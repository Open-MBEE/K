package k.frontend

import org.json.JSONObject
import java.text._
import org.json.JSONArray
import scala.collection.mutable.Stack
import java.io.File

// NOTE: toJson is the correct way of doing JSON
// toJson2 is the MMS way of doing JSON, which in a lot of cases
// is ill defined and in those cases, it is set to toJson
// for expressions, toJson2 is LISP style... 

object ASTOptions {
  var debug: Boolean = false
  var silent: Boolean = false
  var useJson1: Boolean = true
  var numberOfInstances: Int = 5
  var checkPostNoBody: Boolean = false
}

object UtilAST {
  def ???(comment: String): Nothing = {
    println("NOT IMPLEMENTED " + comment)
    null.asInstanceOf[Nothing]
  }

  def ??? : Nothing = ???("")

  def debug(text: String) {
    if (ASTOptions.debug) println(s"[-- debug --: $text]")
  }

  def dotDepth(exp: Exp): Int = {
    exp match {
      case DotExp(exp1, _) => 1 + dotDepth(exp1)
      case _               => 0
    }
  }
}
import UtilAST._
import ClassHierarchy._
import TypeChecker._

object K2SMTException extends Exception

object UtilSMT {
  var constraintCounter = 0
  var constraintMessageMap: Map[String, String] = Map()
  var objectGraph: HeapLayout = null
  var statistics: Statistics = null
  var variableCounter: Int = 0
  var heapInitializerConstants: List[(Int, String, String)] = Nil // index into heap, class name, constant

  def newVariable(): String = {
    variableCounter += 1
    s"var_$variableCounter"
  }

  def saveConstraintMapping(cPrint: String) {
    UtilSMT.constraintMessageMap = UtilSMT.constraintMessageMap + (s"_xkassert${UtilSMT.constraintCounter}" -> cPrint)
    UtilSMT.constraintCounter += 1
  }

  def headline1(msg: String): String = {
    val line = "=" * (msg.length + 9)
    var result = s"; $line\n"
    result += s"; === $msg: ===\n"
    result += s"; $line\n\n"
    result
  }

  def headline2(msg: String): String = {
    val line = "-" * (msg.length + 5)
    var result = s"; $line\n"
    result += s";   $msg:\n"
    result += s"; $line\n\n"
    result
  }

  def headline3(msg: String): String = {
    s"; --- $msg: ---\n\n"
  }

  def headline4(msg: String): String = {
    s"; -- [$msg]\n\n"
  }

  object Names {
    val mainClass: String = "TopLevelDeclarations"
  }

  var subClassMap: Map[String, List[String]] = Map()
  var constantsToDeclare: List[(String, Type)] = Nil
  var gettersToDeclare: Set[String] = Set()
  var constantCounter: Int = 0
  var createdLocals: Set[String] = Set() // locals not detected by type checker

  def reset {
    subClassMap = Map()
    constantsToDeclare = Nil
    constantCounter = 0
    heapInitializerConstants = Nil
  }

  def error(msg: String) = {
    val msgFull = s"Unsupported: $msg"
    if (ASTOptions.silent) Misc.silentErrorThrow("K2SMT", msgFull, K2SMTException)
    else Misc.errorThrow("K2SMT", msgFull, K2SMTException)
  }
  // TODO: should these refer to the TypeChecker?:
  def log(msg: String) = if (!ASTOptions.silent) Misc.log("TypeChecker", msg)
  def logDebug(msg: String) = if (ASTOptions.debug && !ASTOptions.silent) Misc.log("TypeChecker", s"DEBUG $msg")
  def warning(msg: String) = Misc.log("TypeChecker", s"Warning $msg")

  def sortEntityDecls(unsortedEntityDecls: List[EntityDecl]): List[EntityDecl] = {
    val entityDeclPairs =
      for (ed1 <- unsortedEntityDecls; ed2 <- TypeChecker.getDirectSubClasses(ed1.ident)) yield (ed1, classes(ed2))
    val sortedEntityDecls = Misc.topologicalSort(entityDeclPairs).toList
    sortedEntityDecls ++ (unsortedEntityDecls.filterNot(sortedEntityDecls.contains(_)))
  }

  def wellFormedType(ty: Type): Boolean =
    ty match {
      case CartesianType(types)          => types forall wellFormedType
      case ParenType(ty)                 => wellFormedType(ty)
      case BoolType | IntType | RealType => true
      case IdentType(_, _)               => true
      case FunctionType(_, _) | SubType(_, _, _) | CharType | StringType | UnitType =>
        //UtilSMT.error(s"$ty in local property declaration")
        false
    }

  def ignoreMember(memberDecl: MemberDecl): Boolean = {
    memberDecl match {
      case PropertyDecl(modifiers, name, ty, multiplicity, assignment, expr) =>
        !wellFormedType(ty)
    }
  }

  def funDeclRefinement(fd1: FunDecl, fd2: FunDecl): Boolean = {
    val FunDecl(ident1, typeParams1, params1, ty1, spec1, body1) = fd1
    val FunDecl(ident2, typeParams2, params2, ty2, spec2, body2) = fd2
    ident1 == ident2 &&
      body1.isEmpty &&
      !(spec2.isEmpty && body2.isEmpty)
  }

  def compressFunDecls(funDecls: List[FunDecl]): List[FunDecl] = {
    val reduced: List[FunDecl] = eliminateDuplicates(funDecls)
    for (curFD @ FunDecl(ident, typeParams, params, ty, spec, body) <- reduced) yield {
      val relevant: List[FunDecl] = funDecls.filter(fd => fd.ident == ident && !fd.eq(curFD))
      val superSpec: List[FunSpec] = relevant map (_.spec) flatten
      val newSpec: List[FunSpec] = superSpec ++ spec
      FunDecl(ident, typeParams, params, ty, superSpec ++ spec, body)
    }
  }

  def eliminateDuplicates(funDecls: List[FunDecl]): List[FunDecl] = {
    funDecls match {
      case Nil => Nil
      case fd1 :: rest =>
        val remainder = eliminateDuplicates(rest)
        if (rest.exists(fd2 => UtilSMT.funDeclRefinement(fd1, fd2)))
          remainder
        else
          fd1 :: remainder
    }
  }

  def memberList2SMT(members: List[MemberDecl], className: String, subtyping: Boolean, level: Int = 0): String = {
    members match {
      case ExpressionDecl(exp) :: Nil =>
        val expSMT = exp.toSMT(className, subtyping)
        "  " + ("  " * level) + expSMT + (")" * level)
      case pd @ PropertyDecl(modifiers, name, ty, None, _, exp) :: rest =>
        if (!modifiers.forall(_ == Val))
          UtilSMT.error(s"modifier in $pd")
        if (!wellFormedType(ty))
          UtilSMT.error(s"$ty in local property declaration $pd")
        exp match {
          case Some(e) =>
            if (UtilSMT.isConstructorAppl(e))
              UtilSMT.error(s"constructor application $e not allowed in block")
            val expSMT = e.toSMT(className, subtyping)
            "  " + ("  " * level) + s"(let (($name $expSMT))\n" +
              memberList2SMT(rest, className, subtyping, level + 1)
          case None =>
            UtilSMT.error(s"expression is missing in local property declaration $pd")
        }
      case _ =>
        UtilSMT.error(s"body of function\n${members.mkString("\n")}")
    }
  }

  def getSubClassesTransitive(className: String): List[String] = {
    if (subClassMap contains className)
      subClassMap(className)
    else {
      val classes = getSubClasses(className)
      subClassMap = subClassMap + (className -> classes)
      classes
    }
  }

  def getNewConstant(ty: Type): String = {
    constantCounter += 1
    val constant = s"const__$constantCounter"
    constantsToDeclare ++= List((constant, ty))
    constant
  }

  def constantsIsEmpty: Boolean = constantsToDeclare.isEmpty

  def addGetter(getter: String) {
    gettersToDeclare += getter
  }

  def getterIsUsed(getter: String): Boolean =
    gettersToDeclare.contains(getter)

  def createLocals(locals: Set[String]) {
    createdLocals ++= locals
  }

  def removeCreatedLocals(locals: Set[String]) {
    createdLocals --= locals
  }

  def clearCreatedLocals() {
    createdLocals = Set()
  }

  def isCreatedLocal(x: String): Boolean =
    createdLocals contains x

  def isGlobal(identExp: Exp): Boolean = {
    require(identExp.isInstanceOf[IdentExp])
    getOwningEntityDecl(identExp) == null
  }

  def getSetMemberTypeOf(setExp: Exp): Type = {
    val ty = exp2Type.get(setExp)
    ty match {
      case IdentType(QualifiedName("Set" :: Nil), elemty :: Nil) =>
        elemty
      case _ => UtilSMT.error(s"Set type expected, found $setExp : $ty")
    }
  }

  def generateOmittedConstructorParameters: String = {
    var result = ""
    for ((id, ty) <- constantsToDeclare) {
      result += s"(declare-const $id ${ty.toSMT})\n"
    }
    result
  }

  def getDeclaringClass(identExp: Exp): String = {
    if (!identExp.isInstanceOf[IdentExp])
      error(s"Should be an IdentExp: $identExp")
    else {
      val entityDecl: EntityDecl = getOwningEntityDecl(identExp)
      if (entityDecl == null)
        Names.mainClass
      else
        entityDecl.ident
    }
  }

  def getDeclaringClass(className: String, ident: String): String = {
    val typeInfo = decl2TypeEnvi(classes(className)).map(ident)
    val declaringEntityDecl = typeInfo match {
      case PropertyTypeInfo(_, _, _, owning) => owning
      case FunctionTypeInfo(_, owning)       => owning
      case _                                 => error(s"property type or function type expected: $typeInfo")
    }
    declaringEntityDecl.ident
  }

  def derefField(field: String, classes: List[String], level: Int = 0): String = {
    classes match {
      case className :: Nil =>
        s"  ($field (deref-$className this))" + (")" * level) + "\n"
      case className :: rest =>
        s"  (ite (deref-is-$className this) ($field (deref-$className this))\n" +
          derefField(field, rest, level + 1)
    }
  }

  def isConstructorPredicate(exp: Exp): Boolean = {
    exp match {
      case BinExp(exp1, EQ, exp2) =>
        isConstructorAppl(exp2)
      case _ => false
    }
  }

  def isConstructorAppl(exp: Exp): Boolean = {
    exp match {
      case FunApplExp(function, _) =>
        isConstructor(function)
      case IfExp(_, trueBranch, Some(falseBranch)) =>
        isConstructorAppl(trueBranch) && isConstructorAppl(falseBranch)
      case _ =>
        false
    }
  }

  def isComplexSetCompr(exp: Exp): Boolean = {
    exp match {
      case CollectionComprExp(SetKind, exp1, _, _) =>
        !exp1.isInstanceOf[IdentExp]
      case _ => false // TODO: also take sequences and bags into consideration
    }
  }

  def isClassName(ty: Type): Boolean = {
    ty match {
      case IdentType(QualifiedName(_ :: Nil), _) => true
      case _                                     => false
    }
  }

  def removeRngBindingsFor(idents: Set[String], bindings: List[RngBinding]): List[RngBinding] = {
    var result: List[RngBinding] = Nil
    for (RngBinding(patterns, collection) <- bindings) {
      val remainingPatterns = patterns.filter {
        case IdentPattern(ident) => !idents.contains(ident)
        case _                   => UtilSMT.error(this.toString)
      }
      if (!remainingPatterns.isEmpty) {
        result ++= List(RngBinding(remainingPatterns, collection))
      }
    }
    result
  }

  def transformModel(model: Model): Model = {
    val Model(packageName, imports, annotations, decls) = model
    var memberDecls: List[MemberDecl] =
      for (decl <- decls if decl.isInstanceOf[MemberDecl]) yield decl.asInstanceOf[MemberDecl]
    val mainClass = EntityDecl(Nil, ClassToken, None, UtilSMT.Names.mainClass, Nil, Nil, memberDecls)
    var entityDecls: List[EntityDecl] =
      for (decl <- decls if decl.isInstanceOf[EntityDecl]) yield decl.asInstanceOf[EntityDecl]
    val entityDeclsSorted = UtilSMT.sortEntityDecls(entityDecls)
    val entityDeclsWithMain = mainClass :: entityDeclsSorted
    val newModel = Model(packageName, imports, annotations, entityDeclsWithMain)
    // println(s"---\n$model\n---\n$newModel\n---")
    newModel
  }
}

class Statistics {
  // --- Top level: ---
  var CLASSDEF: Int = 0
  var EXTENSION: Int = 0
  var PROPERTY: Int = 0
  var FUNDECL: Int = 0
  var FUNSPEC: Int = 0
  var PRECONDITION: Int = 0
  var POSTCONDITION: Int = 0
  var CONSTRAINT: Int = 0
  // --- Types: ---
  var REFTYPE: Int = 0
  var TUPLETYPE: Int = 0
  var SETTYPE: Int = 0
  var SEQTYPE: Int = 0
  var FUNTYPE: Int = 0
  var INTTYPE: Int = 0
  var REALTYPE: Int = 0
  var BOOLTYPE: Int = 0
  var STRINGTYPE: Int = 0
  var CHARTYPE: Int = 0
  var UNITTYPE: Int = 0
  var PARENTYPE: Int = 0
  var SUBTYPE: Int = 0
  // --- Expressions: ---
  var PARENEXP: Int = 0
  var DOTEXP: Int = 0
  var DOTEXPLONG: Int = 0
  var DOTEXPMAX: Int = 0
  var FUNAPPL: Int = 0
  var IFEXP: Int = 0
  var BLOCK: Int = 0
  var BINEXP: Int = 0
  var UNARYEXP: Int = 0
  var TUPLEEXP: Int = 0
  var FORALLEXP: Int = 0
  var EXISTSEXP: Int = 0
  var QUANTINT: Int = 0
  var QUANTREAL: Int = 0
  var QUANTSET: Int = 0
  var QUANTSEQ: Int = 0
  var SETENUMEXP: Int = 0
  var SETRANGEEXP: Int = 0
  var SETCOMPREXP: Int = 0
  var SEQENUMEXP: Int = 0
  var SEQRANGEEXP: Int = 0
  var SEQCOMPREXP: Int = 0
  var LAMBDAEXP: Int = 0
  var TYPECASTEXP: Int = 0
  var TYPECHECKEXP: Int = 0
  var MULOP: Int = 0
  var DIVOP: Int = 0
  var REMOP: Int = 0
  var SETOP: Int = 0
  var SETOPISIN: Int = 0
  var SEQOP: Int = 0
  var INTLIT: Int = 0
  var REALLIT: Int = 0
  var STRINGLIT: Int = 0
  var BOOLLIT: Int = 0
  var NULLLIT: Int = 0
  var THISLIT: Int = 0

  val INDENT: String = " " * 8
  val TEXT_WIDTH: Int = 25
  val TABLE_WIDTH: Int = 30
  var result = ""

  def data(str: String, count: Int) {
    if (count != 0) {
      val sep: String = " " * (TEXT_WIDTH - str.length)
      result += INDENT + str + sep + ":" + " " + count + "\n"
    }
  }

  def text(str: String) {
    result += INDENT + str + "\n"
  }

  def headline(str: String) {
    val initStr = s"--- $str: "
    val remStr = "-" * (TABLE_WIDTH - initStr.length)
    text(initStr + remStr)
  }
  
