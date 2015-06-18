
-- Test 6: --

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

=== MODEL:

[
  event:          0 -> (lift-Event (mk-Event 6)), 
  state:          1 -> (lift-State (mk-State 7)), 
  rocket:         2 -> (lift-RocketMachine (mk-RocketMachine 3 8 4 9 10 11)), 
  state.off:      3 -> (lift-State (mk-State 12)), 
  state.firing:   4 -> (lift-State (mk-State 14)), 
  top:            5 -> (lift-TopLevelDeclarations TopLevelDeclarations!val!0), 
  state.ready:    8 -> (lift-State (mk-State 13)), 
  event.turn_on:  9 -> (lift-Event (mk-Event 15)), 
  event.fire:    10 -> (lift-Event (mk-Event 16)), 
  event.turn_off 11 -> (lift-Event (mk-Event 17))
]



===

