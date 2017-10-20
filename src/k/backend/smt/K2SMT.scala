package k.backend.smt

import k.frontend._

/*
 * Why are we doing it this way?
 * - so we can use other SMT solvers
 * - it is clearer what is happening
 * - 
 */

object Util {
  def defineFunction(name: String, args: List[(String, String)], resultType: String, body: String): String = {
    val argList: List[String] = for ((x, ty) <- args) yield s"($x $ty)"
    val argString: String = argList.mkString
    s"(define-fun $name ($argString) $resultType\n  $body\n)"
  }

  def declareFunction(name: String, argTypes: List[String], resultType: String): String = {
    val argString: String = argTypes.mkString(" ")
    s"(declare-fun $name ($argString) $resultType)"
  }
}
import Util._

object TypeChecker {

}
import TypeChecker._

class K2SMT {
  //case class Model(packageName: Option[PackageDecl], imports: List[ImportDecl],
  //                 annotations: List[AnnotationDecl],
  //                 decls: List[TopDecl]) 

  def translate(model: Model): String = {
    model match {
      case Model(packageName, packages, imports, annotations, decls) =>
        translate(packages, decls)
    }
  }

  //
  //case class PackageDecl(name: QualifiedName) 
  //
  //case class AnnotationDecl(name: String, ty: Type) extends TopDecl 
  //
  //case class Annotation(name: String, exp: Exp) 
  //
  //case class QualifiedName(names: List[String]) 
  //
  //case class ImportDecl(name: QualifiedName, star: Boolean) 

  def translate(packages: List[PackageDecl], decls: List[TopDecl]): String = {
    var result : String = ""
    //for (decl <- decls) result += translate(decl)
    result
  }
  
