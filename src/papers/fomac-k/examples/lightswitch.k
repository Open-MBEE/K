class State

class LightSwitch_Spec {
  off : State
  on  : State

  req off != on

  fun toggle(s:State):State

  fun isOn(s:State):Bool { 
    s = on 
  }

  req toggle(off) = on
  req toggle(on) = off
}

class LightSwitch {
  fun toggle(cs: Int): Int {
    if cs = 1 then 0 else 1    
  }

  fun isOn(cs: Int): Bool {
    cs = 1
  }
}

class RefinementProof {
  spec : LightSwitch_Spec
  impl : LightSwitch
  
  fun abs(cs:Int):State {
    if cs = 1 then spec.on else spec.off
  }

  req forall cs: Int :-
    spec.toggle(abs(cs)) = abs(impl.toggle(cs))

  req forall cs: Int :-
    spec.isOn(abs(cs)) = impl.isOn(cs)

}

