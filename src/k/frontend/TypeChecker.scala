package k.frontend

import k.frontend._
import java.util.{ IdentityHashMap => IMap }
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

object TypeCheckException extends Exception

case object TypeChecker {
  val debug = false
  var silent = false
  def error(msg: String) = {
    if (silent) Misc.silentErrorThrow("TypeChecker", msg, TypeCheckException)
    else Misc.errorThrow("TypeChecker", msg, TypeCheckException)
  }
  def log(msg: String) = if (!silent) Misc.log("TypeChecker", msg)
  def logDebug(msg: String) = if (debug && !silent) Misc.log("TypeChecker", s"DEBUG $msg")
  def warning(msg: String) = Misc.log("TypeChecker", s"Warning $msg")

  var globalTypeEnv: TypeEnv = TypeEnv(null, Map())
  var decl2TypeEnvi: Map[TopDecl, TypeEnv] = Map()
  var origTypeEnvironments: Map[TopDecl, TypeEnv] = Map()
  var exp2Type: IMap[Exp, Type] = new IMap()
  var exp2TypeEnv: IMap[Exp, TypeEnv] = new IMap()
  var keywords: Map[String, Type] = Map[String, Type]()
  var type2Decl = Map[Type, TopDecl]()
  var annotations = Map[String, AnnotationDecl]()
  var classes = Map[String, EntityDecl]()

  def reset() {
    globalTypeEnv = TypeEnv(null, Map())
    decl2TypeEnvi = Map()
    origTypeEnvironments = Map()
    exp2Type = new IMap()
    exp2TypeEnv = new IMap()
    keywords = Map[String, Type]()
    type2Decl = Map[Type, TopDecl]()
    annotations = Map[String, AnnotationDecl]()
    classes = Map[String, EntityDecl]()
    ClassHierarchy.parents = Map[EntityDecl, Set[Type]]()
    ClassHierarchy.children = Map[EntityDecl, Set[Type]]()
  }

  def getEntityDecl(className: String): EntityDecl = {
    assert(classes contains className, s"$className does not exist in 'classes'")
    classes(className)
  }

  def getPropertyDeclType(decl: PropertyDecl): Type = {
    if (!decl.multiplicity.isEmpty) {
      if (decl.modifiers.contains(Unique)) IdentType(QualifiedName(List("Set")), List(decl.ty))
      else if (decl.modifiers.contains(Ordered)) IdentType(QualifiedName(List("Seq")), List(decl.ty))
      else IdentType(QualifiedName(List("Bag")), List(decl.ty))
    } else decl.ty

  }

  def isPrimitiveType(t: Type): Boolean = {
    t.isInstanceOf[PrimitiveType] ||
      (t match {
        case CartesianType(types) => types.forall { isPrimitiveType(_) }
        case ParenType(ty)        => isPrimitiveType(ty)
        case UnitType             => true
        case _                    => false
      })
  }

  // assming that exp is an ident exp...
  def getOwningEntityDecl(exp: Exp): EntityDecl = {
    if (exp2TypeEnv.containsKey(exp)) {
      val te = exp2TypeEnv.get(exp)
      te(exp.toString) match {
        case PropertyTypeInfo(_, _, _, o) => o
        case FunctionTypeInfo(_, o)       => o
        case i @ _                        => error(s"Unexpected type info for given expression. Cannot retrieve owning decl for $exp ${i.getClass}")
      }
    } else null
  }

  def areTypesEqual(ty1: Type, ty2: Type, compatibility: Boolean): Boolean = {
    (ty1, ty2) match {
      case (i1 @ IdentType(it1, it2), i2 @ IdentType(it3, it4)) if !Misc.isCollection(i1) && !Misc.isCollection(i2) =>
        val it1Parents = ClassHierarchy.parentsTransitive(type2Decl(ty1).asInstanceOf[EntityDecl])
        val it2Parents = ClassHierarchy.parentsTransitive(type2Decl(ty2).asInstanceOf[EntityDecl])
        val same = (it1.equals(it3) && (it2 zip it4).forall { t => areTypesEqual(t._1, t._2, compatibility) })
        val inheritanceSame = !((it1Parents.intersect(it2Parents)).isEmpty) || it1Parents.contains(ty2) || it2Parents.contains(ty1)
        return same || inheritanceSame
      case _ => Misc.areTypesEqual(ty1, ty2, compatibility)
    }
  }

  def isConstructorCall(te: TypeEnv, exp: Exp): Option[Type] = {
    return exp match {
      case IdentExp(i) =>
        if (te.map.keySet.contains(i)) {
          te.map(i) match {
            case ClassTypeInfo(d) => Some(type2Decl.map(_.swap).asInstanceOf[Map[EntityDecl, Type]](d))
            case _                => None
          }
        } else None
      case _ => None
    }
  }

  def isConstructor(exp: Exp): Boolean = !isConstructorCall(globalTypeEnv, exp).isEmpty

  def isConstructorAppl(exp: Exp): Boolean =
    exp match {
      case FunApplExp(exp1, _) => isConstructor(exp1)
      case _                   => false
    }

  def getDirectSubClasses(className: String): List[String] =
    if (className == "TopLevelDeclarations") Nil
    else if (ClassHierarchy.children.contains(classes(className)))
      ClassHierarchy.children(classes(className)).map(_.toString).toList
    else Nil

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
    val res = try {
      exp2TypeEnv.get(exp)(exp.ident) match {
        case ParamTypeInfo(_)             => true
        case PatternTypeInfo(_, _)        => true
        case PropertyTypeInfo(_, g, c, _) => !g && !c
        case _                            => false
      }
    } catch {
      case _: Throwable => false
    }
    logDebug(s"isLocal $exp $res")
    res
  }

}

