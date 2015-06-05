package small

class Car {
  price : Int
  make : String
  model : String
  mfdate : Int
}

class Garage { 

  cars : Set[Car] [0,42]

  fun garageValue (cs : Set[Car]) : Int {
    cs.collect(c -> c.price).sum()
  }

  fun garageCarsMakeModel (cs : Set[Car]) : Set[(String*String)] {
    cs.collect(c -> Tuple(c.make, c.model))
  }

  fun garageCarsMakeModelDate (cs : Set[Car]) : Set[String * String * Int] {
    cs.collect(c -> Tuple(c.make, c.model, c.mfdate))
  }

}

class Person {

  dob : Int
  garages : Set[Garage] 

  totalWorth  : Int = garages.collect(g -> g.garageValue(g.cars)).sum()

  dob = 12345678
}