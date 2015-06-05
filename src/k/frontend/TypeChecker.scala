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
case class PropertyTypeInfo(decl: PropertyDecl) extends TypeInfo {
  override def toString =
    s"Property: ${decl.name} : ${decl.ty}"
}
case class TypeTypeInfo(decl: TypeDecl) extends TypeInfo
case class ParamTypeInfo(p: Param) extends TypeInfo

class TypeChecker(model: Model) {
  var tes: Map[TopDecl, TypeEnv] = Map()
  var expTes: Map[Exp, Type] = Map()
  var keywords: Map[String, Type] = Map[String, Type]()
  val collectionNames = Set("Set", "Bag", "Seq")

  private def isCollection(it: IdentType): Boolean = collectionNames(it.ident.toString)

  def areTypesEqual(t1: Type, t2: Type, compatibility: Boolean): Boolean = {
    (t1, t2) match {
      case (ParenType(pt1), ParenType(pt2))         => return areTypesEqual(pt1, pt2, compatibility)
      case (ParenType(pt1), pt2 @ _)                => return areTypesEqual(pt1, pt2, compatibility)
      case (pt1 @ _, ParenType(pt2))                => return areTypesEqual(pt1, pt2, compatibility)
      case (CartesianType(ct1), CartesianType(ct2)) => return (ct1 zip ct2).forall { t => areTypesEqual(t._1, t._2, compatibility) }
      case (CollectType(ct1), CollectType(ct2))     => return (ct1 zip ct2).forall { t => areTypesEqual(t._1, t._2, compatibility) }
      case (AnyType, _)                             => return true
      case (_, AnyType)                             => return true
      case (RealType, IntType) if compatibility     => return true
      case (IntType, RealType) if compatibility     => return true
      case _ =>
        return t1 == t2
    }
    return false
  }

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
                keywords + (kw -> IdentType(QualifiedName(List(ed.ident)), List()))
              }
            case _ => keywords
          }
          res + (ident -> ClassTypeInfo(ed, Map(), Map()))
        case td @ TypeDecl(ident, _, _) =>
          res + (ident -> TypeTypeInfo(td))
        case _ => res
      }
    }

    // pass: get property info on global level and check if types exist
    globalTypeEnv = model.decls.foldLeft(globalTypeEnv) { (res, d) =>
      d match {
        case p @ PropertyDecl(_, name, ty, _, _, _) =>
          // check if the type exists
          if (!doesTypeExist(res, ty)) {
            TypeChecker.error(s"Specified type $ty does not exist. Please check. Exiting.")
          }
          res + (name -> PropertyTypeInfo(p))
        case _ => res
      }
    }

    // pass: build information about properties in classes
    // store it in the global type env, but also one for each class
    model.decls.foreach { d =>
      d match {
        case ed @ EntityDecl(_, _, _, ident, _, _, _) =>
          val classTypeEnv = ed.members.foldLeft(globalTypeEnv) {
            (res, m) =>
              m match {
                case pd @ PropertyDecl(_, _, _, _, _, _) =>
                  res + (pd.name -> PropertyTypeInfo(pd))
                case fd @ FunDecl(_, _, _, _, _, _) =>
                  res + (fd.ident -> FunctionTypeInfo(fd))
                case _ => res
              }
          }
          tes += (d -> classTypeEnv)
        case _ => ()
      }
    }

    // pass: do inheritance for each class
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
          val newClassTypeEnv = TypeEnv(classTypeEnv.map ++

            extending.foldLeft(classTypeEnv) {
              (res, ex) =>
                val extendingTypeEnv = tes.find(
                  de =>
                    de._1 match {
                      case ed @ EntityDecl(_, _, _, _, _, _, _) =>
                        ed.ident.toString.equals(ex.asInstanceOf[IdentType].ident.toString)
                      case _ => false
                    }).get
                extendingTypeEnv._2
            }.map)
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
          case ed @ EntityDecl(_, ClassToken, _, ident, _, _, _) =>
            val entityTypeEnv = tes(ed)
            ed.members.foldLeft(res) { (res1, m) =>
              m match {
                case cd @ ConstraintDecl(name, exp) =>
                  (res._1, res._2 + (exp -> getExpType(entityTypeEnv, exp)))
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
                        (fres1._1 + (pd.name -> PropertyTypeInfo(pd)), fres1._2)
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
                        if (!areTypesEqual(t, lastT, false)) {
                          val errorMsg: StringBuilder = new StringBuilder
                          errorMsg.append("Return type does not match application: " + fd.ident)
                          errorMsg.append("\n")
                          errorMsg.append(s"\tExpected $t, Found $lastT")
                          TypeChecker.error(errorMsg.toString)
                        }
                      case None => ()
                    }
                  }

                  (res1._1 + (fd -> functionTypeEnv), res1._2)
                case pd @ PropertyDecl(_, _, _, _, _, _) =>
                  pd.expr match {
                    case Some(e) =>
                      val exprType = getExpType(entityTypeEnv, e)
                      if (!areTypesEqual(exprType, pd.ty, true)) {
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
                if (!areTypesEqual(exprType, pd.ty, true)) {
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

  case class CollectType(ty: List[Type]) extends PrimitiveType {
    override def toJson1 = null
    override def toJson2 = null
  }

  case class SumType(ty: List[Type]) extends PrimitiveType {
    override def toJson1 = null
    override def toJson2 = null
  }

  case object AnyType extends Type {
    override def toJson1 = null
    override def toJson2 = null
  }

  case object UnitType extends Type {
    override def toJson1 = null
    override def toJson2 = null
  }

  def isConstructorCall(te: TypeEnv, exp: Exp): Boolean = {
    exp match {
      case IdentExp(i) =>
        if(te.map.keySet.contains(i)){
          te.map(i) match {
            case ClassTypeInfo(_,_,_) => return true
            case _ => return false
          }
        }
        else return false
      case _ => return false
    }

  }

  def getExpType(te: TypeEnv, exp: Exp): Type = {
    exp match {
      case ResultExp => AnyType
      case ParenExp(e) =>
        getExpType(te, e)
      case IdentExp(i) =>
        if (!te.contains(i)) {
          TypeChecker.error(s"$i not found in scope. Please check. Exiting.")
        }
        te(i) match {
          case pti @ PropertyTypeInfo(decl)    => pti.decl.ty
          case pti @ ParamTypeInfo(p)          => p.ty
          case pti @ FunctionTypeInfo(decl)    => decl.ty.get
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
              if (i == "collect") return CollectType(it.args)
              if (i == "sum") return SumType(it.args)
              if (i == "size") return SumType(it.args)
              if (i == "at") return SumType(it.args)

            } else {
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
                    case pti @ PropertyTypeInfo(decl) => return pti.decl.ty
                    case pti @ ParamTypeInfo(p)       => return p.ty
                    case pti @ FunctionTypeInfo(decl) => return decl.ty.get
                  }
              }
              return null
            }
          case tt @ _ =>
            if (i == "collect") return CollectType(List(tt))
            if (i == "sum") return SumType(List(tt))
            if (i == "size") return SumType(List())
            if (i == "at") return SumType(List())
            return tt
        }
        null
      case BinExp(exp1, op, exp2) =>
        val ty1 = getExpType(te, exp1)
        val ty2 = getExpType(te, exp2)

        op match {
          case LT | LTE | GT | GTE | AND | IMPL |
            OR | IFF | NEQ | EQ =>
            if (!areTypesEqual(ty1, ty2, true)) {
              TypeChecker.error(s"$exp does not type check. $ty1 and $ty2 are not equivalent.")
            }
            BoolType
          case  MUL | DIV | ADD | SUB | REM => 
            if (!areTypesEqual(ty1, ty2, false)) {
              TypeChecker.error(s"$exp does not type check. $ty1 and $ty2 are not equivalent.")
            }
            ty1
          case ASSIGN =>
            if (!areTypesEqual(ty1, ty2, false)) {
              TypeChecker.error(s"$exp does not type check. $ty1 and $ty2 are not equivalent.")
            }
            UnitType
          case ISIN | NOTISIN =>
            //TODO
            BoolType
          case _ => ty1
        }

      case FunApplExp(exp, args) =>
        if (isConstructorCall(te, exp)) {
          return IdentType(QualifiedName(List(exp.toString)), List())
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
              //return CollectType(List(getExpType(lambdaTe, lambdaExp)))
              return IdentType(QualifiedName(List("Seq")), List(getExpType(lambdaTe, lambdaExp)))
            case SumType(t) => return IntType
            case _          => return functionType
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
        if (!areTypesEqual(tbType, ebType, true)) {
          TypeChecker.error("Then and Else branch types are different.")
        }
        tbType
      case BlockExp(body) =>
        body.last match {
          case ExpressionDecl(e) => getExpType(te, e)
          case _                 => TypeChecker.error("Other than expression found in block. Not supported yet.")
        }
      case UnaryExp(op, exp) =>
        getExpType(te, exp)
      case TupleExp(exps) =>
        CartesianType(exps.map { e => getExpType(te, e) })
      case LambdaExp(pat, exp) =>
        getExpType(te, exp)
      case ReturnExp(exp) =>
        getExpType(te, exp)
      //        case ForExp(pattern, exp, body) =>
      //        case MatchExp(e, m) =>
      //        case MatchCase(p, e) =>
      case QuantifiedExp(q, b, e) =>
        // TODO
        return AnyType
      case IntegerLiteral(_)   => IntType
      case BooleanLiteral(_)   => BoolType
      case CharacterLiteral(_) => CharType
      case StringLiteral(_)    => StringType
      case RealLiteral(_)      => RealType
      case _                   => TypeChecker.error(s"Type checking for ${exp.getClass} not implemented yet!")
    }
  }

  def inferTypeFrom(exp: String, ty: Type) = ty

  typeCheck
}