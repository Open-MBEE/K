

class Event {
  time : Int
}

class Events {
  s : Set[Event]

  req s != Set{}

  req forall e : Event :-
    e isin s =>	 e.time >= 0
}


