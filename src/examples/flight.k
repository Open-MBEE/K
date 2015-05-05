package examples


annotation doc : String


class Airplane {

  var engines : List[Engine]
  val controller : FlightController
  val leftWing : Wing
  val rightWing : Wing
  val landing : Bool
  val takeoff : Bool
  var speed : Real
  var flaps : Real -- current angle of flaps

  req landing = 1 || landing = 0
  req takeoff = 1 || takeoff = 0

  req LandingFlaps: (landing = 1) => (flaps > 15)
  
  req TakeoffFlaps: (takeoff = 1) => flaps <= 15  
  
  -- remove this comment for demo, error is in encoding the takeoff/landing conditions
  req (landing != 0 && takeoff = 1) || (landing = 1 && takeoff != 0) || (landing != 0 && takeoff != 0)

  req TakeoffSpeed: (takeoff = 1) => (flaps = 10) && (speed > 63) && (speed < 74) -- m/s
  
  req LandingSpeed: (landing = 1) => ((flaps = 16) && (speed > 40) && (speed < 54)) -- m/s
    
  
}

class Wing { }

class Engine { }

class Actuator {
  var value : Real 
  
  fun read {
  }
}

class FlightController {

  val act1 : Actuator
  val act2 : Actuator

  req ActuatorsPresent: actuator1 != 0 && actuator2 != 0
  
  req ActuatorAvg: (act1.value + act2.value)/2 <= 0.0314
  
  fun readActuators {
    act1.read
    act2.read  
  }
  
}