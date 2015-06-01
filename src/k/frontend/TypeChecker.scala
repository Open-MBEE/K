package k.frontend

import k.frontend._
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

case class TypeEnv(map: Map[String, TypeInfo]) {
  def +(kv: (String, TypeInfo)): TypeEnv = {
    if (map.contains(kv._1)) {
      println(s"${kv._1} already defined. Please check. Exiting.")
      println(kv)
      System.exit(-1).asInstanceOf[TypeEnv]
    } else {
      TypeEnv(map + kv)
    }
  }

  def apply(k: String): TypeInfo = map(k)

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
  val collectionNames = Set("Set", "Bag", "Seq")

  private def isCollection(it: IdentType): Boolean = collectionNames(it.ident.toString)

  def areTypesEqual(t1: Type, t2: Type): Boolean = {
    (t1, t2) match {
      case (ParenType(pt1), ParenType(pt2)) => return areTypesEqual(pt1, pt2)
      case (ParenType(pt1), pt2 @ _)        => return areTypesEqual(pt1, pt2)
      case (pt1 @ _, ParenType(pt2))        => return areTypesEqual(pt1, pt2)
      case (CartesianType(ct1), CartesianType(ct2)) =>
        return (ct1 zip ct2).forall { t => areTypesEqual(t._1, t._2) }
      case (AnyType, _) => return true
      case (_, AnyType) => return true
      case _ =>
        println("Comparing " + t1 + " " + t2)
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
          println(s"it is ${it.toString}")
          println(te)
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

    // pass 1 : get class and type information 
    println("Pass 1")
    var globalTypeEnv = model.decls.foldLeft(TypeEnv(Map[String, TypeInfo]())) { (res, d) =>
      d match {
        case ed @ EntityDecl(_, _, _, ident, _, _, _) =>
          res + (ident -> ClassTypeInfo(ed, Map(), Map()))
        case td @ TypeDecl(ident, _, _) =>
          res + (ident -> TypeTypeInfo(td))
        case _ => res
      }
    }

    // pass 2 : get property info on global level and check if types exist
    println("Pass 2")
    globalTypeEnv = model.decls.foldLeft(globalTypeEnv) { (res, d) =>
      d match {
        case p @ PropertyDecl(_, name, ty, _, _, _) =>
          // check if the type exists
          if (!doesTypeExist(res, ty)) {
            println(s"Specified type $ty does not exist. Please check. Exiting.")
            System.exit(-1)
          }
          res + (name -> PropertyTypeInfo(p))
        case _ => res
      }
    }

    // pass 3: build information about properties in classes
    // store it in the global type env, but also one for each class
    println("Pass 3")
    model.decls.foreach { d =>
      d match {
        case ed @ EntityDecl(_, ClassToken, _, ident, _, _, _) =>
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

    // pass 3: build the information for expressions 
    // except expressions that are in functions (bodies)
    println("Pass 4")
    expTes = model.decls.foldLeft(Map[Exp, Type]()) { (res, d) =>
      println(s"Doing $d. + ${d.getClass}")
      d match {
        case ExpressionDecl(exp) =>
          val ty = getExpType(globalTypeEnv, exp)
          println(s"Expression $exp has type $ty")
          res + (exp -> ty)
        case ed @ EntityDecl(_, ClassToken, _, ident, _, _, _) =>
          res ++ ed.members.foldLeft(res) { (res1, m) =>
            m match {
              case ExpressionDecl(exp) =>
                val ty = getExpType(tes(ed), exp)
                println(s"Expression $exp has type $ty")
                res1 + (exp -> ty)
              case _ => res1
            }
          }
        case _ => res
      }
    }

    // pass 4: now process function bodies
    println("Pass 4")
    val result =
      model.decls.foldLeft((tes, expTes)) { (res, d) =>
        d match {
          case ed @ EntityDecl(_, ClassToken, _, ident, _, _, _) =>
            val entityTypeEnv = tes(ed)
            ed.members.foldLeft(res) { (res1, m) =>
              m match {
                case fd @
                  FunDecl(_, _, _, _, _, _) =>
                  println(s"Doing function ${fd.ident}")

                  // check if return type exists 
                  fd.ty match {
                    case Some(t) =>
                      if (!doesTypeExist(entityTypeEnv, t)) {
                        println(s"Type $t not found. Exiting.")
                        System.exit(-1)
                      }
                    case _ => ()
                  }

                  // parameters, properties
                  val functionTypeEnv = fd.params.foldLeft(entityTypeEnv) {
                    (fres, p) =>
                      println("inserting " + p.name)
                      if (!doesTypeExist(fres, p.ty)) {
                        println(s"Type ${p.ty} not found. Exiting.")
                        System.exit(-1)
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
                        println(lastT)
                        println(s"$t versus ${lastT}")
                        println(s"${t.getClass} versus ${lastT.getClass}")

                        if (!areTypesEqual(t, lastT)) {
                          println("Return type does not match application.")
                          System.exit(-1).asInstanceOf[Nothing]
                        }
                      case None => ()
                    }
                  }

                  (res1._1 + (fd -> functionTypeEnv), res1._2)

                case _ => res1
              }
            }
            res
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

  def isConstructorCall(te: TypeEnv, exp: Exp): Boolean = {
    exp match {
      case IdentExp(i) =>
        return     te.map.keySet.contains(i)
      case _ => return false
    }

  }

  def getExpType(te: TypeEnv, exp: Exp): Type = {
    println(s"getExpType: (${exp.getClass} $exp from $te")
    exp match {
      case ResultExp => AnyType
      case ParenExp(e) =>
        getExpType(te, e)
      case IdentExp(i) =>
        if (!te.contains(i)) {
          println(s"$i not found in scope. Please check. Exiting.")
          System.exit(-1).asInstanceOf[Type]
        }
        println(s"te(i) is ${te(i)}")
        te(i) match {
          case pti @ PropertyTypeInfo(decl) => pti.decl.ty
          case pti @ ParamTypeInfo(p) =>
            println("returning " + p.ty.getClass)
            p.ty
          case pti @ FunctionTypeInfo(decl) =>

            println(decl.ty.get)
            decl.ty.get
          case cti @ ClassTypeInfo(decl, p, f) =>
            IdentType(QualifiedName(List(decl.ident)), null)
          case tt @ _ =>
            println(s"Type could not be found for $exp." + tt.getClass)
            System.exit(-1).asInstanceOf[Type]
        }
      case DotExp(e, i) =>
        println("Doing dot exp for " + exp + " " + i)
        val ti = getExpType(te, e)
        println(s"ti is $ti")
        ti match {
          case it @ IdentType(_, _) =>
            if (isCollection(it)) {
              println("collection found " + e + " " + i)

              // TODO
              if (i == "collect") return CollectType(it.args)
              if (i == "sum") return SumType(it.args)
              if (i == "size") return SumType(it.args)
              if (i == "at") return SumType(it.args)

            } else {
              println("else")
              te(it.toString) match {
                case cti @ ClassTypeInfo(d, p, f) =>
                  println("class type")

                  d.members.foreach {
                    m =>
                      m match {
                        case pd @ PropertyDecl(_, id, _, _, _, _) if id == i =>
                          println(s"returning for $i ${pd.ty}")
                          return pd.ty
                        case _ => ()
                      }
                  }

                  cti.properties.foreach(kv =>
                    println("comparing " + kv._1.toString + " " + i + " " + (kv._1.toString.equals(i))))
                  cti.functions.foreach(kv =>
                    if (kv._1.toString.equals(i))
                      return kv._2.decl.ty.asInstanceOf[FunctionType].to)
                  println("after props")
                  f.foreach(kv =>
                    if (kv._1.toString.equals(i))
                      return kv._2.decl.ty.get)
                case tt @ _ =>
                  println("null, tt is " + tt)
                  return null
              }
            }
          case tt @ _ =>
            println("null2, tt is " + tt)
            return tt
        }
        null
      case BinExp(exp1, op, exp2) =>
        val ty1 = getExpType(te, exp1)
        val ty2 = getExpType(te, exp2)

        if (!ty1.eq(ty2)) {
          println(s"$exp does not type check. $ty1 and $ty2 are not equivalent.")
          System.exit(-1)
        }

        op match {
          case LT | LTE | GT | GTE | AND | IMPL |
            OR | IFF | NEQ | EQ | ISIN | NOTISIN => BoolType
          case _ => ty1
        }

      case FunApplExp(exp, args) =>
        println("function application " + exp + "(" + args + ")")

        if (isConstructorCall(te, exp)) {
          println("isConstructor")
          return AnyType
        } else {

          var functionType = getExpType(te, exp)
          println("function type for " + exp + " is " + functionType)

          // TODO ensure arguments match up

          functionType match {
            case CollectType(t) =>
              assert(args.length == 1)
              // assuming lambda expression as only argument
              // assuming ident pattern in lambda expression
              val lambdaExp = args.last.asInstanceOf[PositionalArgument].exp.asInstanceOf[LambdaExp]
              val lambdaTe = te + (lambdaExp.pat.asInstanceOf[IdentPattern].ident -> te(t.last.toString))
              println("lambdaTe is " + lambdaTe)
              val ttt = getExpType(lambdaTe, lambdaExp)

              return ttt
            case SumType(t) => return IntType
            case _          => return functionType
          }
        }
      case WhileExp(cond, body) =>
        val condType = getExpType(te, cond)
        println("cond type is " + condType)

        if (condType != BoolType) {
          println(s"Branch condition $cond does not evaluate to Bool. Please check.")
          System.exit(-1).asInstanceOf[Type]
        }

        getExpType(te, body)

      case IfExp(cond, tb, eb) =>
        val condType = getExpType(te, cond)
        println("cond type is " + condType)

        if (condType != BoolType) {
          println(s"Branch condition $cond does not evaluate to Bool. Please check.")
          System.exit(-1).asInstanceOf[Type]
        }

        val tbType = getExpType(te, tb)
        val ebType =
          eb match { case Some(ebb) => getExpType(te, ebb) case None => tbType }
        println("branch types are " + tbType + " " + ebType)

        if (!areTypesEqual(tbType, ebType)) {
          println("Then and Else branch types are different.")
          System.exit(-1).asInstanceOf[Type]
        }

        tbType
      case BlockExp(body) =>
        body.last match {
          case ExpressionDecl(e) => getExpType(te, e)
          case _ =>
            println("Other than expression found in block. Not supported yet.")
            System.exit(-1).asInstanceOf[Type]
        }
      case UnaryExp(op, exp) =>
        getExpType(te, exp)
      case TupleExp(exps) =>
        CartesianType(exps.map { e => getExpType(te, e) })
      case LambdaExp(pat, exp) =>
        getExpType(te, exp)
      case ReturnExp(exp) => 
        getExpType(te, exp)
      //        args.foreach { a =>

      //        }

      //        case ForExp(pattern, exp, body) =>

      //        case MatchExp(e, m) =>
      //        case MatchCase(p, e) =>
      //        case QuantifiedExp(q, b, e) =>
      case IntegerLiteral(_)   => IntType
      case BooleanLiteral(_)   => BoolType
      case CharacterLiteral(_) => CharType
      case StringLiteral(_)    => StringType
      case RealLiteral(_)      => RealType
      case _ =>
        println(s"Type checking for ${exp.getClass} not implemented yet!")
        System.exit(-1).asInstanceOf[Type]
    }
  }

  def inferTypeFrom(exp: String, ty: Type) = ty

  typeCheck

}