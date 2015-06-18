
-- Test 5: --

class Event {
  t1: Int
  t2: Int

  fun meets(other: Event): Bool {
    t2 = other.t1
  }

  fun before(other: Event): Bool {
    t2 < other.t1
  }

  fun contains(other: Event): Bool {
    t1 < other.t1 && other.t2 < t2
  }

  req t1 < t2
  req t2 - t1 > 10
}

class Schedule {
  a : Event
  b : Event
  c : Event
  d : Event

  req a.meets(b)
  req b.before(c)
  req c.contains(d)
}

=== MODEL:

[
  event:       2 -> (lift-Event (mk-Event 0 11)), 
  schedule:    4 -> (lift-Schedule (mk-Schedule 14 15 16 17)), 
  top:        13 -> (lift-TopLevelDeclarations TopLevelDeclarations!val!0), 
  schedule.a: 14 -> (lift-Event (mk-Event 2414 2425)), 
  schedule.b: 15 -> (lift-Event (mk-Event 2425 2436)), 
  schedule.c: 16 -> (lift-Event (mk-Event 2437 2450)), 
  schedule.d: 17 -> (lift-Event (mk-Event 2438 2449)), 
            else -> (lift-Event (mk-Event 2425 2436))
  ]

===