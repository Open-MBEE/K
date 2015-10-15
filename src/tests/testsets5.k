
Do we in K yet have a way to encode “subsetting” of properties in K?
Basically, a subsetting property is a property in the context of an
inheritance hierarchy that is allowed to add members to a collection
of the subsetted property simultaneously.  For example:
 
Class Car {
  vin : String
}

Class Honda extends Car {
  streetValue : Real
}
 
Class Garage {
  cars : Car[*]
 
  req forall c in cars: c.vin is not null
}
 
Class chopShop extends Garage {
-- Hondas are easy to sell on the street so I care especially about them
 
  goodCars : Honda[*] subsets cars
 
  req forall gc in goodCars: gc.streetValue > 5000.0
}
 
In the example above (forgive syntax errors in the requirements), any
instances of Honda added to the goodCar collection will also be added
to the cars collection inherited from Garage. That also means that the
constraints applied to the cars collection (each member needs a
non-null vin) would be applied to the goodCars. But I could also add
specific constraints to the goodCars that would not necessary apply to
the cars like being worth something in resale.
 
===========

Gents,
 
I’d say that high on my list of features of interest after the multi-file collection is the use of sets and subsets in K. In particular, I’d like to be able to start saying things like:
 
Class Planet
Class Earth extends Planet
Class Mars extends Planet
 
Class Spacecraft {
  cost : Real
  destination : Planet
}
 
Class LowCostSCFleet {
  deployedSC : Set[Spacecraft]
  req forall sc in deployedSC { sc.cost < 1e6 } -- yes, 1 million is pretty cheap in this community!
}
 
Or
 
Class FeasibleLowCostSCFleet {
  deployedSC : Set[Spacecraft]
  req forall sc in deployedSC { sc.destination is Earth }
}
 
For the subsetting piece, I think we had the cars / good cars example but I can clarify if needed.
 