import TypeChecker._

case class TypeEnv(decl: TopDecl, map: Map[String, TypeInfo]) {
  def overwrite(kv: (String, TypeInfo)) = TypeEnv(decl, map + kv)
  def union(kv: (String, TypeInfo)): TypeEnv = {
    if (map.contains(kv._1)) {
      error(s"${kv._1} already defined. Please check. Exiting.")
    } else {
      TypeEnv(decl, map + kv)
    }
  }

  /*
   * Overwrites globals with locals and member variables
   * Does not allow function overloading
   * Uses decl from this 
   */
  def union2(te: TypeEnv): TypeEnv = {
    var newMap = Map[String, TypeInfo]()
    map.foreach { kv => newMap += (kv._1 -> kv._2) }
    te.map.foreach {
      kv =>
        (kv._1, kv._2) match {
          case (functionName, FunctionTypeInfo(fdecl, fowner)) =>
            if (map.contains(functionName)) {
              val ofdecl = map(functionName).asInstanceOf[FunctionTypeInfo].decl
              val areReturnTypesEqual = areTypesEqual(fdecl.ty.getOrElse(UnitType),
                ofdecl.ty.getOrElse(UnitType), false)
              val areParamsEqual = (fdecl.params zip ofdecl.params).forall { p => areTypesEqual(p._1.ty, p._2.ty, false) }
              if (!(areReturnTypesEqual && areParamsEqual)) {
                error(s"${fdecl.ident} redefined with different type.")
              }
            }
            newMap += (kv._1 -> kv._2)
          case (pname, pti @ PropertyTypeInfo(pdecl, global, classMember, powner)) =>
            if (map.contains(pname)) {
              if (!map(pname).isInstanceOf[PropertyTypeInfo]) {
                error(s"$pname overloaded. Currently not supported.")
              }
              val opti = map(pname).asInstanceOf[PropertyTypeInfo]
              if (opti.global && pti.global && opti != pti) {
                error(s"$pname has been declared multiple times in the global scope.")
              }
              if (opti.global && !pti.global) {
                newMap += (pname -> pti)
              }
              if (pti.global && !opti.global) {
                newMap += (pname -> opti)
              }
              if (!pti.global && !opti.global) {
                error(s"$pname declared multiple times.")
              }
            } else {
              newMap += (kv._1 -> kv._2)
            }
          case _ => newMap += (kv._1 -> kv._2)
        }
    }
    TypeEnv(decl, newMap)
  }

  def apply(k: String): TypeInfo = {
    if (!map.contains(k)) error(s"Could not find declaration for $k")
    else map(k)
  }
  def contains(k: String): Boolean = map.contains(k)

  override def toString = {
    if (decl != null) s"${decl.asInstanceOf[EntityDecl].ident} : $map"
    else s"Global : $map"
  }
}

trait TypeInfo