  override def toString: String = {
    val line: String = "-" * TABLE_WIDTH
    val dline: String = "=" * TABLE_WIDTH
    text("")
    text(dline)
    text("         STATISTICS:")
    text(dline)
    headline("declarations")
    data("class definitions", CLASSDEF)
    data("class extensions", EXTENSION)
    data("properties", PROPERTY)
    data("functions", FUNDECL)
    data("function specs", FUNSPEC)
    data("pre conditions", PRECONDITION)
    data("post conditions", POSTCONDITION)
    data("constraints", CONSTRAINT)
    headline("types")
    data("ref types", REFTYPE)
    data("tuple types", TUPLETYPE)
    data("set types", SETTYPE)
    data("seq types", SEQTYPE)
    data("function types", FUNTYPE)
    data("int types", INTTYPE)
    data("real types", REALTYPE)
    data("bool types", BOOLTYPE)
    data("string types", STRINGTYPE)
    data("char types", CHARTYPE)
    data("unit types", UNITTYPE)
    data("parenthesized types", PARENTYPE)
    data("subtypes", SUBTYPE)
    headline("expressions")
    data("parenthesized exp", PARENEXP)
    data("dot exp", DOTEXP)
    data("dot exp long", DOTEXPLONG)
    data("dot exp max", DOTEXPMAX)
    data("fun appl exp", FUNAPPL)
    data("if exp", IFEXP)
    data("block exp", BLOCK)
    data("binary exp", BINEXP)
    data("unary exp", UNARYEXP)
    data("tuple exp", TUPLEEXP)
    data("forall exp", FORALLEXP)
    data("exists exp", EXISTSEXP)
    data("quantifed int", QUANTINT)
    data("quantifed real", QUANTREAL)
    data("quantifed set", QUANTSET)
    data("quantifed seq", QUANTSEQ)
    data("set enumeration exp", SETENUMEXP)
    data("set range exp", SETRANGEEXP)
    data("set comprehension exp", SETCOMPREXP)
    data("seq enumeration exp", SEQENUMEXP)
    data("seq range exp", SEQRANGEEXP)
    data("seq comprehension exp", SEQCOMPREXP)
    data("lambda exp", LAMBDAEXP)
    data("type cast exp", TYPECASTEXP)
    data("type check exp", TYPECHECKEXP)
    data("multiplication exp", MULOP)
    data("division exp", DIVOP)
    data("remainder exp", REMOP)
    data("set infix exp", SETOP)
    data("seq infix exp", SEQOP)
    data("set membership exp", SETOPISIN)
    data("int literal exp", INTLIT)
    data("real literal exp", REALLIT)
    data("string literal exp", STRINGLIT)
    data("bool literal exp", BOOLLIT)
    data("null literal exp", NULLLIT)
    data("this literal exp", THISLIT)

    text(line)
    result
  }
}

class InstantiationGraph(model: Model) {
  type ClassName = String

  private var graph: Map[ClassName, List[ClassName]] = Map()

  override def toString: String =
    s"instantiation graph:\n  ${graph.mkString("\n  ")}"

  def getInstances(creator: ClassName): List[ClassName] =
    graph.getOrElse(creator, Nil)

  private def addInstances(creator: ClassName, created: List[ClassName]) {
    val instances = created ++ getInstances(creator)
    graph += (creator -> instances)
  }

  def getAllClasses = graph.keySet

  // TODO: think of other strategies
  def getClassesToChase(strategy: Int): Set[ClassName] = {
    require(strategy == 1 || strategy == 2)
    strategy match {
      case 1 =>
        // classes not instantiated by other classes (the top level)
        // problem: misses recursive classes
        val allClasses = graph.keySet
        val classesInstantiated = graph.values.flatMap(_.toSet)
        allClasses -- classesInstantiated
      case 2 =>
        // all classes
        // problem: creates perhaps too many instances
        getAllClasses
    }
  }

  // --- Populate state: ---

  for (ed <- model.decls.asInstanceOf[List[EntityDecl]]) {
    val created = ed.getCreatedObjects
    addInstances(ed.ident, created)
  }
}

class HeapLayout(model: Model) {
  private val graph = new InstantiationGraph(model)

  private var instancesByAnnotation: Map[graph.ClassName, Int] = Map()
  private var instancesByComputation: Map[graph.ClassName, Int] = Map()
  private var heapEntries: Map[graph.ClassName, (Int, Int)] = Map()

  override def toString: String = {
    var result: String = ""
    result += "\n"
    result += "------ heap layout: ------\n"
    result += graph.toString + "\n"
    result += s"\ninstancesByAnnotation:\n  ${instancesByAnnotation.mkString("\n  ")}\n"
    result += s"\ninstancesByComputation:\n  ${instancesByComputation.mkString("\n  ")}\n"
    result += s"\nheapEntries:\n  ${heapEntries.mkString("\n  ")}\n"
    result += "---------------------------\n"
    result += "\n"
    result
  }

  private def getNrOfInstances(className: graph.ClassName): Int =
    instancesByAnnotation.getOrElse(className,
      instancesByComputation.getOrElse(className,
        ASTOptions.numberOfInstances))

  private def dfs(node: graph.ClassName) {
    dfs(List(node))
  }

  private def dfs(stack: List[graph.ClassName]) {
    if (K2Z3.debug) println(stack.reverse)
    val top = stack.head
    val count = instancesByComputation.getOrElse(top, 0)
    instancesByComputation += (top -> (count + 1))
    val children = graph.getInstances(top)
    for (child <- children) {
      if (stack.contains(child)) {
        // TODO: choose strategy
        if (K2Z3.debug) println(s"cycle $child in $stack")
        val countChild = instancesByComputation(child)
        instancesByComputation += (child -> (countChild + 1))
      } else {
        dfs(child :: stack)
      }
    }
  }

  def getHeapEntries(className: graph.ClassName): List[Int] = {
    val (low, high) = heapEntries(className)
    (low to high).toList
  }

  // --- Populate state: ---

  // update instancesByAnnotation:
  for (ed <- model.decls.asInstanceOf[List[EntityDecl]]) {
    for (Annotation("instances", IntegerLiteral(size)) <- ed.annotations) {
      instancesByAnnotation += (ed.ident -> size)
    }
  }

  // update instancesByComputation:
  if (K2Z3.debug) println("\n--- dfs instance search:\n")
  for (className <- graph.getClassesToChase(2))
    dfs(className)

  // update heapEntries:
  heapEntries += ("TopLevelDeclarations" -> (0, 0))
  var nextFreeHeapCell: Int = 1
  for (className <- graph.getAllClasses if !className.equals("TopLevelDeclarations")) {
    val nrOfInstances = getNrOfInstances(className)
    val newNextFreeHeapCell = nextFreeHeapCell + nrOfInstances
    val range = (nextFreeHeapCell, newNextFreeHeapCell - 1)
    nextFreeHeapCell = newNextFreeHeapCell
    heapEntries += (className -> range)
  }

  if (K2Z3.debug) println(this)
}

object K2ScalaException extends Exception

object UtilScala {
  def error(msg: String) = {
    val msgFull = s"Unsupported: $msg"
    if (ASTOptions.silent) Misc.silentErrorThrow("K2Scala", msgFull, K2ScalaException)
    else Misc.errorThrow("K2Scala", msgFull, K2ScalaException)
  }
  // TODO: should these refer to the TypeChecker?:
  def log(msg: String) = if (!ASTOptions.silent) Misc.log("TypeChecker", msg)
  def logDebug(msg: String) = if (ASTOptions.debug && !ASTOptions.silent) Misc.log("TypeChecker", s"DEBUG $msg")
  def warning(msg: String) = Misc.log("TypeChecker", s"Warning $msg")
}

private[frontend] object ToStringSupport {
  private val space = "  "
  private var level: Int = 0

  def moveIn {
    level += 1
  }

  def moveOut {
    level -= 1
  }

  def indent: String = space * level

  def requiresPreceedingBlankLine(member: MemberDecl): Boolean =
    member.isInstanceOf[FunDecl] || member.isInstanceOf[ConstraintDecl]
}
import ToStringSupport._

trait HasChildren {
  def children: List[AnyRef]
}
case class Model(packageName: Option[PackageDecl], imports: List[ImportDecl],
                 annotations: Set[AnnotationDecl],
                 decls: List[TopDecl]) extends HasChildren {

  def children: List[TopDecl] = decls

  def toSMT: String = {
    val model: Model = UtilSMT.transformModel(this)
    UtilSMT.objectGraph = new HeapLayout(model)
    UtilSMT.statistics = new Statistics()
    decls foreach (_.statistics())
    val entityDecls = model.decls.asInstanceOf[List[EntityDecl]].filterNot {
      case ed => ed.annotations exists {
        case Annotation(name, _) => name.equals("ignore")
      }
    }

    var result1: String = "" // text before omitted constructor parameter constants
    var result2: String = "" // text after omitted constructor parameter constants
    // result will eventually contain result1 ++ constants ++ result2.
    // This approach is needed since constants need to go before result2 but 
    // in part are computed based on result2.

    // Generate options

    result1 += UtilSMT.headline1("Options")
    result1 += "(set-option :smt.macro-finder true)\n"
    result1 += "\n"

    // Generate builtin datatypes:

    result1 += UtilSMT.headline1("Built-in datatypes")
    result1 += "(define-sort Ref () Int)\n"
    result1 += "\n"
    result1 += "(declare-datatypes (T1 T2) ((Tuple2 (mk-Tuple2 (_1 T1)(_2 T2)))))\n"
    result1 += "(declare-datatypes (T1 T2 T3) ((Tuple3 (mk-Tuple3 (_1 T1)(_2 T2)(_3 T3)))))\n"
    result1 += "\n"
    result1 += "(define-sort Set (T) (Array T Bool))\n"
    // result1 += "(define-sort Bag (T) (Array T Int))\n"

    result1 += "\n"
    result1 += UtilSMT.headline1("User-defined datatypes")
    for (ed <- entityDecls) {
      result1 += ed.toSMTDatatype + "\n"
    }
    result1 += "\n"

    // Generate heap:

    result1 += UtilSMT.headline1("Heap")
    result1 += "(declare-datatypes () ((Any\n"
    for (ed <- entityDecls) {
      result1 += ed.toSMTAnyEntry + "\n"
    }
    result1 += "  null))\n"
    result1 += ")\n"
    result1 += "\n"
    result1 += "(declare-const heap (Array Ref Any))\n"
    result1 += "\n"
    result1 += "(define-fun deref ((ref Ref)) Any\n"
    result1 += "  (select heap ref)\n"
    result1 += ")\n"
    result1 += "\n"

    // Generate class specific is/deref-functions:

    result1 += UtilSMT.headline1("Class specific is/deref-functions")
    for (ed <- entityDecls) {
      result1 += ed.toSMTIsAndDerefFunctions + "\n"
      result1 += "\n"
    }

    // Generate isa-functions (not used right now):    

    result1 += UtilSMT.headline1("Isa-functions")
    for (ed <- entityDecls) {
      result1 += ed.toSMTIsAFunction + "\n"
      result1 += "\n"
    }

    // -------------------------------------------
    // --- Here switching to result2.          ---
    // --- Getters and constructor constants   ---
    // --- to be inserted between result1 and  ---
    // --- result2.                            ---
    // -------------------------------------------

    // Generate methods:

    result2 += UtilSMT.headline1("Methods")
    for (ed <- entityDecls) {
      val methodsSMT: String = ed.toSMTMethods
      if (methodsSMT != "") {
        result2 += methodsSMT + "\n"
        result2 += "\n"
      }
    }

    // Generate invariants:

    result2 += UtilSMT.headline1("Invariants")
    for (ed <- entityDecls) {
      result2 += UtilSMT.headline2(s"Invariant for class ${ed.ident}")
      result2 += s"${ed.toSMTInvariant}\n"
      result2 += "\n"
    }
    result2 += "\n"

    // Generate heap:

    result2 += UtilSMT.headline1("Generate heap")
    result2 += s"(assert\n"
    result2 += s"  (=\n"
    result2 += s"    heap\n"
    val storeOperations = "(store" * UtilSMT.heapInitializerConstants.size
    result2 += s"    $storeOperations\n"
    result2 += s"      ((as const (Array Ref Any)) null)\n"
    for ((index, className, constName) <- UtilSMT.heapInitializerConstants.reverse) {
      result2 += s"        $index (lift-$className $constName))\n"
    }
    result2 += s"  )\n"
    result2 += s")\n"
    result2 += "\n"

    // -----------------------------------
    // --- Back to the middle section. ---
    // -----------------------------------

    // Generate getters:    

    var getters: String = UtilSMT.headline1("Getters")
    for (ed <- entityDecls) {
      val gettersSMT: String = ed.toSMTGetterFunctions
      if (gettersSMT != "") {
        getters += gettersSMT + "\n"
        getters += "\n"
      }
    }

    // Generate constants for omitted constructor parameters:

    var constants: String = ""
    if (!UtilSMT.constantsIsEmpty) {
      constants += UtilSMT.headline1("Constructor parameter constants")
      constants += UtilSMT.generateOmittedConstructorParameters + "\n"
      constants += "\n"
    }

    // ------------------------
    // --- Combine results. ---
    // ------------------------

    // Correct result:
    result1 + getters + constants + result2

    // Testing:
    // val max = UtilSMT.objectGraph.getCounter
    // result1 + getters + constants + result2 +
    // s"(assert (forall ((this Ref)) (=> (or (< this 0)(> this $max))(= (deref this) null))))"
  }

  def toScala: String = {
    decls.map(_.toScala).mkString("\n\n")
  }

  override def toString = {
    var result =
      packageName match {
        case Some(p) => p + "\n"
        case None    => ""
      }
    if (!imports.isEmpty) {
      result += "\n"
      for (imp <- imports) {
        result += imp + "\n"
      }
    }

    if (!annotations.isEmpty) {
      result += "\n"
      for (annotationDecl <- annotations) {
        result += annotationDecl + "\n"
      }
    }

    if (!decls.isEmpty) {
      result += "\n"
      for (decl <- decls) {
        result += decl + "\n\n"
      }
    }

    result
  }

  def toJson: JSONObject = {
    val model = new JSONObject()
    val theImports = new JSONArray()
    val theDecls = new JSONArray()
    val theAnnotations = new JSONArray()

    model.put("type", "Model")
    packageName match {
      case None =>
      case Some(pckdecl) =>
        model.put("packageName", pckdecl.toJson)
    }

    for (imp <- imports) theImports.put(imp.toJson)
    model.put("imports", theImports)

    for (annotation <- annotations) theAnnotations.put(annotation.toJson)
    model.put("annotations", theAnnotations)

    for (decl <- decls) theDecls.put(decl.toJson)
    model.put("decls", theDecls)

  }

}

case class PackageDecl(name: QualifiedName) {//extends MemberDecl {
  override def toString = s"package $name"

  //def children: List[AnyRef] =

  def toJson: JSONObject = {
    val packagedecl = new JSONObject()
    packagedecl.put("type", "PackageDecl")
    packagedecl.put("name", name.toJson)
  }

}

case class AnnotationDecl(name: String, ty: Type) extends TopDecl {
  override def toString = s"annotation $name : $ty"

  def children: List[AnyRef] = List()

  override def toJson1 = {
    val annotationDecl = new JSONObject()
    annotationDecl.put("type", "AnnotationDecl")
    annotationDecl.put("name", name)
    annotationDecl.put("ty", ty.toJson)
  }
  override def toJson2 = toJson1
}

case class Annotation(name: String, exp: Exp) {
  override def toString = s"@$name($exp)"

  def toJson = {
    val annotation = new JSONObject()
    annotation.put("type", "Annotation")
    annotation.put("name", name)
    if (exp != null) annotation.put("exp", exp.toJson)
  }
}

case class QualifiedName(names: List[String]) {

  def toScala: String = {
    if (names.length != 1)
      UtilSMT.error("class type name with too long qualified name: $names")
    else
      names(0)
  }

  override def toString = names.mkString(".")

  def toPath = names.mkString(File.separator)

  def toJson: JSONObject = {
    val qualifiedName = new JSONObject()
    val theNames = new JSONArray()
    for (name <- names) theNames.put(name)
    qualifiedName.put("names", theNames)
    qualifiedName.put("type", "QualifiedName")
  }

   // FIXME -- This assumes that the consumer of the JSON will be able to parse
   // the qualified name.
   // Don't we want to pass back the unique identifier of the symbol?
   // Do we have a lookup table?
   // Or, we could assume a QualifiedName function externally that returns
   // the ElementValue.
   def toJson2: JSONObject = {
     val qName = new JSONObject()
     qName.put("type", "ElementValue").put("element", toString)
     qName.put("comment","QualifiedName")
   }
 }

