-- Package
package k.examples.sysml

-- This example shows various constructs from SysML in K.

-- LiteralReal 
0.1212;

-- LiteralInteger 
-1;

-- LiteralString
"K SysML rocks!";

-- LiteralBoolean
true;

-- Expression
1 + 41 = 42;

-- LiteralUnlimitedNatural
-- TODO: what is an unlimited natural number? 
-- We are assuming it is a natural number, >= 0
0;
1;
42;

-- LiteralNull
null;

-- ElementValue
-- TODO: need more clarity about ElementValue

-- OpaqueExpression
-- TODO: how do we do this? what is it? 

-- Namespace
-- Package, Class, or Property

-- Class with OwnedAttribute
class Engine {
  -- hybrid, gasoline etc. 
  val engineType : Int; 
}

-- Class with sub typing and inheritance
class CarPart { 
}
class Wheel extends CarPart {
}

-- Class with relation expressed as property
class Car {
  -- TypedProperty
  -- TODO: allow users to write part/ref in classes
  --       currently, they are only allowed to do it in 
  --       an assoc.
  part engine : Engine;  
  part wheels : Wheel 3..4;
}

-- Class with a relation expressed as an association
class Car {
}

-- Each car can have 3 or 4 wheels
assoc CarWheel {
  ref car : Car;
  part wheel : Wheel 3..4;
}

-- Each car is associated with 1 engine
assoc CarEngine {
  ref car : Car;
  part engine : Engine;
}
val vw : Car = Car();
val jeep : Car = Car();
val w0 : Wheel = Wheel();
val w1 : Wheel = Wheel();
val w2 : Wheel = Wheel();
val cw0 : CarWheel(vw, w0);
val cw1 : CarWheel(vw, w1);
val cw2 : CarWheel(vw, w2);
val cw3 : CarWheel(jeep, w2);

req cw2.wheel = cw3.wheel;
req vw.wheel = {w0,w1,w2};

-- Ternary Relation example 
=============================
A Companionship is a single instance of
the ternary relationship; it associates exactly one SENIOR SALES REP,
exactly one PRODU CT and exactly one JUNIOR SALES REP. The cardinality
constraint near SENIOR SALES REP (minimum = 1; maximum = 1) indicates
that every possible combination of JUNIOR SALES REP and PRODUCT must
be associated with exac tly one SENIOR SALES REP. The cardinality
constraint near PRODUCT (minimum = 0; maxi mum = 1) indicates that
although every possible combination of JUNIOR SALES REP and SENIOR
SALES REP need not be associated with a product (i.e., th ere is no
instance of the relations hip that associates that com bination of
JUNIOR SALES REP and SENIOR SALES REP) each combination can be
associated with at most one PRODUCT. The cardinality constraint near
JUNIOR SALES REP (minimum = 0; maximum = *) indicates that although
every possible combination of PRODUCT and SENIOR SALES REP need not be
associated with a JUNIOR SALES REP, it is possible for a specific
combination to be associated with more than one JUNIOR SALES REP
(Rumbaugh et al. 2005, p. 471).  
--

class SeniorSaleRep { 
  val firstName : String; 
  val lastName : String; 
  val hireDate : Int; 
  val phoneNumber :String; 
}

class Product { 
  val name : String;
  val category : String;
  val description : String;
}

class JuniorSaleRep {
  val firstName : String;
  val lastName : String;
  val hireDate : Int;
  val phoneNumber : String;
}

assoc Companionship {
  ref product : Product 0..1;
  ref juniorRep : JuniorSaleRep 0..*;
  ref seniorRep : SeniorSaleRep 1..1;
}

-- Constraint
req a = b;
req hitchhiker : 1 + 41 = 42;
class NormalCar extends Car {
 req wheels.size() = 4;
}

-- Constraint as a Class
class A {
  val a : Int;
  val i;
  val j;
}
class B {
  val b : Int;
}
class ConstrainAB {
  val x : A;
  val y : B;
  req x.a > y.b;
}
class SomeIBD {
  val one : A;
  val two : B;
  ConstrainAB(one,two);
}

-- Property
val counter : Int = 0;
val name : String = "K";
val car;
var cars;

-- Namespace
-- TODO: what is a namespace? Need more explanation.
-- Specifically: what is a relation?

-- Generalization
-- K does not have explicit generalizations. 
-- K supports generalization through inheritance.
-- As such, the sub types can have properties 
-- but there is no generalization entity itself.

-- Characterizes
-- This is done implicitly by K. 
-- The extends relationship takes care of it. 
class A {
  val x : Int;
  val p : Int;
}
class B {
  val x : Int;
}
class C extends A,B {
  val i : Int;
  val j : Real;
  val y : Int;
  A.x = 42;
  B.x = -1;
  p = 0;
}
C(1,2,3) -- in this case A.x and B.x and A.p are uninitialized
C(A.x = 11, B.x = 12) -- in this case i, j, y are uninitialized