case class FunctionTypeInfo(decl: FunDecl, owner: EntityDecl) extends TypeInfo {
  val returnType: Option[Type] = decl.ty

  override def toString() =
    s"""Function: ${decl.ident} : (${decl.params.mkString(",")}) -> ${returnType.getOrElse("")}"""
}
case class ClassTypeInfo(decl: EntityDecl) extends TypeInfo {
  override def toString = s"Class: ${decl.ident}"
}
case class PropertyTypeInfo(decl: PropertyDecl, global: Boolean, classMember: Boolean, owner: EntityDecl) extends TypeInfo {
  override def toString =
    s"Property: ${decl.name} : ${decl.ty} $global ${if (owner != null) owner.ident}"
}
case class TypeTypeInfo(decl: TypeDecl) extends TypeInfo
case class ParamTypeInfo(p: Param) extends TypeInfo
case class PatternTypeInfo(p: Pattern, ty: Type) extends TypeInfo

object ClassHierarchy {
  var parents = Map[EntityDecl, Set[Type]]()
  var children = Map[EntityDecl, Set[Type]]()

  def buildHierarchy(model: Model) {

    for (ed @ EntityDecl(_, _, _, _, _, _, _) <- model.decls) {
      var edParents: Set[Type] = Set()
      if (ed.entityToken.isInstanceOf[IdentifierToken]) {
        edParents += keywords(ed.entityToken.asInstanceOf[IdentifierToken].name)
      }
      edParents ++= buildHierarchy(ed, type2Decl, Set())
      parents += (ed -> edParents)
      edParents.foreach { p =>
        val parent = type2Decl(p).asInstanceOf[EntityDecl]
        if (!children.contains(parent)) children = children + (parent -> Set())
        children = children +
          (parent ->
            (children(parent) +
              (type2Decl.map(_.swap).asInstanceOf[Map[TopDecl, Type]](ed))))
      }
    }

    // ensure that one cannot reach itself in the inheritance scheme
    val decl2Type = type2Decl.map(_.swap).asInstanceOf[Map[EntityDecl, Type]]
    parents.foreach { kv =>
      if (parentsTransitive(kv._1).contains(decl2Type(kv._1)))
        error(s"${kv._1.ident} has a cyclic inheritance structure.")
    }

  }

  def childrenTransitive(e: EntityDecl, visited: Set[Type] = Set()): List[Type] = {
    val declType = type2Decl.map(_.swap).asInstanceOf[Map[EntityDecl, Type]](e)
    if (visited.contains(declType)) return Nil
    val immediateChildren = children.getOrElse(e, Nil).toList
    val subChildren = (for (child <- immediateChildren)
      yield childrenTransitive(type2Decl(child).asInstanceOf[EntityDecl], visited + declType)).flatten
    (immediateChildren ++ subChildren).distinct
  }

  def parentsTransitive(e: EntityDecl, visited: Set[Type] = Set()): List[Type] = {
    val declType = type2Decl.map(_.swap).asInstanceOf[Map[EntityDecl, Type]](e)
    if (visited.contains(declType)) return Nil
    val immediateParent = parents.getOrElse(e, Nil).toList.reverse
    val iParents = immediateParent.foldLeft(List[Type]()) {
      (res, p) =>
        parentsTransitive(type2Decl(p).asInstanceOf[EntityDecl], visited + declType) ++ (p :: res)
    }
    iParents.distinct
  }

  def buildHierarchy(d: EntityDecl, types: Map[Type, TopDecl], visited: Set[EntityDecl]): Set[Type] = {
    d.extending.foldLeft(Set[Type]()) { (res, e) =>
      assert(types(e).isInstanceOf[EntityDecl])
      assert(!visited.contains(types(e).asInstanceOf[EntityDecl]))
      res + e
    }
  }

}

class TypeChecker(model: Model) {

