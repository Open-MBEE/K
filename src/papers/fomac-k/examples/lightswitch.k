class State

class LightSwitchSpec {
  off : State
  on  : State

  fun toggle(s:State):State
  fun isOn(s:State):Bool{ 
    s = on 
  }

  req off != on
  req toggle(off) = on
  req toggle(on) = off
}

class LightSwitchImpl {
  fun toggle(cs: Int): Int {
    if cs = 1 then 0 
    else 1    
  }

  fun isOn(cs: Int): Bool {
    cs = 1
  }
}

class Main {
  spec : LightSwitchSpec
  impl : LightSwitchImpl
  
  fun abs(cs:Int):State {
    if cs = 1 then spec.on else spec.off
  }

  req forall cs: Int :-
    spec.toggle(abs(cs)) = 
    abs(impl.toggle(cs))
}

