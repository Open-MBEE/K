package examples


annotation doc : String


class Airplane {

  var engines : Seq[Engine]
  val controller : FlightController
  val leftWing : Wing
  val rightWing : Wing
  val landing : Bool
  val takeoff : Bool
  var speed : Real
  var flaps : Real -- current angle of flaps

  req landing || landing
  req takeoff || takeoff

  req LandingFlaps: landing => (flaps > 15)
  
  req TakeoffFlaps: takeoff => flaps <= 15  
  
  req TakeoffSpeed: takeoff => (flaps = 10) && (speed > 63) && (speed < 74) -- m/s
  
  req LandingSpeed: landing => ((flaps = 16) && (speed > 40) && (speed < 54)) -- m/s
    
  
}

class Wing { }

class Engine { }

class Actuator {
  var value : Real 
  
  fun read {  }
}

class FlightController {

  val act1 : Actuator
  val act2 : Actuator

  req ActuatorAvg: (act1.value + act2.value)/2.0 <= 0.0314
  
  
}