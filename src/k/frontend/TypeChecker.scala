package k.frontend

import k.frontend._
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

case object TypeChecker {
  def error(msg: String) = Misc.error("TC", msg)
  def log(msg: String) = Misc.log("TC", msg)

  var globalTypeEnv: TypeEnv = TypeEnv(Map())
  var tes: Map[TopDecl, TypeEnv] = Map()
  var origtes: Map[TopDecl, TypeEnv] = Map()
  var exp2Type: Map[Exp, Type] = Map()
  var exp2TypeEnv: Map[Exp, TypeEnv] = Map()

  var keywords: Map[String, Type] = Map[String, Type]()
  var types = Map[Type, TopDecl]()
  var annotations = Map[String, AnnotationDecl]()
  var classes = Map[String, EntityDecl]()

  def areTypesEqual(ty1: Type, ty2: Type, compatibility: Boolean): Boolean = {
    (ty1, ty2) match {
      case (i1 @ IdentType(it1, it2), i2 @ IdentType(it3, it4)) if !Misc.isCollection(i1) && !Misc.isCollection(i2) =>
        val it1Parents = ClassHierarchy.parentsTransitive(types(ty1).asInstanceOf[EntityDecl])
        val it2Parents = ClassHierarchy.parentsTransitive(types(ty2).asInstanceOf[EntityDecl])
        val same = (it1.equals(it3) && (it2 zip it4).forall { t => areTypesEqual(t._1, t._2, compatibility) })
        val inheritanceSame = !((it1Parents.intersect(it2Parents)).isEmpty) || it1Parents.contains(ty2) || it2Parents.contains(ty1)
        return same || inheritanceSame
      case _ => Misc.areTypesEqual(ty1, ty2, compatibility)
    }
  }

  def isConstructorCall(te: TypeEnv, exp: Exp): Boolean = {
    return exp match {
      case IdentExp(i) =>
        if (te.map.keySet.contains(i)) {
          te.map(i) match {
            case ClassTypeInfo(_, _, _) => true
            case _                      => false
          }
        } else false
      case _ => false
    }
  }

  def isConstructor(className: String, exp: Exp): Boolean = {
    //val isFunAppl = exp.isInstanceOf[FunApplExp]
    //val isThisLiteral = exp == ThisLiteral
    //!isThisLiteral && isFunAppl && types(expTes(exp)).isInstanceOf[EntityDecl]
    isConstructorCall(globalTypeEnv, exp)
  }

  def getDirectSuperClasses(className: String): List[String] =
    if (className == "TopLevelDeclarations") Nil
    else ClassHierarchy.parents(classes(className)).map(_.toString).toList

  def getSuperClasses(className: String): List[String] =
    if (className == "TopLevelDeclarations") Nil
    else ClassHierarchy.parentsTransitive(classes(className)).map(_.toString).toList

  def getSubClasses(className: String): List[String] =
    if (className == "TopLevelDeclarations") Nil
    else ClassHierarchy.childrenTransitive(classes(className)).map(_.toString).toList

  def isLocal(exp: IdentExp): Boolean = {
    exp2TypeEnv(exp)(exp.ident) match {
      case ParamTypeInfo(_)=> true
      case _ => false
    }
  }

}

import TypeChecker._

case class TypeEnv(map: Map[String, TypeInfo]) {
  def overwrite(kv: (String, TypeInfo)) = TypeEnv(map + kv)
  def +(kv: (String, TypeInfo)): TypeEnv = {
    if (map.contains(kv._1)) {
      error(s"${kv._1} already defined. Please check. Exiting.")
    } else {
      TypeEnv(map + kv)
    }
  }
  def ++(te: TypeEnv): TypeEnv = {
    if (!map.forall(kv =>
      (kv._1, kv._2) match {
        case (fi, FunctionTypeInfo(fd)) =>
          if (te.map.contains(fi)) {
            val ofd = te.map(fi).asInstanceOf[FunctionTypeInfo].decl
            if (!areTypesEqual(fd.ty.getOrElse(AnyType), ofd.ty.getOrElse(AnyType), false)) {
              error(s"${fd.ident} redefined with different type.")
            } else {
              if (!(fd.params zip ofd.params).forall { p => areTypesEqual(p._1.ty, p._2.ty, false) })
                error(s"${fd.ident} redefined with different parameter types.")
              else true
            }
          } else true
        case (pi, PropertyTypeInfo(pd, false)) =>
          if (te.map.contains(pi)) {
            error(s"${pi} declared more than once.")
          } else true
        case _ => true
      })) {
    }
    TypeEnv(map ++ te.map)
  }
  def apply(k: String): TypeInfo = {
    if (!map.contains(k)) error(s"Could not find declaration for $k")
    else map(k)
  }
  def contains(k: String): Boolean = map.contains(k)
}

