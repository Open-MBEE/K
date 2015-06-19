
-- Test 2: --

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

=== MODEL:

[
  dur:    2 -> (lift-Duration (mk-Duration 0 1)),
  event:  4 -> (lift-Event (mk-Event 13 (- 1795))),
  top:    7 -> (lift-TopLevelDeclarations (mk-TopLevelDeclarations 14 15)),
         13 -> (lift-Duration (mk-Duration 8855 8856)),
  a:     14 -> (lift-Event (mk-Event 16 10)),
  b:     15 -> (lift-Event (mk-Event 17 20)),
  a.dur: 16 -> (lift-Duration (mk-Duration 2272 2282)),
  b.dur: 17 -> (lift-Duration (mk-Duration 2283 2303)),
         else -> (lift-Duration (mk-Duration 8855 8856))
]

===