  //
  //trait TopDecl
  //
  //case class EntityDecl(
  //  var annotations: List[Annotation],
  //  entityToken: EntityToken,
  //  keyword: Option[String],
  //  ident: String,
  //  typeParams: List[TypeParam],
  //  extending: List[Type],
  //  members: List[MemberDecl]) extends TopDecl 
  //
  //trait EntityToken 
  //
  //case object ClassToken extends EntityToken 
  //
  //case object AssocToken extends EntityToken 
  //
  //case class IdentifierToken(name: String) extends EntityToken 
  //
  //case class TypeParam(ident: String, bound: Option[TypeBound]) 
  //
  //case class TypeBound(types: List[Type]) 
  //
  //trait MemberDecl extends TopDecl 
  //
  //case class TypeDecl(ident: String,
  //                    typeParams: List[TypeParam],
  //                    ty: Option[Type]) extends MemberDecl 
  //
  //case class PropertyDecl(modifiers: List[PropertyModifier],
  //                        name: String,
  //                        ty: Type,
  //                        multiplicity: Option[Multiplicity],
  //                        assignment: Option[Boolean],
  //                        expr: Option[Exp]) extends MemberDecl 
  //
  //trait PropertyModifier 
  //
  //case object Part extends PropertyModifier 
  //
  //case object Var extends PropertyModifier 
  //
  //case object Val extends PropertyModifier 
  //
  //case object Ordered extends PropertyModifier 
  //
  //case object Unique extends PropertyModifier 
  //
  //case object Source extends PropertyModifier 
  //
  //case object Target extends PropertyModifier 
  //
  //case class FunSpec(pre: Boolean, exp: Exp) 
  //
  //case class Param(name: String, ty: Type) 
  //
  //case class FunDecl(ident: String,
  //                   typeParams: List[TypeParam],
  //                   params: List[Param],
  //                   ty: Option[Type],
  //                   spec: List[FunSpec],
  //                   body: List[MemberDecl]) extends MemberDecl 
  //
  //case class ConstraintDecl(name: Option[String], exp: Exp) extends MemberDecl 
  //
  //case class ExpressionDecl(exp: Exp) extends MemberDecl 
  //
  //trait Exp 
  //
  //case class ParenExp(exp: Exp) extends Exp 
  //
  //case class IdentExp(ident: String) extends Exp 
  //
  //case class DotExp(exp: Exp, ident: String) extends Exp 
  //
  //case class FunApplExp(exp1: Exp, args: List[Argument]) extends Exp 
  //
  //case class IfExp(cond: Exp, trueBranch: Exp, falseBranch: Option[Exp]) extends Exp 
  //
  //case class MatchExp(exp: Exp, m: List[MatchCase]) extends Exp 
  //
  //case class MatchCase(patterns: List[Pattern], exp: Exp) extends Exp 
  //
  //case class BlockExp(body: List[MemberDecl]) extends Exp 
  //
  //case class WhileExp(cond: Exp, body: Exp) extends Exp 
  //
  //case class ForExp(pattern: Pattern, exp: Exp, body: Exp) extends Exp 
  //
  //case class BinExp(exp1: Exp, op: BinaryOp, exp2: Exp) extends Exp 
  //
  //case class UnaryExp(op: UnaryOp, exp: Exp) extends Exp 
  //
  //case class QuantifiedExp(quant: Quantifier,
  //                         bindings: List[RngBinding],
  //                         exp: Exp) extends Exp 
  //
  //case class TupleExp(exps: List[Exp]) extends Exp 
  //
  //trait CollectionKind 
  //
  //case object SetKind extends CollectionKind 
  //
  //case object SeqKind extends CollectionKind 
  //
  //case object BagKind extends CollectionKind 
  //
  //case class CollectionEnumExp(kind: CollectionKind, exps: List[Exp]) extends Exp 
  //
  //case class CollectionRangeExp(kind: CollectionKind, exp1: Exp, exp2: Exp) extends Exp 
  //
  //case class CollectionComprExp(kind: CollectionKind,
  //                              exp1: Exp,
  //                              bindings: List[RngBinding],
  //                              exp2: Exp) extends Exp 
  //
  //case class LambdaExp(pat: Pattern, exp: Exp) extends Exp 
  //
  //case class AssertExp(exp: Exp) extends Exp 
  //
  //case class TypeCastCheckExp(cast: Boolean, exp: Exp, ty: Type) extends Exp 
  //
  //case class ReturnExp(exp: Exp) extends Exp 
  //
  //case object BreakExp extends Exp 
  //
  //case object ContinueExp extends Exp 
  //
  //case object ResultExp extends Exp 
  //
  //case object StarExp extends Exp 
  //
  //trait Argument extends Exp
  //
  //case class PositionalArgument(exp: Exp) extends Argument 
  //
  //case class NamedArgument(ident: String, exp: Exp) extends Argument 
  //
  //trait BinaryOp 
  //
  //case object LT extends BinaryOp 
  //
  //case object LTE extends BinaryOp 
  //
  //case object GT extends BinaryOp 
  //
  //case object GTE extends BinaryOp 
  //
  //case object AND extends BinaryOp 
  //
  //case object OR extends BinaryOp 
  //
  //case object IMPL extends BinaryOp 
  //
  //case object IFF extends BinaryOp 
  //
  //case object EQ extends BinaryOp 
  //
  //case object NEQ extends BinaryOp 
  //
  //case object MUL extends BinaryOp 
  //
  //case object DIV extends BinaryOp 
  //
  //case object REM extends BinaryOp 
  //
  //case object SETINTER extends BinaryOp 
  //
  //case object SETDIFF extends BinaryOp 
  //
  //case object LISTCONCAT extends BinaryOp 
  //
  //case object TUPLEINDEX extends BinaryOp 
  //
  //case object ADD extends BinaryOp 
  //
  //case object SUB extends BinaryOp 
  //
  //case object SETUNION extends BinaryOp 
  //
  //case object ISIN extends BinaryOp 
  //
  //case object NOTISIN extends BinaryOp 
  //
  //case object SUBSET extends BinaryOp 
  //
  //case object PSUBSET extends BinaryOp 
  //
  //case object ASSIGN extends BinaryOp 
  //
  //trait UnaryOp 
  //
  //case object NOT extends UnaryOp 
  //
  //case object NEG extends UnaryOp 
  //
  //case object PREV extends UnaryOp 
  //
  //trait Literal extends Exp
  //
  //case class IntegerLiteral(i: Int) extends Literal 
  //
  //case class RealLiteral(f: Float) extends Literal 
  //
  //case class CharacterLiteral(c: Char) extends Literal 
  //
  //case class StringLiteral(s: String) extends Literal 
  //
  //case class BooleanLiteral(b: Boolean) extends Literal 
  //
  //case object NullLiteral extends Literal 
  //
  //case object ThisLiteral extends Literal 
  //
  //trait Quantifier 
  //
  //case object Forall extends Quantifier 
  //
  //case object Exists extends Quantifier 
  //
  //trait Type 
  //
  //case class IdentType(ident: QualifiedName, args: List[Type]) extends Type 
  //
  //case class CartesianType(types: List[Type]) extends Type 
  //
  //case class FunctionType(from: Type, to: Type) extends Type 
  //
  //case class ParenType(ty: Type) extends Type 
  //
  //case class SubType(ident: String, ty: Type, exp: Exp) extends Type 
  //
  //trait PrimitiveType extends Type
  //
  //case object BoolType extends PrimitiveType 
  //
  //case object CharType extends PrimitiveType 
  //
  //case object IntType extends PrimitiveType 
  //
  //case object RealType extends PrimitiveType 
  //
  //case object StringType extends PrimitiveType 
  //
  //case object UnitType extends PrimitiveType 
  //
  //trait Pattern 
  //
  //case class LiteralPattern(literal: Literal) extends Pattern 
  //
  //case class IdentPattern(ident: String) extends Pattern 
  //
  //case class ProductPattern(patterns: List[Pattern]) extends Pattern 
  //
  //case class TypedPattern(pattern: Pattern, ty: Type) extends Pattern 
  //
  //case object DontCarePattern extends Pattern 
  //
  //case class RngBinding(patterns: List[Pattern], collection: Collection) 
  //
  //trait Collection 
  //
  //case class ExpCollection(exp: Exp) extends Collection 
  //
  //case class TypeCollection(ty: Type) extends Collection 
  //
  //case class Multiplicity(exp1: Exp, exp2: Option[Exp]) 

}

object Main {
  implicit def liftString(s: String) = new {
    def print {
      println("-" * 50)
      println(s)
    }
  }

  def main(args: Array[String]) {
    defineFunction("add", List("x" -> "Int", "y" -> "Int"), "Int", "(+ x y)") print

    declareFunction("add", List("Int", "Int"), "Int") print
  }
}