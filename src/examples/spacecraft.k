package nasa.jpl.spacecraft

-- Should package contents be in {..}?

=================
Space Craft Model
-----------------

class Instrument {
    val name : String; 
    val id : Int;
    val powerConsumption : Real = 1000; -- Wh
    val weight : Real; -- Grams
    var currentPowerConsumption : Real; -- Wh
    var operating : Boolean = false; 
    
    -- toggle the operating state of the instrument
    -- update the power consumption
    fun toggleOperating() {
      operating := !operating;
      if not operating then 
        currentPowerConsumption := 0;
      else
        currentPowerConsumption := powerConsumption;
    }

    req OperatingPower: 
      !operating implies currentPowerConsumption = 0 &&
      operating implies currentPowerConsumption = powerConsumption;

    req ValidId: id >= 0;
};

class Camera extends Instrument {
  val fps : Int;
}

class AngularVector {
  var angle1 : Real;
  var angle2 : Real;
  var angle3 : Real;
};

class Attitude {
  var angularPosition : AngularVector;
  var speed : Real;
  var acceleration : Real;
  val distanceToEarth : unit -> Real;
};

class Battery {
};
-- connector
assoc BatteryInstrument{
  ref bat : Battery;
  ref inst : Instrument 0..*;
};

class Spacecraft {
  val name : String;
  val attitude : Attitude;

  req EarthSafeDistance:
    attitude.distanceToEarth > 50000 &&
    attitude.distanceToEarth < 350000;

  req notTooHeavy:
    instrument.collect(i -> i.weight).sum() <= maxWeight;

  -- the battery on the spacecraft can be connected to upto
  -- 10 instruments.
  connector BatInst (bat, inst 1..10) : BatteryInstrument;
};

-- an association between a spacecraft and some instruments.
-- only a maximum of 10 instruments are allowed. 
-- each instrument has to be unique. 

assoc SpacecraftInstrument {
    ref spacecraft : Spacecraft;
    part instrument: Instrument 1 .. 10;
};

-- create some instruments
var Camera1 : Camera = Instrument(name="HighPixel", id=42, powerConsumption=2000, operating=true, fps=2);
var Camera2 : Camera = Instrument(name="SharpShooter", id=3, powerConsumptino=10000, operating=false, fps=1000);
var SolarPanel : Instrument = Instrument(name="SP1", id=2, powerConsumption=~1000);
var Magnetometer : Instrument = Instrument(name="Magnetometer", id=5, powerConsumption=1500, operating=true);
var Battery : Instrument = Instrument(name="Battery", id=11, powerConsumption=-100000, operating=true);

-- create clipper spacecraft object
var Clipper = Spacecraft(name="Clipper");

-- add instruments to spacecraft

SpacecraftInstrument(Spacecraft=Clipper, instrument=Camera1);
SpacecraftInstrument(Spacecraft=Clipper, instrument=Camera2);
SpacecraftInstrument(Spacecraft=Clipper, instrument=SolarPanel);
SpacecraftInstrument(Spacecraft=Clipper, instrument=Magnetometer);

-- add another requirement that one camera is always turned on in Clipper
req CameraAlwaysOn: 
   exists Clipper.instrument inst . inst is Camera && inst.operating = true;

-- the same constraint written as one would write it in OCL (using a library)
req CameraAlwaysOnOCL:
  Clipper.instrument.exists(inst => inst is Camera && inst.operating = true);

-- view on a class definition
view SpacecraftFields {
  var fieldType : [(String,String)];
};

viewpoint SpacecraftView(): SpacecraftFields {
  var sf : SpacecraftFields = SpacecraftFields()
  for (f in Reflection.fields(Spacecraft)) do 
    sf.fields += (f.name, f.type);
  end
  sf
}

-- view on an instance not using keyword
class MassRollupView extends View {
  var nameWeight : [(String,Real)];
  var total : Real;
};

fun MassRollup (s : Spacecraft) : MassRollupView {
    val retVal : MassRollupView = MassRollupView();

    for (i in s.instrument) do
      retVal.nameWeight += (i.name, i.weight);
      retVal.total += i.weight;
    end
    
    retVal
}

val clipperMassRollup : MassRollupView = MassRollup(Clipper);

================================
Instantiation as in programming:
--------------------------------

class SpaceCraft {
  val name : String
}

var clipper = SpaceCraft(name="Clipper")
var msl = SpaceCraft(name="msl")

================================
Instantiation using inheritance:
--------------------------------

class SpaceCraft {
  val name : String
  val weight : Real
}

class Clipper extends SpaceCraft {
  name = "clipper"
}

class MSL extends SpaceCraft {
  name = "msl"
}

===========================
Instantiation using hybrid:
--------------------------

class SpaceCraft {
  val name : String
  val weight : Real
}

instance Clipper extends SpaceCraft {
  name = "clipper"
}

instance MSL extends SpaceCraft {
  name = "msl"
}


