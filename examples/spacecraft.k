package nasa.jpl.spacecraft

type goodCamera = {|x:Int . x > 30 && x < 120|};

=================
Space Craft Model
-----------------

class Instrument {
    var name : String; 
    var Id : Int;
    var angle : goodCamera;
    var powerLevel : Real;

    angle := 0;
    powerLevel := 100;
    --  + 1
 
    req {
	Id > 1
    }
}

class SpaceCraft {
    var instruments : [Instrument] = a.p;

    def changeInstrument(instrument:Instrument) : Void { 
      instrument.Id := 42;
    }
    
    def rotateCamera(instrument:Instrument, angle:Int) : Int { 
      instrument.rotate(angle);
    }

    def compare(id1:Int, id2:Int) : Bool {
        id1 = id2 or id1 eq id2;
    }

    def ProcessAction1() : Void {
        var steps : Integer = 0;
        -- do something
        steps := steps + 1;
	steps := steps + 1;
        steps := steps + 1;
    }

    req {
        instruments.count > 0 && 
        (forall i,j:instruments . i.Id != j.Id) &&
        (forall i,j:instruments . i.Id not eq j.Id) &&
        (forall i:instruments,j:instruments . !compare(i.Id, j.Id)) &&
        (forall i:instruments,j:instruments . not compare(i.Id, j.Id))
    }
}


-- setup some instruments
var Camera : Instrument = create Instrument(name:"Camera");
var Camera2 : Instrument = create Instrument(Id:3);
var SolarPanel : Instrument = create Instrument(name:"SolarPanel", Id:2, powerLevel: -100);
var BackupSolarPanel : Instrument = create Instrument(name:"SolarPanel", Id:3);

-- create clipper spacecraft object
var Clipper: SpaceCraft;

-- add instruments to spacecraft
Clipper.instruments.add(Camera)
Clipper.instruments.add(SolarPanel)

Clipper.changeInstrument(SolarPanel)

Clipper.rotateCamera(Camera, 45);

-- ensure angle of the camera stays within field of view
req{
  Camera.angle > 30 && Camera.angle < 120
}

-- ensure that solar panels are different
req{
  SolarPanel != BackupSolarPanel
}
