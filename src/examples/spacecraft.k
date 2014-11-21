package nasa.jpl.spacecraft

import nasa.jpl.instruments.*
import nasa.jpl.power

type goodCamera = {|x:Int . x > 30 && x < 120|};

=================
Space Craft Model
-----------------

class Instrument {
    var name : String = "hello"; 
    var Id : Int;
    var angle : goodCamera;
    var powerLevel : Real;
    var b : Boolean = false; 
    angle := 0;
    powerLevel := 1000;
    --  + 1
    req Id > 1
};

class SpaceCraft {
    var instruments : [Instrument];

    fun changeInstrument(instrument:Instrument) : Void { 
      instrument.Id := 42
    };
    
    fun rotateCamera(instrument:Instrument, angle:Int) : Int { 
      instrument.rotate(angle)
    };

    fun compare(id1:Int, id2:Int) : Bool {
        id1 = id2 or id1 eq id2
    };

    fun ProcessAction1() : Void {
        var steps : Integer = 0;
        -- do something
        steps := steps + 1;
	steps := steps + 1;
        steps := steps + 1
    };

    req RequirementInstrumentsCount : 
        instruments.count > 0 && 
        (forall i,j:instruments . i.Id != j.Id) &&
        (forall i,j:instruments . i.Id not eq j.Id) and
        (forall i:instruments,j:instruments . !compare(i.Id, j.Id)) &&
        (forall i:instruments,j:instruments . not compare(i.Id, j.Id))
};

-- an association between a spacecraft and some instruments.
-- only a maximum of 10 instruments are allowed. 
-- each instrument has to be unique. 
assoc SpacecraftInstrumentsAssociation {
    part Spacecraft : SpaceCraft;
    part instruments: Instrument 1 .. 10;
};

assoc TestAssociation{
    ref Spacecraft : SpaceCraft;
    part instruments: Instrument 1 .. 10;
    var ints : {Int};
};

-- setup some instruments
var Camera : Instrument = Instrument(name="Camera1");
var Camera2 : Instrument = Instrument(Id=3);
var SolarPanel : Instrument = Instrument(name="SolarPanel1", Id=2, powerLevel=~100);
var BackupSolarPanel : Instrument = Instrument(name="SolarPanel12", Id=3);

-- create clipper spacecraft object
var Clipper: SpaceCraft;

-- add instruments to spacecraft
Clipper.instruments.add(Camera);
Clipper.instruments.add(SolarPanel);

Clipper.changeInstrument(SolarPanel);

Clipper.rotateCamera(Camera, 45);

100*45;

-- ensure angle of the camera stays within field of view
req  Camera.angle > 300 && Camera.angle < 120;

-- ensure that solar panels are different
req SolarPanel != BackupSolarPanel;

val x;

val 1;

val 111 = 234234234234234