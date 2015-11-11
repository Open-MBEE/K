
class Planet
class Earth extends Planet
class Mars extends Planet

class Spacecraft {
  cost : Real
  destination : Planet
}

class LowCostSCFleet {
  deployedSC : Set[Spacecraft]

  -- req deployedSC != Set{}

  req forall sc : Spacecraft :-
    sc isin deployedSC => sc.cost < 1e6
}

class FeasibleLowCostSCFleet {
  deployedSC : Set[Spacecraft]

  req deployedSC != Set{}

  req forall sc : Spacecraft :-
   sc isin deployedSC => sc.destination is Earth
}