case class ImportDecl(name: QualifiedName, star: Boolean) {
  def toStringNoImport = name + (if (star) ".*" else "")
  override def toString =
    "import " + toStringNoImport

  def toJson: JSONObject = {
    val importdecl = new JSONObject()
    importdecl.put("type", "ImportDecl")
    importdecl.put("name", name.toJson)
    importdecl.put("star", star.toString)
  }

}

trait TopDecl extends HasChildren {
  def statistics() {}
  def toScala: String = ???
  def toJson: JSONObject = {
    if (ASTOptions.useJson1) toJson1
    else toJson2
  }
  def toJson1: JSONObject
  def toJson2: JSONObject
}

case class EntityDecl(
    _annotations: List[Annotation],
    entityToken: EntityToken,
    keyword: Option[String],
    ident: String,
    typeParams: List[TypeParam],
    extending: List[Type],
    members: List[MemberDecl]) extends MemberDecl(_annotations) {

  override def children: List[TopDecl] = members

  override def statistics() {
    UtilSMT.statistics.CLASSDEF += 1
    UtilSMT.statistics.EXTENSION += extending.length
    members foreach (_.statistics())
  }
  

  def toSMTDatatype: String = {
    val propertyDecls = getAllPropertyDecls
    if (propertyDecls.isEmpty) {
      s"(declare-sort $ident) (declare-const mk-$ident $ident)"
    } else {
      val constr = s"mk-$ident"
      val fields = propertyDecls.map(_.toSMT).mkString
      s"(declare-datatypes () (($ident ($constr $fields))))"
    }
  }

  def toSMTAnyEntry: String =
    s"  (lift-$ident (sel-$ident $ident))"

  def toSMTIsAndDerefFunctions: String = {
    var result: String = ""
    result += s"(define-fun deref-is-$ident ((this Ref)) Bool\n"
    result += s"  (is-lift-$ident (deref this))\n"
    result += s")\n"
    result += "\n"
    result += s"(define-fun deref-$ident ((this Ref)) $ident\n"
    result += s"  (sel-$ident (deref this))\n"
    result += ")"
    result
  }

  def toSMTIsAFunction: String = {
    var result: String = ""
    val subClasses = UtilSMT.getSubClassesTransitive(ident)
    result += s"(define-fun deref-isa-$ident ((this Ref)) Bool\n"
    if (subClasses.isEmpty) {
      result += s"  (deref-is-$ident this)\n"
    } else {
      result += "  (or\n"
      for (cn <- ident :: subClasses) {
        result += s"    (deref-is-$cn this)\n"
      }
      result += "  )\n"
    }
    result += ")"
    result
  }

  def toSMTGetterFunctions: String = {
    var result: String = ""
    val propertyDecls: List[PropertyDecl] = getAllPropertyDecls
    if (!propertyDecls.isEmpty) {
      val subClasses = UtilSMT.getSubClassesTransitive(ident)
      var firstTime = true
      for (pd <- propertyDecls) {
        val field = pd.name
        val tySMT = pd.ty.toSMT
        if (UtilSMT.getterIsUsed(s"$ident.$field") || UtilSMT.getterIsUsed(s"$ident!$field")) {
          if (firstTime) {
            result += UtilSMT.headline2(s"Getters for class $ident")
            firstTime = false
          } else
            result += "\n\n"
          result += UtilSMT.headline3(s"getters for $ident.$field")
          if (UtilSMT.getterIsUsed(s"$ident.$field")) {
            result += s"(define-fun $ident.$field ((this Ref)) $tySMT\n"
            result += UtilSMT.derefField(field, ident :: subClasses)
            result += ")"
          }
          if (UtilSMT.getterIsUsed(s"$ident.$field") && UtilSMT.getterIsUsed(s"$ident!$field"))
            result += "\n\n"
          if (UtilSMT.getterIsUsed(s"$ident!$field")) {
            result += s"(define-fun $ident!$field ((this Ref)) $tySMT\n"
            result += s"  ($field (deref-$ident this))\n"
            result += ")"
          }
        }
      }
    }
    result
  }

  def toSMTMethods: String = {
    var result: String = ""
    val funDecls = UtilSMT.compressFunDecls(getAllFunDecls)
    if (!funDecls.isEmpty) {
      result += UtilSMT.headline2(s"Methods for class $ident")
      result += funDecls.map(_.toSMT(ident)).mkString("\n\n")
    }
    result
  }

  def toSMTInvariant: String = {
    var constraints: List[String] = Nil
    val propertyDecls: List[PropertyDecl] = getAllPropertyDecls
    val constraintDecls: List[ConstraintDecl] = getAllConstraintDecls
    var result: String = ""
    var invFunctionCount: Int = 0
    val heapEntries: List[Int] = UtilSMT.objectGraph.getHeapEntries(ident)

    def mkInvFunAndAssert(ident: String, constraintSMT: String, outputString: String): String = {
      invFunctionCount += 1
      val functionName = s"$ident.inv$invFunctionCount"
      var result = ""
      result += UtilSMT.headline3(s"Invariant $invFunctionCount")
      result += s"(define-fun $functionName ((this Ref)) Bool\n"
      result += s"  $constraintSMT\n"
      result += s")\n"
      result += "\n"
      for (index <- heapEntries) {
        val assertName = s"_xkassert${UtilSMT.constraintCounter}"
        result += s"(assert (! ($functionName $index) :named $assertName))\n"
        UtilSMT.saveConstraintMapping((s"$outputString"))
      }
      result += "\n"
      result
    }

    // generate instances:

    result += UtilSMT.headline3("Constants")
    for (index <- heapEntries) {
      val const = s"const-$index-$ident"
      result += s"(declare-const $const $ident)\n"
      UtilSMT.heapInitializerConstants ::= (index, ident, const)
    }
    result += "\n"

    // ------------------------------
    // Open heap (this did not work):
    // ------------------------------
    // for (index <- heapEntries) {
    //   result += s"(assert (deref-is-$ident $index))\n"
    // }
    // result += "\n"
    // ------------------------------

    // constraints for property definitions of the form: x : T = e
    for (PropertyDecl(_, propertyName, ty, _, _, Some(exp)) <- propertyDecls) {
      val getter = s"$ident!$propertyName"
      UtilSMT.addGetter(getter)
      var constraintSMT =
        if (UtilSMT.isClassName(ty) && UtilSMT.isConstructorAppl(exp))
          s"(= (deref ($getter this)) ${exp.toSMT(ident, false)})"
        else
          s"(= ($getter this) ${exp.toSMT(ident, false)})"

      result += mkInvFunAndAssert(ident, constraintSMT, s"$propertyName : $ty = $exp")
    }

    // constraints for embedded references/parts:
    for (PropertyDecl(_, propertyName, IdentType(QualifiedName(typeName :: Nil), _), _, _, _) <- propertyDecls if !Misc.isCollection(typeName)) {
      val getter = s"$ident!$propertyName"
      UtilSMT.addGetter(getter)
      val constraintSMT = s"(deref-isa-$typeName ($getter this))"
      result += mkInvFunAndAssert(ident, constraintSMT, "_k_ignore_")
    }

    // constraints for constraint decls:
    for (ConstraintDecl(n, exp) <- constraintDecls) {
      val name = n match {
        case None      => ""
        case Some(str) => s" [$str]"
      }
      result += mkInvFunAndAssert(ident, exp.toSMT(ident, false), exp.toString + name)
    }
    result
  }

  def getCreatedObjects: List[String] = {
    // TODO: sets and multiplicities, expressions
    var result: List[String] = Nil
    for (PropertyDecl(_, _, ty, multiplicity, _, _) <- members) {
      ty match {
        case IdentType(QualifiedName(name :: Nil), _) if !Misc.isCollection(name) =>
          result ::= name
        case _ =>
      }
    }
    result
  }

  override def toScala: String = {
    var result: String = s"class $ident"
    val directSuperClasses = TypeChecker.getDirectSubClasses(ident)
    if (directSuperClasses.size > 1)
      UtilSMT.error(s"class $ident has more than one super class")
    if (directSuperClasses.size == 1) {
      val superClass = directSuperClasses(0)
      result += " extends $superClass {\n"
    } else
      result += " {\n"
    result += members.map(_.toScala).mkString("\n\n") + "\n"
    result += "}"
    result
  }

  def getPropertyDecls: List[PropertyDecl] =
    for (m <- members if m.isInstanceOf[PropertyDecl] && !UtilSMT.ignoreMember(m)) yield m.asInstanceOf[PropertyDecl]

  def getAllPropertyDecls: List[PropertyDecl] = {
    val propertyDeclsOfSuperClasses: List[PropertyDecl] =
      (for (superClass <- getSuperClasses(ident)) yield classes(superClass).getPropertyDecls).flatten
    propertyDeclsOfSuperClasses ++ getPropertyDecls
  }

  def getFunDecls: List[FunDecl] =
    for (m <- members if m.isInstanceOf[FunDecl]) yield m.asInstanceOf[FunDecl]

  def getAllFunDecls: List[FunDecl] = {
    val funDeclsOfSuperClasses: List[FunDecl] =
      (for (superClass <- getSuperClasses(ident)) yield classes(superClass).getFunDecls).flatten
    funDeclsOfSuperClasses ++ getFunDecls
  }

  def getConstraintDecls: List[ConstraintDecl] =
    for (m <- members if m.isInstanceOf[ConstraintDecl]) yield m.asInstanceOf[ConstraintDecl]

  def getAllConstraintDecls: List[ConstraintDecl] = {
    val constraintDeclsOfSuperClasses: List[ConstraintDecl] =
      (for (superClass <- getSuperClasses(ident)) yield classes(superClass).getConstraintDecls).flatten
    constraintDeclsOfSuperClasses ++ getConstraintDecls
  }
  
  def getEntityDecls: List[EntityDecl] = 
    for (m <- members if m.isInstanceOf[EntityDecl]) yield m.asInstanceOf[EntityDecl]
  
  def getAllEntityDecls: List[EntityDecl] = {
    val entityDeclsOfSuperClasses: List[EntityDecl] = 
      (for (superClass <- getSuperClasses(ident)) yield classes(superClass).getEntityDecls).flatten
    entityDeclsOfSuperClasses ++ getEntityDecls
  }
  
    
  def getExtendingNames: List[String] = {
    (for (e <- extending if e.isInstanceOf[IdentType]) yield e.toString)
  }
  

  override def toString = {
    var result = ""
    if (!annotations.isEmpty) {
      for (annotation <- annotations) {
        result += annotation + "\n"
      }
      result += "\n"
    }
    result += s"$entityToken"
    keyword match {
      case None      =>
      case Some(str) => result += s" <$str>"
    }
    result += s" $ident"
    if (!typeParams.isEmpty) {
      result += s"[${typeParams.mkString(",")}]"
    }
    if (!extending.isEmpty) {
      result += s" extending ${extending.mkString(",")}"
    }
    if (!members.isEmpty) {
      result += " {\n"
      moveIn
      for (member <- members) {
        if (requiresPreceedingBlankLine(member)) result += "\n"
        result += indent + member + "\n"
      }
      moveOut
      result += "}"
    }
    result
  }

  def toJson1 = {
    val entitydecl = new JSONObject()
    val theAnnotations = new JSONArray()
    val theTypeParams = new JSONArray()
    val theExtending = new JSONArray()
    val theMembers = new JSONArray()

    entitydecl.put("type", "EntityDecl")
    for (annotation <- annotations) theAnnotations.put(annotation.toJson)
    entitydecl.put("annotations", theAnnotations)
    entitydecl.put("entityToken", entityToken.toJson)
    keyword match { case Some(e) => entitydecl.put("keyword", e) case _ => }
    entitydecl.put("ident", ident)
    for (typeParam <- typeParams) theTypeParams.put(typeParam.toJson)
    entitydecl.put("typeparams", theTypeParams)
    for (t <- extending) theExtending.put(t.toJson)
    entitydecl.put("extending", theExtending)
    for (member <- members) theMembers.put(member.toJson)
    entitydecl.put("members", theMembers)
  }

  def toJson2 = toJson1
}

trait EntityToken {
  def toJson: String
}

case object ClassToken extends EntityToken {
  override def toString = "class"
  override def toJson = toString
}

case object AssocToken extends EntityToken {
  override def toString = "assoc"
  override def toJson = toString
}

case class IdentifierToken(name: String) extends EntityToken {
  override def toString = name
  override def toJson = toString
}

case class TypeParam(ident: String, bound: Option[TypeBound]) {
  override def toString =
    bound match {
      case None      => ident
      case Some(tyb) => s"$ident : $tyb"
    }

  def toJson: JSONObject = {
    val typeparam = new JSONObject
    typeparam.put("type", "TypeParam")
    typeparam.put("indent", ident)
    bound match {
      case None => typeparam
      case Some(bound) =>
        typeparam.put("bound", bound.toJson)
    }
  }

}

case class TypeBound(types: List[Type]) {
  override def toString = types.mkString(" + ")

  def toJson = {
    val typebound = new JSONObject()
    val theTypes = new JSONArray()

    typebound.put("type", "TypeBound")
    for (t <- types) theTypes.put(t.toJson)
    typebound.put("types", theTypes)
  }

}

abstract class MemberDecl(var annotations: List[Annotation] = Nil) extends TopDecl {
  def toSMT(className: String): String =
    UtilSMT.error(this.toString)
}

case class TypeDecl(ident: String,
                    typeParams: List[TypeParam],
                    ty: Option[Type]) extends MemberDecl {
  override def toString = {
    var result: String = s"type $ident"
    if (!typeParams.isEmpty) {
      result += s"[${typeParams.mkString(",")}]"
    }
    ty match {
      case None =>
      case Some(t) =>
        result += s" = $t"
    }
    result
  }

  override def children: List[AnyRef] = List()

  override def toJson1 = {
    val typedecl = new JSONObject()
    val params = new JSONArray()
    typedecl.put("ident", ident)
    for (typeParam <- typeParams) params.put(typeParam.toJson)
    typedecl.put("type", "TypeDecl")
    typedecl.put("params", params)
    if (ty.nonEmpty) typedecl.put("ty", ty.get.toJson)
    else typedecl
  }

  override def toJson2 = toJson1
}

object ListIt {
  def m( x : Option[AnyRef] ) : List[AnyRef] = {
    x match {
    case None => List ()
    case Some (e) => List (e)
    }
  }
}

case class PropertyDecl(modifiers: List[PropertyModifier],
                        name: String,
                        ty: Type,
                        multiplicity: Option[Multiplicity],
                        assignment: Option[Boolean],
                        expr: Option[Exp]) extends MemberDecl {

  override def children: List[AnyRef] = List(ty) ::: ListIt.m(multiplicity) ::: ListIt.m(expr)

  override def statistics() {
    UtilSMT.statistics.PROPERTY += 1
    ty.statistics()
    expr match {
      case None =>
      case Some(e) =>
        UtilSMT.statistics.CONSTRAINT += 1
        e.statistics()
    }
  }

  def toSMT: String = s"($name ${ty.toSMT})"

  override def toScala = {
    val modifierScala: String = if (modifiers.contains(Val)) "val" else "var"
    val tyScala: String = ty.toScala
    val exprScala: String =
      expr match {
        case Some(e) => e.toScala
        case None =>
          ty match {
            case IntType | RealType => "0"
            case BoolType           => "false"
            case _                  => null
          }
      }

    s"$modifierScala : $tyScala = $exprScala"
  }

  override def toString = {
    var result = ""
    if (!modifiers.isEmpty) {
      result += modifiers.mkString(" ") + " "
    }
    result += name
    result += ":" + ty
    if (multiplicity.nonEmpty) result += multiplicity.get
    if (expr.nonEmpty) {
      if (assignment.nonEmpty) result += (if (assignment.get) " := " else " = ") + expr.get
      else {
        println("Non-empty expression for property declaration, but assignment type not specified.")
        //System.exit(-1).asInstanceOf[String]
      }
    }
    result
  }

  override def toJson1 = {
    val propertydecl = new JSONObject()
    val theModifiers = new JSONArray()
    propertydecl.put("type", "PropertyDecl")

    for (modifier <- modifiers) theModifiers.put(modifier.toJson)

    propertydecl.put("modifiers", theModifiers)
    propertydecl.put("name", name)
    propertydecl.put("ty", ty.toJson)
    multiplicity match { case Some(m) => propertydecl.put("multiplicity", m.toJson) case None => }
    assignment match { case Some(b) => propertydecl.put("assignment", b) case None => }
    expr match { case Some(e) => propertydecl.put("expr", e.toJson) case None => }
    propertydecl
  }

  override def toJson2 = toJson1

// Below is more accurate; commenting it out since it might break a demo.
//  {
//    val elementJson = new JSONObject()
//    val specialization = new JSONObject()
//    elementJson.put("name", name)
//    elementJson.put("specialization", specialization)
//    specialization.put("type", "Property")
//    specialization.put("propertyType", ty.toString)
//    multiplicity match {
//      case None =>
//      case Some(m) => { 
//        specialization.put("lower", m.exp1.toJson)
//        m.exp2 match { 
//          case Some(e2) => specialization.put("upper", e2.toJson)
//          case None =>
//        }
//      }
//    }
//    
//    expr match {
//      case None =>
//      case Some(e) => {
//        val valueArray = new JSONArray()
//        specialization.put("value", valueArray)
//        valueArray.put(e.toJson)
//      }
//    }
//    elementJson
//  }
  }

