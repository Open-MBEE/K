package k.frontend

import k.frontend._
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

case object TypeChecker {
  def error(msg: String) = Misc.error("TC", msg)
  def log(msg: String) = Misc.log("TC", msg)
}

case class TypeEnv(map: Map[String, TypeInfo]) {
  def +(kv: (String, TypeInfo)): TypeEnv = {
    if (map.contains(kv._1)) {
      TypeChecker.error(s"${kv._1} already defined. Please check. Exiting.")
    } else {
      TypeEnv(map + kv)
    }
  }
  def ++(te: TypeEnv): TypeEnv = {
    // check functions
    if (!map.forall(kv =>
      (kv._1, kv._2) match {
        case (fi, FunctionTypeInfo(fd)) =>
          if (te.map.contains(fi)) {
            val ofd = te.map(fi).asInstanceOf[FunctionTypeInfo].decl
            if (!Misc.areTypesEqual(fd.ty.getOrElse(AnyType), ofd.ty.getOrElse(AnyType), false)) {
              TypeChecker.error(s"${fd.ident} redefined with different type.")
            } else {
              if (!(fd.params zip ofd.params).forall { p => Misc.areTypesEqual(p._1.ty, p._2.ty, false) })
                TypeChecker.error(s"${fd.ident} redefined with different parameter types.")
              else true
            }
          } else true
        case (pi, PropertyTypeInfo(pd, false)) =>
          if (te.map.contains(pi)) {
            TypeChecker.error(s"${pi} declared more than once.")
          } else true
        case _ => true
      })) {
    }
    TypeEnv(map ++ te.map)
  }
  def apply(k: String): TypeInfo = {
    if (!map.contains(k)) TypeChecker.error(s"Could not find declaration for $k")
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

object ClassHierarchy {
  var parents = Map[EntityDecl, Set[Type]]()
  val children = Map[EntityDecl, Set[Type]]()
  var types: Map[Type, TopDecl] = null

  def buildHierarchy(model: Model) {
    model.decls.foreach { d =>
      d match {
        case ed @ EntityDecl(_, t, _, _, _, _, _) if t == ClassToken =>
          val edParents = buildHierarchy(ed, types, Set())
          parents = parents + (ed -> edParents)
        case ed @ EntityDecl(_, t, keyword, _, _, _, _) if !keyword.isEmpty =>
          val edParents = buildHierarchy(ed, types, Set())
          parents = parents + (ed -> (edParents)) // TODO add keyword
        case _ => ()
      }
    }

    check()
  }

  def parentsTransitive(visited: Set[Type]): Set[Type] = {
    visited.foldLeft(visited) { (res, v) =>
      res ++ parentsTransitive(parents(types(v).asInstanceOf[EntityDecl]))
    }
  }

  def check() {
    // ensure that one cannot reach itself
    parents.foreach { kv =>
      println(parentsTransitive(parents(kv._1)))
    }
  }

  def buildHierarchy(d: EntityDecl, types: Map[Type, TopDecl], visited: Set[EntityDecl]): Set[Type] = {
    d.extending.foldLeft(Set[Type]()) { (res, e) =>
      // ensure e is a class
      require(types(e).isInstanceOf[EntityDecl])

      // ensure e is not found in visited
      require(!visited.contains(types(e).asInstanceOf[EntityDecl]))

      res + e
    }
  }

  override def toString: String = {
    parents.mkString(",") + children.mkString(",")
  }

}

class TypeChecker(model: Model) {
  var tes: Map[TopDecl, TypeEnv] = Map()
  var expTes: Map[Exp, Type] = Map()
  var keywords: Map[String, Type] = Map[String, Type]()
  val collectionNames = Set("Set", "Bag", "Seq")
  var types = Map[Type, TopDecl]()

  private def isCollection(it: IdentType): Boolean = collectionNames(it.ident.toString)

  private def doesTypeExist(te: TypeEnv, ty: Type): Boolean = {
    ty match {
      case it @ IdentType(_, _) =>
        if (isCollection(it)) {
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
    var globalTypeEnv = model.decls.foldLeft(TypeEnv(Map[String, TypeInfo]())) { (res, d) =>
      d match {
        case ed @ EntityDecl(_, _, _, ident, _, _, _) =>
          keywords = ed.keyword match {
            case Some(kw) =>
              if (keywords.contains(kw)) {
                TypeChecker.error(s"Keywords $kw is already being used.")
              } else {
                keywords + (kw -> IdentType(QualifiedName(List(ident)), List()))
              }
            case _ => keywords
          }
          types = types + (IdentType(QualifiedName(List(ident)), List()) -> ed)
          res + (ident -> ClassTypeInfo(ed, Map(), Map()))
        case td @ TypeDecl(ident, _, _) =>
          types = types + (IdentType(QualifiedName(List(ident)), List()) -> td)
          res + (ident -> TypeTypeInfo(td))
        case _ => res
      }
    }

    // check inheritance structure
//    ClassHierarchy.types = types
//    ClassHierarchy.buildHierarchy(model)
//    println(ClassHierarchy.toString())

    // pass: get property info on global level and check if types exist
    globalTypeEnv = model.decls.foldLeft(globalTypeEnv) { (res, d) =>
      d match {
        case p @ PropertyDecl(_, name, ty, _, _, _) =>
          // check if the type exists
          if (!doesTypeExist(res, ty)) {
            TypeChecker.error(s"Specified type $ty does not exist. Please check. Exiting.")
          }
          res + (name -> PropertyTypeInfo(p, true))
        case _ => res
      }
    }

    // where do we process associations? I think right here... 

    // pass: build information about properties/functions in classes
    // store it in the global type env, but also one for each class
    model.decls.foreach { d =>
      d match {
        case ed @ EntityDecl(_, token, _, ident, _, _, _) if token != AssocToken =>
          val classTypeEnv = ed.members.foldLeft(globalTypeEnv) {
            (res, m) =>
              m match {
                case pd @ PropertyDecl(_, _, _, _, _, _) =>
                  res + (pd.name -> PropertyTypeInfo(pd, false))
                case fd @ FunDecl(_, _, _, _, _, _) =>
                  res + (fd.ident -> FunctionTypeInfo(fd))
                case _ => res
              }
          }
          tes += (d -> classTypeEnv)
        case ed @ EntityDecl(_, AssocToken, _, ident, _, _, _) =>

          // only support 2 members in associations
          require(ed.members.length == 2,
            TypeChecker.error(s"$ident contains more than two associations.\n\tCurrently only a source and target are supported for associations."))

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
                  TypeChecker.error(s"$ident association contains members besides functions.\n\tCurrently this is unsupported.")
              }
          }

          println(s"members length ${ed.members.length} ${ed.members(0)}")

          // also insert the source/target in respective class
          val m1 = ed.members(0).asInstanceOf[PropertyDecl]
          val m2 = ed.members(1).asInstanceOf[PropertyDecl]
          val cte1 =
            tes.find(p =>
              p._1 match {
                case ed1 @ EntityDecl(_, t, _, ident, _, _, _) if t != AssocToken =>
                  if (ed1.ident.equals(m1.ty.toString)) true
                  else false
                case _ =>
                  false
              }).get

          val cte2 =
            tes.find(p =>
              p._1 match {
                case ed1 @ EntityDecl(_, t, _, ident, _, _, _) if t != AssocToken =>
                  if (ed1.ident.equals(m2.ty.toString)) true
                  true
                case _ =>
                  false
              }).get

          tes += (cte1._1 -> (cte1._2 + ((m2.name) -> PropertyTypeInfo(m2, false))))
          tes += (cte2._1 -> (cte2._2 + ((m1.name) -> PropertyTypeInfo(m1, false))))

          tes += (d -> classTypeEnv)

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
                TypeChecker.error(s"Specified type $t does not exist. Please check. Exiting.")
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
          val extending = {
            if (t != ClassToken)
              ed.extending ++
                List(keywords(t.asInstanceOf[IdentifierToken].name))
            else ed.extending
          }
          println(ident + " extending list is " + extending.mkString(","))
          println("cte " + classTypeEnv)
          val newClassTypeEnv = classTypeEnv ++
            extending.foldLeft(TypeEnv(Map[String, TypeInfo]())) {
              (res, ex) =>
                val extendingTypeEnv = tes.find(
                  de =>
                    de._1 match {
                      case ed @ EntityDecl(_, _, _, _, _, _, _) =>
                        ed.ident.toString.equals(ex.asInstanceOf[IdentType].ident.toString)
                      case _ => false
                    }).get
                println("ete " + extendingTypeEnv._2)
                extendingTypeEnv._2
            }
          println(s"$ident old: $classTypeEnv")
          println(s"$ident new: $newClassTypeEnv")
          tes += (d -> newClassTypeEnv)
        case _ => ()
      }
    }

    // pass: build the information for expressions 
    // except expressions that are in functions (bodies)
    expTes = model.decls.foldLeft(Map[Exp, Type]()) {
      (res, d) =>
        d match {
          case ExpressionDecl(exp) =>
            val ty = getExpType(globalTypeEnv, exp)
            res + (exp -> ty)
          case ed @ EntityDecl(_, _, _, ident, _, _, _) =>
            res ++ ed.members.foldLeft(res) { (res1, m) =>
              m match {
                case ExpressionDecl(exp) =>
                  val ty = getExpType(tes(ed), exp)
                  res1 + (exp -> ty)
                case _ => res1
              }
            }
          case cd @ ConstraintDecl(name, exp) =>
            res + (exp -> getExpType(globalTypeEnv, exp))
          case _ => res
        }
    }

    // pass: now process function bodies, property initializations etc. etc.
    val result =
      model.decls.foldLeft((tes, expTes)) { (res, d) =>
        d match {
          case cd @ ConstraintDecl(name, exp) =>
            val ty = getExpType(globalTypeEnv, exp)
            if (ty != BoolType && ty != AnyType) {
              TypeChecker.error(s"Condition $exp is not of type Bool.")
            }
            (res._1, res._2 + (exp -> ty))
          case ed @ EntityDecl(_, ClassToken, _, ident, _, _, _) =>
            val entityTypeEnv = tes(ed)
            ed.members.foldLeft(res) { (res1, m) =>
              m match {
                case cd @ ConstraintDecl(name, exp) =>
                  val ty = getExpType(entityTypeEnv, exp)
                  if (ty != BoolType && ty != AnyType) {
                    TypeChecker.error(s"Condition $exp is not of type Bool.")
                  }
                  (res._1, res._2 + (exp -> ty))
                case fd @ FunDecl(_, _, _, _, _, _) =>
                  // check if return type exists 
                  fd.ty match {
                    case Some(t) =>
                      if (!doesTypeExist(entityTypeEnv, t)) {
                        TypeChecker.error(s"Type $t not found. Exiting.")
                      }
                    case _ => ()
                  }

                  // parameters, properties
                  val functionTypeEnv = fd.params.foldLeft(entityTypeEnv) {
                    (fres, p) =>
                      if (!doesTypeExist(fres, p.ty)) {
                        TypeChecker.error(s"Type ${p.ty} not found. Exiting.")
                      }
                      fres + (p.name -> ParamTypeInfo(p))
                  }

                  // process body
                  var lastT: Type = null
                  val expTes1 = fd.body.foldLeft(functionTypeEnv, res1._2) { (fres1, m) =>
                    m match {
                      case pd @ PropertyDecl(_, _, _, _, _, _) =>
                        (fres1._1 + (pd.name -> PropertyTypeInfo(pd, false)), fres1._2)
                      case ExpressionDecl(exp) =>
                        lastT = getExpType(fres1._1, exp)
                        (fres1._1, fres1._2 + (exp -> lastT))
                      case _ => fres1
                    }
                  }

                  // check return matches last expression type
                  if (fd.body.length > 0) {
                    fd.ty match {
                      case Some(t) =>
                        if (!Misc.areTypesEqual(t, lastT, true)) {
                          val errorMsg: StringBuilder = new StringBuilder
                          errorMsg.append("Return type does not match body: " + fd.ident)
                          errorMsg.append("\n")
                          errorMsg.append(s"\tExpected $t, Found $lastT.")
                          TypeChecker.error(errorMsg.toString)
                        }
                      case None => ()
                    }
                  }

                  // 

                  (res1._1 + (fd -> functionTypeEnv), res1._2)
                case pd @ PropertyDecl(_, _, _, _, _, _) =>
                  pd.expr match {
                    case Some(e) =>
                      val exprType = getExpType(entityTypeEnv, e)
                      if (!Misc.areTypesEqual(exprType, pd.ty, true)) {
                        val errorMsg: StringBuilder = new StringBuilder
                        errorMsg.append("Type does not match: " + pd.name)
                        errorMsg.append("\n")
                        errorMsg.append(s"\tExpected ${pd.ty}, Found $exprType")
                        TypeChecker.error(errorMsg.toString)
                      }
                      (res1._1, res1._2 + (e -> exprType))
                    case None => res1
                  }

                case _ => res1
              }
            }
            res
          case pd @ PropertyDecl(_, _, _, _, _, _) =>
            pd.expr match {
              case Some(e) =>
                val exprType = getExpType(globalTypeEnv, e)
                if (!Misc.areTypesEqual(exprType, pd.ty, true)) {
                  val errorMsg: StringBuilder = new StringBuilder
                  errorMsg.append("Type does not match: " + pd.name)
                  errorMsg.append("\n")
                  errorMsg.append(s"\tExpected ${pd.ty}, Found $exprType")
                  TypeChecker.error(errorMsg.toString)
                }
                (res._1, res._2 + (e -> exprType))
              case None => res
            }
          case _ => res
        }
      }
    tes = result._1
    expTes = result._2

    true
  }

  def isConstructorCall(te: TypeEnv, exp: Exp): Boolean = {
    exp match {
      case IdentExp(i) =>
        if (te.map.keySet.contains(i)) {
          te.map(i) match {
            case ClassTypeInfo(_, _, _) => return true
            case _                      => return false
          }
        } else return false
      case _ => return false
    }

  }

  def getExpType(te: TypeEnv, exp: Exp): Type = {
    val result: Type = exp match {
      case ResultExp   => AnyType
      case ParenExp(e) => getExpType(te, e)
      case IdentExp(i) =>
        if (!te.contains(i)) {
          TypeChecker.error(s"$i not found in scope for $exp. Please check. Exiting.")
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
          case tt @ _ =>
            TypeChecker.error(s"Type could not be found for $exp." + tt.getClass)
        }
      case DotExp(e, i) =>
        val ti = getExpType(te, e)
        ti match {
          case it @ IdentType(_, _) =>
            if (isCollection(it)) {
              // TODO
              if (i == "collect") CollectType(it.args)
              else if (i == "sum") SumType(it.args)
              else if (i == "size") SumType(it.args)
              else if (i == "at") SumType(it.args)
              else TypeChecker.error(s"getExpType: error, type could not be discovered for $exp.")
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
          case LT | LTE | GT | GTE | AND | IMPL |
            OR | IFF | NEQ | EQ =>
            if (!Misc.areTypesEqual(ty1, ty2, true)) {
              TypeChecker.error(s"$exp does not type check. $ty1 and $ty2 are not equivalent.")
            }
            BoolType
          case MUL | DIV | ADD | SUB | REM =>
            if (!Misc.areTypesEqual(ty1, ty2, false)) {
              TypeChecker.error(s"$exp does not type check. $ty1 and $ty2 are not equivalent.")
            }
            ty1
          case ASSIGN =>
            if (!Misc.areTypesEqual(ty1, ty2, false)) {
              TypeChecker.error(s"$exp does not type check. $ty1 and $ty2 are not equivalent.")
            }
            UnitType
          case ISIN | NOTISIN => BoolType //TODO
          case TUPLEINDEX =>
            // ensure that ty2 is Int and a literal
            if (ty2 != IntType) {
              TypeChecker.error("Tuple index is not an integer.")
            }
            ty1 match {
              case CartesianType(types) => types(exp2.toString.toInt - 1)
              case _                    => TypeChecker.error(s"Non tuple type found with tuple indexing. $exp")
            }
          case _ => ty1
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
          TypeChecker.error(s"Branch condition $cond does not evaluate to Bool. Please check.")
        }
        getExpType(te, body)
      case IfExp(cond, tb, eb) =>
        if (getExpType(te, cond) != BoolType) {
          TypeChecker.error(s"Branch condition $cond does not evaluate to Bool. Please check.")
        }
        val tbType = getExpType(te, tb)
        val ebType = eb match { case Some(ebb) => getExpType(te, ebb) case None => tbType }
        if (!Misc.areTypesEqual(tbType, ebType, true)) {
          TypeChecker.error("Then and Else branch types are different.")
        }
        tbType
      case BlockExp(body) =>
        body.last match {
          case ExpressionDecl(e) => getExpType(te, e)
          case _                 => TypeChecker.error("Other than expression found in block. Not supported yet.")
        }
      case UnaryExp(op, exp)      => getExpType(te, exp)
      case TupleExp(exps)         => CartesianType(exps.map { e => getExpType(te, e) })
      case LambdaExp(pat, exp)    => getExpType(te, exp)
      case ReturnExp(exp)         => getExpType(te, exp)
      //        case ForExp(pattern, exp, body) =>
      //        case MatchExp(e, m) =>
      //        case MatchCase(p, e) =>
      case QuantifiedExp(q, b, e) => AnyType // TODO
      case IntegerLiteral(_)      => IntType
      case BooleanLiteral(_)      => BoolType
      case CharacterLiteral(_)    => CharType
      case StringLiteral(_)       => StringType
      case RealLiteral(_)         => RealType
      case ThisLiteral            => AnyType // TODO
      case _                      => TypeChecker.error(s"Type checking for ${exp.getClass} not implemented yet!")
    }
    println(s"getExpType: $exp $result")
    return result
  }

  def inferTypeFrom(exp: String, ty: Type) = ty

  typeCheck
}