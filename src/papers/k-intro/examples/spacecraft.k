package examples.spacecraft

class Thing {
  weight : Int
}

class Event {
  start : Real
  end : Real
  req start >= 0.0 && end > start
  fun after(e : Event) : Bool {
    return start >= e.end
  }
}

class Instrument extends Thing {
  power : Real
  req power >= 0.0
  req weight > 0 && weight <= 1000
}

class SimpleRadio extends Instrument 
class SmartRadio extends SimpleRadio 

class SystemManager {
  bootUp : Event
  initMem : Event
  takePicture : Event
  req takePicture.after(initMem) && 
      takePicture.after(bootUp)
}

class SpaceCraft extends Thing {
  instrumentsWeight : Real
  radio : Instrument 
  camera : Instrument
  software : SystemManager

  req instrumentsWeight = radio.weight + camera.weight

  req notTooHeavy: instrumentsWeight <= 1000

}

ShRaan : SpaceCraft

