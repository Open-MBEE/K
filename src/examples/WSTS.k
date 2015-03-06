--WSTS modeling pattern
--simple Test script invoking STAKR.rb

//val DurativeEvent = DurativeEvent(name="StringName"); 
//val Timepoint startTime = Timepoint(name="StartTime",value="this");
//val Duration duration = Duration("this");
//val Timepoint endTime = Timepoint(name="EndTime",value="this");

val Functioncall Exit() = Functioncall(object="STAKR.rb",method="Exit");


--call start command from STAKR
--Start STAKR session

val StartCMD : DurativeEvent("StartCMD");

StartCMD.command = Functioncall(object="STAKR.rb",method="START");


val Functioncall SetLogFile = Functioncall(object="STAKR.rb",method="SetLogFile");
	SetLogFile(filename="D-65303Log.txt");


--Write message to console

val Functioncall WriteMsg = Functioncall(object="STAKR.rb",method="Write");
	WriteMsg(text="Session Info");

--Start() startTime

req startTimeConstraints:
	StartCMD.startTime = Timepoint("2015-03-03T10:10:10.000-800"); // ???
	
	
--make sure StartCMD schedule is on time	

// no constraint -- WSTS will tell us what it was
//req startCMDDurationConstraint:
//    StartCMD.duration = 5; // seconds


--EVR and EHA timelines
class EVR {
    channels : String[]
}

val EVR : TimeVaryingMap

--Write message to console

val Functioncall WriteMsg = Functioncall(object="STAKR.rb",method="Write");
	WriteMsg(text="Initializing test... ");


--Write message to console

val Functioncall WriteMsg = Functioncall(object="STAKR.rb",method="Write");
	WriteMsg(text="Verifying baseline settings");


--time for VerifyEHA() occurs after endTime for Start(), verify.StartTime > Start().EndTime

req VerifyEHAscheduleTimer:
	VerifyEHA.startTime > StartCMD.endTime;
	
--send VerifyEHA command
val Functioncall Send = Functioncall(object="STAKR.rb",method="Send");
	Send(val="VerifyEHA");


--VerifyEHA()

val Functioncall VerifyEHA = Functioncall(object="STAKR.rb",method="VerifyEHA");
val DMX0001 = VerifyEHA(val="DMX_0001==DSDT");
val DMX0002 = VerifyEHA(val="DMX_0002==50000");
val DMX0301 = VerifyEHA(val="DMX_0301");
val DMX0302 = VerifyEHA(val="DMX_0302");
val DMX1527 = VerifyEHA(val="DMX_1527==0");
val DMX1501 = VerifyEHA(val="DMX_1501");
val DMX1502 = VerifyEHA(val="DMX_1502");
val DMX1503 = VerifyEHA(val="DMX_1503");
val DMX1504 = VerifyEHA(val="DMX_1504");
val DMX1505 = VerifyEHA(val="DMX_1505");

val Functioncall WriteMsg = Functioncall(object="STAKR.rb",method="Write");
	WriteMsg(text="Ring buffer count at Initializing verified");
	
val Dmx0400 = VerifyEHACritical("DMX-0400==FLOWING"); 
val Dmx0402 = VerifyEHACritical("DMX-0402==0");
val Dmx0403 = VerifyEHACritical("DMX-0403==0") ;
val Dmx0401 = VerifyEHACritical("DMX-0401"); 
val Dmx1507 = VerifyEHACritical("DMX-1507==0");
val Dmx1508 = VerifyEHACritical("DMX-1508");


--check baseline constraint
--do nothing if signal is verified

req baselineCond:
	Dmx1508 == Dmx0401;

if Dmx1508 == Dmx0401
	;
	WriteMsg(text="EVR_FATAL statistics verified");
else 
	WriteMsg(text="EVR_FATAL statistics fail");
	Exit();
	
req VerifyTimeConstraints:
	Timepoint.sum(VerifyEHA.startTime,VerifyEHA.duration) = VerifyEHA.endTime;



--time constraints for the entire test procedure

req timeConstraints:
	Timepoint.sum(startTime,duration) = endTime;
	




	
	

