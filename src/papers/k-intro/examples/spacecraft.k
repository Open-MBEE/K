class Thing {weight : Int}

class Event {
  start : Real
  end : Real
  req start >= 0.0 && 
      end > start
  fun after(e : Event) 
        : Bool {
    start >= e.end
  }
}

class Instr 
      extends Thing {
  power : Real
  req power >= 0.0
  req weight > 0 && 
      weight <= 1000
}

class SmplRadio 
      extends Instr
class SmrtRadio 
      extends SmplRadio 

class SysMngr {
  bootUp : Event
  initMem : Event
  tkPic : Event
  req tkPic.after(initMem) 
      && 
      tkPic.after(bootUp)
}

class SpaceCraft 
      extends Thing {
  instrWeight : Real
  radio : Instr
  camera : Instr
  software : SysMngr

  req instrWeight = 
        radio.weight + 
        camera.weight

  req notTooHeavy: 
        instrWeight <= 999
}

ShRaan : SpaceCraft

