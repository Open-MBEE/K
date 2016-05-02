==========================================
This example shows how inheritance and 
requirements can be used to enforce, 
specify, and disover type related issues.
==========================================

class Fruit {
  mass : Real
}
 
class CitrusFruit extends Fruit {
  vitC : Real
}
 
class Legume extends Fruit {
  protein : Real  
}
 
class Berry extends Fruit
 
class SeedyFruit extends CitrusFruit {
  seeds : Int
}
 
apple : CitrusFruit
peanut : Legume
 
req apple is SeedyFruit

-- The following makes this model UNSAT
-- req apple is Berry