  private def doesTypeExist(te: TypeEnv, ty: Type): Boolean = {
    ty match {
      case it @ IdentType(_, _) =>
        if (Misc.isCollection(it)) return it.args.forall { t => doesTypeExist(te, t) }
        else return te.contains(it.toString)
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

  private def exprContainsAssignment(e: Exp): Boolean = {
    e match {
      case ParenExp(e) => exprContainsAssignment(e)
      case BinExp(exp1, op, exp2) =>
        if (op == ASSIGN) true
        else exprContainsAssignment(exp1) || exprContainsAssignment(exp2)
      case WhileExp(cond, body)       => true
      case IfExp(cond, tb, eb)        => exprContainsAssignment(tb) || (if (!eb.isEmpty) exprContainsAssignment(eb.get) else false)
      case BlockExp(body)             => body.foldLeft(false) { (res, b) => res || declContainsAssignment(b) }
      case UnaryExp(op, exp)          => exprContainsAssignment(exp)
      case LambdaExp(pat, exp)        => exprContainsAssignment(exp)
      case ReturnExp(exp)             => exprContainsAssignment(exp)
      case ForExp(pattern, exp, body) => true
      case QuantifiedExp(q, b, e)     => exprContainsAssignment(e)
      case _                          => false
    }
  }

  private def declContainsAssignment(d: MemberDecl): Boolean = {
    d match {
      case fd @ FunDecl(_, _, _, _, _, _) => fd.body.foldLeft(false)((res, b) => res || declContainsAssignment(b))
      case ed @ ExpressionDecl(exp)       => exprContainsAssignment(exp)
      case pd @ PropertyDecl(_, _, _, _, _, _) =>
        if (pd.assignment.isEmpty) false
        else pd.assignment.get
      case _ => false
    }

  }

  private def functionContainsReq(d: FunDecl): Boolean = {
    d.body.foldLeft(false)((res, b) => res || b.isInstanceOf[ConstraintDecl])
  }

  def smtCheck {
    /*
     * For SMT we disallow statements with side effects and functions returning objects
     */
    model.decls.foreach { d =>
      if (d.isInstanceOf[MemberDecl]) {
        if (declContainsAssignment(d.asInstanceOf[MemberDecl])) {
          error(s"Found assignment in declaration $d. SMT mode disallows assignments.")
        }
      }

      if (d.isInstanceOf[FunDecl]) {
        if (!isPrimitiveType(d.asInstanceOf[FunDecl].ty.getOrElse(UnitType))) {
          error(s"Function $d does not return a primitive type. SMT mode disallows this.")
        }
        if (functionContainsReq(d.asInstanceOf[FunDecl])) {
          error(s"Function $d contains a constraint. SMT mode disallows this.")
        }
      }

      if (d.isInstanceOf[EntityDecl]) {
        for (fd @ FunDecl(_, _, _, _, _, _) <- d.asInstanceOf[EntityDecl].members) {
          val lastMemberIsConstructorCall =
            if (fd.body.length == 0) false
            else fd.body.last match {
              case ExpressionDecl(e) => !isConstructorCall(exp2TypeEnv.get(e), e).isEmpty
              case _                 => false
            }
          if (!isPrimitiveType(fd.ty.getOrElse(UnitType)) && lastMemberIsConstructorCall) {
            error(s"Function $fd does not return a primitive type. SMT mode disallows this.")
          }
          if (functionContainsReq(fd)) {
            error(s"Function $fd contains a constraint. SMT mode disallows this.")
          }
        }
      }
    }
  }

  private def typeCheck: Boolean = {

    if (model == null) return true

    // get declared annotations and corresponding types
    model.annotations.foreach { d =>
      val ad = d.asInstanceOf[AnnotationDecl]
      if (annotations.contains(ad.name)) error(s"Redefining annotation ${ad.name}.")
      annotations += (ad.name -> ad)
    }

    // get class information
    model.decls.foreach { d =>
      d match {
        case ed @ EntityDecl(_, _, _, ident, _, _, _) =>
          val dED = d.asInstanceOf[EntityDecl]
          keywords = ed.keyword match {
            case Some(kw) =>
              if (keywords.contains(kw)) error(s"Keywords $kw is already being used.")
              else keywords + (kw -> IdentType(QualifiedName(List(ident)), List()))
            case _ => keywords
          }
          type2Decl = type2Decl + (IdentType(QualifiedName(List(ident)), List()) -> dED)
          classes = classes + (ident -> dED)
          globalTypeEnv = globalTypeEnv.union(ident -> ClassTypeInfo(ed))
        case td @ TypeDecl(ident, _, _) =>
          type2Decl = type2Decl + (IdentType(QualifiedName(List(ident)), List()) -> d.asInstanceOf[TypeDecl])
          globalTypeEnv = globalTypeEnv.union(ident -> TypeTypeInfo(td))
        case _ => ()
      }
    }

    // build inheritance model
    ClassHierarchy.buildHierarchy(model)

    // pass: get property info on global level and check if types exist
    model.decls.foreach { d =>
      d match {
        case p @ PropertyDecl(_, name, ty, _, _, _) =>
          if ((p.modifiers.contains(Var) && p.modifiers.contains(Val)) ||
            ((p.modifiers.contains(Var) || p.modifiers.contains(Val)) &&
              (p.modifiers.contains(Ordered) || p.modifiers.contains(Unique) ||
                p.modifiers.contains(Source) || p.modifiers.contains(Target))))
            error(s"Property $name has conflicting modifiers: ${p.modifiers.mkString(",")}.")

          if (!doesTypeExist(globalTypeEnv, ty)) error(s"Specified type $ty does not exist. Please check. Exiting.")
          globalTypeEnv = globalTypeEnv.union(name -> PropertyTypeInfo(p, true, false, null))
        case _ => ()
      }
    }

    // pass: process functions (not bodies of functions) at top level
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
          res.union(fd.ident -> FunctionTypeInfo(fd, null))
        case _ => res
      }
    }

    // pass: build information about properties/functions in classes
    // store it in the global type env, but also one for each class
    model.decls.foreach { d =>
      d match {
        case ed @ EntityDecl(_, token, _, ident, _, _, _) if token != AssocToken =>
          // add 'this' to the type env
          var classTypeEnv = TypeEnv(ed, globalTypeEnv.map + ("this" -> ClassTypeInfo(ed)))
          ed.members.foreach { m =>
            m match {
              case pd @ PropertyDecl(_, _, _, _, _, _) =>
                if (!doesTypeExist(classTypeEnv, pd.ty)) error(s"Specified type ${pd.ty} does not exist. Please check. Exiting.")
                classTypeEnv = classTypeEnv.overwrite(pd.name -> PropertyTypeInfo(pd, false, true, ed))
              case fd @ FunDecl(_, _, _, _, _, _) =>
                classTypeEnv = classTypeEnv.union(fd.ident -> FunctionTypeInfo(fd, ed))
              case _ => ()
            }
          }
          decl2TypeEnvi += (d -> classTypeEnv)
          origTypeEnvironments += (d -> classTypeEnv)
        case ed @ EntityDecl(_, AssocToken, _, ident, _, _, _) =>

          // only support 2 members in associations
          if (ed.members.length != 2)
            error(s"$ident contains more than two associations.\n\tCurrently only a source and target are supported for associations.")

          // members must be source and target 
          if (!ed.members.forall { m =>
            m.asInstanceOf[PropertyDecl].modifiers != null &&
              (m.asInstanceOf[PropertyDecl].modifiers.contains(Source) ||
                m.asInstanceOf[PropertyDecl].modifiers.contains(Target))
          })
            error(s"$ident does not define a source or target correctly.")

          // members must be of ident type that is a user defined class
          if (!(ed.members.forall { m =>
            m.asInstanceOf[PropertyDecl].ty.isInstanceOf[IdentType]
          })) error(s"$ident association uses a non user defined type as source/target.")
          var classTypeEnv = TypeEnv(ed, globalTypeEnv.map + ("this" -> ClassTypeInfo(ed)))
          classTypeEnv = ed.members.foldLeft(classTypeEnv) {
            (res, m) =>
              m match {
                case pd @ PropertyDecl(_, _, _, _, _, _) =>
                  res.overwrite(pd.name -> PropertyTypeInfo(pd, false, true, ed))
                case _ =>
                  error(s"$ident association contains members besides functions.\n\tCurrently this is unsupported.")
              }
          }

          // also insert the source/target in respective class
          val m1 = ed.members(0).asInstanceOf[PropertyDecl]
          val m2 = ed.members(1).asInstanceOf[PropertyDecl]
          val cte0 =
            decl2TypeEnvi.find(p =>
              p._1 match {
                case ed1 @ EntityDecl(_, t, _, ident, _, _, _) if t != AssocToken =>
                  if (ed1.ident.equals(m1.ty.toString)) true
                  else false
                case _ =>
                  false
              }).get

          val cte1 =
            decl2TypeEnvi.find(p =>
              p._1 match {
                case ed1 @ EntityDecl(_, t, _, ident, _, _, _) if t != AssocToken =>
                  if (ed1.ident.equals(m2.ty.toString)) true
                  true
                case _ =>
                  false
              }).get

          decl2TypeEnvi += (cte0._1 -> (cte0._2.union((m2.name) -> PropertyTypeInfo(m2, false, true, ed))))
          origTypeEnvironments += (cte0._1 -> (cte0._2.union((m2.name) -> PropertyTypeInfo(m2, false, true, ed))))
          decl2TypeEnvi += (cte1._1 -> (cte1._2.union((m1.name) -> PropertyTypeInfo(m1, false, true, ed))))
          origTypeEnvironments += (cte1._1 -> (cte1._2.union((m1.name) -> PropertyTypeInfo(m1, false, true, ed))))
          decl2TypeEnvi += (d -> classTypeEnv)
          origTypeEnvironments += (d -> classTypeEnv)

        case _ => ()
      }
    }

    logDebug(s"GlobalTE: $globalTypeEnv")

    // pass: do inheritance for each class and associations
    model.decls.foreach { d =>
      d match {
        case ed @ EntityDecl(_, t, _, ident, _, _, _) if t != AssocToken =>
          val classTypeEnv = decl2TypeEnvi(d)
          val extending = ClassHierarchy.parentsTransitive(ed)
          val newClassTypeEnv = {
            val extendingEnv = extending.foldLeft(TypeEnv(ed, Map[String, TypeInfo]())) {
              (res, ex) =>
                origTypeEnvironments(classes(ex.asInstanceOf[IdentType].ident.toString)).union2(res)
            }
            classTypeEnv.union2(extendingEnv)
          }
          decl2TypeEnvi += (d -> newClassTypeEnv)
        case _ => ()
      }
    }

    decl2TypeEnvi.foreach(kv => logDebug(s"${kv._2}"))

    // pass: build the information for expressions 
    // except expressions that are in functions (bodies)
    model.decls.foreach { d =>
      d match {
        case ExpressionDecl(exp) => exp2Type.put(exp, getExpType(globalTypeEnv, exp))
        case ed @ EntityDecl(_, _, _, ident, _, _, _) =>
          ed.members.foreach { m =>
            m match {
              case ExpressionDecl(exp) => exp2Type.put(exp, getExpType(decl2TypeEnvi(ed), exp))
              case _                   => ()
            }
          }
        case cd @ ConstraintDecl(name, exp) => exp2Type.put(exp, getExpType(globalTypeEnv, exp))
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
          exp2Type.put(exp, ty)
        case fd @ FunDecl(_, _, _, _, _, _) =>
          processFunction(fd, globalTypeEnv, null)
        case ed @ EntityDecl(_, token, _, ident, _, _, _) =>
          val entityTypeEnv = decl2TypeEnvi(ed)

          ed.annotations.foreach { a =>
            val annotationExpType = getExpType(entityTypeEnv, a.exp)
            val annotationType = annotations(a.name).ty
            if (!areTypesEqual(annotationExpType, annotationType, false))
              error(s"Annotation $a does not type check.")
          }

          ed.members.foreach { m =>
            m match {
              case cd @ ConstraintDecl(name, exp) =>
                val ty = getExpType(entityTypeEnv, exp)
                if (ty != BoolType && ty != AnyType) {
                  error(s"Condition $exp is not of type Bool.")
                }
                exp2Type.put(exp, ty)
              case fd @ FunDecl(_, _, _, _, _, _) =>
                processFunction(fd, entityTypeEnv, ed)
              case pd @ PropertyDecl(_, _, _, _, _, _) =>
                pd.expr match {
                  case Some(e) =>
                    val exprType = getExpType(entityTypeEnv, e)
                    if (!areTypesEqual(exprType, pd.ty, true)) {
                      error(s"Type does not match: ${pd.name}. Expected ${pd.ty}, Found $exprType")
                    }
                    exp2Type.put(e, exprType)
                  case None => ()
                }
              case ExpressionDecl(e) =>
                val exprType = getExpType(entityTypeEnv, e)
                if (exprType != UnitType) {
                  error(s"Expression in class does not have unit type: $e")
                }
                exp2Type.put(e, exprType)
              case _ => ()
            }
          }
        case pd @ PropertyDecl(_, _, _, _, _, _) =>
          if (!pd.expr.isEmpty) {
            val exprType = getExpType(globalTypeEnv, pd.expr.get)
            if (!areTypesEqual(exprType, pd.ty, true)) {
              error(s"Type does not match: ${pd.name}. + Expected ${pd.ty}, Found $exprType")
            }
            exp2Type.put(pd.expr.get, exprType)
          }
        case _ => ()
      }
    }
    true
  }

