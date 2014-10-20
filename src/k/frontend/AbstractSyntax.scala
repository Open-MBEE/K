package k.frontend

// TODO: get rid of PackageDecl

case class Model(packageName : PackageDecl, imports : List[ImportDecl], 
    decls : List[TopDecl]) {
  
  override def toString = {
    var result = packageName + "\n\n"
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

trait Exp
case class ParenExp(exp: Exp) extends Exp {
  override def toString = s"($exp)"
}
case class IdentExp(ident: String) extends Exp {
  override def toString = ident
}
case class DotExp(exp: Exp, ident: String) extends Exp {
  override def toString = s"exp.$ident"
}
case class CreateExp(name: QualifiedName, args: List[ClassArgument]) extends Exp {
  override def toString = {
    var result = s"create $name"
    if (!args.isEmpty) result += s"[${args.mkString(",")}]"
    result
  }
}
case class FunApplExp(exp1: Exp, exp2: Exp) extends Exp {
  override def toString =
    if (exp2.isInstanceOf[TupleExp] || exp2.isInstanceOf[ParenExp])
      s"$exp1$exp2"
    else
      s"$exp1 $exp2"
}
case class IfExp(cond: Exp, exp1: Exp, exp2: Exp) extends Exp {
  override def toString = s"if $cond then $exp1 else $exp2"
}
case class BinExp(exp1: Exp, op: BinaryOp, exp2: Exp) extends Exp {
  override def toString = s"$exp1 $op $exp2"
}
case class UnaryExp(op: UnaryOp, exp: Exp) extends Exp {
  override def toString = s"$op$exp"
}
case class QuantifiedExp(quant: Quantifier, bindings: List[RngBinding], exp: Exp) extends Exp {
  override def toString = s"$quant ${bindings.mkString(",")} . $exp"
}
case class TupleExp(exps: List[Exp]) extends Exp {
  override def toString = "(" + exps.mkString(",") + ")"
}
case class SetEnumExp(exps: List[Exp]) extends Exp {
  override def toString = "{" + exps.mkString(",") + "}"
}
case class SetRangeExp(exp1: Exp, exp2: Exp) extends Exp {
  override def toString = s"{$exp1 .. $exp2}"
}
case class SetComprExp(exp1: Exp, bindings: List[RngBinding], exp2: Exp) extends Exp {
  override def toString = s"{$exp1 | ${bindings.mkString(",")} :- $exp2}"
}
case class ListEnumExp(exps: List[Exp]) extends Exp {
  override def toString = "[" + exps.mkString(",") + "]"
}
case class ListRangeExp(exp1: Exp, exp2: Exp) extends Exp {
  override def toString = s"[$exp1 .. $exp2]"
}
case class ListComprExp(exp1: Exp, pat: Pattern, exp2: Exp, exp3: Exp) extends Exp {
  override def toString = s"[$exp1 | $pat : $exp2 :- $exp3]"
}
case class MapEnumExp(maps: List[MapPair]) extends Exp {
  override def toString = "{" + maps.mkString(",") + "}"
}
case class MapComprExp(map: MapPair, bindings: List[RngBinding], exp: Exp) extends Exp {
  override def toString = s"{$map | ${bindings.mkString(",")} :- $exp}"
}
case class LambdaExp(pat: Pattern, t: Option[Type], exp: Exp) extends Exp {
  override def toString = {
    t match {
      case None => s"-\\ $pat . $exp"
      case Some(t) => s"-\\ $pat : $t . $exp"
    }
  }
}
case class AssertExp(exp: Exp) extends Exp {
  override def toString = s"assert($exp)"
}
case class BlockExp(body: List[MemberDecl]) extends Exp {
  override def toString = {
    var result = "do {\n"
    for (member <- body) result += s"  $member\n"
    result += "}"
    result
  }
}

case object StarExp extends Exp {
  override def toString = "*"
}

case class ClassArgument(ident: String, exp: Exp) {
  override def toString = s"$ident : $exp"
}

trait BinaryOp
case object LT extends BinaryOp {
  override def toString = "<"
}
case object LTE extends BinaryOp {
  override def toString = "<="
}
case object GT extends BinaryOp {
  override def toString = ">"
}
case object GTE extends BinaryOp {
  override def toString = ">="
}
case object AND extends BinaryOp {
  override def toString = "and"
}
case object OR extends BinaryOp {
  override def toString = "or"
}
case object IMPL extends BinaryOp {
  override def toString = "=>"
}
case object IFF extends BinaryOp {
  override def toString = "<=>"
}
case object EQ extends BinaryOp {
  override def toString = "="
}
case object NEQ extends BinaryOp {
  override def toString = "!="
}
case object MUL extends BinaryOp {
  override def toString = "*"
}
case object DIV extends BinaryOp {
  override def toString = "/"
}
case object REM extends BinaryOp {
  override def toString = "%"
}
case object SETINTER extends BinaryOp {
  override def toString = "inter"
}
case object SETDIFF extends BinaryOp {
  override def toString = "\\"
}
case object LISTCONCAT extends BinaryOp {
  override def toString = "^"
}
case object TUPLEINDEX extends BinaryOp {
  override def toString = "#"
}
case object ADD extends BinaryOp {
  override def toString = "+"
}
case object SUB extends BinaryOp {
  override def toString = "-"
}
case object SETUNION extends BinaryOp {
  override def toString = "union"
}
case object ISIN extends BinaryOp {
  override def toString = "isin"
}
case object NOTISIN extends BinaryOp {
  override def toString = "!isin"
}
case object SUBSET extends BinaryOp {
  override def toString = "subset"
}
case object PSUBSET extends BinaryOp {
  override def toString = "psubset"
}
case object ASSIGN extends BinaryOp {
  override def toString = ":="
}

trait UnaryOp
case object NOT extends UnaryOp {
  override def toString = "!"
}
case object NEG extends UnaryOp {
  override def toString = "-"
}

trait Literal extends Exp
case class IntegerLiteral(i: Int) extends Literal {
  override def toString = i.toString
}
case class RealLiteral(f: Float) extends Literal {
  override def toString = f.toString
}
case class CharacterLiteral(c: Char) extends Literal {
  override def toString = c.toString
}
case class StringLiteral(s: String) extends Literal {
  override def toString = s
}
case class BooleanLiteral(b: Boolean) extends Literal {
  override def toString = b.toString
}

trait Quantifier
case object Forall extends Quantifier {
  override def toString = "forall"
}
case object Exists extends Quantifier {
  override def toString = "exists"
}

trait Type
case class IdentType(ident: QualifiedName, args: List[Type]) extends Type {
  override def toString =
    if (args.isEmpty) ident.toString else s"$ident[${args.mkString(",")}]"
}
case class CartesianType(types: List[Type]) extends Type {
  override def toString = types.mkString(" * ")
}
case class FunctionType(from: Type, to: Type) extends Type {
  override def toString = s"$from -> $to"
}
case class ParenType(t: Type) extends Type {
  override def toString = s"($t)"
}
case class SubType(typing: Typing, exp: Exp) extends Type {
  override def toString = s"{| $typing . $exp |}"
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
}

case class NullableType(t: Type) extends Type {
  override def toString = s"$t?"
}

trait PrimitiveType extends Type
case object BoolType extends PrimitiveType {
  override def toString = "Bool"
}
case object CharType extends PrimitiveType {
  override def toString = "Char"
}
case object IntType extends PrimitiveType {
  override def toString = "Int"
}
case object RealType extends PrimitiveType {
  override def toString = "Real"
}
case object StringType extends PrimitiveType {
  override def toString = "String"
}
case object UnitType extends PrimitiveType {
  override def toString = "Unit"
}

case class Typing(ident: String, ty: Type) {
  override def toString = s"$ident : $ty"
}

trait Pattern
case class IdentPattern(ident: String) extends Pattern {
  override def toString = ident
}
case class ProductPattern(patterns: List[Pattern]) extends Pattern {
  override def toString = "(" + patterns.mkString(",") + ")"
}

case class RngBinding(patterns: List[Pattern], collection: Collection) {
  override def toString = patterns.mkString(",") + " : " + collection
}

case class MapPair(exp1: Exp, exp2: Exp) {
  override def toString = s"$exp1 -> $exp2"
}

trait Collection
case class ExpCollection(exp: Exp) extends Collection {
  override def toString = exp.toString()
}
case class TypeCollection(ty: Type) extends Collection {
  override def toString = ty.toString()
}
