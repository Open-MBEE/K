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
 
class SeedyFruit extends Fruit, CitrusFruit {
  seeds : Int
}
 
apple : CitrusFruit
peanut : Legume
 
req apple is SeedyFruit

-- The following is not possible
--req apple is Berry

