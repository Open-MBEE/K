package test5

case class Model(
  packageName: PackageDecl,
  imports: List[ImportDecl],
  classes: List[TopDecl])

trait TopDecl
  
case class PackageDecl(name: QualifiedName)
  
case class QualifiedName(names: List[String])

case class ImportDecl(name: QualifiedName, star: Boolean)

case class ClassDecl(
  classToken: ClassToken,
  ident: String,
  typeParams: TypeParams,
  valueParams: ValueParams,
  extending: Extending,
  members: List[MemberDecl]) extends TopDecl

trait ClassToken
case object Class extends ClassToken
case object Assoc extends ClassToken
  
case class TypeParams(typeParams: List[TypeParam])  

case class ValueParams(valueParams: List[Typing])

case class Extending(types: List[Type])

case class TypeParam(ident: String, bound: Option[TypeBound])

case class TypeBound(types: List[Type])

trait MemberDecl extends TopDecl
case class SortDecl(ident: String) extends MemberDecl
case class TypeDecl(ident: String, typeParams: TypeParams, t: Type) extends MemberDecl
case class ValDecl(typing: Typing, expr: Option[Exp]) extends MemberDecl
case class VarDecl(typing: Typing, expr: Option[Exp]) extends MemberDecl
case class FunDecl(ident: String, args: List[List[Typing]], resType: Type, body: List[MemberDecl]) extends MemberDecl
case class ConstraintDecl(name: Option[String], exp: Exp) extends MemberDecl
case class ExpressionDecl(exp: Exp) extends MemberDecl

trait Exp
case class ParenExp(exp: Exp) extends Exp
case class Identifier(ident: String) extends Exp
case class DotExp(exp: Exp, ident: String) extends Exp
case class CreateExp(name: QualifiedName, args: List[ClassArgument]) extends Exp
case class FunAppl(exp1: Exp, exp2: Exp) extends Exp
case class IfExp(cond: Exp, exp1: Exp, exp2: Exp) extends Exp
case class BinExp(exp1: Exp, op: BinaryOp, exp2: Exp) extends Exp
case class UnaryExp(op: UnaryOp, exp: Exp) extends Exp
case class QuantifiedExp(quant: Quantifier, bindings: List[RngBinding], exp: Exp) extends Exp
case class TupleExp(exps: List[Exp]) extends Exp
case class SetEnumExp(exps: List[Exp]) extends Exp
case class SetRangeExp(exp1: Exp, exp2: Exp) extends Exp
case class SetComprExp(exp1: Exp, bindings: List[RngBinding], exp2: Exp) extends Exp
case class ListEnumExp(exps: List[Exp]) extends Exp
case class ListRangeExp(exp1: Exp, exp2: Exp) extends Exp
case class ListComprExp(exp1: Exp, pat: Pattern, exp2: Exp, exp3: Exp) extends Exp
case class MapEnumExp(maps: List[MapPair]) extends Exp
case class MapComprExp(map: MapPair, bindings: List[RngBinding], exp: Exp) extends Exp
case class LambdaExp(pat: Pattern, ty: Option[Type], exp: Exp) extends Exp
case class AssertExp(exp: Exp) extends Exp
case class BlockExp(body: List[MemberDecl]) extends Exp

case object StarExp extends Exp

case class ClassArgument(ident: String, exp: Exp)

trait BinaryOp
case object LT extends BinaryOp
case object LTE extends BinaryOp
case object GT extends BinaryOp
case object GTE extends BinaryOp
case object AND extends BinaryOp
case object OR extends BinaryOp
case object IMPL extends BinaryOp
case object IFF extends BinaryOp
case object EQ extends BinaryOp
case object MUL extends BinaryOp
case object DIV extends BinaryOp
case object REM extends BinaryOp
case object SETINTER extends BinaryOp
case object SETDIFF extends BinaryOp
case object LISTCONCAT extends BinaryOp
case object TUPLEINDEX extends BinaryOp
case object ADD extends BinaryOp
case object SUB extends BinaryOp
case object SETUNION extends BinaryOp
case object ISIN extends BinaryOp
case object NOTISIN extends BinaryOp
case object SUBSET extends BinaryOp
case object PSUBSET extends BinaryOp
case object ASSIGN extends BinaryOp

trait UnaryOp
case object NOT extends UnaryOp
case object NEG extends UnaryOp

trait Literal extends Exp
case class IntegerLiteral(i: Int) extends Literal
case class RealLiteral(f: Float) extends Literal
case class CharacterLiteral(c: Char) extends Literal
case class StringLiteral(s: String) extends Literal
case class BooleanLiteral(b: Boolean) extends Literal

trait Quantifier
case object Forall extends Quantifier
case object Exists extends Quantifier

trait Type
case class IdentType(ident: QualifiedName, args: List[Type]) extends Type
case class CartesianType(types: List[Type]) extends Type
case class FunctionType(from: Type, to: Type) extends Type
case class ParenType(t: Type) extends Type
case class SubType(typing: Typing, exp: Exp) extends Type
case class MultType(t: Type, min: Exp, max: Option[Exp])
case class NullableType(t: Type) extends Type

trait PrimitiveType extends Type
case object BoolType extends PrimitiveType
case object CharType extends PrimitiveType
case object IntType extends PrimitiveType
case object RealType extends PrimitiveType
case object StringType extends PrimitiveType
case object UnitType extends PrimitiveType

case class Typing(ident: String, ty: Type)

trait Pattern
case class IdentPattern(ident: String) extends Pattern
case class ProductPattern(patterns: List[Pattern]) extends Pattern

case class LetBinding(pat: Pattern, ty: Option[Type], exp: Exp)

case class RngBinding(patterns: List[Pattern], collection: Collection)

case class MapPair(exp1: Exp, exp2: Exp)

trait Collection
case class ExpCollection(exp: Exp) extends Collection
case class TypeCollection(ty: Type) extends Collection