trait TypeInfo

case class FunctionTypeInfo(decl: FunDecl) extends TypeInfo {
  val returnType: Option[Type] = decl.ty
  val argsType: List[Type] = List()

  override def toString() =
    s"""Function: ${decl.ident} : (${argsType.mkString(",")}) -> ${returnType.getOrElse("")}"""
}
case class ClassTypeInfo(decl: EntityDecl,
                         properties: Map[String, PropertyTypeInfo],
                         functions: Map[String, FunctionTypeInfo]) extends TypeInfo {

  override def toString =
    s"Class: ${decl.ident} {" +
      properties.map(k => k._1).mkString(",") +
      functions.map(k => k._1).mkString(",") + "}"
}
case class PropertyTypeInfo(decl: PropertyDecl, global: Boolean) extends TypeInfo {
  override def toString =
    s"Property: ${decl.name} : ${decl.ty}"
}
case class TypeTypeInfo(decl: TypeDecl) extends TypeInfo
case class ParamTypeInfo(p: Param) extends TypeInfo
case class PatternTypeInfo(p: Pattern, ty: Type) extends TypeInfo

object ClassHierarchy {
  var parents = Map[EntityDecl, Set[Type]]()
  var children = Map[EntityDecl, Set[Type]]()

  def buildHierarchy(model: Model) {
    model.decls.foreach { d =>
      d match {
        case ed @ EntityDecl(_, t, _, _, _, _, _) if t == ClassToken =>
          val edParents = buildHierarchy(ed, types, Set())
          parents = parents + (ed -> edParents)
          edParents.foreach { p =>
            val parent = types(p).asInstanceOf[EntityDecl]
            if (!children.contains(parent)) children = children + (parent -> Set())
            children = children +
              (parent ->
                (children(parent) +
                  (types.map(_.swap).asInstanceOf[Map[TopDecl, Type]](ed))))
          }
        case ed @ EntityDecl(_, t, _, _, _, _, _) if t.isInstanceOf[IdentifierToken] =>
          val tokenClass = t.asInstanceOf[IdentifierToken].name
          val tokenClassType = keywords(tokenClass)
          val edParents = buildHierarchy(ed, types, Set())
          parents = parents + (ed -> (edParents + tokenClassType))
          edParents.foreach { p =>
            val parent = types(p).asInstanceOf[EntityDecl]
            if (!children.contains(parent)) children = children + (parent -> Set())
            children = children +
              (parent ->
                (children(parent) +
                  (types.map(_.swap).asInstanceOf[Map[TopDecl, Type]](ed))))
          }
        case _ => ()
      }
    }

    // ensure that one cannot reach itself
    parents.foreach { kv =>
      if (parentsTransitive(kv._1).contains(IdentType(QualifiedName(List(kv._1.ident)), List())))
        error(s"${kv._1.ident} has a cyclic inheritance structure.")
    }

  }

  def childrenTransitive(e: EntityDecl, visited: Set[Type] = Set()): Set[Type] = {
    val immediateChildren = children.getOrElse(e, Nil).toList
    val subChildren = (for (child <- immediateChildren) yield childrenTransitive(types(child).asInstanceOf[EntityDecl], visited + child)).flatten
    (immediateChildren ++ subChildren).toSet
  }

  def parentsTransitive(e: EntityDecl, visited: Set[Type] = Set()): Set[Type] = {
    val immediateParent = parents.getOrElse(e, Nil).toList
    val iParents = (for (parent <- immediateParent) yield parentsTransitive(types(parent).asInstanceOf[EntityDecl], visited + parent)).flatten
    (immediateParent ++ iParents).toSet
  }

