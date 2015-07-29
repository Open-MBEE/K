
ERROR : Int req ERROR < 0
fun CHECK(b:Bool):Int {if b then 42 else ERROR}

class Event {
  t1: Int
  t2: Int

  req t1 < t2
  req t2 - t1 < 10

  RESULT : Int = CHECK(t1 < t2 && t2 - t1 < 10)
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

  RESULT : Int = CHECK(a.t2 = b.t1 && b.t2 < c.t1 && c.t1 <= d.t1 && d.t2 <= c.t2)
}

