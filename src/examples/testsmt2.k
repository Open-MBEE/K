
class Duration {
  t1 : Int
  t2 : Int

  fun before(other: Duration): Bool {
    t2 < other.t1
  }

  req t1 < t2
}

class Event {
  duration : Duration
  min: Int  

  req duration.t2-duration.t1 >= min
}

a : Event
b : Event

req a.min = 10
req b.min = 20
req a.duration.before(b.duration)