  def updateTypeEnvForBody(body: List[MemberDecl], te: TypeEnv, owner: EntityDecl): TypeEnv = {
    var newTe = te
    body.foreach { m =>
      m match {
        case pd @ PropertyDecl(_, _, _, _, _, _) =>
          if (!doesTypeExist(newTe, pd.ty)) {
            error(s"Type ${pd.ty} not found. Exiting.")
          }

          pd.expr match {
            case Some(e) =>
              val exprType = getExpType(newTe, e)
              if (!areTypesEqual(exprType, pd.ty, true)) {
                error(s"Type does not match: ${pd.name}. Expected ${pd.ty}, Found $exprType")
              }
              exp2Type.put(e, exprType)
            case None => ()
          }
          newTe = newTe.overwrite(pd.name -> PropertyTypeInfo(pd, false, false, owner))
        case _ => ()
      }
    }
    newTe
  }

  def processFunction(fd: FunDecl, entityTypeEnv: TypeEnv, owner: EntityDecl) {
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

    functionTypeEnv = updateTypeEnvForBody(fd.body, functionTypeEnv, owner)

    // process expressions in function
    var lastT: Type = null
    for (i <- Range(0, fd.body.length)) {
      val m = fd.body(i)
      val mType = {
        m match {
          case ExpressionDecl(exp) =>
            lastT = getExpType(functionTypeEnv, exp)
            if (exp.isInstanceOf[ReturnExp] && !fd.ty.isEmpty) {
              if (!areTypesEqual(lastT, fd.ty.get, true))
                error(s"Return type does not match for $exp in function ${fd.ident}")
            }
            exp2Type.put(exp, lastT)
            lastT
          case _ => UnitType
        }
      }
      if (i < fd.body.length - 1 && mType != UnitType)
        error(s"Non-unit type expression found in function body: $m")
      if (i == fd.body.length - 1 && !fd.ty.isEmpty) {
        if (!areTypesEqual(mType, fd.ty.get, true))
          error(s"Return type does not match for $m in function ${fd.ident}")
      }
    }

    // check return matches last expression type
    if (lastT != null && !fd.ty.isEmpty) {
      if (!areTypesEqual(fd.ty.get, lastT, true)) {
        error(s"Return type does not match body: ${fd.ident}. Expected ${fd.ty.get}, Found $lastT.")
      }
    }

    decl2TypeEnvi = decl2TypeEnvi + (fd -> functionTypeEnv)

  }

