
===:
Bjoern Cole:
Do we in K yet have a way to encode “subsetting” of properties in K?
Basically, a subsetting property is a property in the context of an
inheritance hierarchy that is allowed to add members to a collection
of the subsetted property simultaneously.  For example:
===

Null : Int = 0
 
class Car {
  vin : Int
}

class Honda extends Car {
  streetValue : Int
}
 
class Garage {
  cars : Set[Car]
 
  -- req r1 : forall c : Car :- c isin cars => c.vin != Null
}
 
class ChopShop extends Garage {
  goodCars : Set[Honda] 

  -- req r2 : goodCars subset cars
 
  req r3 : forall gc : Honda :- 
    gc isin goodCars => gc.streetValue > 5000

  -- r2 and r3 do not solve when both provided. They each solve in isolation.

  -- req r4 : forall h : Honda :- h isin goodCars => h isin cars
     -- Alternative formulation of r2.
     -- But h isin cars does not type check. Honda and Set[Car] are not compatible.
     -- It should type check.

}
 
===:
Bjoern Cole:
In the example above (forgive syntax errors in the requirements), any
instances of Honda added to the goodCar collection will also be added
to the cars collection inherited from Garage. That also means that the
constraints applied to the cars collection (each member needs a
non-null vin) would be applied to the goodCars. But I could also add
specific constraints to the goodCars that would not necessary apply to
the cars like being worth something in resale.
===
