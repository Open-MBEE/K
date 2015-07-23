class State
class Event

class RocketEngine {

  off : State
  ready : State
  firing : State

  turn_on : Event
  fire : Event
  turn_off : Event
 
  req off != ready && off != firing && firing != ready
   
  fun move(s: State, e: Event) : State
  
  req move(off, turn_on) = ready
  req move(ready, fire) = firing
  req move(firing, turn_off) = ready  
  req unsatisfiable : move(ready, fire) = off    
}