  def getFunDecl(te: TypeEnv, exp: Exp): (Boolean, FunDecl) = {
    logDebug(s"getFunDecl: $exp in $te")

    val result: (Boolean, FunDecl) = exp match {
      case ParenExp(e) => getFunDecl(te, e)
      case IdentExp(i) =>
        if (!te.contains(i)) {
          error(s"$i not found in scope for $exp.")
        }
        te(i) match {
          case pti @ FunctionTypeInfo(decl, _) => (false, decl)
          case _                               => error(s"Unexpected type found for expression during function application. $exp")
        }
      case DotExp(e, i) =>
        val ti = getExpType(te, e)
        if (i == "toString") (true, null)
        else ti match {
          case it @ IdentType(_, _) =>
            if (Misc.isCollection(it)) {
              (true, null)
            } else {
              te(it.toString) match {
                case cti @ ClassTypeInfo(d) =>
                  val classTypeEnv = decl2TypeEnvi(d)
                  classTypeEnv(i) match {
                    case pti @ FunctionTypeInfo(decl, _) => (false, decl)
                    case _                               => error(s"Unknown type info received for expression when discovering function type. $exp")
                  }
              }
            }
          case _ => error(s"Unexpected expression type found in function application. $exp $ti")
        }

      case _ => error(s"Unexpected expression found in function application. $exp")
    }
    return result
  }

