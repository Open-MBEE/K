
================
ABSTRACT SYNTAX:

TODO:
- options : it does not type check because of this
  for the moment replaced with Bag
- enumerated types
================

class Model {
  decls: Seq[TopDecl]
}

class TopDecl 

class EntityDecl extends TopDecl {
  entityToken: EntityToken
  ident: String
  typeParams: Seq[TypeParam]
  extending: Seq[Type]
  members: Seq[MemberDecl]
} 

class MemberDecl extends TopDecl 

class TypeDecl extends MemberDecl {
  ident: String 
  typeParams: Seq[TypeParam] 
  ty: Set[Type] -- Option
}

class PropertyDecl extends MemberDecl {
  modifiers: Seq[PropertyModifier] 
  name: String 
  ty: Type 
  multiplicity: Set[Multiplicity] -- Option
  assignment: Set[Bool] -- Option 
  expr: Set[Exp] -- Option
} 

class FunDecl extends MemberDecl { 
  ident: String 
  typeParams: Seq[TypeParam] 
  params: Seq[Param] 
  ty: Set[Type] -- Option 
  spec: Seq[FunSpec] 
  body: Seq[MemberDecl]
} 

class ConstraintDecl extends MemberDecl {
  -- name: Set[String] -- Option 
  exp: Exp
} 

class EntityToken
ClassToken : EntityToken
AssocToken : EntityToken

class TypeParam {
  ident: String 
  bound: Set[TypeBound] -- Option
} 

class TypeBound {
  types: Seq[Type]
} 

class PropertyModifier 
Part   : PropertyModifier 
Val    : PropertyModifier 
Source : PropertyModifier 
Target : PropertyModifier 

class FunSpec {
  isPre: Bool 
  exp: Exp
} 

class Param {
  name: String 
  ty: Type
} 

class Exp 
class ParenExp extends Exp {exp: Exp}  
class IdentExp extends Exp {ident: String}
class DotExp extends Exp {exp: Exp ident: String}
class FunApplExp extends Exp {exp1: Exp args: Seq[Argument]}
class IfExp extends Exp {cond: Exp trueBranch: Exp falseBranch: Set[Exp]} -- Option
class BinExp extends Exp {exp1: Exp op: BinaryOp exp2: Exp}
class UnaryExp extends Exp {op: UnaryOp exp: Exp}
class QuantifiedExp extends Exp {quant: Quantifier bindings: Seq[RngBinding] exp: Exp}
class TupleExp extends Exp {exps: Seq[Exp]}
class CollectionEnumExp extends Exp {kind: CollectionKind exps: Seq[Exp]}
class CollectionRangeExp extends Exp {kind: CollectionKind exp1: Exp exp2: Exp}
class CollectionComprExp extends Exp {kind: CollectionKind exp1: Exp bindings: Seq[RngBinding] exp2: Exp}
class LambdaExp extends Exp {pat: Pattern exp: Exp}
class TypeCastCheckExp extends Exp {cast: Bool exp: Exp ty: Type}
ResultExp : Exp   
StarExp   : Exp 

class CollectionKind 
SetKind : CollectionKind 
SeqKind : CollectionKind 
BagKind : CollectionKind 

class Argument
class PositionalArgument extends Argument {exp: Exp}  
class NamedArgument extends Argument {ident: String exp: Exp}

class BinaryOp 
LT : BinaryOp 
LTE : BinaryOp 
GT : BinaryOp 
GTE : BinaryOp 
AND : BinaryOp 
OR : BinaryOp 
IMPL : BinaryOp 
IFF : BinaryOp 
EQ : BinaryOp 
NEQ : BinaryOp 
MUL : BinaryOp 
DIV : BinaryOp 
REM : BinaryOp
SETINTER : BinaryOp 
SETDIFF : BinaryOp 
LISTCONCAT : BinaryOp 
TUPLEINDEX : BinaryOp 
ADD : BinaryOp 
SUB : BinaryOp 
SETUNION : BinaryOp 
ISIN : BinaryOp 
NOTISIN : BinaryOp 
SUBSET : BinaryOp 
PSUBSET : BinaryOp 
ASSIGN : BinaryOp 

class UnaryOp 
NOT  : UnaryOp 
NEG  : UnaryOp 
PREV : UnaryOp 

class Literal extends Exp 
class IntegerLiteral extends Literal {i: Int} 
class RealLiteral extends Literal {f: Real} 
class CharacterLiteral extends Literal {c: Char} 
class StringLiteral extends Literal {s: String} 
class BooleanLiteral extends Literal {b: Bool}
NullLiteral : Literal 
ThisLiteral :  Literal 

class Quantifier 
Forall : Quantifier 
Exists : Quantifier 

class Type 
class IdentType extends Type {ident: String args: Seq[Type]}
class CartesianType extends Type {types: Seq[Type]}
class FunctionType extends Type {from: Type to: Type}
class ParenType extends Type {ty: Type}
class SubType extends Type {ident: String ty: Type exp: Exp}

class PrimitiveType extends Type
BoolType   : PrimitiveType 
CharType   : PrimitiveType 
IntType    : PrimitiveType 
RealType   : PrimitiveType 
StringType : PrimitiveType 
UnitType   : PrimitiveType 

class Pattern 
class LiteralPattern extends Pattern {literal: Literal}
class IdentPattern extends Pattern {ident: String}
class ProductPattern extends Pattern {patterns: Seq[Pattern]}
class TypedPattern extends Pattern {pattern: Pattern ty: Type}
DontCarePattern : Pattern 

class RngBinding{patterns: Seq[Pattern] collection: Collection} 

class Collection 
class ExpCollection extends Collection {exp: Exp}
class TypeCollection extends Collection {ty: Type} 

class Multiplicity{exp1: Exp exp2: Set[Exp]} -- Option

==========
SEMANTICS:
==========

--- SEMANTIC DOMAINS: ---

class VALUE

class ENV extends VALUE {
  fun dom : Set[String]
  fun lookUp(id:String): VALUE
  fun update(id:String, v:VALUE): ENV
}

class INT extends VALUE {i : Int}

class REAL extends VALUE {r : Real}

--- SEMANTIC FUNCTIONS: ---

fun semModel(m:Model): Set[ENV] {
  Set{env | env : ENV :- modelSatEnv(m,env)}
}

fun modelSatEnv(m:Model, env:ENV):Bool {
  forall decl : TopDecl :- decl isin m.decls => declSatEnv(decl,env)
}

fun declSatEnv(decl: TopDecl, env : ENV): Bool

===
req
  forall et : EntityToken :-
  forall id : String :-
  forall tp : Seq[TypeParam] :-
  forall ex : Seq[Type] :-
  forall me : Seq[MemberDecl] :-
  forall env : ENV :-
    declSatEnv(
      EntityDecl(
        entityToken :: et,
        ident :: id,
        typeParams :: tp,
        extending :: ex,
        members :: me
       ),
      env) = true
===

req 
  forall ed : EntityDecl :-
  forall env : ENV :-
  declSatEnv(ed,env) =
    (ed.ident isin env.dom()) 



