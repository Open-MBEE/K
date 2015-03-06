package nasa.jpl.spacecraft

==================
Space Craft Model
==================

class Util {

  fun binarySearch (l : Seq[Int], x:Int) : (Bool*String) 
  -- specify that the list should be sorted
    pre forall i : Int . 
          forall j : Int .
            i >= 0 && j >= 0 && 
            i < l.size() && 
            j > i && j < l.size() => l.at(i) < l.at(j)
    post $.1 = true => x isin l
  {
    r : Int = rand()
    mid : Int = l.size()/2

    if l.size() = 0 then return false

    -- poor mans sleep
    while true do {
      temp : Bool
      temp := r % 47
      if temp then break
      r := rand()
    }
    

    if l.at(mid) = x then {
      println("I found it!")
      return Tuple(true, x.toString())
    }
    else {
      if l.at(mid) < x then 
        return binarySearch(l.subList(mid+1, l.size()), x)
      else 
        return binarySearch(l.subList(0, mid-1), x)
    }
  }

  
}

class Instrument {
   name : String 
   id : Int
   powerConsumption : Real = 1000 -- Wh
   weight : Real -- Grams
   currentPowerConsumption : Real -- Wh
   operating : Boolean = false 
    
    -- toggle the operating state of the instrument
    -- update the power consumption
    fun toggleOperating {
      operating := !operating
      if !operating then 
        currentPowerConsumption := 0
      else
        currentPowerConsumption := powerConsumption
    }

    req OperatingPower: 
      !operating implies currentPowerConsumption = 0 &&
      operating implies currentPowerConsumption = powerConsumption

    req idId: id >= 0
}

class Camera extends Instrument {
   fps : Int
}

class AngularVector {
   angle1 : Real
   angle2 : Real
   angle3 : Real
}

class Attitude {
   angularPosition : AngularVector
   speed : Real
   acceleration : Real
   distanceToEarth : unit -> Real
}

class Battery {}

-- connector

assoc BatteryInstrument {
  bat : Battery
  inst : Instrument [0,*]
}

class Spacecraft {
   name : String
   attitude : Attitude

  req EarthSafeDistance:
    attitude.distanceToEarth > 50000 &&
    attitude.distanceToEarth < 350000

  req notTooHeavy:
    instrument.collect(i -> i.weight).sum() <= maxWeight

}

-- an association between a spacecraft and some instruments.
-- only a maximum of 10 instruments are allowed. 
-- each instrument has to be unique. 

assoc SpacecraftInstrument {
    spacecraft : Spacecraft
    part instrument: Instrument[1,10]
}

-- create some instruments
Camera1 : Camera = Instrument(name="HighPixel", id=42, powerConsumption=2000, operating=true, fps=2)
Camera2 : Camera = Instrument(name="SharpShooter", id=3, powerConsumptino=10000, operating=false, fps=1000)
SolarPanel : Instrument = Instrument(name="SP1", id=2, powerConsumption=~1000)
Magnetometer : Instrument = Instrument(name="Magnetometer", id=5, powerConsumption=1500, operating=true)
Battery : Instrument = Instrument(name="Battery", id=11, powerConsumption=~100000, operating=true)

-- create clipper spacecraft object
Clipper = Spacecraft(name="Clipper")

-- add instruments to spacecraft

SpacecraftInstrument(Spacecraft=Clipper, instrument=Camera1)
SpacecraftInstrument(Spacecraft=Clipper, instrument=Camera2)
SpacecraftInstrument(Spacecraft=Clipper, instrument=SolarPanel)
SpacecraftInstrument(Spacecraft=Clipper, instrument=Magnetometer)

-- add another requirement that one camera is always turned on in Clipper
req CameraAlwaysOn: 
   exists inst : Clipper.instrument . inst is Camera && inst.operating = true

-- the same constraint written as one would write it in OCL (using a library)
req CameraAlwaysOnOCL:
  Clipper.instrument.Exists(inst -> inst is Camera && inst.operating = true)

================================
Instantiation as in programming:
================================

class SpaceCraft {
   name : String
}

clipper = SpaceCraft(name="Clipper")
msl = SpaceCraft(name="msl")

================================
Instantiation using inheritance:
================================

class SpaceCraft {
   name : String
   weight : Real
}

class Clipper extends SpaceCraft {
  name = "clipper"
}

class MSL extends SpaceCraft {
  name = "msl"
}

