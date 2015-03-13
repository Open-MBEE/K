package k.frontend

import org.json.JSONObject
import org.json.JSONArray

case class Model(packageName: Option[PackageDecl], imports: List[ImportDecl],
                 annotations: List[AnnotationDecl],
                 decls: List[TopDecl]) {

  override def toString = {
    var result =
      packageName match {
        case Some(p) => p + "\n\n"
        case None    => ""
      }
    if (!imports.isEmpty) {
      for (imp <- imports) {
        result += imp + "\n"
      }
      result += "\n"
    }
    for (decl <- decls) {
      result += decl + "\n\n"
    }
    result
  }

  def toJson: JSONObject = {
    val model = new JSONObject()
    val theImports = new JSONArray()
    val theDecls = new JSONArray()
    model.put("type", "Model")
    packageName match {
      case None =>
      case Some(pckdecl) =>
        model.put("package", pckdecl.toJson)
    }
    for (imp <- imports) theImports.put(imp.toJson)
    model.put("imports", theImports)
    for (decl <- decls) theDecls.put(decl.toJson)
    model.put("decls", theDecls)
  }

  def toJson2: JSONObject = null // TODO
}

case class PackageDecl(name: QualifiedName) {
  override def toString = s"package $name"

  def toJson: JSONObject = {
    val packagedecl = new JSONObject()
    packagedecl.put("type", "PackageDecl")
    packagedecl.put("name", name.toJson)
  }

  def toJson2: JSONObject = null // TODO
}

case class AnnotationDecl(name: String, t: Type) extends TopDecl {
  override def toString = s"annotation $name : $t"
  override def toJson = null
  override def toJson2 = null

}

case class Annotation(name: String, exp: Exp)

case class QualifiedName(names: List[String]) {
  override def toString = names.mkString(".")

  def toJson: JSONObject = {
    val qualifiedName = new JSONObject()
    val theNames = new JSONArray()
    for (name <- names) theNames.put(name)
    qualifiedName.put("names", theNames)
    qualifiedName.put("type", "QualifiedName")
  }

  def toJson2: JSONObject = null // TODO
}

case class ImportDecl(name: QualifiedName, star: Boolean) {
  override def toString =
    "import " + name + (if (star) ".*" else "")

  def toJson: JSONObject = {
    val importdecl = new JSONObject()
    importdecl.put("type", "ImportDecl")
    importdecl.put("name", name.toJson)
    importdecl.put("star", star.toString)
  }

  def toJson2: JSONObject = null // TODO  
}

trait TopDecl {
  def toJson: JSONObject

  def toJson2: JSONObject
}

// TODO: get rid of ValueParams and Extending

case class EntityDecl(
  entityToken: EntityToken,
  keyword: Option[String],
  ident: String,
  typeParams: List[TypeParam],
  extending: List[Type],
  members: BlockExp) extends TopDecl {
  var annotations: List[Annotation] = null
  override def toString = {
    var result = s"$entityToken $ident"
    if (!typeParams.isEmpty) {
      result += s"[${typeParams.mkString(",")}]"
    }
    if (!extending.isEmpty) {
      result += s" extending ${extending.mkString(",")}"
    }
    result += " {\n"
    //for (member <- members) {
    //result += "  " + member + "\n"
    //}
    result += "}"
    result
  }

  def toJson: JSONObject = {
    val classdecl = new JSONObject()
    val theTypeParams = new JSONArray()
    val theExtending = new JSONArray()
    val theMembers = new JSONArray()

    classdecl.put("type", "ClassDecl")
    classdecl.put("classToken", entityToken.toJson)
    classdecl.put("ident", ident)
    for (typeParam <- typeParams) theTypeParams.put(typeParam.toJson)
    classdecl.put("typeparams", theTypeParams)
    for (t <- extending) theExtending.put(t.toJson)
    classdecl.put("extending", theExtending)
    //for (member <- members) theMembers.put(member.toJson)
    classdecl.put("members", theMembers)
  }

  def toJson2: JSONObject = null // TODO
}

