==============================================
This example highlights how we can perform 
refinement using inheritance and have K check
the specification using function specifications
(pre and post conditions) as wel as requirements
inherited from parent classes. We also use a 
quantifier to show that the specification is 
equivalent to the implementation.
==============================================

class State

class LightSwitchSpec {

  off : State
  on  : State

  req off != on

  fun toggle(state: State):State
 
  req toggle(off) = on
  req toggle(on) = off

  fun isOn(state: State): Bool {
    state = on  
  }
}

class LightSwitchImpl {
  fun toggle(state: Int): Int 
    post $result = 0 || $result = 1
  {
    if state = 1 then 0 
    else 1    
  }

  fun isOn(state: Int): Bool {
    state = 1
  }
}

class Main {
  abstract : LightSwitchSpec
  concrete : LightSwitchImpl
  
  fun abs(concrete:Int):State 
  {
    if concrete = 1 then abstract.on
    else abstract.off
  }

  req forall concreteState: Int :-
    abstract.toggle(abs(concreteState)) = abs(concrete.toggle(concreteState))
}

