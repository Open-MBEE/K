package nasa.jpl.spacecraft

import nasa.jpl.physics
import nasa.jpl.europa.trajectory

==============
Annotations
==============

// Requirements:
// 1. Be able to define them in named groups
//    - Define them as classes extending a class Annnotation.
// 2. Benefit from inheritance
//    - We get that for free if doing the above
// 3. Be able to associate them with certain positions in models
//    - Defining a field  (perhaps different keyword than req) axiom? 
// 4. Be able to redefine names of positions (keywords such as val and fun).
//    - This one is harder.

annotation ModelElement {
  axiom location = Set("class","val","fun")

  name : String 
  id : String 
  doc : String 
  owner : String 
  url : String 
}

annotation Property {
  navigable : Bool
}

==================
Space Craft Model
==================

@name("InstrumentClass")
@id("_GHSZ3432")
@doc("This class describes the basic instrument for a spacecraft.")

class Instrument {
  name : String
  id : Int
  @owner("Rahul")
  powerConsumption : Real = 1000 
  @owner("Bjorn")
  weight : Real
  currentPowerConsumption : Real 
  operating : Boolean = false 
    
  fun toggleOperating 
    post(operating = !operating~)
  {
    operating := !operating
    if !operating then 
      currentPowerConsumption := 0
    else
      currentPowerConsumption := powerConsumption
  }

  @name("OperatingPowerOfInstrument")
  @doc("The current power consumption of an instrument should either be 0, 
        when it is turned off, or if it is on,
        it should be what the operating power is specified to be.")
  req OperatingPower: 
    (!(operating = 1)=> currentPowerConsumption = 0) &&
      ((operating = 1)=> currentPowerConsumption = powerConsumption)

  req idId: id >= 0
  
  req OperatingPower1:
      currentPowerConsumption = powerConsumption
}

@name("BasicCameraInstrument")
@id("_fgds2345234")
@doc("This is the basic camera for a spacecraft")
class Camera extends Instrument {
  fps : Int
}

class Battery {}

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
  target inst : Instrument [*] -- Set[Instrument] ? 
}

class Spacecraft {
  name : String
  attitude : Attitude
  weight : Real
  maxWeight : Real = 1000

  --req EarthSafeDistance:
    --attitude.distanceToEarth > 50000 &&
    --attitude.distanceToEarth < 350000

  --req notTooHeavy: totalWeight() <= maxWeight

  fun totalWeight : Real {
    instrument.collect(i -> i.weight).sum()
  }

  fun getInstrumentsNameWeight : Seq[String * Real] 
    post $result.length() = instrument.size()
  {
    instrument.collect(i -> Tuple(i.name, i.weight)).toSeq()
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


==============
Instances
==============
camera1 : Camera = Camera(name="HighPixel", id=42, powerConsumption=2000, operating=true, fps=2)
camera2 : Camera = Camera(name="SharpShooter", id=3, powerConsumptino=10000, operating=false, fps=1000)
solarPanel : Instrument = Instrument(name="SP1", id=2, powerConsumption=-1000)
magnetometer : Instrument = Instrument(name="Magnetometer", id=5, powerConsumption=1500, operating=true)
battery : Battery = Battery()

clipper = Spacecraft(name="Clipper")

SpacecraftInstrument(Spacecraft::clipper, instrument::camera1)
SpacecraftInstrument(Spacecraft=clipper, instrument=camera2)
SpacecraftInstrument(Spacecraft=clipper, instrument=solarPanel)
SpacecraftInstrument(Spacecraft=clipper, instrument=magnetometer)
SpacecraftInstrument(Spacecraft=clipper, instrument=battery)

req CameraAlwaysOn: 
  exists inst : Clipper.instrument . inst is Camera && inst.operating = true

req CameraAlwaysOnOCL:
  Clipper.instrument.Exists(inst -> inst is Camera && inst.operating = true)