trait PropertyModifier {
  def toJson: String
}
case object Part extends PropertyModifier {
  override def toString = "part"
  def toJson = toString
}
case object Var extends PropertyModifier {
  override def toString = "var"
  def toJson = toString
}
case object Val extends PropertyModifier {
  override def toString = "val"
  def toJson = toString
}
case object Ordered extends PropertyModifier {
  override def toString = "ordered"
  def toJson = toString
}
case object Unique extends PropertyModifier {
  override def toString = "unique"
  def toJson = toString
}
case object Source extends PropertyModifier {
  override def toString = "source"
  def toJson = toString
}
case object Target extends PropertyModifier {
  override def toString = "target"
  override def toJson = toString
}

case class FunSpec(pre: Boolean, exp: Exp) extends HasChildren {

  def children: List[AnyRef] = List(exp)

  def statistics() {
    if (pre)
      UtilSMT.statistics.PRECONDITION += 1
    else
      UtilSMT.statistics.POSTCONDITION += 1
    exp.statistics()
  }

  override def toString =
    if (pre) s"pre $exp" else s"post $exp"

  def toJson = {
    val funspec = new JSONObject()
    funspec.put("type", "FunSpec")
    funspec.put("pre", pre.toString)
    funspec.put("exp", exp.toJson)
  }

}

case class Param(name: String, ty: Type) {
  def statistics() {
    ty.statistics()
  }

  def toSMT: String = s"($name ${ty.toSMT})"

  def toSMTName: String = name

  def toSMTType: String = ty.toSMT

  def toScala: String = s"$name : ${ty.toScala}"

  override def toString = s"$name:$ty"

  def toJson = {
    val param = new JSONObject()
    param.put("type", "Param")
    param.put("name", name)
    param.put("ty", ty.toJson)
  }
}

case class FunDecl(ident: String,
                   typeParams: List[TypeParam],
                   params: List[Param],
                   ty: Option[Type],
                   spec: List[FunSpec],
                   body: List[MemberDecl]) extends MemberDecl {

  override def children: List[AnyRef] = body

  override def statistics() {
    UtilSMT.statistics.FUNDECL += 1
    params foreach (_.statistics())
    ty match {
      case None    =>
      case Some(t) => t.statistics()
    }
    UtilSMT.statistics.FUNSPEC += spec.length
    spec foreach (_.statistics())
    body foreach (_.statistics())
  }

  override def toSMT(className: String): String = {
    var result: String = ""
    val parameterTypes: String = s"Ref " + params.map(_.toSMTType).mkString(" ")
    val parameters: String = s"(this Ref)" + params.map(_.toSMT).mkString
    val actuals: String = "this " + params.map(_.toSMTName).mkString(" ")
    val resultType: String = ty match {
      case Some(t) =>
        if (!UtilSMT.wellFormedType(t))
          UtilSMT.error(s"function return type $t in $this")
        else
          t.toSMT
      case None =>
        UtilSMT.error(s"Missing return type (= Unit) $this")
    }

    // body:

    if (body == Nil) {
      result += s"(declare-fun $className.$ident ($parameterTypes) $resultType)\n"
      result += "\n"
      result += s"(define-fun $className!$ident ($parameters) $resultType\n"
      result += s"  ($className.$ident $actuals)\n"
      result += ")"
    } else {
      val bodySMTWithSubtyping = UtilSMT.memberList2SMT(body, className, true)
      result += s"(define-fun $className.$ident ($parameters) $resultType\n"
      result += s"$bodySMTWithSubtyping\n"
      result += ")\n"
      result += "\n"
      val bodySMTNoSubtyping = UtilSMT.memberList2SMT(body, className, false)
      result += s"(define-fun $className!$ident ($parameters) $resultType\n"
      result += s"$bodySMTNoSubtyping\n"
      result += ")"
    }

    // specification:

    val preConditions = spec.filter(_.pre)
    val postConditions = spec.filterNot(_.pre)

    // TODO: currently we do not do anything for a function
    // if the body is empty.
    if (body != Nil && !postConditions.isEmpty) {
      UtilSMT.createLocals(params.map(_.name).toSet)
      result += "\n\n"
      val preSMT = preConditions.map(_.exp.toSMT(className, false)).mkString("\n      ") // and true?
      val postSMT = postConditions.map(_.exp.toSMT(className, false)).mkString("\n        ") // and true?
      val resultVar = "$result"
      if (body != Nil) {
        result += s"(assert (!(forall ($parameters)\n"
        result += s"  (=>\n"
        result += s"    (and\n"
        result += s"      (deref-is-$className this)\n" // isa does not solve, but should it be isa?
        for (Param(name, IdentType(QualifiedName(tyName :: Nil), Nil)) <- params) {
          result += s"      (deref-isa-$tyName $name)\n"
        }
        if (preSMT != "") result += s"      $preSMT\n"
        result += s"    )\n"
        result += s"    (let (($resultVar ($className!$ident $actuals)))\n" // and dot?
        result += s"      (and\n"
        result += s"        $postSMT\n"
        result += s"      )\n"
        result += s"    )\n"
        result += s"  )\n"
        result += s") :named _xkassert${UtilSMT.constraintCounter}))"
        UtilSMT.saveConstraintMapping(s"Function $ident does not satisfy its specification.")
      } else if (ASTOptions.checkPostNoBody) {
        if (!params.isEmpty) {
          val explicitParametersSMT = params.map(_.toSMT).mkString
          result += s"(assert (!(forall ($explicitParametersSMT)"
        }
        result += s"(exists ((result $resultType))\n"
        result += s"  (=>\n"
        result += s"    (and\n"
        result += s"      true\n"
        for (Param(name, IdentType(QualifiedName(tyName :: Nil), Nil)) <- params) {
          result += s"      (deref-isa-$tyName $name)\n"
        }
        if (preSMT != "") result += s"      $preSMT\n"
        result += s"    )\n"
        result += s"    (let (($resultVar result))\n"
        result += s"      (and\n"
        result += s"        $postSMT\n"
        result += s"      )\n"
        result += s"    )\n"
        result += s"  )\n"
        if (!params.isEmpty) result += ")"
        result += s") :named _xkassert${UtilSMT.constraintCounter}))"
        UtilSMT.saveConstraintMapping(s"Function $ident's specification is not satisfiable.")
      }
      UtilSMT.clearCreatedLocals()
    }

    // return result:
    result
  }

  override def toScala: String = {
    if (body.isEmpty)
      UtilScala.error(s"function with no body\n  $this")
    var result: String = ""
    val paramsScala =
      if (params.isEmpty)
        ""
      else
        "(" + params.map(_.toScala).mkString(", ") + ")"
    val tyScala: String =
      ty match {
        case None    => ""
        case Some(t) => s": ${t.toScala}"
      }
    result += s"  def $ident$paramsScala$tyScala ="
    if (body.size > 1) {
      result += "  {\n"
      for (memberDecl <- body) {
        result += s"    ${memberDecl.toScala}\n"
      }
      result += s"  }"
    } else {
      result += "\n"
      val bodyScala = body(0).toScala
      result += s"    $bodyScala"
    }
    result
  }

  override def toString = {
    var result = s"fun $ident"
    if (typeParams.size > 0) {
      result += "[" + typeParams.mkString(",") + "]"
    }
    if (params.size > 0) {
      result += "(" + params.mkString(",") + ")"
    }
    ty match {
      case Some(ty) => result += " : " + ty
      case _        =>
    }
    result += "\n"
    if (!spec.isEmpty) {
      moveIn
      for (sp <- spec) {
        result += indent + sp + "\n"
      }
      moveOut
    }
    if (!body.isEmpty) {
      result += indent + "{\n"
      moveIn
      for (member <- body) {
        result += indent + member + "\n"
      }
      moveOut
      result += indent + "}"
    }
    result
  }

  override def toJson1 = {
    val fundecl = new JSONObject()
    val theTypeParams = new JSONArray()
    val theParams = new JSONArray()
    val theSpec = new JSONArray()
    val theBody = new JSONArray()
    fundecl.put("type", "FunDecl")
    fundecl.put("ident", ident)
    for (tp <- typeParams) theTypeParams.put(tp.toJson)
    fundecl.put("typeParams", theTypeParams)
    for (p <- params) theParams.put(p.toJson)
    fundecl.put("params", theParams)
    ty match { case Some(t) => fundecl.put("ty", t.toJson) case None => }
    for (s <- spec) theSpec.put(s.toJson)
    fundecl.put("spec", theSpec)
    for (member <- body) theBody.put(member.toJson)
    fundecl.put("body", theBody)
  }

  override def toJson2 = toJson1
}

case class ConstraintDecl(name: Option[String], exp: Exp) extends MemberDecl {
  override def children: List[AnyRef] = List(exp)

  override def statistics() {
    UtilSMT.statistics.CONSTRAINT += 1
    exp.statistics()
  }

  override def toSMT(className: String): String =
    UtilSMT.error(this.toString)

  override def toScala = {
    ??? // TODO
  }

  override def toString =
    name match {
      case None =>
        s"req $exp"
      case Some(n) =>
        s"req $n: $exp"
    }

  override def toJson1 = {
    val constraintdecl = new JSONObject
    constraintdecl.put("type", "ConstraintDecl")
    name match {
      case None =>
      case Some(ident) =>
        constraintdecl.put("name", ident)
    }
    constraintdecl.put("exp", exp.toJson)
  }

  override def toJson2 = toJson1
}

case class ExpressionDecl(exp: Exp) extends MemberDecl {
  override def children: List[AnyRef] = List(exp)

  override def toScala: String = exp.toScala

  override def toString = exp.toString

  override def toJson1 = {
    val expressiondecl = new JSONObject()
    expressiondecl.put("type", "ExpressionDecl")
    expressiondecl.put("exp", exp.toJson)
  }

  override def toJson2 = toJson1

}

trait Exp extends HasChildren {
  def statistics() {}

  def freeVariables: Set[String] = Set()

  def substitute(substitution: Map[String, Exp]): Exp =
    UtilSMT.error(this.toString)

  def copyType(oldExp: Exp): Exp = {
    exp2Type.put(this, exp2Type.get(oldExp))
    this
  }

  def containsSetComprhension: Boolean = false

  def toSMT(className: String, subTyping: Boolean): String =
    UtilSMT.error(this.toString)

  def toSMTSetContains(className: String, subTyping: Boolean)(element: Exp): String =
    UtilSMT.error(this.toString)

  def toScala: String = ???
  def toJson: JSONObject = {
    if (ASTOptions.useJson1) toJson1
    else toJson2
  }
  def toJson1: JSONObject
  def toJson2: JSONObject
  def toJavaString: String = this.toString
}

case class ParenExp(exp: Exp) extends Exp {
  override def children: List[Exp] = List(exp)

  override def statistics() {
    UtilSMT.statistics.PARENEXP += 1
    exp.statistics()
  }

  override def freeVariables: Set[String] = exp.freeVariables

  override def substitute(substitution: Map[String, Exp]): Exp =
    ParenExp(exp.substitute(substitution)) copyType this

  override def containsSetComprhension: Boolean =
    exp.containsSetComprhension

  override def toSMT(className: String, subTyping: Boolean): String =
    exp.toSMT(className, subTyping)

  override def toSMTSetContains(className: String, subTyping: Boolean)(element: Exp): String =
    exp.toSMTSetContains(className, subTyping)(element)

  // TODO: Reached here for Scala translation, which is at experimental stage

  override def toString = s"($exp)"
  
  override def toJavaString = s"(${exp.toJavaString})"
  
  override def toJson1 = {
    val expression = new JSONObject()

    expression.put("exp", exp.toJson)
    expression.put("type", "ParenExp")
  }

  override def toJson2 = {
    exp.toJson2
  }
}

case class IdentExp(ident: String) extends Exp {
  override def children: List[Exp] = List()

  override def freeVariables: Set[String] = Set(ident)

  override def substitute(substitution: Map[String, Exp]): Exp =
    if (substitution contains ident) substitution(ident).copyType(this) else this

  override def toSMT(className: String, subTyping: Boolean): String = {
    if (isLocal(this) || UtilSMT.isCreatedLocal(ident))
      ident
    else if (UtilSMT.isGlobal(this) && className != UtilSMT.Names.mainClass) {
      val mainClass: String = UtilSMT.Names.mainClass
      val getter: String = s"$mainClass!$ident"
      UtilSMT.addGetter(getter)
      s"($getter 0)"
    } else {
      val dot: String = if (subTyping) "." else "!"
      val getter: String = s"$className$dot$ident"
      UtilSMT.addGetter(getter)
      s"($getter this)" // deleted space after ')'. I think it does not break anything (KH).
    }
  }

  override def toSMTSetContains(className: String, subTyping: Boolean)(element: Exp): String = {
    val identSMT = toSMT(className, subTyping)
    val elementSMT = element.toSMT(className, subTyping)
    s"(select $identSMT $elementSMT)"
  }

  override def toScala = ident

  override def toString = ident
  
  override def toJson1 = {
    val expression = new JSONObject()

    expression.put("ident", ident)
    expression.put("type", "IdentExp")
  }

  override def toJson2 = {
    val expObj = new JSONObject()

    expObj.put("element", ident)
    expObj.put("type", "ElementValue")
  }
}

case class DotExp(exp: Exp, ident: String) extends Exp {
  override def children: List[Exp] = List(exp)

  override def statistics() {
    val depth = dotDepth(this)
    UtilSMT.statistics.DOTEXP += 1
    UtilSMT.statistics.DOTEXPMAX = Math.max(UtilSMT.statistics.DOTEXPMAX, depth)
    if (depth > 1)
      UtilSMT.statistics.DOTEXPLONG += 1
  }

  override def freeVariables: Set[String] = exp.freeVariables

  override def substitute(substitution: Map[String, Exp]): Exp = {
    val expRenamed = exp.substitute(substitution)
    DotExp(expRenamed, ident) copyType this
  }

  override def toSMT(className: String, subTyping: Boolean): String = {
    val expSMT = exp.toSMT(className, subTyping)
    val classNameOfExp = exp2Type.get(exp).toString
    val getter = s"$classNameOfExp.$ident"
    UtilSMT.addGetter(getter)
    s"($getter $expSMT)"
  }

  override def toSMTSetContains(className: String, subTyping: Boolean)(element: Exp): String = {
    val dotSMT = toSMT(className, subTyping)
    val elementSMT = element.toSMT(className, subTyping)
    s"(select $dotSMT $elementSMT)"
  }

  override def toString = s"$exp.$ident"
  
  override def toJavaString = s"${exp.toJavaString}.$ident"

  override def toJson1 = {
    val expression = new JSONObject()

    expression.put("ident", ident)
    expression.put("exp", exp.toJson)
    expression.put("type", "DotExp")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    operand.put(new JSONObject().put("type", "ElementValue").put("element", "getProperty"))
    operand.put(exp.toJson)
    operand.put(new JSONObject().put("type", "LiteralString").put("string",ident))
//    operand.put(new JSONObject().put("type", "ElementValue").put("element", "Dot"))
//    operand.put(exp.toJson)
//    operand.put(new JSONObject().put("type", "LiteralString").put("string",ident))    

    expression.put("operand", operand)
    expression.put("type", "Expression")
    
    expression
  }
}

