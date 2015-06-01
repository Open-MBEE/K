package small

-- class Set [T] {
--  fun collect : Set[T]
--  fun sum : Int
-- }

class Car {
  price : Int
  make : String
  model : String
  mfdate : Int
}


class Person {

  primaryCar : Car
  dob : Int
  garages : Set[Garage] 

  totalWorth  : Int = garages.collect(g -> g.garageValue(g.cars)).sum()

  dob = 12345678
  
  primaryCar.price := 0
  
}

class Garage { 

  cars : Set[Car][0,42]

  fun garageValue (cs : Set[Car]) : Int {
    x : Int
    
    x := x + 1
    
    if x > 0 then {
      cs.collect(c -> c.price).sum()
    }
    else {
      0
    }
  }

  fun garageCarsMakeModel (cs : Set[Car]) : (String*String) {
    cs.collect(c -> Tuple(c.make, c.model))
  }

  fun garageCarsMakeModelDate (cs : Set[Car]) : String * Int {
    cs.collect(c -> Tuple(c.make, c.mfdate))
  }
  
  garageCarsMakeModel(cs)
  
}