trait EntityToken {
  def toJson: String

  def toJson2: String
}

case object ClassToken extends EntityToken {
  override def toString = "class"

  override def toJson = this.toString

  override def toJson2 = toJson
}

case object AssocToken extends EntityToken {
  override def toString = "assoc"

  override def toJson = this.toString

  override def toJson2 = toJson
}

case class IdentifierToken(name: String) extends EntityToken {
  override def toString = name
  override def toJson = null
  override def toJson2 = null
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
    bound match {
      case None =>
      case Some(bound) =>
        typeparam.put("bound", bound.toJson)
    }
    typeparam.put("indent", ident)
  }

  def toJson2: JSONObject = null // TODO
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

  def toJson2 = null // TODO
}

trait MemberDecl extends TopDecl {
  var annotations: List[Annotation] = null
}

case class BlockDecl(body: MemberDecl) extends MemberDecl {
  override def toString = null // TODO
  override def toJson = null
  override def toJson2 = null
}

case class TypeDecl(ident: String,
                    typeParams: List[TypeParam],
                    t: Option[Type]) extends MemberDecl {
  override def toString =
    if (typeParams.isEmpty)
      s"type $ident = $t"
    else
      s"type $ident[${typeParams.mkString(",")}] = $t"

  override def toJson = {
    val typedecl = new JSONObject()
    val params = new JSONArray()

    for (typeParam <- typeParams) params.put(typeParam.toJson)
    typedecl.put("type", "TypeDecl")
    typedecl.put("params", params)
    if (t.nonEmpty) typedecl.put("type", t.get.toJson)
    else typedecl
  }

  override def toJson2 = null // TODO

}

case class PropertyDecl(modifiers: List[PropertyModifier],
                        name: String, 
                        t: Type,
                        multiplicity: Option[Multiplicity],
                        assignment: Option[Boolean],
                        expr: Option[Exp]) extends MemberDecl {

  override def toJson = null
  override def toString = null
  override def toJson2 = null // TODO
}

trait PropertyModifier
case object Part extends PropertyModifier
case object Var extends PropertyModifier
case object Val extends PropertyModifier
case object Ordered extends PropertyModifier
case object Unique extends PropertyModifier
case object Source extends PropertyModifier
case object Target extends PropertyModifier

case class FunSpec(pre: Boolean, exp: Exp) {

}

case class Param(name: String, t: Type) {}

case class FunDecl(ident: String,
                   typeParams: List[TypeParam],
                   params: List[Param],
                   t: Option[Type],
                   spec: List[FunSpec],
                   body: Option[Exp]) extends MemberDecl {
  override def toString = null
  override def toJson = {
    val fundecl = new JSONObject()
    val theArgs = new JSONArray()
    val theBody = new JSONArray()
    fundecl.put("type", "FunDecl")
    fundecl.put("ident", ident)
    // TODO
    //    for (pattern <- patterns) {
    //      val theArgListObject = new JSONObject()
    //      val theArgListArray = new JSONArray()
    //      for (arg <- pattern) {
    //        theArgListArray.put(arg.toJson)
    //      }
    //      theArgListObject.put("args", theArgListArray)
    //      theArgs.put(theArgListObject)
    //    }
    fundecl.put("args", theArgs)
    //fundecl.put("t", t.toJson)
    //for (member <- body) theBody.put(member.toJson)
    fundecl.put("body", theBody)
  }

  override def toJson2 = null // TODO
}

case class ConstraintDecl(name: Option[String], exp: Exp) extends MemberDecl {
  override def toString =
    name match {
      case None =>
        s"constraint { $exp }"
      case Some(n) =>
        s"constraint $n { $exp }"
    }

  override def toJson = {
    val constraintdecl = new JSONObject
    constraintdecl.put("type", "ConstraintDecl")
    name match {
      case None =>
      case Some(ident) =>
        constraintdecl.put("name", ident)
    }
    constraintdecl.put("exp", exp.toJson)
  }

  override def toJson2 = null // TODO
}
case class ExpressionDecl(exp: Exp) extends MemberDecl {
  override def toString = s"$exp;"

  override def toJson = {
    val expressiondecl = new JSONObject()
    expressiondecl.put("type", "ExpressionDecl")
    expressiondecl.put("exp", exp.toJson)
  }

  override def toJson2 = null // TODO
}