case class IndexExp(exp1: Exp, args: List[Argument]) extends Exp {
  override def children: List[Exp] = exp1 :: args

  override def toString = {
    var result = exp1.toString
    if (args != null)
      result += "[" + args.mkString(",") + "]"
    result
  }
  
  
  override def toJavaString = {
    var result = exp1.toJavaString
    args.foreach(result += ".get(" + _.toJavaString + ")")
    result
  }

  override def toJson1 = {
    val funappl = new JSONObject()
    val theArgs = new JSONArray()
    funappl.put("type", "FunApplExp")
    funappl.put("exp1", exp1.toJson)
    for (a <- args) theArgs.put(a.toJson)
    funappl.put("args", theArgs)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    expression.put("operand", operand)
    expression.put("type", "Expression")

    operand.put(exp1.toJson)
    for (arg <- args) operand.put(arg.toJson)

    expression
  }

}

case class ClassExp(ty: Type) extends Exp {
  override def children: List[AnyRef] = List()

  override def toString = {
    ty.toString + ".class"
  }
  
  def toJson1 : org.json.JSONObject = ???
  def toJson2 : org.json.JSONObject = ???
}

// KH: first argument should be 'exp' really.

case class FunApplExp(exp1: Exp, args: List[Argument]) extends Exp {
  override def children: List[Exp] = exp1 :: (if (args == null)  List() else args)

  def name: String =
    exp1 match {
      case IdentExp(ident) => ident
      case DotExp(_, ident) => ident
    }

  override def statistics() {
    UtilSMT.statistics.FUNAPPL += 1
    exp1.statistics()
    args foreach (_.statistics())
  }

  override def freeVariables: Set[String] = {
    val freeArgVariables = args.flatMap(_.freeVariables).toSet
    exp1.freeVariables union freeArgVariables
  }

  override def substitute(substitution: Map[String, Exp]): Exp = {
    val argsRenamed = args.map(_.substitute(substitution)).asInstanceOf[List[Argument]]
    FunApplExp(exp1, argsRenamed) copyType this
  }

  override def toSMT(className: String, subTyping: Boolean): String = {
    if (isConstructor(exp1)) {
      // constructor application:
      val argMap: Map[String, Exp] = (for (NamedArgument(x, exp) <- args) yield (x -> exp)).toMap
      val IdentExp(ident) = exp1
      val entityDecl = getEntityDecl(ident)
      val propertyDecls = entityDecl.getAllPropertyDecls
      if (propertyDecls.isEmpty)
        s"(lift-$ident mk-$ident)"
      else {
        val argsSMTList: List[String] =
          for (PropertyDecl(_, id, ty, _, _, _) <- propertyDecls) yield if (argMap contains id) argMap(id).toSMT(className, subTyping) else UtilSMT.getNewConstant(ty)
        val argsSMT = argsSMTList.mkString(" ")
        s"(lift-$ident (mk-$ident $argsSMT))"
      }
    } else {
      // function application:
      val expSMT: String =
        exp1 match {
          case IdentExp(ident) =>
            if (UtilSMT.isGlobal(exp1) && className != UtilSMT.Names.mainClass) {
              val mainClass: String = UtilSMT.Names.mainClass
              s"$mainClass!$ident 0"
            } else {
              val dot = if (subTyping) "." else "!"
              s"$className$dot$ident this"
            }
          case DotExp(expBeforeDot, ident) =>
            val classOfFunction = exp2Type.get(expBeforeDot).toString
            val expSMT = expBeforeDot.toSMT(className, subTyping)
            s"$classOfFunction.$ident $expSMT"
        }
      val argsSMT: String = args.map(_.toSMT(className, subTyping)).mkString(" ")
      s"($expSMT $argsSMT)"
    }
  }

  override def toSMTSetContains(className: String, subTyping: Boolean)(element: Exp): String = {
    val funSMT = toSMT(className, subTyping)
    val elementSMT = element.toSMT(className, subTyping)
    s"(select $funSMT $elementSMT)"
  }

  override def toString = {
    var result = exp1.toString
    if (args != null)
      result += "(" + args.mkString(",") + ")"
    result
  }
  
  
    override def toJavaString = {
    var result = exp1.toJavaString
    if (args != null)
      result += "(" + args.mkString(",") + ")"
    result
  }

  override def toJson1 = {
    val funappl = new JSONObject()
    val theArgs = new JSONArray()
    funappl.put("type", "FunApplExp")
    funappl.put("exp1", exp1.toJson)
    for (a <- args) theArgs.put(a.toJson)
    funappl.put("args", theArgs)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    expression.put("operand", operand)
    expression.put("type", "Expression")

    operand.put(exp1.toJson)
    for (arg <- args) operand.put(arg.toJson)

    expression
  }
}

case class IfExp(cond: Exp, trueBranch: Exp, falseBranch: Option[Exp]) extends Exp {
  override def children: List[AnyRef] = List(cond, trueBranch) ::: ListIt.m(falseBranch)

  override def statistics() {
    UtilSMT.statistics.IFEXP += 1
    cond.statistics()
    trueBranch.statistics()
    falseBranch match {
      case None    =>
      case Some(e) => e.statistics()
    }
  }

  override def freeVariables: Set[String] =
    cond.freeVariables union
      trueBranch.freeVariables union
      (falseBranch match {
        case None    => Set()
        case Some(e) => e.freeVariables
      })

  override def substitute(substitution: Map[String, Exp]): Exp = {
    val condRenamed = cond.substitute(substitution)
    val trueBranchRenamed = trueBranch.substitute(substitution)
    val falseBranchRenamed = falseBranch match {
      case None    => falseBranch
      case Some(e) => Some(e.substitute(substitution))
    }
    IfExp(condRenamed, trueBranchRenamed, falseBranchRenamed) copyType this
  }

  override def containsSetComprhension: Boolean =
    trueBranch.containsSetComprhension ||
      (falseBranch match {
        case None    => false
        case Some(e) => e.containsSetComprhension
      })

  override def toSMT(className: String, subTyping: Boolean): String = {
    val condSMT = cond.toSMT(className, subTyping)
    val trueSMT = trueBranch.toSMT(className, subTyping)
    val falseSMT = falseBranch match {
      case None          => UtilSMT.error(this.toString)
      case Some(elseExp) => elseExp.toSMT(className, subTyping)
    }
    s"(ite $condSMT $trueSMT $falseSMT)"
  }

  override def toSMTSetContains(className: String, subTyping: Boolean)(element: Exp): String = {
    val condSMT = cond.toSMT(className, subTyping)
    val trueSMT = trueBranch.toSMTSetContains(className, subTyping)(element)
    val falseSMT = falseBranch match {
      case None          => UtilSMT.error(this.toString)
      case Some(elseExp) => elseExp.toSMTSetContains(className, subTyping)(element)
    }
    s"(ite $condSMT $trueSMT $falseSMT)"
  }

  override def toScala: String = {
    val condScala = cond.toScala
    val trueScala = trueBranch.toScala
    val falseScala = falseBranch match {
      case None          => "???"
      case Some(elseExp) => elseExp.toScala
    }
    s"if ($condScala) $trueScala else $falseScala"
  }

  override def toString = {
    var result = s"if $cond then\n"
    moveIn
    result += indent + s"$trueBranch\n"
    moveOut
    if (falseBranch.nonEmpty) {
      result += indent + "else\n"
      moveIn
      result += indent + falseBranch.get
      moveOut
    }
    result
  }
  
  override def toJavaString = {
    var result = s"${cond.toJavaString} ? "
    result += s"${trueBranch.toJavaString} : "
    result += (falseBranch match {
      case None => s"null"
      case Some(fb) => s"${fb.toJavaString}"
    })
    result
  }

  override def toJson1 = {
    val expression = new JSONObject()
    expression.put("type", "IfExp")
    expression.put("cond", cond.toJson)
    expression.put("trueBranch", trueBranch.toJson)
    falseBranch match { case Some(fb) => expression.put("falseBranch", fb.toJson) case None => expression }
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    expression.put("type", "Expression")
    expression.put("operand", operand)

    operand.put(new JSONObject().put("type", "ElementValue").put("element", "If"))
    operand.put(cond.toJson)
    operand.put(trueBranch.toJson)
    falseBranch match { case Some(fb) => operand.put(fb.toJson) case None => }

    expression
  }
}

case class MatchExp(exp: Exp, m: List[MatchCase]) extends Exp {
  override def children: List[Exp] = exp :: m

  override def toString = {
    var result = s"match $exp with\n"
    moveIn
    for (mtch <- m) {
      result += indent + s"$mtch\n"
    }
    moveOut
    result += indent + "}"
    result
  }

  override def toJson1 = {
    val matchexp = new JSONObject()
    val theCases = new JSONArray()
    matchexp.put("type", "MatchExp")
    for (c <- m) theCases.put(c.toJson)
    matchexp.put("exp", exp.toJson)
    matchexp.put("m", theCases)
  }

  // FIXME
  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    expression.put("type", "Expression")
    expression.put("operand", operand)

    operand.put(new JSONObject().put("type", "ElementValue").put("element", "MatchExp"))
    operand.put(exp.toJson)
    for (mc <- m) operand.put(mc.toJson)

    expression
  }
}

// KH: How did this become an expression?

case class MatchCase(patterns: List[Pattern], exp: Exp) extends Exp {
  override def children: List[AnyRef] = patterns.asInstanceOf[List[AnyRef]] ::: List[AnyRef](exp)

  override def toString =
    "case " + patterns.mkString("|") + " => " + exp

  override def toJson1 = {
    val matchcase = new JSONObject()
    val thePatterns = new JSONArray()
    matchcase.put("type", "MatchCase")
    for (p <- patterns) thePatterns.put(p.toJson)
    matchcase.put("patterns", thePatterns)
    matchcase.put("exp", exp.toJson)
  }

  // FIXME
  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    expression.put("type", "Expression")
    expression.put("operand", operand)

    operand.put(new JSONObject().put("type", "ElementValue").put("element", "MatchCase"))
    operand.put(exp.toJson)
    for (pattern <- patterns) operand.put(pattern.toJson)
    expression
  }
}

case class BlockExp(body: List[MemberDecl]) extends Exp {
  override def children: List[MemberDecl] = body

  override def statistics() {
    UtilSMT.statistics.BLOCK += 1
    body foreach (_.statistics())
  }

  override def toSMT(className: String, subTyping: Boolean): String =
    UtilSMT.memberList2SMT(body, className, subTyping)

  override def toString = {
    var result = "{\n"
    moveIn
    for (member <- body) {
      result += indent + member + "\n"
    }
    moveOut
    result += indent + "}"
    result
  }
  
  
  

  override def toJson1 = {
    val expression = new JSONObject()
    expression.put("type", "BlockExp")
    val theBody = new JSONArray()
    for (member <- body) theBody.put(member.toJson)
    expression.put("body", theBody)
  }

  // FIXME
  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    expression.put("type", "Expression")
    expression.put("operand", operand)

    operand.put(new JSONObject().put("type", "ElementValue").put("element", "BlockExp"))
    for (md <- body) operand.put(md.toJson)

    expression

  }
}

case class WhileExp(cond: Exp, body: Exp) extends Exp {
  override def children: List[Exp] = List(cond, body)

  override def toString = {
    var result = s"while $cond do"
    moveIn
    result += indent + body
    moveOut
    result
  }
  

  override def toJson1 = {
    val whileexp = new JSONObject()
    whileexp.put("type", "WhileExp")
    whileexp.put("condition", cond.toJson)
    whileexp.put("body", body.toJson)
  }

  // FIXME
  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    expression.put("type", "Expression")
    expression.put("operand", operand)

    operand.put(new JSONObject().put("type", "ElementValue").put("element", "WhileExp"))
    operand.put(cond.toJson)
    operand.put(body.toJson)

    expression
  }
}

case class ForExp(pattern: Pattern, exp: Exp, body: Exp) extends Exp {
  override def children: List[AnyRef] = List(pattern, exp, body)

  override def toString = {
    var result = s"for $pattern in $exp do"
    moveIn
    result += indent + body
    moveOut
    result
  }
  

  override def toJson1 = {
    val forexp = new JSONObject()
    forexp.put("type", "ForExp")
    forexp.put("pattern", pattern.toJson)
    forexp.put("exp", exp.toJson)
    forexp.put("body", body.toJson)
  }

  // FIXME
  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    expression.put("type", "Expression")
    expression.put("operand", operand)

    operand.put(new JSONObject().put("type", "ElementValue").put("element", "ForExp"))
    operand.put(pattern.toJson)
    operand.put(exp.toJson)
    operand.put(body.toJson)

    expression
  }
}

