package test3

package k.frontend

// ======
// Model:
// ======

case class Model(
  packageName: Option[QualifiedName],
  imports: List[ImportDecl],
  classes: List[ClassDecl]) {
  override def toString = {
    var result = ""
    packageName match {
      case None =>
      case Some(qn) =>
        result += s"package $qn\n\n"
    }
    if (!imports.isEmpty) {
      for (imp <- imports) {
        result += imp + "\n"
      }
      result += "\n"
    }
    for (clazz <- classes) {
      result += clazz + "\n\n"
    }
    result
  }
}

case class QualifiedName(names: List[String]) {
  override def toString = names.mkString(".")
}

case class ImportDecl(name: QualifiedName, star: Boolean) {
  override def toString =
    "import " + name + (if (star) ".*" else "")
}

// ==========
// ClassDecl:
// ==========

case class ClassDecl(
  name: String,
  typeParams: List[TypeParam],
  valueParams: List[Typing],
  extending: List[Type],
  members: List[MemberDecl]) {
  override def toString = {
    var result = name
    if (!typeParams.isEmpty) {
      result += s"[${typeParams.mkString(",")}]"
    }
    if (!valueParams.isEmpty) {
      result += s"(${valueParams.mkString(",")})"
    }
    if (!extending.isEmpty) {
      result += s"extending ${extending.mkString(",")}"
    }
    result += " {\n"
    for (member <- members) {
      result += "  " + member + "\n"
    }
    result += "}"
    result
  }
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

// ===========
// MemberDecl:
// ===========

trait MemberDecl

case class SortDecl(ident: String) extends MemberDecl {
  override def toString = s"type $ident"
}

case class TypeDecl(ident: String, typeParams: List[TypeParam], ty: Type) extends MemberDecl {
  override def toString =
    if (typeParams.isEmpty)
      s"type $ident = $ty"
    else
      s"type $ident[${typeParams.mkString(",")}] = $ty"
}

case class VarDecl(typing: Typing, expr: Option[Exp]) extends MemberDecl {
  override def toString =
    expr match {
      case None => typing.toString
      case Some(e) => s"$typing = $e"
    }
}

case class FunDecl(ident: String, args: List[List[Typing]], resType: Option[Type], exp: Exp) extends MemberDecl {
  override def toString = {
    var result = s"function $ident"
    for (listOfTyping <- args) {
      result += "(" + listOfTyping.mkString(",") + ")"
    }
    resType match {
      case None =>
      case Some(t) =>
        result += s" : $t"
    }
    result += s" = $exp"
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

// ====
// Exp:
// ====

trait Exp

trait Literal extends Exp

case class Identifier(id: String) extends Exp {
  override def toString = id
}

case class BinExp(exp1: Exp, op: String, exp2: Exp) extends Exp {
  override def toString = s"$exp1 $op $exp2"
}

case class UnaryExp(op: String, exp: Exp) extends Exp {
  override def toString = s"$op$exp"
}

case class ParenExp(exp: Exp) extends Exp {
  override def toString = s"($exp)"
}

case class DotExp(exp: Exp, id: String) extends Exp {
  override def toString = s"exp.$id"
}

case class LambdaExp(pat: Pattern, ty: Option[Type], exp: Exp) extends Exp {
  override def toString = {
    ty match {
      case None => s"-\\ $pat :- $exp"
      case Some(t) => s"-\\ $pat : $t :- $exp"
    }
  }
}

case class FunAppl(exp1: Exp, exp2: Exp) extends Exp {
  override def toString =
    if (exp2.isInstanceOf[TupleExp] || exp2.isInstanceOf[ParenExp])
      s"$exp1$exp2"
    else
      s"$exp1 $exp2"
}

case class LetExp(bindings: List[LetBinding], exp: Exp) extends Exp {
  override def toString = {
    val binders = bindings.mkString(",")
    s"let $binders in $exp"
  }
}

case class IfExp(cond: Exp, exp1: Exp, exp2: Exp) extends Exp {
  override def toString = s"if $cond then $exp1 else $exp2"
}

case class QuantifiedExp(quant: Quantifier, bindings: List[RngBinding], exp: Exp) extends Exp {
  override def toString = s"$quant ${bindings.mkString(",")} :- $exp"
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

case class SetComprExp(exp: Exp, bindings: List[RngBinding], exp2: Exp) extends Exp {
  override def toString = s"{$exp | ${bindings.mkString(",")} :- $exp2}"
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

// ===========
// Quantifier:
// ===========

trait Quantifier

case object Forall extends Quantifier {
  override def toString = "forall"
}

case object Exists extends Quantifier {
  override def toString = "exists"
}

// =====
// Type:
// =====

trait Type

trait PrimitiveType extends Type

case class IdentifierType(id: String, args: Option[List[Type]]) extends Type {
  override def toString =
    args match {
      case None => id
      case Some(tys) => s"$id[${tys.mkString(",")}]"
    }
}

case class ParenType(ty: Type) extends Type {
  override def toString = s"($ty)"
}

case class ProductType(types: List[Type]) extends Type {
  override def toString = types.mkString(" * ")
}

case class FunctionType(from: Type, to: Type) extends Type {
  override def toString = s"$from -> $to"
}

case class SubType(typing: Typing, exp: Exp) extends Type {
  override def toString = s"{| $typing :- $exp |}"
}

case object BoolType extends PrimitiveType {
  override def toString = "Boolean"
}

case object CharType extends PrimitiveType {
  override def toString = "Char"
}

case object IntType extends PrimitiveType {
  override def toString = "Int"
}

case object FloatType extends PrimitiveType {
  override def toString = "Float"
}

case object StringType extends PrimitiveType {
  override def toString = "String"
}

case class Typing(id: String, ty: Type) {
  override def toString = s"$id : $ty"
}

// ========
// Pattern:
// ========

trait Pattern

case class IdentPattern(id: String) extends Pattern {
  override def toString = id
}

case class ProductPattern(patterns: List[Pattern]) extends Pattern {
  override def toString = "(" + patterns.mkString(",") + ")"
}

// =============
// Bindings etc:
// =============

case class LetBinding(pat: Pattern, ty: Option[Type], exp: Exp) {
  override def toString = {
    ty match {
      case None => s"$pat = $exp"
      case Some(t) => s"$pat : $t = $exp"
    }
  }
}

case class RngBinding(patterns: List[Pattern], collection: Collection) {
  override def toString = patterns.mkString(",") + " : " + collection
}

case class MapPair(exp1: Exp, exp2: Exp) {
  override def toString = s"$exp1 -> $exp2"
}

// ===========
// Collection:
// ===========

trait Collection

case class ExpCollection(exp: Exp) extends Collection {
  override def toString = exp.toString()
}

case class TypeCollection(ty: Type) extends Collection {
  override def toString = ty.toString()
}

// ========
// Literal:
// ========

case class IntegerLiteral(i: Int) extends Literal {
  override def toString = i.toString
}

case class FloatingPointLiteral(f: Float) extends Literal {
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