  def buildHierarchy(d: EntityDecl, types: Map[Type, TopDecl], visited: Set[EntityDecl]): Set[Type] = {
    d.extending.foldLeft(Set[Type]()) { (res, e) =>
      require(types(e).isInstanceOf[EntityDecl])
      require(!visited.contains(types(e).asInstanceOf[EntityDecl]))
      res + e
    }
  }

}

class TypeChecker(model: Model) {

  private def doesTypeExist(te: TypeEnv, ty: Type): Boolean = {
    ty match {
      case it @ IdentType(_, _) =>
        if (Misc.isCollection(it)) {
          return it.args.forall { t => doesTypeExist(te, t) }
        } else {
          return te.contains(it.toString)
        }
      case ct @ CartesianType(_) =>
        return ct.types.forall { x => doesTypeExist(te, x) }
      case ft @ FunctionType(_, _) =>
        return (doesTypeExist(te, ft.from) &&
          doesTypeExist(te, ft.to))
      case pt @ ParenType(_) =>
        return doesTypeExist(te, pt.ty)
      case st @ SubType(_, _, _) =>
        return te.contains(st.ident.toString)

      case BoolType   => return true
      case IntType    => return true
      case CharType   => return true
      case StringType => return true
      case UnitType   => return true
      case RealType   => return true
    }
    return false
  }