trait Exp {
  def toJson: JSONObject
  def toJson2: JSONObject
}

case class ParenExp(exp: Exp) extends Exp {
  override def toString = s"($exp)"

  override def toJson = {
    val expression = new JSONObject()

    expression.put("exp", exp.toJson)
    expression.put("type", "ParenExp")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    operand.put(new JSONObject().put("element", "ParenExp").put("type", "ElementValue"))
    operand.put(exp.toJson2)
    expression.put("operand", operand)
    expression.put("type", "Expression")
  }
}

case class IdentExp(ident: String) extends Exp {
  override def toString = ident

  override def toJson = {
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
  override def toString = s"$exp.$ident"

  override def toJson = {
    val expression = new JSONObject()

    expression.put("ident", ident)
    expression.put("exp", exp.toJson)
    expression.put("type", "DotExp")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    operand.put(new JSONObject().put("element", "DotExp").put("type", "ElementValue"))
    operand.put(exp.toJson2)
    operand.put(new JSONObject().put("element", ident).put("type", "ElementValue"))

    expression.put("operand", operand)
    expression.put("type", "Expression")
  }
}

case class FunApplExp(exp1: Exp, args: List[Argument]) extends Exp {
  // TODO: toString, toJson, toJson2
  override def toString = s"fun"

  override def toJson = {
    val expression = new JSONObject()
    expression
  }

  override def toJson2 = {
    val expression = new JSONObject()
    expression
  }
}

case class IfExp(cond: Exp, trueBranch: Exp, falseBranch: Option[Exp]) extends Exp {
  override def toString = s"if $cond then $trueBranch else $falseBranch"

  override def toJson = {
    val expression = new JSONObject()
    val trueBranchArray = new JSONArray()
    val falseBranchArray = new JSONArray()

    expression.put("type", "IfExp")
    expression.put("cond", cond.toJson)
    //for (member <- trueBranch) trueBranchArray.put(member.toJson)
    expression.put("trueBranch", trueBranchArray)
    for (member <- falseBranch) falseBranchArray.put(member.toJson)
    expression.put("falseBranch", falseBranchArray)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()

    operand.put(new JSONObject().put("type", "elementValue").put("element", "IfExp"))
    operand.put(cond.toJson2)
    val trueBranchArray = new JSONArray()
    val falseBranchArray = new JSONArray()
    // for (member <- trueBranch) trueBranchArray.put(member.toJson)
    operand.put(new JSONObject().put("trueBranch", trueBranchArray))
    for (member <- falseBranch) falseBranchArray.put(member.toJson)
    operand.put(new JSONObject().put("falseBranch", falseBranchArray))
    expression.put("operand", operand)
    expression.put("type", "Expression")
  }
}

case class MatchExp(exp: Exp, m: List[MatchCase]) extends Exp {
  override def toString = null // TODO
  override def toJson = null // TODO
  override def toJson2 = null // TODO
}

case class MatchCase(patterns: List[Pattern], exp: Exp) extends Exp {
  override def toString = null // TODO
  override def toJson = null // TODO
  override def toJson2 = null // TODO
}

case class BlockExp(body: List[MemberDecl]) extends Exp {
  override def toString =
    s"do {\n ${body.foldLeft("")((res, m) => res + s"  $m\n")}}"

  override def toJson = {
    val expression = new JSONObject()

    expression.put("type", "DoExp")
    val theBody = new JSONArray()
    for (member <- body) theBody.put(member.toJson)
    expression.put("body", theBody)
  }

  override def toJson2 = null // TODO
}

case class WhileExp(cond: Exp, body: Exp) extends Exp {
  override def toString = null
  // s"while ($cond) {\n  ${body.foldLeft("")((res, m) => res + "  $m\n")} }"

  override def toJson = {
    val whileexp = new JSONObject()
    val theBody = new JSONArray()

    whileexp.put("type", "WhileExp")
    whileexp.put("condition", cond.toJson)
    //for (member <- body) theBody.put(member.toJson)
    whileexp.put("body", theBody)
  }

  override def toJson2 = null // TODO
}

case class ForExp(pattern: Pattern, exp: Exp, body: Exp) extends Exp {
  override def toString = {
    null
    //s"for ($pattern in $exp) do\n ${body.foldLeft("")((res, m) => res + "  $m\n")} }"
  }

  override def toJson = {
    val forexp = new JSONObject()
    val theBody = new JSONArray()
    // TODO
    forexp.put("exp", exp.toJson)
    //for (member <- body) theBody.put(member.toJson)
    forexp.put("body", theBody)
  }

  override def toJson2 = null // TODO  
}

case class BinExp(exp1: Exp, op: BinaryOp, exp2: Exp) extends Exp {
  override def toString = s"$exp1 $op $exp2"

  override def toJson = {
    val expression = new JSONObject()
    val operation = new JSONObject()
    val operand = new JSONArray()

    expression.put("type", "BinExp")
    expression.put("op", op.toJsonName)
    expression.put("exp1", exp1.toJson)
    expression.put("exp2", exp2.toJson)

  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operation = new JSONObject()
    val operand = new JSONArray()

    operation.put("type", "ElementValue")
    operation.put("element", op.toJsonName)
    operand.put(operation)
    operand.put(exp1.toJson2)
    operand.put(exp2.toJson2)
    expression.put("operand", operand)
    expression.put("type", "Expression")
  }
}

case class UnaryExp(op: UnaryOp, exp: Exp) extends Exp {
  override def toString = s"$op$exp"

  override def toJson = {
    val expression = new JSONObject()

    expression.put("exp", exp.toJson)
    expression.put("type", "UnaryExp")
    expression.put("op", op.toJsonName)
  }

  override def toJson2 = {
    val json = exp.toJson2
    val opName = op.toJsonName
    val expression = new JSONObject()
    val operation = new JSONObject()
    val operand = new JSONArray()

    operation.put("type", "ElementValue")
    operation.put("element", opName)
    operand.put(operation)
    operand.put(json)
    expression.put("operand", operand)
    expression.put("type", "Expression")
  }
}

case class QuantifiedExp(quant: Quantifier, bindings: List[RngBinding], exp: Exp) extends Exp {
  override def toString = s"$quant ${bindings.mkString(",")} . $exp"

  override def toJson = {
    val expression = new JSONObject()
    val quantifier = new JSONObject()
    val operand = new JSONArray()
    val binding = new JSONArray()

    quantifier.put("type", "Quantifier")
    quantifier.put("element", quant.toJson)

    operand.put(quantifier)
    for (bind <- bindings) binding.put(bind.toJson)
    operand.put(exp.toJson)

    expression.put("quantifier", quantifier)
    expression.put("bindings", binding)
    expression.put("operand", operand)
    expression.put("type", "QuantifiedExp")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val quantifier = new JSONObject()
    val operand = new JSONArray()
    val binding = new JSONArray()

    quantifier.put("type", "QuantifiedExp")
    quantifier.put("element", quant.toJson)

    for (bind <- bindings) binding.put(bind.toJson2)

    operand.put(quantifier)
    operand.put(exp.toJson2)
    operand.put(new JSONObject().put("bindings", binding))

    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class TupleExp(exps: List[Exp]) extends Exp {
  override def toString = "(" + exps.mkString(",") + ")"

  override def toJson = {
    val tupleExp = new JSONObject()
    val expressions = new JSONArray()
    for (exp <- exps) expressions.put(exp.toJson)
    tupleExp.put("type", "TupleExp")
    tupleExp.put("exps", expressions)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "TupleExp"))
    for (exp <- exps) operand.put(exp.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

trait CollectionKind
case object SetKind extends CollectionKind
case object SeqKind extends CollectionKind
case object BagKind extends CollectionKind

case class CollectionEnumExp(kind: CollectionKind, exps: List[Exp]) extends Exp {
  override def toString = "{" + exps.mkString(",") + "}"

  override def toJson = {
    val setEnumExp = new JSONObject()
    val expressions = new JSONArray()
    for (exp <- exps) expressions.put(exp.toJson)
    setEnumExp.put("type", "SetEnumExp")
    setEnumExp.put("exps", expressions)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "SetEnumExp"))
    for (exp <- exps) operand.put(exp.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class CollectionRangeExp(kind: CollectionKind, exp1: Exp, exp2: Exp) extends Exp {
  override def toString = s"{$exp1 .. $exp2}"

  override def toJson = {
    val setRangeExp = new JSONObject()
    setRangeExp.put("type", "SetRangeExp")
    setRangeExp.put("exp1", exp1.toJson)
    setRangeExp.put("exp2", exp2.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "SetRangeExp"))
    operand.put(exp1.toJson2)
    operand.put(exp2.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class CollectionComprExp(kind: CollectionKind, exp1: Exp, bindings: List[RngBinding], exp2: Exp) extends Exp {
  override def toString = s"{$exp1 | ${bindings.mkString(",")} . $exp2}"

  override def toJson = {
    val setComprExp = new JSONObject()
    val bndgs = new JSONArray()
    for (binding <- bindings) bndgs.put(binding.toJson)
    setComprExp.put("type", "SetComprExp")
    setComprExp.put("exp1", exp1.toJson)
    setComprExp.put("bindings", bndgs)
    setComprExp.put("exp2", exp2.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "SetComprExp"))
    operand.put(exp1.toJson2)
    operand.put(exp2.toJson2)
    for (binding <- bindings) operand.put(binding.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

object Util {
  val emptyJsonObjectElementValue = new JSONObject().put("type", "elementValue").put("element", "None")
}

case class LambdaExp(pat: Pattern, exp: Exp) extends Exp {
  override def toString = {
    s"$pat -> $exp"
  }

  override def toJson = {
    val lambdaExp = new JSONObject()
    lambdaExp.put("type", "LambdaExp")
    lambdaExp.put("pat", pat.toJson)
    lambdaExp.put("exp", exp.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "LambdaExp"))
    operand.put(pat.toJson2)
    operand.put(exp.toJson2)

    expression.put("type", "Expression")
    expression.put("operand", operand)

  }
}
case class AssertExp(exp: Exp) extends Exp {
  override def toString = s"assert($exp)"

  override def toJson = {
    new JSONObject().put("type", "AssertExp").put("exp", exp.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "AssertExp"))
    operand.put(exp.toJson2)

    expression.put("type", "Expression")
    expression.put("operand", operand)

  }
}

case class TypeCastCheckExp(cast: Boolean, exp: Exp, t: Type) extends Exp {
  override def toString = null // TODO
  override def toJson = null // TODO
  override def toJson2 = null // TODO
}

case class ReturnExp(exp: Exp) {
  override def toString = null // TODO
  def toJson = null // TODO
  def toJson2 = null // TODO
}

case object BreakExp extends Exp {
  override def toString = null // TODO
  override def toJson = null // TODO
  override def toJson2 = null // TODO
}

case object ContinueExp extends Exp {
  override def toString = null // TODO
  override def toJson = null // TODO
  override def toJson2 = null // TODO
}

case object ResultExp extends Exp {
  override def toString = null // TODO
  override def toJson = null // TODO
  override def toJson2 = null // TODO
}

case object StarExp extends Exp {
  override def toString = "*"

  override def toJson = {
    new JSONObject().put("type", "StarExp")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "StarExp"))

    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

trait Argument {
}
case class PositionalArgument(exp: Exp) extends Argument {
  override def toString = s"$exp"

  def toJson = {
    val positionalArgument = new JSONObject()
    positionalArgument.put("type", "PositionalArgument")
    positionalArgument.put("exp", exp.toJson)
  }
}

case class NamedArg(ident: String, exp: Exp) {
  override def toString = s"$ident = $exp"

  def toJson = {
    val classArgument = new JSONObject()
    classArgument.put("type", "NamedArgument")
    classArgument.put("ident", ident)
    classArgument.put("exp", exp.toJson)
  }
}

trait BinaryOp {
  def toJsonName: String
}
case object LT extends BinaryOp {
  override def toString = "<"

  override def toJsonName = "LT"
}
case object LTE extends BinaryOp {
  override def toString = "<="

  override def toJsonName = "LTE"
}
case object GT extends BinaryOp {
  override def toString = ">"

  override def toJsonName = "GT"
}
case object GTE extends BinaryOp {
  override def toString = ">="

  override def toJsonName = "GTE"
}
case object AND extends BinaryOp {
  override def toString = "&&"

  override def toJsonName = "And"
}
case object OR extends BinaryOp {
  override def toString = "||"

  override def toJsonName = "OR"

}
case object IMPL extends BinaryOp {
  override def toString = "=>"

  override def toJsonName = "Implies"

}
case object IFF extends BinaryOp {
  override def toString = "<=>"

  override def toJsonName = "Iff"

}
case object EQ extends BinaryOp {
  override def toString = "="

  override def toJsonName = "EQ"
}
case object NEQ extends BinaryOp {
  override def toString = "!="

  override def toJsonName = "NotEQ"

}
case object MUL extends BinaryOp {
  override def toString = "*"

  override def toJsonName = "Times"

}
case object DIV extends BinaryOp {
  override def toString = "/"

  override def toJsonName = "Divide"

}
case object REM extends BinaryOp {
  override def toString = "%"

  override def toJsonName = "Modulo"

}
case object SETINTER extends BinaryOp {
  override def toString = "inter"

  override def toJsonName = "Inter"

}
case object SETDIFF extends BinaryOp {
  override def toString = "\\"

  override def toJsonName = "SetDiff"

}
case object LISTCONCAT extends BinaryOp {
  override def toString = "^"

  override def toJsonName = "Concat"
}
case object TUPLEINDEX extends BinaryOp {
  override def toString = "#"

  override def toJsonName = "TupleIndex"
}
case object ADD extends BinaryOp {
  override def toString = "+"

  override def toJsonName = "Plus"
}
case object SUB extends BinaryOp {
  override def toString = "-"

  override def toJsonName = "Minus"
}
case object SETUNION extends BinaryOp {
  override def toString = "union"

  override def toJsonName = "Union"
}
case object ISIN extends BinaryOp {
  override def toString = "isin"

  override def toJsonName = "IsIn"

}
case object NOTISIN extends BinaryOp {
  override def toString = "!isin"

  override def toJsonName = "NotIn"

}
case object SUBSET extends BinaryOp {
  override def toString = "subset"

  override def toJsonName = "Subset"
}
case object PSUBSET extends BinaryOp {
  override def toString = "psubset"

  override def toJsonName = "PSubset"
}
case object ASSIGN extends BinaryOp {
  override def toString = ":="

  override def toJsonName = "Assign"
}

trait UnaryOp {
  def toJsonName: String
}

case object NOT extends UnaryOp {
  override def toString = "!"

  override def toJsonName = "Not"
}
case object NEG extends UnaryOp {
  override def toString = "-"

  override def toJsonName = "Neg"
}

case object PREV extends UnaryOp {
  override def toString = "~"
  override def toJsonName = "Prev"
}

trait Literal extends Exp
case class IntegerLiteral(i: Int) extends Literal {
  override def toString = i.toString

  override def toJson = {
    val o = new JSONObject()
    o.put("integer", i)
    o.put("type", "LiteralInteger")
  }

  override def toJson2 = toJson
}
case class RealLiteral(f: Float) extends Literal {
  override def toString = f.toString

  override def toJson = {
    val o = new JSONObject()
    o.put("floatingpoint", f)
    o.put("type", "LiteralFloatingPoint")
  }

  override def toJson2 = toJson
}
case class CharacterLiteral(c: Char) extends Literal {
  override def toString = c.toString

  override def toJson = {
    val o = new JSONObject()
    o.put("character", c)
    o.put("type", "LiteralCharacter")
  }

  override def toJson2 = toJson
}
case class StringLiteral(s: String) extends Literal {
  override def toString = s

  override def toJson = {
    val o = new JSONObject()
    o.put("string", s.replaceAll("\"", ""))
    o.put("type", "LiteralString")
  }

  override def toJson2 = toJson
}
case class BooleanLiteral(b: Boolean) extends Literal {
  override def toString = b.toString

  override def toJson = {
    val o = new JSONObject()
    o.put("boolean", b)
    o.put("type", "LiteralBoolean")
  }

  override def toJson2 = toJson
}

case object NullLiteral extends Literal {
  override def toJson = null
  override def toJson2 = null
}

case object ThisLiteral extends Literal {
  override def toJson = null
  override def toJson2 = null
}

trait Quantifier {
  def toJson: JSONObject
  def toJson2: JSONObject
}
case object Forall extends Quantifier {
  override def toString = "forall"

  override def toJson = {
    val o = new JSONObject()
    o.put("element", "Forall")
    o.put("type", "Quantifier")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "Forall"))

    expression.put("type", "Expression")
    expression.put("operand", operand)

  }
}
case object Exists extends Quantifier {
  override def toString = "exists"

  override def toJson = {
    val o = new JSONObject()
    o.put("element", "Exists")
    o.put("type", "Quantifier")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "Exists"))

    expression.put("type", "Expression")
    expression.put("operand", operand)

  }
}

trait Type {
  def toJson: JSONObject
  def toJson2: JSONObject
}

//TODO - revisit ident:QualifiedName, do we need more here? 
case class IdentType(ident: QualifiedName, args: List[Type]) extends Type {
  override def toString =
    if (args.isEmpty) ident.toString else s"$ident[${args.mkString(",")}]"

  override def toJson = {
    val identType = new JSONObject()
    val arguments = new JSONArray()
    for (arg <- args) arguments.put(arg.toJson)
    identType.put("args", arguments)
    identType.put("ident", ident.toJson)
    identType.put("type", "IdentType")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "IdentType"))
    operand.put(ident)
    for (a <- args) operand.put(a.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)

  }
}

case class CartesianType(types: List[Type]) extends Type {
  override def toString = types.mkString(" * ")

  override def toJson = {
    val cartesianType = new JSONObject()
    val theTypes = new JSONArray()
    for (ty <- types) theTypes.put(ty.toJson)
    cartesianType.put("types", theTypes)
    cartesianType.put("type", "CartesianType")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "CartesianType"))
    for (ty <- types) operand.put(ty.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class FunctionType(from: Type, to: Type) extends Type {
  override def toString = s"$from -> $to"

  override def toJson = {
    val functionType = new JSONObject()
    functionType.put("to", to.toJson)
    functionType.put("from", from.toJson)
    functionType.put("type", "FunctionType")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "FunctionType"))
    operand.put(from.toJson2)
    operand.put(to.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class ParenType(t: Type) extends Type {
  override def toString = s"($t)"

  override def toJson = {
    val parenType = new JSONObject()
    parenType.put("type", "ParenType")
    parenType.put("t", t.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "ParenType"))
    operand.put(t.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)

  }
}

case class SubType(ident: String, t: Type, exp: Exp) extends Type {
  override def toString = s"{| $ident : $t . $exp |}"

  override def toJson = {
    val subType = new JSONObject()
    subType.put("SubTypeType", t.toJson)
    subType.put("exp", exp.toJson)
    subType.put("type", "SubType")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "SubType"))
    // TODO operand.put(typing.toJson2)
    operand.put(exp.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

trait PrimitiveType extends Type
case object BoolType extends PrimitiveType {
  override def toString = "Bool"

  override def toJson = {
    new JSONObject().put("type", "BoolType")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "BoolType"))
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case object CharType extends PrimitiveType {
  override def toString = "Char"

  override def toJson = {
    new JSONObject().put("type", "CharType")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "CharType"))
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case object IntType extends PrimitiveType {
  override def toString = "Int"

  override def toJson = {
    new JSONObject().put("type", "IntType")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "IntType"))
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case object RealType extends PrimitiveType {
  override def toString = "Real"

  override def toJson = {
    new JSONObject().put("type", "RealType")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "RealType"))
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case object StringType extends PrimitiveType {
  override def toString = "String"

  override def toJson = {
    new JSONObject().put("type", "StringType")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "StringType"))
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case object UnitType extends PrimitiveType {
  override def toString = "Unit"

  override def toJson = {
    new JSONObject().put("type", "UnitType")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "UnitType"))
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

trait Pattern {
  def toJson: JSONObject
  def toJson2: JSONObject
}

case class LiteralPattern(literal: Literal) extends Pattern {
  override def toJson = null
  override def toJson2 = null
}

case class IdentPattern(ident: String) extends Pattern {
  override def toString = ident

  override def toJson = {
    val identPattern = new JSONObject()
    identPattern.put("ident", ident)
    identPattern.put("type", "IdentPattern")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "IdentPattern"))
    operand.put(new JSONObject().put("type", "elementValue").put("element", ident))
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class ProductPattern(patterns: List[Pattern]) extends Pattern {
  override def toString = "(" + patterns.mkString(",") + ")"

  override def toJson = {
    val productPattern = new JSONObject()
    val thepatterns = new JSONArray()
    for (pattern <- patterns) thepatterns.put(pattern.toJson)
    productPattern.put("type", "ProductPattern")
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "ProductPattern"))
    for (p <- patterns) operand.put(p.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class TypedPattern(pattern: Pattern, t: Type) extends Pattern {
  override def toString = null //TODO
  override def toJson = null //TODO
  override def toJson2 = null //TODO
}

case object DontCarePattern extends Pattern {
  override def toString = null //TODO
  override def toJson = null //TODO
  override def toJson2 = null //TODO
}

case class RngBinding(patterns: List[Pattern], collection: Collection) {
  override def toString = patterns.mkString(",") + " : " + collection

  def toJson = {
    val binding = new JSONObject()
    val thePatterns = new JSONArray()
    for (pattern <- patterns) thePatterns.put(pattern.toJson)
    binding.put("patterns", thePatterns)
    binding.put("collection", collection.toJson)
    binding.put("type", "RngBinding")
  }

  def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "RngBinding"))
    operand.put(collection.toJson2)
    for (p <- patterns) operand.put(p.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

trait Collection {
  def toJson: JSONObject
  def toJson2: JSONObject
}
case class ExpCollection(exp: Exp) extends Collection {
  override def toString = exp.toString()

  override def toJson = {
    val collection = new JSONObject()
    collection.put("type", "ExpCollection")
    collection.put("exp", exp.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "ExpCollection"))
    operand.put(exp.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)
  }
}

case class TypeCollection(ty: Type) extends Collection {
  override def toString = ty.toString()

  override def toJson = {
    val collection = new JSONObject()
    collection.put("type", "TypeCollection")
    collection.put("ty", ty.toJson)
  }

  override def toJson2 = {
    val expression = new JSONObject()
    val operand = new JSONArray()
    operand.put(new JSONObject().put("type", "elementValue").put("element", "TypeCollection"))
    operand.put(ty.toJson2)
    expression.put("type", "Expression")
    expression.put("operand", operand)

  }
}

case class Multiplicity(exp1: Exp, exp2: Option[Exp]) {
  override def toString = null // TODO
  def toJson = null // TODO
  def toJson2 = null // TODO
}
