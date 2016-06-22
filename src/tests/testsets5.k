
Null : Int = 0

class Car {
  vin : Int
}

class Honda extends Car {
  streetValue : Int
}
 
class Garage {
  cars : Set[Car]

  -- req r1 : cars != Set{}
 
  req r2 : forall c : Car :- c isin cars => c.vin != Null
}
 
class ChopShop extends Garage {
  goodCars : Set[Honda] 

  -- req r3 : goodCars != Set{}

  req r4 : goodCars subset cars
 
  req r5 : forall gc : Honda :- gc isin goodCars => gc.streetValue > 5000
}
 
