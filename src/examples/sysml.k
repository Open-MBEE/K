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

-- Constraint
req a = b;
req hitchhiker : 1 + 41 = 42;
class NormalCar extends Car {
 req wheels.size() = 4;
}