  private def typeCheck: Boolean = {

    if (model == null) return true

    // pass: get class and type information 
    model.annotations.foreach { d =>
      val ad = d.asInstanceOf[AnnotationDecl]
      if (annotations.contains(ad.name)) error(s"Redefining annotation ${ad.name}.")
      annotations = annotations + (ad.name -> ad)
    }
    model.decls.foreach { d =>
      d match {
        case ed @ EntityDecl(_, _, _, ident, _, _, _) =>
          val dED = d.asInstanceOf[EntityDecl]
          keywords = ed.keyword match {
            case Some(kw) =>
              if (keywords.contains(kw)) {
                error(s"Keywords $kw is already being used.")
              } else {
                keywords + (kw -> IdentType(QualifiedName(List(ident)), List()))
              }
            case _ => keywords
          }
          types = types + (IdentType(QualifiedName(List(ident)), List()) -> dED)
          classes = classes + (ident -> dED)
          globalTypeEnv = globalTypeEnv + (ident -> ClassTypeInfo(ed, Map(), Map()))
        case td @ TypeDecl(ident, _, _) =>
          types = types + (IdentType(QualifiedName(List(ident)), List()) -> d.asInstanceOf[TypeDecl])
          globalTypeEnv = globalTypeEnv + (ident -> TypeTypeInfo(td))
        case _ => ()
      }
    }

    // build inheritance model
    ClassHierarchy.buildHierarchy(model)

    // pass: get property info on global level and check if types exist
    model.decls.foreach { d =>
      d match {
        case p @ PropertyDecl(_, name, ty, _, _, _) =>
          if (!doesTypeExist(globalTypeEnv, ty)) error(s"Specified type $ty does not exist. Please check. Exiting.")
          globalTypeEnv = globalTypeEnv + (name -> PropertyTypeInfo(p, true))
        case _ => ()
      }
    }

    // where do we process associations? I think right here... 

    // pass: build information about properties/functions in classes
    // store it in the global type env, but also one for each class
    model.decls.foreach { d =>
      d match {
        case ed @ EntityDecl(_, token, _, ident, _, _, _) if token != AssocToken =>
          // add 'this' to the type env
          var classTypeEnv = globalTypeEnv + ("this" -> ClassTypeInfo(ed, Map(), Map()))
          ed.members.foreach { m =>
            m match {
              case pd @ PropertyDecl(_, _, _, _, _, _) =>
                classTypeEnv += (pd.name -> PropertyTypeInfo(pd, false))
              case fd @ FunDecl(_, _, _, _, _, _) =>
                classTypeEnv += (fd.ident -> FunctionTypeInfo(fd))
              case _ => ()
            }
          }
          tes += (d -> classTypeEnv)
          origtes += (d -> classTypeEnv)
        case ed @ EntityDecl(_, AssocToken, _, ident, _, _, _) =>

          // only support 2 members in associations
          require(ed.members.length == 2,
            error(s"$ident contains more than two associations.\n\tCurrently only a source and target are supported for associations."))

          // members must be source and target 
          require(ed.members.forall { m =>
            m.asInstanceOf[PropertyDecl].modifiers != null &&
              (m.asInstanceOf[PropertyDecl].modifiers.contains(Source) ||
                m.asInstanceOf[PropertyDecl].modifiers.contains(Target))
          }, s"$ident does not define a source or target correctly.")

          // members must be of ident type that is a user defined class
          require(ed.members.forall { m =>
            m.asInstanceOf[PropertyDecl].ty.isInstanceOf[IdentType]
          }, s"$ident association uses a non user defined type as source/target.")

          val classTypeEnv = ed.members.foldLeft(globalTypeEnv) {
            (res, m) =>
              m match {
                case pd @ PropertyDecl(_, _, _, _, _, _) =>
                  res + (pd.name -> PropertyTypeInfo(pd, false))
                case _ =>
                  error(s"$ident association contains members besides functions.\n\tCurrently this is unsupported.")
              }
          }

          // also insert the source/target in respective class
          val m1 = ed.members(0).asInstanceOf[PropertyDecl]
          val m2 = ed.members(1).asInstanceOf[PropertyDecl]
          val cte0 =
            tes.find(p =>
              p._1 match {
                case ed1 @ EntityDecl(_, t, _, ident, _, _, _) if t != AssocToken =>
                  if (ed1.ident.equals(m1.ty.toString)) true
                  else false
                case _ =>
                  false
              }).get

          val cte1 =
            tes.find(p =>
              p._1 match {
                case ed1 @ EntityDecl(_, t, _, ident, _, _, _) if t != AssocToken =>
                  if (ed1.ident.equals(m2.ty.toString)) true
                  true
                case _ =>
                  false
              }).get

          tes += (cte0._1 -> (cte0._2 + ((m2.name) -> PropertyTypeInfo(m2, false))))
          origtes += (cte0._1 -> (cte0._2 + ((m2.name) -> PropertyTypeInfo(m2, false))))
          tes += (cte1._1 -> (cte1._2 + ((m1.name) -> PropertyTypeInfo(m1, false))))
          origtes += (cte1._1 -> (cte1._2 + ((m1.name) -> PropertyTypeInfo(m1, false))))

          tes += (d -> classTypeEnv)
          origtes += (d -> classTypeEnv)

        case _ => ()
      }
    }

    // pass: process functions at top level
    globalTypeEnv = model.decls.foldLeft(globalTypeEnv) { (res, d) =>
      d match {
        case fd @ FunDecl(_, _, _, _, _, _) =>
          // check if the type exists
          fd.ty match {
            case Some(t) =>
              if (!doesTypeExist(res, t)) {
                error(s"Specified type $t does not exist. Please check. Exiting.")
              }
            case None => ()
          }
          res + (fd.ident -> FunctionTypeInfo(fd))
        case _ => res
      }
    }

    // pass: do inheritance for each class and associations
    model.decls.foreach { d =>
      d match {
        case ed @ EntityDecl(_, t, _, ident, _, _, _) if t != AssocToken =>
          val classTypeEnv = tes(d)
          val extending = ClassHierarchy.parentsTransitive(ed)
          val newClassTypeEnv = classTypeEnv ++
            extending.foldLeft(TypeEnv(Map[String, TypeInfo]())) {
              (res, ex) =>
                val extendingTypeEnv = origtes.find(
                  de =>
                    de._1 match {
                      case ed @ EntityDecl(_, _, _, _, _, _, _) =>
                        ed.ident.toString.equals(ex.asInstanceOf[IdentType].ident.toString)
                      case _ => false
                    }).get
                res ++ extendingTypeEnv._2
            }
          tes += (d -> newClassTypeEnv)
        case _ => ()
      }
    }

    // pass: build the information for expressions 
    // except expressions that are in functions (bodies)
    model.decls.foreach { d =>
      d match {
        case ExpressionDecl(exp) => exp2Type = exp2Type + (exp -> getExpType(globalTypeEnv, exp))
        case ed @ EntityDecl(_, _, _, ident, _, _, _) =>
          ed.members.foreach { m =>
            m match {
              case ExpressionDecl(exp) => exp2Type = exp2Type + (exp -> getExpType(tes(ed), exp))
              case _                   => ()
            }
          }
        case cd @ ConstraintDecl(name, exp) => exp2Type = exp2Type + (exp -> getExpType(globalTypeEnv, exp))
        case _                              => ()
      }
    }

    // pass: now process function bodies, property initializations etc. etc.
    model.decls.foreach { d =>
      d match {
        case cd @ ConstraintDecl(name, exp) =>
          val ty = getExpType(globalTypeEnv, exp)
          if (ty != BoolType) {
            error(s"Condition $exp is not of type Bool.")
          }
          exp2Type = exp2Type + (exp -> ty)
        case fd @ FunDecl(_, _, _, _, _, _) =>
          processFunction(fd, globalTypeEnv)
        case ed @ EntityDecl(_, token, _, ident, _, _, _) =>
          val entityTypeEnv = tes(ed)

          ed.annotations.foreach { a =>
            val annotationExpType = getExpType(entityTypeEnv, a.exp)
            val annotationType = annotations(a.name).ty
            require(areTypesEqual(annotationExpType, annotationType, false),
              s"Annotation $a does not type check.")
          }

          ed.members.foreach { m =>
            m match {
              case cd @ ConstraintDecl(name, exp) =>
                val ty = getExpType(entityTypeEnv, exp)
                if (ty != BoolType && ty != AnyType) {
                  error(s"Condition $exp is not of type Bool.")
                }
                exp2Type = exp2Type + (exp -> ty)
              case fd @ FunDecl(_, _, _, _, _, _) =>
                processFunction(fd, entityTypeEnv)
              case pd @ PropertyDecl(_, _, _, _, _, _) =>
                pd.expr match {
                  case Some(e) =>
                    val exprType = getExpType(entityTypeEnv, e)
                    if (!areTypesEqual(exprType, pd.ty, true)) {
                      error(s"Type does not match: ${pd.name}. Expected ${pd.ty}, Found $exprType")
                    }
                    exp2Type = exp2Type + (e -> exprType)
                  case None => ()
                }
              case _ => ()
            }
          }
        case pd @ PropertyDecl(_, _, _, _, _, _) =>
          if (!pd.expr.isEmpty) {
            val exprType = getExpType(globalTypeEnv, pd.expr.get)
            if (!areTypesEqual(exprType, pd.ty, true)) {
              error(s"Type does not match: ${pd.name}. + Expected ${pd.ty}, Found $exprType")
            }
            exp2Type += (pd.expr.get -> exprType)
          }
        case _ => ()
      }
    }
    true
  }

