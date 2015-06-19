
-- Test 4: --

class Event {
  t1: Int
  t2: Int

  req t1 < t2
  req t2 - t1 < 10
}

class Schedule {
  a : Event
  b : Event
  c : Event
  d : Event

  fun before(e1:Event,e2:Event): Bool {
    e1.t2 < e2.t1
  }

  fun meets(e1:Event,e2:Event): Bool {
    e1.t2 = e2.t1
  }

  fun contains(e1:Event,e2:Event): Bool {
    e1.t1 < e2.t1 && e2.t2 < e1.t2
  }

  req meets(a,b)
  req before(b,c)
  req contains(c,d)

}

=== MODEL:

[
  event:    2 -> (lift-Event (mk-Event 0 1)), 
  schedule: 4 -> (lift-Schedule (mk-Schedule 13 14 15 16)), 
  top:     12 -> (lift-TopLevelDeclarations TopLevelDeclarations!val!0), 
  schedule.a: 13 -> (lift-Event (mk-Event 8852 8853)), 
  schedule.b: 14 -> (lift-Event (mk-Event 8853 8854)), 
  schedule.d: 15 -> (lift-Event (mk-Event 8855 8858)), 
  schedule.c: 16 -> (lift-Event (mk-Event 8856 8857)), 
         else -> (lift-Event (mk-Event 8853 8854))
]

===
