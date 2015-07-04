package examples.borges

class <event> Event {
  t1 : Real 
  t2 : Real  
  duration : Real  

  req t1 > 0
  req t2 > t1 
  req t2 = t1 + duration
  req duration > 0

  -- START OPERATORS -- 
  fun before (e : Event) : Bool {
    t2 < e.t1
  }

  fun meets (e : Event) : Bool {
    t2 = e.t1
  }  

  fun overlaps (e : Event) : Bool {
    t2 > e.t1 && t2 < e.t2
  }

  fun starts (e : Event) : Bool {
    t1 = e.t1
  }

  fun during (e : Event) : Bool {
    t2 > e.t1 && t2 < e.t2 &&
    t1 > e.t1 && t2 < e.t2
  }
 
  fun finishes (e : Event) : Bool {
    t2 = e.t2
  }

  fun equal (e : Event) : Bool {
    t1 = e.t1 && t2 = e.t2
  }
  -- END OPERATORS --

}

a : Event
b : Event
telecom : Event
radioScience : Event
targetSlew : Event

  req Schedule1OrSchedule2: 
    (
      a.meets(b) && -- encoding m
      b.meets(telecom) && -- encodig m
      telecom.meets(radioScience) && -- encoding m
      radioScience.meets(targetSlew) -- encoding m
    )
    ||
    (
      a.meets(b) && -- encoding m
      b.meets(telecom) && -- encoding m
      telecom.meets(radioScience) && -- encoding m 
      radioScience.meets(targetSlew) -- encoding M
    )
    