  def processFunction(fd: FunDecl, entityTypeEnv: TypeEnv) {
    // check if return type exists 
    if (!fd.ty.isEmpty) {
      if (!doesTypeExist(entityTypeEnv, fd.ty.get)) {
        error(s"Type ${fd.ty.get} not found. Exiting.")
      }
    }

    // parameters, properties
    var functionTypeEnv = fd.params.foldLeft(entityTypeEnv) {
      (fres, p) =>
        if (!doesTypeExist(fres, p.ty)) {
          error(s"Type ${p.ty} not found. Exiting.")
        }
        fres.overwrite(p.name -> ParamTypeInfo(p))
    }

    var lastT: Type = null

    // process body for properties in function
    fd.body.foreach { m =>
      m match {
        case pd @ PropertyDecl(_, _, _, _, _, _) =>
          if (!doesTypeExist(functionTypeEnv, pd.ty)) {
            error(s"Type ${pd.ty} not found. Exiting.")
          }
          functionTypeEnv = functionTypeEnv.overwrite(pd.name -> PropertyTypeInfo(pd, false))
        case _ => ()
      }
    }

    // process expressions in function
    fd.body.foreach { m =>
      m match {
        case ExpressionDecl(exp) =>
          lastT = getExpType(functionTypeEnv, exp)
          if (exp.isInstanceOf[ReturnExp] && !fd.ty.isEmpty) {
            require(areTypesEqual(lastT, fd.ty.get, true), s"Return type does not match for $exp in function ${fd.ident}")
          }
          exp2Type = exp2Type + (exp -> lastT)
        case _ => ()
      }
    }

    // check return matches last expression type
    if (lastT != null && !fd.ty.isEmpty) {
      if (!areTypesEqual(fd.ty.get, lastT, true)) {
        error(s"Return type does not match body: ${fd.ident}. Expected ${fd.ty.get}, Found $lastT.")
      }
    }

    tes = tes + (fd -> functionTypeEnv)

  }

