package nasa.jpl.spacecraft

import nasa.jpl.physics
import nasa.jpl.europa.trajectory

============
Annotations:
============

annotation name : String
annotation id : String
annotation doc : String
annotation owner : String
annotation url : String

==================
Space Craft Model:
==================

@name("InstrumentClass")
@id("_GHSZ3432")
@doc("This class describes the basic instrument for a spacecraft.")

class Instrument {
  name : String
  id : Int
  powerConsumption : Real = 1000 
  weight : Real
  currentPowerConsumption : Real 
  operating : Boolean = false 

  req idId: id >= 0

  req OperatingPower: 
    !operating => currentPowerConsumption = 0 &&
      operating => currentPowerConsumption = powerConsumption
    
  fun toggleOperating 
    post(operating = !operating~)
  {
    operating := !operating
    if !operating then 
      currentPowerConsumption := 0
    else
      currentPowerConsumption := powerConsumption
  }
}

class Camera extends Instrument {
  fps : Int
}

class Battery

class AngularVector {
  angle1 : Real
  angle2 : Real
  angle3 : Real
}

class Attitude {
  angularPosition : AngularVector
  speed : Real
  acceleration : Real
  distanceToEarth : Real
}

assoc BatteryInstrument {
  source bat : Battery
  target inst : Instrument [*] 

  req ...
}

class Spacecraft {
  name : String
  attitude : Attitude
  weight : Real
  maxWeight : Real = 1000

  req EarthSafeDistance:
    attitude.distanceToEarth > 50000 &&
    attitude.distanceToEarth < 350000

  req notTooHeavy: totalWeight() <= maxWeight

  fun totalWeight : Real {
    BatteryInstrument.inst.collect(i -> i.weight).sum() -- name of association!
  }

  fun getInstrumentsNameAndWeight : Seq[String * Real] 
    post $result.length() = instrument.size()
  {
    BatteryInstrument.inst.collect(i -> Tuple(i.name, i.weight)).toSeq() -- name of association!
  }

  fun addInstruments(insts : Set[Instrument]) 
    pre insts.size() <= 10
    pre forall i : insts . i !isin instrument
  {
    instrument := instrument union insts
  }

  fun isInstrumentAdded(instr : Instrument) : Bool {
    instr isin instrument 
  }  
}

assoc SpacecraftInstrument {
  source spacecraft : Spacecraft
  target part instrument: Instrument[1,10]
}

========
Library:
========

-- The normal way:

class StateMachine {
  states : Set[Int]
  transitions : Set[Int * String * Int]
}

class Pyro extends StateMachine {
  req states = Set{1,2,3}

  req transitions = Set{
   Tuple(1,"on",2),
   Tuple(2,"fire",3),
   Tuple(3,"off",1)
  }  
}

-- Using user-defined keywords:

class <statemachine> StateMachine {
  states : Set[Int]
  transitions : Set[Int * String * Int]
}

statemachine Pyro {
  req states = Set{1,2,3}

  req transitions = Set{
   Tuple(1,"on",2),
   Tuple(2,"fire",3),
   Tuple(3,"off",1)
  }  
}


==========
Instances:
==========

camera1 : Camera = Camera(name="HighPixel", id=42, powerConsumption=2000, operating=true, fps=2)
camera2 : Camera = Camera(name="SharpShooter", id=3, powerConsumptino=10000, operating=false, fps=1000)
solarPanel : Instrument = Instrument(name="SP1", id=2, powerConsumption=-1000)
magnetometer : Instrument = Instrument(name="Magnetometer", id=5, powerConsumption=1500, operating=true)
battery : Battery = Battery()

clipper = Spacecraft(name="Clipper")

SpacecraftInstrument(Spacecraft=clipper, instrument=camera1)
SpacecraftInstrument(Spacecraft=clipper, instrument=camera2)
SpacecraftInstrument(Spacecraft=clipper, instrument=solarPanel)
SpacecraftInstrument(Spacecraft=clipper, instrument=magnetometer)
SpacecraftInstrument(Spacecraft=clipper, instrument=battery)

req CameraAlwaysOn: 
  exists inst : clipper.instrument . inst is Camera && inst.operating = true

req CameraAlwaysOnOCL:
  clipper.instrument.Exists(inst -> inst is Camera && inst.operating = true)
