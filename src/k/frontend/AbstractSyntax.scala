package k.frontend

import org.json.JSONObject
import org.json.JSONArray

// TODO: get rid of PackageDecl

case class Model(packageName: Option[PackageDecl], imports: List[ImportDecl],
  decls: List[TopDecl]) {

  override def toString = {
    var result = 
      packageName match {
      case Some(p) => p + "\n\n"
      case None => ""
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
}

case class PackageDecl(name: QualifiedName) {
  override def toString = s"package $name"
}

case class QualifiedName(names: List[String]) {
  override def toString = names.mkString(".")

  def toJson = {
    val qualifiedName = new JSONObject()
    val theNames = new JSONArray()
    for (name <- names)theNames.put(name)
    qualifiedName.put("names",theNames)
    qualifiedName.put("type","QualifiedName")
  }
}

case class ImportDecl(name: QualifiedName, star: Boolean) {
  override def toString =
    "import " + name + (if (star) ".*" else "")
}

trait TopDecl

// TODO: get rid of ValueParams and Extending

case class ClassDecl(
  classToken: ClassToken,
  ident: String,
  typeParams: List[TypeParam],
  valueParams: ValueParams,
  extending: Extending,
  members: List[MemberDecl]) extends TopDecl {
  override def toString = {
    var result = s"$classToken $ident"
    if (!typeParams.isEmpty) {
      result += s"[${typeParams.mkString(",")}]"
    }
    result += valueParams.toString
    result += extending.toString
    result += " {\n"
    for (member <- members) {
      result += "  " + member + "\n"
    }
    result += "}"
    result
  }
}

trait ClassToken
case object Class extends ClassToken {
  override def toString = "class"
}
case object Assoc extends ClassToken {
  override def toString = "assoc"
}

case class ValueParams(valueParams: List[Typing]) {
  override def toString =
    if (valueParams.isEmpty)
      ""
    else
      s"(${valueParams.mkString(",")})"
}

case class Extending(types: List[Type]) {
  override def toString =
    if (types.isEmpty)
      ""
    else
      s" extending ${types.mkString(",")}"
}

case class TypeParam(ident: String, bound: Option[TypeBound]) {
  override def toString =
    bound match {
      case None => ident
      case Some(tyb) => s"$ident : $tyb"
    }
}

case class TypeBound(types: List[Type]) {
  override def toString = types.mkString(" + ")
}

trait MemberDecl extends TopDecl
case class SortDecl(ident: String) extends MemberDecl {
  override def toString = s"type $ident"
}
case class TypeDecl(ident: String, typeParams: List[TypeParam], t: Type) extends MemberDecl {
  override def toString =
    if (typeParams.isEmpty)
      s"type $ident = $t"
    else
      s"type $ident[${typeParams.mkString(",")}] = $t"
}
case class ValDecl(typing: Typing, expr: Option[Exp]) extends MemberDecl {
  override def toString =
    expr match {
      case None => s"val $typing"
      case Some(e) => s"val $typing = $e"
    }
}
case class VarDecl(typing: Typing, expr: Option[Exp]) extends MemberDecl {
  override def toString =
    expr match {
      case None => s"var $typing"
      case Some(e) => s"var $typing = $e"
    }
}
case class FunDecl(ident: String, args: List[List[Typing]], t: Type, body: List[MemberDecl]) extends MemberDecl {
  override def toString = {
    var result = s"fun $ident"
    for (listOfTyping <- args) {
      result += "(" + listOfTyping.mkString(",") + ")"
    }
    result += s" : $t {"
    for (member <- body) result += s"  $member\n"
    result += "  }"
    result
  }
}
case class ConstraintDecl(name: Option[String], exp: Exp) extends MemberDecl {
  override def toString =
    name match {
      case None =>
        s"constraint { $exp }"
      case Some(n) =>
        s"constraint $n { $exp }"
    }
}
case class ExpressionDecl(exp: Exp) extends MemberDecl {
  override def toString = s"$exp;"
}

trait Exp {
  def toJson: JSONObject
}
case class ParenExp(exp: Exp) extends Exp {
  override def toString = s"($exp)"

  override def toJson = {
    val expression = new JSONObject()

    expression.put("exp", exp.toJson)
    expression.put("type", "ParenExp")
  }
}
case class IdentExp(ident: String) extends Exp {
  override def toString = ident

  override def toJson = {
    val expression = new JSONObject()

    expression.put("ident", ident)
    expression.put("type", "IdentExp")
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
}
case class CreateExp(name: QualifiedName, args: List[ClassArgument]) extends Exp {
  override def toString = {
    var result = s"create $name"
    if (!args.isEmpty) result += s"[${args.mkString(",")}]"
    result
  }

  override def toJson = {
    val expression = new JSONObject()
    val arguments = new JSONArray()
    for(arg <- args) arguments.put(arg.toJson)
    expression.put("type", "CreateExp")
    expression.put("name", name.toJson)
    expression.put("args", arguments)
  }
}
case class FunApplExp(exp1: Exp, exp2: Exp) extends Exp {
  override def toString =
    if (exp2.isInstanceOf[TupleExp] || exp2.isInstanceOf[ParenExp])
      s"$exp1$exp2"
    else
      s"$exp1 $exp2"

  override def toJson = {
    val expression = new JSONObject()

    expression.put("type", "FunApplExp")
    expression.put("exp1", exp1.toJson)
    expression.put("exp2", exp2.toJson)
  }
}
case class IfExp(cond: Exp, exp1: Exp, exp2: Exp) extends Exp {
  override def toString = s"if $cond then $exp1 else $exp2"

  override def toJson = {
    val expression = new JSONObject()

    expression.put("type", "IfExp")
    expression.put("cond", cond.toJson)
    expression.put("exp1", exp1.toJson)
    expression.put("exp2", exp2.toJson)
  }
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
}
case class UnaryExp(op: UnaryOp, exp: Exp) extends Exp {
  override def toString = s"$op$exp"

  override def toJson = {
    val expression = new JSONObject()

    expression.put("exp", exp.toJson)
    expression.put("type", "UnaryExp")
    expression.put("op", op.toJsonName)
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

    expression.put("quantifier",quantifier)
    expression.put("bindings",binding)
    expression.put("operand", operand)
    expression.put("type", "QuantifiedExp")
  }
}
case class TupleExp(exps: List[Exp]) extends Exp {
  override def toString = "(" + exps.mkString(",") + ")"

  override def toJson = {
	val tupleExp = new JSONObject()
	val expressions = new JSONArray()
	for(exp <- exps) expressions.put(exp.toJson)
	tupleExp.put("type", "TupleExp")
	tupleExp.put("exps", expressions)
  }
}
case class SetEnumExp(exps: List[Exp]) extends Exp {
  override def toString = "{" + exps.mkString(",") + "}"

  override def toJson = {
	val setEnumExp = new JSONObject()
	val expressions = new JSONArray()
	for(exp <- exps) expressions.put(exp.toJson)
	setEnumExp.put("type", "SetEnumExp")
	setEnumExp.put("exps", expressions)
  }
}
case class SetRangeExp(exp1: Exp, exp2: Exp) extends Exp {
  override def toString = s"{$exp1 .. $exp2}"

  override def toJson = {
    val setRangeExp = new JSONObject()
    setRangeExp.put("type", "SetRangeExp")
    setRangeExp.put("exp1", exp1.toJson)
    setRangeExp.put("exp2", exp2.toJson)
  }
}
case class SetComprExp(exp1: Exp, bindings: List[RngBinding], exp2: Exp) extends Exp {
  override def toString = s"{$exp1 | ${bindings.mkString(",")} . $exp2}"

  override def toJson = {
    val setComprExp = new JSONObject()
    val bndgs = new JSONArray()
    for(binding <- bindings) bndgs.put(binding.toJson)
    setComprExp.put("type", "SetComprExp")
    setComprExp.put("exp1", exp1.toJson)
    setComprExp.put("bindings", bndgs)
    setComprExp.put("exp2", exp2.toJson)
  }
}
case class ListEnumExp(exps: List[Exp]) extends Exp {
  override def toString = "[" + exps.mkString(",") + "]"

  override def toJson = {
    val listEnumExp = new JSONObject()
	val expressions = new JSONArray()
	for(exp <- exps) expressions.put(exp.toJson)
	listEnumExp.put("type", "ListEnumExp")
	listEnumExp.put("exps", expressions)
  }
}
case class ListRangeExp(exp1: Exp, exp2: Exp) extends Exp {
  override def toString = s"[$exp1 .. $exp2]"

  override def toJson = {
    val listRangeExp = new JSONObject()
    listRangeExp.put("type", "ListRangeExp")
    listRangeExp.put("exp1", exp1.toJson)
    listRangeExp.put("exp2", exp2.toJson)
  }
}
case class ListComprExp(exp1: Exp, pat: Pattern, exp2: Exp, exp3: Exp) extends Exp {
  override def toString = s"[$exp1 | $pat : $exp2 . $exp3]"

  override def toJson = {
    val listComprExp = new JSONObject()
    listComprExp.put("type", "ListComprExp")
    listComprExp.put("exp1", exp1.toJson)
    listComprExp.put("pattern", pat.toJson)
    listComprExp.put("exp2", exp2.toJson)
    listComprExp.put("exp3", exp3.toJson)
  }
}
case class MapEnumExp(maps: List[MapPair]) extends Exp {
  override def toString = "{" + maps.mkString(",") + "}"

  override def toJson = {
    val mapEnumExp = new JSONObject()
    val mps = new JSONArray()
    for(map <- maps) mps.put(map.toJson)
    mapEnumExp.put("type", "MapEnumExp")
    mapEnumExp.put("maps", mps)
  }
}
case class MapComprExp(map: MapPair, bindings: List[RngBinding], exp: Exp) extends Exp {
  override def toString = s"{$map | ${bindings.mkString(",")} . $exp}"

  override def toJson = {
    val mapComprExp = new JSONObject()
    val bndgs = new JSONArray()
    for(binding <- bindings) bndgs.put(binding.toJson)
    mapComprExp.put("type", "MapComprExp")
    mapComprExp.put("exp", exp.toJson)
    mapComprExp.put("bindings", bndgs)
  }
}
case class LambdaExp(pat: Pattern, t: Option[Type], exp: Exp) extends Exp {
  override def toString = {
    t match {
      case None => s"fun $pat . $exp"
      case Some(t) => s"fun $pat : $t . $exp"
    }
  }

  override def toJson = {
    val lambdaExp = new JSONObject()
    lambdaExp.put("type", "LambdaExp")
    lambdaExp.put("pat", pat.toJson)
    t match {case Some(ty) => lambdaExp.put("t", ty.toJson) case None => ()}
    lambdaExp.put("exp", exp.toJson)
  }
}
case class AssertExp(exp: Exp) extends Exp {
  override def toString = s"assert($exp)"

  override def toJson = {
    new JSONObject().put("type", "AssertExp").put("exp", exp.toJson)
  }
}
case class BlockExp(body: List[MemberDecl]) extends Exp {
  override def toString = {
    var result = "do {\n"
    for (member <- body) result += s"  $member\n"
    result += "}"
    result
  }

  override def toJson = {
    /*
    var blockExp = new JSONObject()
    var bdy = new JSONArray()
    for(b <- body) bdy.put(b.toJson)
    blockExp.put("type", "BlockExp")
    blockExp.put("body", bdy)
    */
    //TODO
    null
  }
}

case object StarExp extends Exp {
  override def toString = "*"

  override def toJson = {
    new JSONObject().put("type", "StarExp")
  }
}

case class ClassArgument(ident: String, exp: Exp) {
  override def toString = s"$ident : $exp"
  
  def toJson = {
    val classArgument = new JSONObject()
    classArgument.put("type", "ClassArgument")
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
  override def toString = "and"

  override def toJsonName = "And"
}
case object OR extends BinaryOp {
  override def toString = "or"

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
  override def toString = "~"

  override def toJsonName = "Neg"
}

trait Literal extends Exp
case class IntegerLiteral(i: Int) extends Literal {
  override def toString = i.toString

  override def toJson = {
    val o = new JSONObject()
    o.put("integer", i)
    o.put("type", "LiteralInteger")
  }
}
case class RealLiteral(f: Float) extends Literal {
  override def toString = f.toString

  override def toJson = {
    val o = new JSONObject()
    o.put("floatingpoint", f)
    o.put("type", "LiteralFloatingPoint")
  }
}
case class CharacterLiteral(c: Char) extends Literal {
  override def toString = c.toString

  override def toJson = {
    val o = new JSONObject()
    o.put("character", c)
    o.put("type", "LiteralCharacter")

  }
}
case class StringLiteral(s: String) extends Literal {
  override def toString = s

  override def toJson = {
    val o = new JSONObject()
    o.put("string", s.replaceAll("\"", ""))
    o.put("type", "LiteralString")
  }
}
case class BooleanLiteral(b: Boolean) extends Literal {
  override def toString = b.toString

  override def toJson = {
    val o = new JSONObject()
    o.put("boolean", b)
    o.put("type", "LiteralBoolean")
  }
}

trait Quantifier {
  def toJson: JSONObject
}
case object Forall extends Quantifier {
  override def toString = "forall"

  override def toJson = {
    val o = new JSONObject()
    o.put("element","Forall")
    o.put("type","Quantifier")
  }
}
case object Exists extends Quantifier {
  override def toString = "exists"

  override def toJson = {
    val o = new JSONObject()
    o.put("element","Exists")
    o.put("type","Quantifier")
  }
}

trait Type {
  def toJson: JSONObject
}
case class IdentType(ident: QualifiedName, args: List[Type]) extends Type {
  override def toString =
    if (args.isEmpty) ident.toString else s"$ident[${args.mkString(",")}]"

  override def toJson = {
    val identType = new JSONObject()
    val arguments = new JSONArray()
    for (arg <- args) arguments.put(arg.toJson)
    identType.put("args",arguments)
    identType.put("ident",ident.toJson)
    identType.put("type","IdentType")
  }
}
case class CartesianType(types: List[Type]) extends Type {
  override def toString = types.mkString(" * ")
  
  override def toJson = {
    val cartesianType = new JSONObject()
    val theTypes = new JSONArray()
    for (ty <- types) theTypes.put(ty.toJson)
    cartesianType.put("types",theTypes)
    cartesianType.put("type","CartesianType")
  }
}
case class FunctionType(from: Type, to: Type) extends Type {
  override def toString = s"$from -> $to"

  override def toJson = {
    val functionType = new JSONObject()
    functionType.put("to",to.toJson)
    functionType.put("from",from.toJson)
    functionType.put("type","FunctionType")
  }
}
case class ParenType(t: Type) extends Type {
  override def toString = s"($t)"

  override def toJson = {
    val parenType = new JSONObject()
    parenType.put("type","ParenType")
    parenType.put("t",t.toJson)
  }
}
case class SubType(typing: Typing, exp: Exp) extends Type {
  override def toString = s"{| $typing . $exp |}"

  override def toJson = {
    val subType = new JSONObject()
    subType.put("typing",typing.toJson)
    subType.put("exp",exp.toJson)
    subType.put("type","SubType")
  }
}
case class MultType(t: Type, min: Exp, max: Option[Exp]) extends Type {
  override def toString = {
    var result = s"$t $min"
    max match {
      case None =>
      case Some(e) => result += s" .. $e"
    }
    result
  }

  override def toJson = {
    val multType = new JSONObject()
    multType.put("min",min.toJson)
    max match {
      case None =>
      case Some(exp) => multType.put("max",exp.toJson)
    }
    multType.put("t",t.toJson)
    multType.put("type","MultType")
  }
}

case class NullableType(t: Type) extends Type {
  override def toString = s"$t?"

  override def toJson = {
    val nullableType = new JSONObject()

    nullableType.put("t",t.toJson)
    nullableType.put("type","NullableType")
  }
}

trait PrimitiveType extends Type
case object BoolType extends PrimitiveType {
  override def toString = "Bool"

  override def toJson = {
    new JSONObject().put("type","BoolType")
  }
}
case object CharType extends PrimitiveType {
  override def toString = "Char"

  override def toJson = {
    new JSONObject().put("type","CharType")
  }
}
case object IntType extends PrimitiveType {
  override def toString = "Int"

  override def toJson = {
    new JSONObject().put("type","IntType")
  }
}
case object RealType extends PrimitiveType {
  override def toString = "Real"

  override def toJson = {
    new JSONObject().put("type","RealType")
  }
}
case object StringType extends PrimitiveType {
  override def toString = "String"

  override def toJson = {
    new JSONObject().put("type","StringType")
  }
}
case object UnitType extends PrimitiveType {
  override def toString = "Unit"

  override def toJson = {
    new JSONObject().put("type","UnitType")
  }
}

case class Typing(ident: String, ty: Type) {
  override def toString = s"$ident : $ty"

  def toJson = {
    val typing = new JSONObject()
    typing.put("ty",ty.toJson)
    typing.put("ident",ident)
    typing.put("type","Typing")
  }
}

trait Pattern {
  def toJson: JSONObject
}
case class IdentPattern(ident: String) extends Pattern {
  override def toString = ident

  override def toJson = {
    val identPattern = new JSONObject()
    identPattern.put("ident",ident)
    identPattern.put("type","IdentPattern")
  }
}
case class ProductPattern(patterns: List[Pattern]) extends Pattern {
  override def toString = "(" + patterns.mkString(",") + ")"

  override def toJson = {
    val productPattern = new JSONObject()
    val thepatterns = new JSONArray()
    for (pattern <- patterns) thepatterns.put(pattern.toJson)
    productPattern.put("type","ProductPattern")
  }
}

case class RngBinding(patterns: List[Pattern], collection: Collection) {
  override def toString = patterns.mkString(",") + " : " + collection

  def toJson = {
    val binding = new JSONObject()
    val thePatterns = new JSONArray()
    for (pattern <- patterns) thePatterns.put(pattern.toJson) 
    binding.put("patterns",thePatterns)
    binding.put("collection",collection.toJson)
    binding.put("type","RngBinding")
  }
}

case class MapPair(exp1: Exp, exp2: Exp) {
  override def toString = s"$exp1 -> $exp2"
  
  def toJson = {
    val mapPair = new JSONObject()
    mapPair.put("type", "MapPair")
    mapPair.put("exp1", exp1.toJson)
    mapPair.put("exp2", exp2.toJson)
  }
}

trait Collection {
  def toJson : JSONObject
}
case class ExpCollection(exp: Exp) extends Collection {
  override def toString = exp.toString()
  
  override def toJson = {
    val collection = new JSONObject()
    collection.put("type", "ExpCollection")
    collection.put("exp", exp.toJson)
  } 
}
case class TypeCollection(ty: Type) extends Collection {
  override def toString = ty.toString()
  
  override def toJson =  {
    val collection = new JSONObject()
    collection.put("type", "TypeCollection")
    collection.put("ty", ty.toJson)
  }
}
