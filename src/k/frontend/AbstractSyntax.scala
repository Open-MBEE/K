package k.frontend


class Model {
  var packageName: PackageDecl = null
  var imports: List[ImportDecl] = Nil
  var decls: List[TopDecl] = Nil
}

trait TopDecl {
  
}
  
case class PackageDecl(name: QualifiedName) {
  
}
  
case class QualifiedName(names: List[String]) {
  override def toString = names.mkString(".")  
}

case class ImportDecl(name: QualifiedName, star: Boolean) {
  override def toString =
    "import " + name + (if (star) ".*" else "")  
}

case class ClassDecl(
  classToken: ClassToken,
  ident: String,
  typeParams: List[TypeParam],
  valueParams: ValueParams,
  extending: Extending,
  members: List[MemberDecl]) extends TopDecl {
  
}

trait ClassToken
case object Class extends ClassToken {
  
}
case object Assoc extends ClassToken {
  
}
  
case class ValueParams(valueParams: List[Typing]) {
  
}

case class Extending(types: List[Type]) {
  
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
  
}
case class VarDecl(typing: Typing, expr: Option[Exp]) extends MemberDecl {
  override def toString =
    expr match {
      case None => typing.toString
      case Some(e) => s"$typing = $e"
    }  
}
case class FunDecl(ident: String, args: List[List[Typing]], resType: Type, body: List[MemberDecl]) extends MemberDecl {
  
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
  
}
case class BlockExp(body: List[MemberDecl]) extends Exp {
  
}

case object StarExp extends Exp {
  
}

case class ClassArgument(ident: String, exp: Exp) {
  
}

trait BinaryOp
case object LT extends BinaryOp {
  
}
case object LTE extends BinaryOp {
  
}
case object GT extends BinaryOp {
  
}
case object GTE extends BinaryOp {
  
}
case object AND extends BinaryOp {
  
}
case object OR extends BinaryOp {
  
}
case object IMPL extends BinaryOp {
  
}
case object IFF extends BinaryOp {
  
}
case object EQ extends BinaryOp {
  
}
case object NEQ extends BinaryOp {
  
}
case object MUL extends BinaryOp {
  
}
case object DIV extends BinaryOp {
  
}
case object REM extends BinaryOp {
  
}
case object SETINTER extends BinaryOp {
  
}
case object SETDIFF extends BinaryOp {
  
}
case object LISTCONCAT extends BinaryOp {
  
}
case object TUPLEINDEX extends BinaryOp {
  
}
case object ADD extends BinaryOp {
  
}
case object SUB extends BinaryOp {
  
}
case object SETUNION extends BinaryOp {
  
}
case object ISIN extends BinaryOp {
  
}
case object NOTISIN extends BinaryOp {
  
}
case object SUBSET extends BinaryOp {
  
}
case object PSUBSET extends BinaryOp {
  
}
case object ASSIGN extends BinaryOp {
  
}

trait UnaryOp
case object NOT extends UnaryOp {
  
}
case object NEG extends UnaryOp {
  
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
  
}
case object Exists extends Quantifier {
  
}

trait Type
case class IdentType(ident: QualifiedName, args: List[Type]) extends Type {
  
}
case class CartesianType(types: List[Type]) extends Type {
  
}
case class FunctionType(from: Type, to: Type) extends Type {
  
}
case class ParenType(t: Type) extends Type {
  
}
case class SubType(typing: Typing, exp: Exp) extends Type {
  
}
case class MultType(t: Type, min: Exp, max: Option[Exp]) {
  
}
case class NullableType(t: Type) extends Type {
  
}

trait PrimitiveType extends Type
case object BoolType extends PrimitiveType {
  
}
case object CharType extends PrimitiveType {
  
}
case object IntType extends PrimitiveType {
  
}
case object RealType extends PrimitiveType {
  
}
case object StringType extends PrimitiveType {
  
}
case object UnitType extends PrimitiveType {
  
}

case class Typing(ident: String, ty: Type) {
  
}

trait Pattern
case class IdentPattern(ident: String) extends Pattern {
  
}
case class ProductPattern(patterns: List[Pattern]) extends Pattern {
  
}

case class LetBinding(pat: Pattern, ty: Option[Type], exp: Exp) {
  
}

case class RngBinding(patterns: List[Pattern], collection: Collection) {
  
}

case class MapPair(exp1: Exp, exp2: Exp) {
  
}

trait Collection
case class ExpCollection(exp: Exp) extends Collection {
  override def toString = exp.toString()  
}
case class TypeCollection(ty: Type) extends Collection {
  override def toString = ty.toString()  
}
