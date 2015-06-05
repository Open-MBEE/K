
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
