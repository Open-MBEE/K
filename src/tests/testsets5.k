
Null : Int = 0
 
class Car {
  vin : Int
}

class Honda extends Car {
  streetValue : Int
}
 
class Garage {
  cars : Set[Car]
 
  req r1 : forall c : Car :- c isin cars => c.vin != Null
}
 
class ChopShop extends Garage {
  goodCars : Set[Honda] 

  -- req r2 : goodCars subset cars
 
  req r3 : forall gc : Honda :- 
    gc isin goodCars => gc.streetValue > 5000
}
 
