
package examples.spacecraft

class Thing {
  ident : Int
  weight : Int

  fun equals(other: Thing) : Bool {
    ident = other.ident
  }

  req weight > 0 && weight <= 1000
}

class Instrument extends Thing {
  power : Real
  
  req power >= 0.0
}

class Radio extends Instrument {
  fps : Int
}

class SpaceCraft extends Thing {
  radio : Radio
  instrument1 : Instrument
  instrument2 : Instrument

  distanceToEarth : Int

  instrumentWeight : Int = instrument1.weight + instrument2.weight

  req instrumentsDiffer:
    ! instrument1.equals(instrument2) && 
    ! instrument1.equals(radio) &&
    ! instrument2.equals(radio)

  req EarthSafeDistance:
    distanceToEarth > 50000

  req notTooHeavy: 
    instrumentWeight <= 500
}

clipper : SpaceCraft