  def getExpType(te: TypeEnv, exp: Exp): Type = {
    val result: Type = exp match {
      case ResultExp   => AnyType
      case ParenExp(e) => getExpType(te, e)
      case IdentExp(i) =>
        if (!te.contains(i)) {
          error(s"$i not found in scope for $exp. Please check. Exiting.")
        }
        te(i) match {
          case pti @ PropertyTypeInfo(decl, _) => pti.decl.ty
          case pti @ ParamTypeInfo(p)          => p.ty
          case pti @ FunctionTypeInfo(decl) =>
            decl.ty match {
              case Some(t) => t
              case None    => AnyType
            }
          case cti @ ClassTypeInfo(decl, p, f) => IdentType(QualifiedName(List(decl.ident)), null)
          case pti @ PatternTypeInfo(p, t)     => t
          case tt @ _ =>
            error(s"Type could not be found for $exp." + tt.getClass)
        }
      case DotExp(e, i) =>
        val ti = getExpType(te, e)
        ti match {
          case it @ IdentType(_, _) =>
            if (Misc.isCollection(it)) {
              // TODO
              if (i == "collect") CollectType(it.args)
              else if (i == "sum") SumType(it.args)
              else if (i == "size") SumType(it.args)
              else if (i == "at") SumType(it.args)
              else error(s"getExpType: error, type could not be discovered for $exp.")
            } else {
              if (i == "collect") CollectType(List(it))
              else if (i == "sum") SumType(it.args)
              else if (i == "size") SumType(it.args)
              else if (i == "at") SumType(it.args)
              else
                te(it.toString) match {
                  case cti @ ClassTypeInfo(d, p, f) =>
                    // get class type env and lookup property/function etc. 
                    val classTypeEnv =
                      tes.find(
                        de => de._1 match {
                          case ed @ EntityDecl(_, _, _, _, _, _, _) => ed.ident.toString.equals(d.ident)
                          case _                                    => false
                        }).get._2

                    classTypeEnv(i) match {
                      case pti @ PropertyTypeInfo(decl, _) => pti.decl.ty
                      case pti @ ParamTypeInfo(p)          => p.ty
                      case pti @ FunctionTypeInfo(decl)    => decl.ty.get
                    }
                }
            }
          case tt @ _ =>
            if (i == "collect") CollectType(List(tt))
            else if (i == "sum") SumType(List(tt))
            else if (i == "size") SumType(List(tt))
            else if (i == "at") SumType(List(tt))
            else tt
        }
      case BinExp(exp1, op, exp2) =>
        val ty1 = getExpType(te, exp1)
        val ty2 = getExpType(te, exp2)
        op match {
          case LT | LTE | GT | GTE | AND | IMPL | OR | IFF | NEQ | EQ =>
            if (!areTypesEqual(ty1, ty2, true)) error(s"$exp does not type check. $ty1 and $ty2 are not equivalent.")
            BoolType
          case MUL | DIV | ADD | SUB | REM =>
            if (!areTypesEqual(ty1, ty2, false)) error(s"$exp does not type check. $ty1 and $ty2 are not equivalent.")
            ty1
          case ASSIGN =>
            if (!areTypesEqual(ty1, ty2, false)) error(s"$exp does not type check. $ty1 and $ty2 are not equivalent.")
            UnitType
          case ISIN | NOTISIN =>
            val (typesCompat, cType) = Misc.typeTypeCollection(ty1, ty2)
            if (!typesCompat) error(s"$exp does not type check. $ty1 and $ty2 are not compatible.")
            BoolType
          case SETUNION =>
            val (typesCompat, cType) = Misc.typeTypeCollection(ty1, ty2)
            if (!typesCompat) error(s"$exp does not type check. $ty1 and $ty2 are not compatible.")
            cType
          case TUPLEINDEX =>
            if (ty2 != IntType) error("Tuple index is not an integer.")
            ty1 match {
              case CartesianType(types) => types(exp2.toString.toInt - 1)
              case _                    => error(s"Non tuple type found with tuple indexing. $exp")
            }
        }
      case FunApplExp(exp, args) =>
        if (isConstructorCall(te, exp)) {
          IdentType(QualifiedName(List(exp.toString)), List())
        } else {
          var functionType = getExpType(te, exp)
          // TODO ensure arguments match up
          functionType match {
            case CollectType(t) =>
              assert(args.length <= 1)
              // assuming lambda expression as only argument
              // assuming ident pattern in lambda expression
              val lambdaExp = args.last.asInstanceOf[PositionalArgument].exp.asInstanceOf[LambdaExp]
              val lambdaTe = te + (lambdaExp.pat.asInstanceOf[IdentPattern].ident -> te(t.last.toString))
              // CollectType(List(getExpType(lambdaTe, lambdaExp)))
              IdentType(QualifiedName(List("Seq")), List(getExpType(lambdaTe, lambdaExp)))
            case SumType(t) => IntType
            case _          => functionType
          }
        }
      case WhileExp(cond, body) =>
        if (getExpType(te, cond) != BoolType) {
          error(s"Branch condition $cond does not evaluate to Bool. Please check.")
        }
        getExpType(te, body)
      case IfExp(cond, tb, eb) =>
        if (getExpType(te, cond) != BoolType) {
          error(s"Branch condition $cond does not evaluate to Bool. Please check.")
        }
        val tbType = getExpType(te, tb)
        val ebType = eb match { case Some(ebb) => getExpType(te, ebb) case None => tbType }
        if (!areTypesEqual(tbType, ebType, true)) {
          error("Then and Else branch types are different.")
        }
        tbType
      case BlockExp(body) =>
        body.last match {
          case ExpressionDecl(e) => getExpType(te, e)
          case _                 => error("Other than expression found in block. Not supported yet.")
        }
      case UnaryExp(op, exp)   => getExpType(te, exp)
      case TupleExp(exps)      => CartesianType(exps.map { e => getExpType(te, e) })
      case LambdaExp(pat, exp) => getExpType(te, exp)
      case ReturnExp(exp)      => getExpType(te, exp)
      case ForExp(pattern, exp, body) =>
        val newTe = pattern match {
          case TypedPattern(ident, ty) if ident.isInstanceOf[IdentPattern] =>
            te.overwrite(ident.asInstanceOf[IdentPattern].ident -> PatternTypeInfo(pattern, ty))
          case _ => error(s"Must use a typed pattern in for expressions: $exp")
        }
        require(getExpType(newTe, exp) == BoolType, s"$exp is not of type Bool")
        getExpType(newTe, body)
      case TypeCastCheckExp(cast, e, ty) => if (cast) ty else BoolType
      case QuantifiedExp(q, b, e) =>

        // process bindings
        val newTe = b.foldLeft(te) { (res, bndg) =>
          bndg.patterns.foldLeft(res) { (res2, p) =>
            val collectionType = bndg.collection match {
              case ExpCollection(collE)   => getExpType(te, collE)
              case TypeCollection(collTy) => collTy
            }
            val singleType = Misc.removeCollection(collectionType)
            p match {
              case IdentPattern(ident)      => res2.overwrite(ident -> PatternTypeInfo(p, singleType))
              case ProductPattern(patterns) => error(s"Currently only identifier and product patterns are supported. $exp")
              case _                        => error(s"Currently only identifier and product patterns are supported. $exp")
            }
          }
        }
        require(getExpType(newTe, e).equals(BoolType), s"$exp does not evaluate to Bool")
        BoolType
      case IntegerLiteral(_)   => IntType
      case BooleanLiteral(_)   => BoolType
      case CharacterLiteral(_) => CharType
      case StringLiteral(_)    => StringType
      case RealLiteral(_)      => RealType
      case ThisLiteral =>
        types.map(_.swap).asInstanceOf[Map[TopDecl, Type]](te("this").asInstanceOf[ClassTypeInfo].decl)
      case _ => error(s"Type checking for ${exp.getClass} not implemented yet!")
    }
    exp2Type = exp2Type + (exp -> result)
    exp2TypeEnv = exp2TypeEnv + (exp -> te)
    //println(s"getExpType: $exp $result")
    return result
  }

  def inferTypeFrom(exp: String, ty: Type) = ty

  typeCheck
}