  def getExpType(te: TypeEnv, exp: Exp): Type = {
    logDebug(s"getExpType: $exp in $te")
    val result: Type = exp match {
      case ResultExp   => AnyType //TODO
      case ParenExp(e) => getExpType(te, e)
      case IdentExp(i) =>
        if (!te.contains(i)) {
          error(s"$i not found in scope for $exp.")
        }
        te(i) match {
          case pti @ PropertyTypeInfo(decl, _, _, _) => getPropertyDeclType(decl)
          case pti @ ParamTypeInfo(p)                => p.ty
          case pti @ FunctionTypeInfo(decl, _) =>
            decl.ty match {
              case Some(t) => t
              case None    => UnitType
            }
          case cti @ ClassTypeInfo(decl) =>
            ClassType(QualifiedName(List(decl.ident)))
          case pti @ PatternTypeInfo(p, t) => t
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
              else if (i == "subList") CollectType(it.args)
              else error(s"getExpType: error, type could not be discovered for $exp.")
            } else {
              if (i == "collect") CollectType(List(it))
              else if (i == "sum") SumType(it.args)
              else if (i == "size") SumType(it.args)
              else if (i == "at") SumType(it.args)
              else if (i == "toString") StringType
              else {
                // get class type environment
                val classTypeEnv = decl2TypeEnvi(classes(it.ident.toString))
                classTypeEnv(i) match {
                  case pti @ PropertyTypeInfo(decl, _, _, _) => getPropertyDeclType(decl)
                  case pti @ ParamTypeInfo(p)                => p.ty
                  case pti @ FunctionTypeInfo(decl, _)       => decl.ty.get
                }
              }
            }
          case tt @ _ =>
            if (i == "collect") CollectType(List(tt))
            else if (i == "sum") SumType(List(tt))
            else if (i == "size") SumType(List(tt))
            else if (i == "at") SumType(List(tt))
            else if (i == "toString") StringType
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
      case FunApplExp(fexp, args) =>
        val callToConstructor = isConstructorCall(te, fexp)
        if (!callToConstructor.isEmpty) {
          val ty = callToConstructor.get
          val decl = type2Decl(ty)

          assert(decl.isInstanceOf[EntityDecl])

          val declTypeEnvironment = decl2TypeEnvi(decl)

          if (!args.forall { a => a.isInstanceOf[NamedArgument] })
            error(s"Have to use named arguments in a constructor function call: $exp")

          if (!args.forall {
            a =>
              val namedArg = a.asInstanceOf[NamedArgument]
              val lhsType =
                {
                  declTypeEnvironment(namedArg.ident) match {
                    case PropertyTypeInfo(pd, _, _, _) => pd.ty
                    case _                             => error(s"Property ${namedArg.ident} could not be found for ${decl.asInstanceOf[EntityDecl].ident}")
                  }
                }
              val rhsType = getExpType(te, namedArg.exp)
              val res = areTypesEqual(lhsType, rhsType, false)
              if (!res) {
                log(s"Types are $lhsType $rhsType.")
              }
              res
          })
            error(s"Incorrect arguments to constructor call: $exp")

          ty
        } else {
          var functionReturnType = getExpType(te, fexp)
          var (collectionFunction, functionDecl) = getFunDecl(te, fexp)

          if (functionDecl == null)
            error(s"Could not find function for $exp.")

          // ensure arguments match param types (unless collection function)
          if (!args.forall { a => a.isInstanceOf[PositionalArgument] })
            error(s"Cannot use named arguments to a non-constructor function call: $exp")

          if (args.length != functionDecl.params.length)
            error(s"Incorrect number of arguments $exp")

          if (!collectionFunction &&
            !((functionDecl.params zip args).forall { pa =>
              val p2Type = getExpType(te, pa._2.asInstanceOf[PositionalArgument].exp)
              areTypesEqual(pa._1.ty, p2Type, false)
            }))
            error(s"Arguments to function seem incorrect: $exp")

          functionReturnType match {
            case CollectType(t) =>
              if (args.length > 1)
                IdentType(QualifiedName(List("Seq")), t)
              else {
                assert(args.length <= 1)
                // TODO
                // assuming lambda expression as only argument
                // assuming ident pattern in lambda expression
                val lambdaExp = args.last.asInstanceOf[PositionalArgument].exp.asInstanceOf[LambdaExp]
                val lambdaTe = te.overwrite(lambdaExp.pat.asInstanceOf[IdentPattern].ident -> te(t.last.toString))
                // CollectType(List(getExpType(lambdaTe, lambdaExp)))
                IdentType(QualifiedName(List("Seq")), List(getExpType(lambdaTe, lambdaExp)))
              }
            case SumType(t) => IntType
            case _          => functionReturnType
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
        var lastType: Type = UnitType
        val bodyTypes = body.foreach {
          b =>
            b match {
              case ExpressionDecl(e)              => lastType = getExpType(te, e)
              case PropertyDecl(_, _, _, _, _, _) => UnitType
              case _                              => error(s"Unsupported member in block: $b")
            }
        }
        lastType
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
        if (getExpType(newTe, exp) != BoolType)
          error(s"$exp is not of type Bool")
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
        if (getExpType(newTe, e) != BoolType)
          error(s"$exp does not evaluate to Bool")
        BoolType
      case IntegerLiteral(_)   => IntType
      case BooleanLiteral(_)   => BoolType
      case CharacterLiteral(_) => CharType
      case StringLiteral(_)    => StringType
      case RealLiteral(_)      => RealType
      case ThisLiteral =>
        type2Decl.map(_.swap).asInstanceOf[Map[TopDecl, Type]](te("this").asInstanceOf[ClassTypeInfo].decl)
      case _ => error(s"Type checking for ${exp.getClass} not implemented yet!")
    }
    exp2Type.put(exp, result)
    exp2TypeEnv.put(exp, te)

    logDebug(s"getExpType: $exp $result")

    return result
  }

  def inferTypeFrom(exp: String, ty: Type) = ty

  typeCheck
}