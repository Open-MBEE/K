==============================================
This example shows how one can encode Allen
logic using a simple Event class, and then 
encode a schedule which can be tested for 
satisfiability and receive a possible schedule 
in return.
==============================================

package examples.planning

class Event {
  t1 : Int
  t2 : Int 

  req t1 >= 0
  req t2 > t1 

  fun before (e : Event) : Bool {
    t2 < e.t1
  }

  fun meets (e : Event) : Bool {
    t2 = e.t1
  }  

  fun contains (e : Event) : Bool {
    t1 <= e.t1 && e.t2 <= t2
  }
}

class Schedule {
  a : Event
  b : Event
  c : Event

  schedule1 : Bool = a.meets(b) && b.contains(c)
  schedule2 : Bool = a.contains(b) && a.contains(c)

  req schedule1 || schedule2
}
    
mySchedule : Schedule