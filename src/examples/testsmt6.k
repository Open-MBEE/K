
class Event {
  id : Int
}

class State {
  id : Int
}

class RocketMachine {

  off : State
  ready : State
  firing : State

  turn_on : Event
  fire : Event
  turn_off : Event

  req off != ready && off != firing && firing != ready
  
  fun move(s: State, e: Event) : State {
    if s = off && e = turn_on then ready else
    if s = ready && e = fire then firing else
    if s = firing && e = turn_off then off
     else s
  }  
   
  req move(off, turn_on) = ready
  req move(ready, fire) = firing
  req move(firing, turn_off) = off  
}