case class BinExp(exp1: Exp, op: BinaryOp, exp2: Exp) extends Exp {
  override def children: List[AnyRef] = List(exp1, op, exp2)

  override def statistics() {
    UtilSMT.statistics.BINEXP += 1
    op.statistics()
    exp1.statistics()
    exp2.statistics()
  }

  override def freeVariables: Set[String] =
    exp1.freeVariables union exp2.freeVariables

  override def substitute(substitution: Map[String, Exp]): Exp = {
    val exp1Renamed = exp1.substitute(substitution)
    val exp2Renamed = exp2.substitute(substitution)
    BinExp(exp1Renamed, op, exp2Renamed) copyType this
  }

  private def assertQuantification(quantifier: String, typeMap: Map[String, Type], op: String, smt1: String, smt2: String): String = {
    val bindingsSMT = (for ((id, ty) <- typeMap) yield s"($id ${ty.toSMT})").mkString
    s"($quantifier ($bindingsSMT) ($op $smt1 $smt2))"
  }

  override def toSMT(className: String, subTyping: Boolean): String = {
    if (!exp1.containsSetComprhension && !exp2.containsSetComprhension) {
      val exp1SMT = exp1.toSMT(className, subTyping)
      val exp2SMT = exp2.toSMT(className, subTyping)
      if (UtilSMT.isConstructorPredicate(this)) {
        s"(= (deref $exp1SMT) $exp2SMT)"
      } else {
        op match {
          case NEQ =>
            s"(not (= $exp1SMT $exp2SMT))"
          case TUPLEINDEX =>
            assert(exp2.isInstanceOf[IntegerLiteral], "Tuple index must be an integer literal!")
            val indexFunSMT = s"_$exp2SMT"
            s"($indexFunSMT $exp1SMT)"
          case ISIN =>
            // @@@\
            // s"(select $exp2SMT $exp1SMT)"
            if (true)
              s"(select $exp2SMT $exp1SMT)"
            else
              s"(seq.contains $exp2SMT (seq.unit $exp1SMT))"
            // @@@/
          case NOTISIN =>
            s"(not (select $exp2SMT $exp1SMT))"
          case PSUBSET =>
            s"(and (subset $exp1SMT $exp2SMT) (not (= $exp1SMT $exp2SMT)))"
          case _ =>
            val opSMT = op.toSMT
            s"($opSMT $exp1SMT $exp2SMT)"
        }
      }
    } else { // at least one set comprehension or set range expression
      var typeMapQuantified: Map[String, Type] = Map()
      var exp1SMT: String = null
      var exp2SMT: String = null
      if (!UtilSMT.isComplexSetCompr(exp1) && !UtilSMT.isComplexSetCompr(exp2)) {
        op match {
          case EQ | NEQ | SUBSET | PSUBSET =>
            val qvar = UtilSMT.newVariable()
            val identExp = IdentExp(qvar)
            val ty = UtilSMT.getSetMemberTypeOf(exp2)
            typeMapQuantified = Map(qvar -> ty)
            UtilSMT.createLocals(Set(qvar))
            exp1SMT = exp1.toSMTSetContains(className, subTyping)(identExp)
            exp2SMT = exp2.toSMTSetContains(className, subTyping)(identExp)
            UtilSMT.removeCreatedLocals(Set(qvar))
          case _ =>
        }
      } else { // at least one complex set comprehension
        val swapExpressions: Boolean = !UtilSMT.isComplexSetCompr(exp2)
        val (lessComplex, moreComplex) = if (swapExpressions) (exp2, exp1) else (exp1, exp2)
        op match {
          case EQ | NEQ | SUBSET | PSUBSET =>
            val CollectionComprExp(kind, headExp, bindings, bodyExp) = exp2
            val freeVarsExp1 = headExp.freeVariables
            val typeMap: Map[String, Type] = bindings.flatMap(_.getTypeMap.toSet).toMap
            var substitution: Map[String, Exp] = Map()
            var locals: Set[String] = Set()
            for (ident <- typeMap.keySet if freeVarsExp1.contains(ident)) {
              val newIdent = UtilSMT.newVariable()
              typeMapQuantified += (newIdent -> typeMap(ident))
              substitution += (ident -> IdentExp(newIdent))
              locals += newIdent
            }
            UtilSMT.createLocals(locals)
            val exp2Head = exp2.asInstanceOf[CollectionComprExp].exp1
            val exp2HeadRenamed = exp2Head.substitute(substitution)
            val lessComplexSMT = lessComplex.toSMTSetContains(className, subTyping)(exp2HeadRenamed)
            val moreComplexSMT = moreComplex.asInstanceOf[CollectionComprExp].toSMTSetContainsIgnoreHead(className, subTyping)(substitution)
            UtilSMT.removeCreatedLocals(locals)
            if (swapExpressions) {
              exp1SMT = moreComplexSMT
              exp2SMT = lessComplexSMT
            } else {
              exp1SMT = lessComplexSMT
              exp2SMT = moreComplexSMT
            }
          case _ =>
        }
      }
      op match {
        case EQ =>
          assertQuantification("forall", typeMapQuantified, "=", exp1SMT, exp2SMT)
        case NEQ =>
          val allEqual = assertQuantification("forall", typeMapQuantified, "=", exp1SMT, exp2SMT)
          s"(not $allEqual)"
        case SUBSET =>
          assertQuantification("forall", typeMapQuantified, "=>", exp1SMT, exp2SMT)
        case PSUBSET =>
          val isSubset = assertQuantification("forall", typeMapQuantified, "=>", exp1SMT, exp2SMT)
          val notEqual = assertQuantification("exists", typeMapQuantified, "and", s"(not $exp1SMT)", exp2SMT)
          s"(and $isSubset $notEqual)"
        case ISIN =>
          exp2.toSMTSetContains(className, subTyping)(exp1)
        case NOTISIN =>
          val setContainsElement = exp2.toSMTSetContains(className, subTyping)(exp1)
          s"(not $setContainsElement)"
      }
    }
  }

  override def toSMTSetContains(className: String, subTyping: Boolean)(element: Exp): String = {
    val exp1SMT = exp1.toSMTSetContains(className, subTyping)(element)
    val exp2SMT = exp2.toSMTSetContains(className, subTyping)(element)
    op match {
      case SETINTER => s"(and $exp1SMT $exp2SMT)"
      case SETUNION => s"(or $exp1SMT $exp2SMT)"
      case _        => UtilSMT.error(this.toString)
    }
  }

  override def toScala: String = {
    val exp1Scala = exp1.toScala
    val exp2Scala = exp2.toScala
    val opScala = op.toScala
    s"$exp1Scala $opScala $exp2Scala"
  }

  override def toString = s"$exp1 $op $exp2"
  
  override def toJavaString = s"${exp1.toJavaString} ${op.toJavaString} ${exp2.toJavaString}"

  override def toJson1 = {
    val expression = new JSONObject()
    expression.put("type", "BinExp")
    expression.put("op", op.toJsonName)
    expression.put("exp1", exp1.toJson)
    expression.put("exp2", exp2.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    expression.put("operand", operand)
    expression.put("type", "Expression")

    operand.put(new JSONObject().put("type", "ElementValue").put("element", op.toJsonName))
    operand.put(exp1.toJson)
    operand.put(exp2.toJson)

    expression
  }
}

case class UnaryExp(op: UnaryOp, exp: Exp) extends Exp {
  override def children: List[AnyRef] = List(op, exp)

  override def statistics() {
    UtilSMT.statistics.UNARYEXP += 1
    op.statistics()
    exp.statistics()
  }

  override def freeVariables: Set[String] =
    exp.freeVariables

  override def substitute(substitution: Map[String, Exp]): Exp = {
    val expRenamed = exp.substitute(substitution)
    UnaryExp(op, expRenamed) copyType this
  }

  override def toSMT(className: String, subTyping: Boolean): String = {
    val opSMT = op.toSMT
    val expSMT = exp.toSMT(className, subTyping)
    s"($opSMT $expSMT)"
  }

  override def toScala = {
    val opScala = op.toScala
    val expScala = exp.toScala
    s"$opScala $expScala"
  }

  override def toString =
    if (op == PREV)
      s"$exp$op"
    else
      s"$op$exp"
      
      
  override def toJavaString = s"$op${exp.toJavaString}"

  override def toJson1 = {
    val expression = new JSONObject()

    expression.put("exp", exp.toJson)
    expression.put("type", "UnaryExp")
    expression.put("op", op.toJsonName)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    expression.put("operand", operand)
    expression.put("type", "Expression")

    operand.put(new JSONObject().put("type", "ElementValue").put("element", op.toJsonName))
    operand.put(exp.toJson)

    expression
  }
}

case class QuantifiedExp(quant: Quantifier,
                         bindings: List[RngBinding],
                         exp: Exp) extends Exp {
  override def children: List[AnyRef] = bindings.asInstanceOf[List[AnyRef]] :+ exp.asInstanceOf[AnyRef]

  override def statistics() {
    quant.statistics()
    bindings foreach (_.statistics())
    exp.statistics()
  }

  override def freeVariables: Set[String] = {
    val boundNames = bindings.flatMap(_.boundNames)
    exp.freeVariables -- boundNames
  }

  override def substitute(substitution: Map[String, Exp]): Exp = {
    val boundNames = bindings.flatMap(_.boundNames)
    val expRenamed = exp.substitute(substitution -- boundNames)
    QuantifiedExp(quant, bindings, expRenamed) copyType this
  }

  override def toSMT(className: String, subTyping: Boolean): String = {
    val quantSMT = quant.toSMT
    val bindingsSMT = bindings.map(_.toSMT).mkString
    val expSMT = exp.toSMT(className, subTyping)
    val result = s"($quantSMT ($bindingsSMT) $expSMT)"
    result
  }

  override def toString = s"$quant ${bindings.mkString(",")} . $exp"
  
  override def toJavaString = s"$quant ${bindings.mkString(",")} . ${exp.toJavaString}"

  override def toJson1 = {
    val expression = new JSONObject()
    val binding = new JSONArray()

    for (bind <- bindings) binding.put(bind.toJson)

    expression.put("quant", quant.toJson)
    expression.put("bindings", binding)
    expression.put("exp", exp.toJson)
    expression.put("type", "QuantifiedExp")
  }

  override def toJson2 = {

    val expression = new JSONObject()
    val operand = new JSONArray()
    val theBindings = new JSONArray()
    for (bind <- bindings) theBindings.put(bind.toJson)

    expression.put("operand", operand)
    expression.put("type", "Expression")

    operand.put(quant.toJson)
    //operand.append(theBindings);
    for (i <- 0 to theBindings.length() - 1) operand.put(theBindings.get(i))
    operand.put(exp.toJson)

    expression
  }
}

case class TupleExp(exps: List[Exp]) extends Exp {
  override def children: List[Exp] = exps

  override def statistics() {
    UtilSMT.statistics.TUPLEEXP += 1
    exps foreach (_.statistics())
  }

  override def freeVariables: Set[String] =
    exps.flatMap(_.freeVariables).toSet

  override def substitute(substitution: Map[String, Exp]): Exp = {
    val expsRenamed = exps.map(_.substitute(substitution))
    TupleExp(expsRenamed) copyType this
  }

  override def toSMT(className: String, subTyping: Boolean): String = {
    val constrSMT = s"mk-Tuple${exps.length}"
    val expsSMT = exps.map(_.toSMT(className, subTyping)).mkString(" ")
    s"($constrSMT $expsSMT)"
  }

  override def toString = "Tuple(" + exps.mkString(",") + ")"
  
  override def toJson1 = {
    val tupleExp = new JSONObject()
    val expressions = new JSONArray()
    for (exp <- exps) expressions.put(exp.toJson)
    tupleExp.put("type", "TupleExp")
    tupleExp.put("exps", expressions)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "ElementValue").put("element", "Tuple"))
    for (exp <- exps) operand.put(exp.toJson)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

trait CollectionKind {
  def toJson: String
  def toJavaString: String = toString
}

case object SetKind extends CollectionKind {
  override def toString = "Set"
  override def toJson = toString
}

case object OSetKind extends CollectionKind {
  override def toString = "OSet"
  override def toJson = toString
}

case object SeqKind extends CollectionKind {
  override def toString = "Seq"
  override def toJson = toString
  override def toJavaString = "ArrayList"
  
}

case object BagKind extends CollectionKind {
  override def toString = "Bag"
  override def toJson = toString
}

case class CollectionEnumExp(kind: CollectionKind, exps: List[Exp]) extends Exp {
  override def children: List[Exp] = exps

  override def statistics() {
    kind match {
      case SetKind =>
        UtilSMT.statistics.SETENUMEXP += 1
      case SeqKind =>
        UtilSMT.statistics.SEQENUMEXP += 1
    }
    exps foreach (_.statistics())
  }

  override def freeVariables: Set[String] =
    exps.flatMap(_.freeVariables).toSet

  override def substitute(substitution: Map[String, Exp]): Exp = {
    val expsRenamed = exps.map(_.substitute(substitution))
    CollectionEnumExp(kind, expsRenamed) copyType this
  }

  override def toSMT(className: String, subTyping: Boolean): String = {
    kind match {
      case SetKind =>
        val ty = exp2Type.get(this) // not used, see below.
        val tySMT = "Int" // TODO: use ty instead
        val emptySMT = s"((as const (Set $tySMT)) false)"
        var result = emptySMT
        for (exp <- exps) {
          val expSMT = exp.toSMT(className, subTyping)
          result = s"(store $result $expSMT true)"
        }
        result
      case _ => UtilSMT.error(this.toString)
    }
  }

  override def toSMTSetContains(className: String, subTyping: Boolean)(element: Exp): String = {
    val expSMT = toSMT(className, subTyping)
    val elementSMT = element.toSMT(className, subTyping)
    s"(select $expSMT $elementSMT)"
  }

  override def toString = kind + "{" + exps.mkString(",") + "}"

  override def toJson1 = {
    val enumExp = new JSONObject()
    val expressions = new JSONArray()
    for (exp <- exps) expressions.put(exp.toJson)
    enumExp.put("type", "CollectionEnumExp")
    enumExp.put("exps", expressions)
    enumExp.put("kind", kind.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "ElementValue").put("element", kind))
    for (exp <- exps) operand.put(exp.toJson)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class CollectionRangeExp(kind: CollectionKind, exp1: Exp, exp2: Exp) extends Exp {
  override def children: List[AnyRef] = List(exp1, exp2)

  override def statistics() {
    kind match {
      case SetKind =>
        UtilSMT.statistics.SETRANGEEXP += 1
      case SeqKind =>
        UtilSMT.statistics.SEQRANGEEXP += 1
    }
    exp1.statistics()
    exp2.statistics()
  }

  override def freeVariables: Set[String] =
    exp1.freeVariables union exp2.freeVariables

  override def substitute(substitution: Map[String, Exp]): Exp = {
    val exp1Renamed = exp1.substitute(substitution)
    val exp2Renamed = exp2.substitute(substitution)
    CollectionRangeExp(kind, exp1Renamed, exp2Renamed) copyType this
  }

  override def containsSetComprhension: Boolean =
    !exp1.isInstanceOf[IntegerLiteral] || !exp2.isInstanceOf[IntegerLiteral]

  override def toSMT(className: String, subTyping: Boolean): String = {
    kind match {
      case SetKind =>
        (exp1, exp2) match {
          case (IntegerLiteral(low), IntegerLiteral(high)) =>
            val emptySMT = s"((as const (Set Int)) false)"
            var result = emptySMT
            for (i <- low to high) {
              result = s"(store $result $i true)"
            }
            result
          case _ =>
            UtilSMT.error(this.toString)
        }
      case _ => UtilSMT.error(this.toString)
    }
  }

  override def toSMTSetContains(className: String, subTyping: Boolean)(element: Exp): String = {
    val exp1SMT = exp1.toSMT(className, subTyping)
    val exp2SMT = exp2.toSMT(className, subTyping)
    val elementSMT = element.toSMT(className, subTyping)
    s"(and (<= $exp1SMT $elementSMT) (<= $elementSMT $exp2SMT))"
  }

  override def toString = s"$kind{$exp1 .. $exp2}"

  override def toJson1 = {
    val rangeExp = new JSONObject()
    rangeExp.put("type", "CollectionRangeExp")
    rangeExp.put("kind", kind.toJson)
    rangeExp.put("exp1", exp1.toJson)
    rangeExp.put("exp2", exp2.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "ElementValue").put("element", kind))
    operand.put(exp1.toJson)
    operand.put(exp2.toJson)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class CollectionComprExp(kind: CollectionKind,
                              exp1: Exp,
                              bindings: List[RngBinding],
                              exp2: Exp) extends Exp {
  override def children: List[AnyRef] = (exp1 :: bindings) :+ exp2

  override def statistics() {
    kind match {
      case SetKind =>
        UtilSMT.statistics.SETCOMPREXP += 1
      case SeqKind =>
        UtilSMT.statistics.SEQCOMPREXP += 1
    }
    exp1.statistics()
    exp2.statistics()
    bindings foreach (_.statistics())
  }

  override def freeVariables: Set[String] = {
    val boundNames = bindings.flatMap(_.boundNames).toSet
    val exp1FreeVariables = exp1.freeVariables -- boundNames
    val exp2FreeVariables = exp2.freeVariables -- boundNames
    exp1FreeVariables union exp2FreeVariables
  }

  override def containsSetComprhension: Boolean = true

  override def toSMTSetContains(className: String, subTyping: Boolean)(element: Exp): String = {
    val simpleCase: Boolean = exp1 match {
      case IdentExp(id) => bindings.flatMap(_.boundNames).toSet.contains(id)
      case _            => false
    }
    if (simpleCase) {
      val ident = exp1.asInstanceOf[IdentExp].ident
      val exp2Renamed = exp2.substitute(Map(ident -> element))
      val exp2RenamedSMT = exp2Renamed.toSMT(className, subTyping)
      val headVariables = exp1.freeVariables
      val remainingBindings = UtilSMT.removeRngBindingsFor(headVariables, bindings)
      if (remainingBindings.isEmpty)
        exp2RenamedSMT
      else {
        val remainingBindingsSMT = remainingBindings.map(_.toSMT).mkString
        s"(exists ($remainingBindingsSMT) $exp2RenamedSMT)"
      }
    } else {
      val bindingsSMT = bindings.flatMap(_.toSMT).mkString
      val elementSMT = element.toSMT(className, subTyping)
      val exp1SMT = exp1.toSMT(className, subTyping)
      val exp2SMT = exp2.toSMT(className, subTyping)
      val predicateSMT = s"(and (= $elementSMT $exp1SMT) $exp2SMT)"
      s"(exists ($bindingsSMT) $predicateSMT)"
    }
  }

  def toSMTSetContainsIgnoreHead(className: String, subTyping: Boolean)(substitution: Map[String, Exp]): String = {
    val exp2RenamedSMT = exp2.substitute(substitution).toSMT(className, subTyping)
    val remainingBindings = UtilSMT.removeRngBindingsFor(substitution.keySet, bindings)
    if (remainingBindings.isEmpty)
      exp2RenamedSMT
    else {
      val bindingsSMT = remainingBindings.map(_.toSMT).mkString
      s"(exists ($bindingsSMT) $exp2RenamedSMT)"
    }
  }

  override def toString = s"$kind{$exp1 | ${bindings.mkString(",")} . $exp2}"

  override def toJson1 = {
    val comprExp = new JSONObject()
    val bndgs = new JSONArray()
    for (binding <- bindings) bndgs.put(binding.toJson)
    comprExp.put("type", "CollectionComprExp")
    comprExp.put("kind", kind.toJson)
    comprExp.put("exp1", exp1.toJson)
    comprExp.put("bindings", bndgs)
    comprExp.put("exp2", exp2.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "ElementValue").put("element", kind))
    operand.put(exp1.toJson)
    operand.put(exp2.toJson)
    for (binding <- bindings) operand.put(binding.toJson)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class LambdaExp(pat: Pattern, exp: Exp) extends Exp {
  override def children: List[AnyRef] = List(pat, exp)

  override def statistics() {
    UtilSMT.statistics.LAMBDAEXP += 1
    exp.statistics()
  }

  override def freeVariables: Set[String] =
    exp.freeVariables -- pat.boundNames

  override def toString = {
    s"$pat -> $exp"
  }

  override def toJson1 = {
    val lambdaExp = new JSONObject()
    lambdaExp.put("type", "LambdaExp")
    lambdaExp.put("pat", pat.toJson)
    lambdaExp.put("exp", exp.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "ElementValue").put("element", "Lambda"))
    operand.put(pat.toJson)
    operand.put(exp.toJson)

    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class AssertExp(exp: Exp) extends Exp {
  override def children = List(exp)

  override def freeVariables: Set[String] =
    exp.freeVariables

  override def toString = s"assert($exp)"

  override def toJson1 = {
    new JSONObject().put("type", "AssertExp").put("exp", exp.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "ElementValue").put("element", "Assert"))
    operand.put(exp.toJson)

    expression.put("type", "Expression")
    expression.put("operand", operand)

  }
}

case class TypeCastCheckExp(cast: Boolean, exp: Exp, ty: Type) extends Exp {
  override def children: List[AnyRef] = List(exp, ty)

  override def statistics() {
    if (cast)
      UtilSMT.statistics.TYPECASTEXP += 1
    else
      UtilSMT.statistics.TYPECHECKEXP += 1
    exp.statistics()
    ty.statistics()
  }

  override def freeVariables: Set[String] =
    exp.freeVariables // TODO type expressions can also contain expressions

  override def substitute(substitution: Map[String, Exp]): Exp = {
    val expRenamed = exp.substitute(substitution)
    TypeCastCheckExp(cast, expRenamed, ty) copyType this
  }

  override def toSMT(className: String, subTyping: Boolean): String = {
    if (cast)
      UtilSMT.error(s"type cast $this")
    ty match {
      case IdentType(QualifiedName(name :: Nil), Nil) =>
        val expSMT = exp.toSMT(className, subTyping)
        s"(deref-isa-$name $expSMT)"
      case _ =>
        UtilSMT.error(s"type test format $this")
    }
  }

  override def toString =
    if (cast) s"$exp as $ty"
    else s"$exp is $ty"

  override def toJson1 = {
    val typecastcheckexp = new JSONObject()
    typecastcheckexp.put("type", "TypeCastCheckExp")
    typecastcheckexp.put("cast", cast.toString)
    typecastcheckexp.put("exp", exp.toJson)
    typecastcheckexp.put("ty", ty.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    operand.put(new JSONObject().put("type", "ElementValue").put("element", "typeCastCheck"))
    operand.put(cast.toString)
    operand.put(exp.toJson)
    operand.put(ty.toJson)

    expression.put("type", "Expression")
    expression.put("operand", operand)

  }
}

case class ReturnExp(exp: Exp) extends Exp {
  override def children: List[AnyRef] = List(exp)

  override def freeVariables: Set[String] =
    exp.freeVariables

  override def toSMT(className: String, subTyping: Boolean): String =
    exp.toSMT(className, subTyping)

  override def toString = s"return $exp"
  
  override def toJavaString = s"return ${exp.toJavaString}"

  override def toJson1 = {
    val returnexp = new JSONObject()
    returnexp.put("type", "ReturnExp")
    returnexp.put("exp", exp.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    operand.put(new JSONObject().put("type", "ElementValue").put("element", "Return"))
    operand.put(exp.toJson)

    expression.put("type", "Expression")
    expression.put("operand", operand)

  }
}

case object BreakExp extends Exp {
  override def children: List[AnyRef] = List()

  override def toString = "break"

  override def toJson1 =
    new JSONObject().put("type", "BreakExp")

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    operand.put(new JSONObject().put("type", "ElementValue").put("element", toString))

    expression.put("type", "Expression")
    expression.put("operand", operand)
  }

}

case object ContinueExp extends Exp {
  override def children: List[AnyRef] = List()

  override def toString = "continue"

  override def toJson1 =
    new JSONObject().put("type", "ContinueExp")

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    operand.put(new JSONObject().put("type", "ElementValue").put("element", toString))

    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case object ResultExp extends Exp {
  override def children: List[AnyRef] = List()

  override def toString = "$result"

  override def toSMT(className: String, subTyping: Boolean): String =
    "$result"

  override def toJson1 = {
    new JSONObject().put("type", "ResultExp")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    operand.put(new JSONObject().put("type", "ElementValue").put("element", toString))

    expression.put("type", "Expression")
    expression.put("operand", operand)
  }

}

case object StarExp extends Exp {
  override def children: List[AnyRef] = List()

  override def toString = "*"

  override def toJson1 = {
    new JSONObject().put("type", "StarExp")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    operand.put(new JSONObject().put("type", "ElementValue").put("element", "Star"))

    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

// KH: How come this became an expression?:

trait Argument extends Exp

case class PositionalArgument(exp: Exp) extends Argument {
  override def children: List[Exp] = List(exp)

  override def statistics() {
    exp.statistics()
  }

  override def freeVariables: Set[String] =
    exp.freeVariables

  override def substitute(substitution: Map[String, Exp]): Exp =
    PositionalArgument(exp.substitute(substitution)) copyType this

  override def toSMT(className: String, subTyping: Boolean): String =
    exp.toSMT(className, subTyping)

  override def toString = exp.toString

  override def toJson1 = {
    val positionalArgument = new JSONObject()
    positionalArgument.put("type", "PositionalArgument")
    positionalArgument.put("exp", exp.toJson)
  }

  override def toJson2 = {
    exp.toJson
  }
}

case class NamedArgument(ident: String, exp: Exp) extends Argument {
  override def children: List[Exp] = List(exp)

  override def statistics() {
    exp.statistics()
  }

  override def freeVariables: Set[String] =
    exp.freeVariables

  override def substitute(substitution: Map[String, Exp]): Exp =
    NamedArgument(ident, exp.substitute(substitution)) copyType this

  override def toString = s"$ident :: $exp"

  override def toJson1 = {
    val classArgument = new JSONObject()
    classArgument.put("type", "NamedArgument")
    classArgument.put("ident", ident)
    classArgument.put("exp", exp.toJson)
  }

  // FIXME -- missing support for named arguments
  override def toJson2 = {
    exp.toJson
  }
}

trait BinaryOp {
  def statistics() {}

  def toSMT: String = UtilSMT.error(this.toString)
  def toScala: String = ???
  def toJsonName: String
  def toJavaString = toString
}

case object LT extends BinaryOp {
  override def toSMT = "<"

  override def toScala = "<"

  override def toString = "<"

  override def toJsonName = "LT"
}

case object LTE extends BinaryOp {
  override def toSMT = "<="

  override def toScala = "<="

  override def toString = "<="

  override def toJsonName = "LTE"
}

case object GT extends BinaryOp {
  override def toSMT = ">"

  override def toScala = ">"

  override def toString = ">"

  override def toJsonName = "GT"
}

case object GTE extends BinaryOp {
  override def toSMT = ">="

  override def toScala = ">="

  override def toString = ">="

  override def toJsonName = "GTE"
}

case object AND extends BinaryOp {
  override def toSMT = "and"

  override def toScala = "&&"

  override def toString = "&&"

  override def toJsonName = "And"
}

case object OR extends BinaryOp {
  override def toSMT = "or"

  override def toScala = "||"

  override def toString = "||"

  override def toJsonName = "OR"
}

case object IMPL extends BinaryOp {
  override def toSMT = "=>"

  override def toScala = "=>" // TODO: include this in prelude 

  override def toString = "=>"

  override def toJsonName = "Implies"
}

case object IFF extends BinaryOp {
  override def toSMT = "="

  override def toScala = "=="

  override def toString = "<=>"

  override def toJsonName = "Iff"
}

case object EQ extends BinaryOp {
  override def toSMT = "="

  override def toScala = "=="

  override def toString = "="
  
  override def toJavaString = "=="

  override def toJsonName = "EQ"
}

case object NEQ extends BinaryOp {
  override def toScala = "!="

  override def toString = "!="

  override def toJsonName = "NotEQ"
}

case object MUL extends BinaryOp {
  override def statistics() {
    UtilSMT.statistics.MULOP += 1
  }

  override def toSMT = "*"

  override def toScala = "*"

  override def toString = "*"

  override def toJsonName = "Times"
}

case object DIV extends BinaryOp {
  override def statistics() {
    UtilSMT.statistics.DIVOP += 1
  }

  override def toSMT = "/"

  override def toScala = "/"

  override def toString = "/"

  override def toJsonName = "Divide"
}

case object REM extends BinaryOp {
  override def statistics() {
    UtilSMT.statistics.REMOP += 1
  }

  override def toScala = "%"

  override def toString = "%"

  override def toJsonName = "Modulo"
}

case object SETINTER extends BinaryOp {
  override def statistics() {
    UtilSMT.statistics.SETOP += 1
  }

  override def toSMT = "intersect"

  override def toString = "inter"

  override def toJsonName = "Inter"
}

case object SETDIFF extends BinaryOp {
  override def statistics() {
    UtilSMT.statistics.SETOP += 1
  }

  override def toString = "\\"

  override def toJsonName = "SetDiff"
}

case object LISTCONCAT extends BinaryOp {
  override def statistics() {
    UtilSMT.statistics.SEQOP += 1
  }

  override def toString = "^"

  override def toJsonName = "Concat"
}

case object TUPLEINDEX extends BinaryOp {
  override def toString = "#"

  override def toJsonName = "TupleIndex"
}

case object ADD extends BinaryOp {
  override def toSMT = "+"

  override def toScala = "+"

  override def toString = "+"

  override def toJsonName = "Plus"
}

case object SUB extends BinaryOp {
  override def toSMT = "-"

  override def toScala = "-"

  override def toString = "-"

  override def toJsonName = "Minus"
}

case object SETUNION extends BinaryOp {
  override def statistics() {
    UtilSMT.statistics.SETOP += 1
  }

  override def toSMT = "union"

  override def toString = "union"

  override def toJsonName = "Union"
}

case object ISIN extends BinaryOp {
  override def statistics() {
    UtilSMT.statistics.SETOPISIN += 1
  }

  override def toString = "isin"

  override def toJsonName = "IsIn"
}

case object NOTISIN extends BinaryOp {
  override def statistics() {
    UtilSMT.statistics.SETOPISIN += 1
  }

  override def toString = "!isin"

  override def toJsonName = "NotIn"
}

case object SUBSET extends BinaryOp {
  override def statistics() {
    UtilSMT.statistics.SETOP += 1
  }

  override def toSMT = "subset"

  override def toString = "subset"

  override def toJsonName = "Subset"
}

case object PSUBSET extends BinaryOp {
  override def statistics() {
    UtilSMT.statistics.SETOP += 1
  }

  override def toString = "psubset"

  override def toJsonName = "PSubset"
}

case object ASSIGN extends BinaryOp {
  override def toScala = "="

  override def toString = ":="

  override def toJsonName = "Assign"
}

trait UnaryOp {
  def statistics() {}

  def toSMT: String = UtilSMT.error(this.toString)

  def toScala: String = ???(s"'$this' is not translated to Scala")

  def toJsonName: String // why is it called toJsonName and not toJson?
}

case object NOT extends UnaryOp {
  override def toSMT = "not"

  override def toScala = "!"

  override def toString = "!"

  override def toJsonName = "Not"
}

case object NEG extends UnaryOp {
  override def toSMT = "-"

  override def toScala = "-"

  override def toString = "-"

  override def toJsonName = "Neg"
}

case object PREV extends UnaryOp {
  override def toString = "~"
  override def toJsonName = "Prev"
}

trait Literal extends Exp {
  override def children = List()

  override def substitute(substitution: Map[String, Exp]): Exp =
    this
}

case class IntegerLiteral(i: Int) extends Literal {
  override def children = List()

  override def statistics() {
    UtilSMT.statistics.INTLIT += 1
  }
  
  override def toSMT(className: String, subTyping: Boolean): String = {
    i.toString
  }

  override def toScala = i.toString

  override def toString = i.toString

  override def toJson1 = {
    val o = new JSONObject()
    o.put("i", i)
    o.put("type", "LiteralInteger")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    expression.put("type", "LiteralInteger").put("integer", i)
  }
}

case class RealLiteral(f: java.math.BigDecimal) extends Literal {
  override def children = List()

  override def statistics() {
    UtilSMT.statistics.REALLIT += 1
  }
  
  override def toSMT(className: String, subTyping: Boolean): String = {
    f.formatted("%.16f")
  }

  override def toScala = f.toString

  override def toString = new DecimalFormat("0.#####E0").format(f)

  override def toJson1 = {
    val o = new JSONObject()
    o.put("f", f.formatted("%.16f"))
    o.put("type", "LiteralFloatingPoint")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    expression.put("type", "LiteralReal").put("double", f)
  }
}

case class CharacterLiteral(c: Char) extends Literal {
  override def children = List()

  override def toString = c.toString

  override def toScala = c.toString // are the quotes printed as well?

  override def toJson1 = {
    val o = new JSONObject()
    o.put("c", c)
    o.put("type", "LiteralCharacter")
  }

  override def toJson2 = {
    // Warning: loses information when treating simply as a String
    val expression = new JSONObject()
    expression.put("type", "LiteralString").put("string", toString)
  }
}

case class StringLiteral(s: String) extends Literal {
  override def children = List()

  override def statistics() {
    UtilSMT.statistics.STRINGLIT += 1
  }
  
  override def toString = s

  override def toJson1 = {
    val o = new JSONObject()
    o.put("string", s.replaceAll("\"", ""))
    o.put("type", "StringLiteral")
  }

  override def toJson2 = {
    val value = new JSONObject()
    value.put("type", "LiteralString").put("string", toString.replaceAll("\"", ""))
  }
}

case class BooleanLiteral(b: Boolean) extends Literal {
  override def children = List()

  override def statistics() {
    UtilSMT.statistics.BOOLLIT += 1
  }
  
  override def toSMT(className: String, subTyping: Boolean): String = b.toString

  override def toString = b.toString

  override def toJson1 = {
    val o = new JSONObject()
    o.put("b", b)
    o.put("type", "LiteralBoolean")
  }

  override def toJson2 = {
    val value = new JSONObject()
    value.put("type", "LiteralBoolean").put("boolean", toString)
  }
}

case object NullLiteral extends Literal {
  override def children = List()

  override def statistics() {
    UtilSMT.statistics.NULLLIT += 1
  }
  
  override def toString = "null"

  override def toJson1 = {
    new JSONObject().put("type", "NullLiteral")
  }

  override def toJson2 = {
    val value = new JSONObject()
    value.put("type", "LiteralNull")
  }
}

case object ThisLiteral extends Literal {
  override def children = List()

  override def statistics() {
    UtilSMT.statistics.THISLIT += 1
  }
  
  override def toSMT(className: String, subTyping: Boolean) = "this"

  override def toString = "this"

  override def toJson1 = {
    new JSONObject().put("type", "ThisLiteral")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "ElementValue").put("element", "This"))
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

trait Quantifier {
  def statistics() {}

  def toSMT: String

  def toJson: JSONObject = {
    if (ASTOptions.useJson1) toJson1
    else toJson2
  }

  def toJson1: JSONObject
  def toJson2: JSONObject
}

case object Forall extends Quantifier {
  override def statistics() {
    UtilSMT.statistics.FORALLEXP += 1
  }

  def toSMT = "forall"

  override def toString = "forall"

  override def toJson1 = {
    val o = new JSONObject()
    o.put("element", "Forall")
    o.put("type", "Quantifier")
    // o.put("type", "Forall") -- should it not be this?
  }

  override def toJson2 = {
    new JSONObject().put("type", "ElementValue").put("element", "ForAll")
  }
}

case object Exists extends Quantifier {
  override def statistics() {
    UtilSMT.statistics.EXISTSEXP += 1
  }

  def toSMT = "exists"

  override def toString = "exists"

  override def toJson1 = {
    val o = new JSONObject()
    o.put("element", "Exists")
    o.put("type", "Quantifier")
    // o.put("type", "Exists") -- should it not be this?
  }

  override def toJson2 = {
    new JSONObject().put("type", "ElementValue").put("element", "Exists")
  }
}

trait Type extends HasChildren {
  def children: List[AnyRef] = List()

  def statistics() {}
  def toSMT: String = UtilSMT.error(this.toString)
  def toScala: String = ???
  def toJavaString: String = toString
  def toJson: JSONObject = {
    if (ASTOptions.useJson1 == true) toJson1
    else toJson2
  }

  def toJson1: JSONObject
  def toJson2: JSONObject = {
    // FIXME -- Should use an identifier here instead of type name, right?
    new JSONObject().put("type", "ElementValue").put("element", toString)
  }
}

case class CollectType(ty: List[Type]) extends PrimitiveType {

  override def toJson1 = null
  override def toJson2 = null
}

case class SumType(ty: List[Type]) extends PrimitiveType {
  override def children: List[AnyRef] = ty
  override def toJson1 = null
  override def toJson2 = null
}

case object AnyType extends Type {
  override def toJson1 = null
  override def toJson2 = null
}

case class ClassType(ident: QualifiedName) extends Type {
  override def toString = s"ClassOf($ident)"
  override def toSMT: String = UtilSMT.error(this.toString)

  override def toJson1 = {
    val identType = new JSONObject()
    val arguments = new JSONArray()
    identType.put("ident", ident.toJson)
    identType.put("type", "ClassType")
  }
}

case class IdentType(ident: QualifiedName, args: List[Type]) extends Type {
  override def children: List[AnyRef] = args
  override def statistics() {
    (ident.names, args) match {
      case (name :: Nil, ty :: Nil) if Misc.isCollection(name) =>
        name match {
          case "Set"  => UtilSMT.statistics.SETTYPE += 1
          case "Bag"  =>
          case "Seq"  => UtilSMT.statistics.SEQTYPE += 1
          case "OSet" =>
        }
      case _ =>
        UtilSMT.statistics.REFTYPE += 1
    }
  }

  override def toSMT: String = {
    (ident.names, args) match {
      case (name :: Nil, ty :: Nil) if Misc.isCollection(name) =>
        val tySMT = ty.toSMT
        val kindSMT = name match {
          case "Set"  => "Set"
          case "Bag"  => "Bag"
          case "Seq"  => "Seq"
          case "OSet" => "OSet"
        }
        s"($kindSMT $tySMT)"
      case _ =>
        "Ref"
    }
  }
  
  override def toJavaString: String = {
    val buf = new StringBuilder
    buf ++= (
    ident.toString match {
      case "Seq" => "ArrayList<"
      case _ => toString
    })
    if (!buf.toString.equals("ArrayList<")) {
      buf.toString
    } else {
       buf ++= args.map(x => x.toJavaString).mkString(",")
    buf ++= ">"
    buf.toString
    }
   
  }

  override def toScala: String = ident.toScala

  override def toString =
    if (args == null || args.isEmpty)
      ident.toString
    else s"$ident[${args.mkString(",")}]"

  override def toJson1 = {
    val identType = new JSONObject()
    val arguments = new JSONArray()
    for (arg <- args) arguments.put(arg.toJson)
    identType.put("args", arguments)
    identType.put("ident", ident.toJson)
    identType.put("type", "IdentType")
  }

}

case class CartesianType(types: List[Type]) extends Type {
  // Probably needs to be a Ref.

  override def children: List[AnyRef] = types

  override def statistics() {
    UtilSMT.statistics.TUPLETYPE += 1
    types foreach (_.statistics())
  }

  override def toSMT: String = {
    val typesSMT = types.map(_.toSMT).mkString(" ")
    val typeSMT = s"Tuple${types.length}"
    s"($typeSMT $typesSMT)"
  }

  override def toString = types.mkString(" * ")

  override def toJson1 = {
    val cartesianType = new JSONObject()
    val theTypes = new JSONArray()
    for (ty <- types) theTypes.put(ty.toJson)
    cartesianType.put("types", theTypes)
    cartesianType.put("type", "CartesianType")
  }

  // FIXME -- See Type trait
  override def toJson2 = {
    val typeName = "Tuple<" + types.mkString(",") + ">"
    new JSONObject().put("type", "ElementValue").put("element", typeName )
  }

}

case class FunctionType(from: Type, to: Type) extends Type {
  override def children: List[AnyRef] = List(from, to)

  override def statistics() {
    UtilSMT.statistics.FUNTYPE += 1
    from.statistics()
    to.statistics()
  }

  override def toString = s"$from -> $to"

  override def toJson1 = {
    val functionType = new JSONObject()
    functionType.put("from", from.toJson)
    functionType.put("to", to.toJson)
    functionType.put("type", "FunctionType")
  }

  // FIXME -- See Type trait
  override def toJson2 = {
    val typeName = "Map<" + from.toString + ","  + to.toString + ">"
    new JSONObject().put("type", "ElementValue").put("element", typeName )
  }
}

case class ParenType(ty: Type) extends Type {
  override def children: List[AnyRef] = List(ty)

  override def statistics() {
    UtilSMT.statistics.PARENTYPE += 1
  }

  override def toSMT: String = ty.toSMT

  override def toScala: String = s"(${ty.toScala})"

  override def toString = s"($ty)"

  override def toJson1 = {
    val parenType = new JSONObject()
    parenType.put("type", "ParenType")
    parenType.put("ty", ty.toJson)
  }

  // FIXME -- See Type trait
  override def toJson2 = {
    val typeName = "List<" + ty.toString + ">"
    new JSONObject().put("type", "ElementValue").put("element", typeName )
  }
}

case class SubType(ident: String, ty: Type, exp: Exp) extends Type {
  override def children: List[AnyRef] = List(ty, exp)

  override def statistics() {
    UtilSMT.statistics.SUBTYPE += 1
    ty.statistics()
    exp.statistics()
  }

  override def toString = s"{| $ident : $ty . $exp |}"

  override def toJson1 = {
    val subType = new JSONObject()
    subType.put("ident", ident)
    subType.put("exp", exp.toJson)
    subType.put("t", ty.toJson)
    subType.put("type", "SubType")
  }

  // FIXME -- See Type trait
  override def toJson2 = {
    val typeName = "Set<" + ty.toString + ">"
    new JSONObject().put("type", "ElementValue").put("element", typeName )
  }
}

trait PrimitiveType extends Type

case object BoolType extends PrimitiveType {
  override def statistics() {
    UtilSMT.statistics.BOOLTYPE += 1
  }

  override def toSMT: String = "Bool"

  override def toScala: String = "Boolean"

  override def toString = "Bool"
  
  override def toJavaString = "Boolean"

  override def toJson1 = {
    new JSONObject().put("type", "BoolType")
  }

  override def toJson2 = {
    new JSONObject().put("type", "ElementValue").put("element", "Boolean" )
  }
}

case object CharType extends PrimitiveType {
  override def statistics() {
    UtilSMT.statistics.CHARTYPE += 1
  }

  override def toString = "Char"

  override def toJson1 = {
    new JSONObject().put("type", "CharType")
  }

  override def toJson2 = {
    new JSONObject().put("type", "ElementValue").put("element", "Character" )
  }
}

case object IntType extends PrimitiveType {
  override def statistics() {
    UtilSMT.statistics.INTTYPE += 1
  }

  override def toSMT: String = "Int"

  override def toScala: String = "Int"

  override def toString = "Int"
  
  override def toJavaString = "Integer"

  override def toJson1 = {
    new JSONObject().put("type", "IntType")
  }

  override def toJson2 = {
    new JSONObject().put("type", "ElementValue").put("element", "Integer" )
  }
}

case object RealType extends PrimitiveType {
  override def statistics() {
    UtilSMT.statistics.REALTYPE += 1
  }

  override def toSMT: String = "Real"

  override def toScala: String = "Flot"

  override def toString = "Real"
  
  override def toJavaString = "Double"

  override def toJson1 = {
    new JSONObject().put("type", "RealType")
  }

  override def toJson2 = {
    new JSONObject().put("type", "ElementValue").put("element", "Double" )
  }
}

case object StringType extends PrimitiveType {
  override def statistics() {
    UtilSMT.statistics.REALTYPE += 1
  }

  override def toScala: String = "String"

  override def toString = "String"

  override def toJson1 = {
    new JSONObject().put("type", "StringType")
  }
}

case object UnitType extends PrimitiveType {
  override def statistics() {
    UtilSMT.statistics.UNITTYPE += 1
  }

  override def toString = "Unit"

  override def toJson1 = {
    new JSONObject().put("type", "UnitType")
  }
}

trait Pattern extends HasChildren {
  def children: List[AnyRef] = List()
  def boundNames: Set[String] = Set()
  def toSMT: String = UtilSMT.error(this.toString)
  def toJson: JSONObject = {
    if (ASTOptions.useJson1) toJson1
    else toJson2
  }

  def toJson1: JSONObject
  def toJson2: JSONObject
}

case class LiteralPattern(literal: Literal) extends Pattern {
  override def toString = literal.toString

  override def toJson1 = {
    new JSONObject().put("type", "LiteralPattern").put("literal", literal.toJson)
  }

  override def toJson2 = {
    literal.toJson2
  }
}

case class IdentPattern(ident: String) extends Pattern {
  override def boundNames = Set(ident)

  override def toSMT = ident

  override def toString = ident

  override def toJson1 = {
    val identPattern = new JSONObject()
    identPattern.put("ident", ident)
    identPattern.put("type", "IdentPattern")
  }

  override def toJson2 = {
    new JSONObject().put("type", "LiteralString").put("string", ident)
  }
}

case class ProductPattern(patterns: List[Pattern]) extends Pattern {
  override def children = patterns

  override def boundNames = patterns.map(_.boundNames).toSet.flatten

  override def toString = "(" + patterns.mkString(",") + ")"

  override def toJson1 = {
    val productPattern = new JSONObject()
    val thepatterns = new JSONArray()
    for (pattern <- patterns) thepatterns.put(pattern.toJson)
    productPattern.put("type", "ProductPattern")
    productPattern.put("patterns", patterns)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    // Warning - assuming newList is understandable by consumer of JSON 
    operand.put(new JSONObject().put("type", "ElementValue").put("element", "newList"))
    for (p <- patterns) operand.put(p.toJson)

    expression.put("type", "Expression")
    expression.put("operand", operand)

  }
}

case class TypedPattern(pattern: Pattern, ty: Type) extends Pattern {
  override def children: List[AnyRef] = List(pattern, ty)

  override def boundNames = pattern.boundNames

  override def toString = s"$pattern : $ty"

  override def toJson1 =
    new JSONObject()
      .put("type", "TypedPattern")
      .put("pattern", pattern.toJson)
      .put("ty", ty.toJson)

  override def toJson2 = {
    pattern.toJson
  }
}

case object DontCarePattern extends Pattern {
  override def toString = "_"

  override def toJson1 = {
    new JSONObject().put("type", "DontCarePattern")
  }

  override def toJson2 = {
    new JSONObject().put("type", "ElementValue").put("element", "DontCare")
  }
}

case class RngBinding(patterns: List[Pattern], collection: Collection) extends HasChildren {
  override def children = patterns :+ collection

  def statistics() {
    collection.statistics()
  }

  def toSMT: String = {
    val patternIds = patterns.map(_.toSMT)
    val typeSMT = collection.toSMT
    patternIds.map(id => s"($id $typeSMT)").mkString
  }

  def boundNames: Set[String] = {
    patterns.map(_.boundNames).toSet.flatten
  }

  def getTypeMap: Map[String, Type] = {
    var result: Map[String, Type] = Map()
    val ty: Type = collection match {
      case TypeCollection(ty) => ty
      case _                  => UtilSMT.error(s"collection $collection")
    }
    for (pattern <- patterns) {
      pattern match {
        case IdentPattern(ident) =>
          result += (ident -> ty)
        case _ =>
          UtilSMT.error(s"pattern $pattern")
      }
    }
    result
  }

  override def toString = patterns.mkString(",") + " : " + collection

  def toJson: JSONObject = {
    if (ASTOptions.useJson1) toJson1
    else toJson2
  }

  def toJson1 = {
    val binding = new JSONObject()
    val thePatterns = new JSONArray()
    for (pattern <- patterns) thePatterns.put(pattern.toJson)
    binding.put("patterns", thePatterns)
    binding.put("collection", collection.toJson)
    binding.put("type", "RngBinding")
  }

  // FIXME
  def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "ElementValue").put("element", "RngBinding"))
    operand.put(collection.toJson)
    for (p <- patterns) operand.put(p.toJson)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

trait Collection extends HasChildren {
  def children: List[AnyRef] = List()

  def statistics() {}

  def toSMT: String = UtilSMT.error(this.toString)

  def toJson: JSONObject = {
    if (ASTOptions.useJson1) toJson1
    else toJson2
  }

  def toJson1: JSONObject
  def toJson2: JSONObject
}

case class ExpCollection(exp: Exp) extends Collection {
  override def children: List[AnyRef] = List(exp)

  override def toSMT: String = {
    exp match {
      case IdentExp(id) if getEntityDecl(id) != null => // user-defined class
        "Ref"
      case _ => // TODO
        UtilSMT.error(this.toString())
    }
  }

  override def toString = exp.toString()

  override def toJson1 = {
    val collection = new JSONObject()
    collection.put("type", "ExpCollection")
    collection.put("exp", exp.toJson)
  }

  // FIXME
  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "ElementValue").put("element", "ExpCollection"))
    operand.put(exp.toJson)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class TypeCollection(ty: Type) extends Collection {
  override def children: List[AnyRef] = List(ty)

  override def statistics() {
    ty.statistics()
    ty match {
      case IntType =>
        UtilSMT.statistics.QUANTINT += 1
      case RealType =>
        UtilSMT.statistics.QUANTREAL += 1
      case IdentType(ident, _) =>
        ident.names(0) match {
          case "Set" => UtilSMT.statistics.QUANTSET += 1
          case "Seq" => UtilSMT.statistics.QUANTSEQ += 1
          case _     =>
        }
      case _ =>
    }
  }

  override def toSMT = ty.toSMT

  override def toString = ty.toString()

  override def toJson1 = {
    val collection = new JSONObject()
    collection.put("type", "TypeCollection")
    collection.put("ty", ty.toJson)
  }

  // FIXME
  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "ElementValue").put("element", "TypeCollection"))
    operand.put(ty.toJson)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class Multiplicity(exp1: Exp, exp2: Option[Exp]) extends HasChildren {
   def children = List(exp1) ::: ListIt.m(exp2)

  override def toString =
    if (exp2.nonEmpty)
      s"[$exp1..${exp2.get}]"
    else
      s"[$exp1]"

  def toJson = {
    if (ASTOptions.useJson1) toJson1
    else toJson2
  }

  def toJson1 = {
    val multiplicity = new JSONObject()
    multiplicity.put("type", "Multiplicity")
    multiplicity.put("exp1", exp1.toJson)
    exp2 match { case Some(e) => multiplicity.put("exp2", e.toJson) case None => multiplicity }
  }

  // FIXME
  def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "ElementValue").put("element", "Multiplicity"))
    operand.put(exp1.toJson)
    exp2 match { case Some(e) => operand.put(e.toJson) case None => }
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}
