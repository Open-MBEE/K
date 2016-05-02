==============================================
This example shows how a simple state machine
can be encoded using K and then checked for
any non-deterministic transitions (which are 
considered erroneous). 
==============================================

package examples.sm

class Event
class State

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
  req move(firing, turn_off) = ready  

  ==============================================
  The following makes the state machine unsat 
  because it introduces non-determinism.
  ==============================================
  -- req move(ready, fire) = off    
}
