
class time {
  value : Int
}

class Event {
  duration : time
}

class RocketMachine {

  e : Event

  fun imp(s : Event) : Int
    post $result < 1800
  {
    if s = e then 50*s.duration.value else 0
  }

  impe : Int = imp(e)

  req impe > 1500

}

myRocket : RocketMachine
