package examples.sm

class <event> Event
class <state> State


class RocketMachine {

  off : State
  ready : State
  firing : State
  turn_on : Event
  fire : Event
  turn_off : Event
  
  
  fun move(s: State, e: Event) : State
  
  req off != ready && off != firing && firing != ready
  
  
  req move(off, turn_on) = ready
  req move(ready, fire) = firing

  
  ====================================================
  The following makes the state machine unsat because 
  it introduces non-determinism.
  
  req move(ready, fire) = off    
  ====================================================


  ====================================================
  Due to a miscommunication between modelers, 
  it was thought that when the rocket is turned off 
  from the firing state, it will go back to the ready 
  state. Again, the state machine becomes 
  non-deterministic, which is caught by K.
    
req move(firing, turn_off) = ready  
  ====================================================
req move(firing, turn_off) = ready  

}