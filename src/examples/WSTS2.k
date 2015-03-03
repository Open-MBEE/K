--WSTS modeling pattern
--simple Test script invoking STAKR.rb


//EHA = Engineering Housekeeping and Accountability Packet
//EVR = Event Report


class Spacecraft {
}



class WSTS extends TestBed {
}

// make this a command?  event?
//Exit() is a command -- no time constraints on Exit
//val Functioncall Exit() = Functioncall(object="STAKR.rb",method="Exit");

class TestBed {


		//--call start command from STAKR-------------------------------------------------------------------
		//--Start STAKR session

		event StartCMD;
		
			StartCMD.command {
		    	STAKR.rb.START;
			}
		
		
			constraint startTimeConstraints:
				StartCMD.startTime = 2015-03-03T10:10:10.000-800;
			
			
			//make sure StartCMD schedule is on time	
		
			constraint startCMDDurationConstraint:
		    	StartCMD.duration = 5s;
		
		
		//--call SetLogFile---------------------------------------------------------------------------------
		
		event SetLogFile;
		
		fileName = "D-65303Log.txt";
		
			SetLogFile.command {
		    	STAKR.rb.SetLogFile(fileName);
			}
		
				constraint SetLogFile:
					SetLogFile.startTime > StartCMD.endTime;
		
		
		//--Write message to console------------------------------------------------------------------------
		
		event WriteMessageCMD();
		
		messageToBeSend : String;
		messageOutputFile : String;
		
		
			WriteMessageCMD(messageToBeSend, messageOutputFile).command {
				STAKR.rb.Write(messageToBeSend, messageOutputFile);
			}
		
				constraint WriteMessageCMDscheduleTimer:
					WriteMessageCMD.startTime > StartCMD.endTime;
		
		    
		    
		//--Send(CMDmessage)-------------------------------------------------------------------------------
		
		event SendCMD();
		
		CMDmessage : String;
		
			SendCMD(CMDmessage).command {
				STAKR.rb.Send(CMDmessage);
			}
		
				constraint SendCMDscheduleTimer:
					SendCMD.startTime > StartCMD.endTime;
		
		
		
		
		    
		//--EVR and EHA timelines
		
		//--VerifyEHA()------------------------------------------------------------------------------------
		    
		event verifyEHA();
		
		channelID : String[];
		BASE = "10"; //16 if HEX, default set to base 10
		
			
			//--verifyEHA("") --parameter should be ID of telemetry channel
		    verifyEHA(channelID,BASE).command{
				STAKR.rb.VerifyEHA(channelID,BASE);
			}
			
				constraint VerifyEHAscheduleTimer:
					verifyEHA.startTime > SendCMD.endTime;
		
		
		//--VerifyEVR()------------------------------------------------------------------------------------
		//VerifyEVR(search_string = “”, lower_sclk = “0”)
		
		event verifyEVR();
		
		search_string : String;
		lower_sclk : Double;
		
			verifyEVR(search_string,sclk).command{
				STAKR.rb.VerifyEVR(search_string,sclk);
			}
		
				constraint VerifyEHAscheduleTimer:
					verifyEVR.startTime > SendCMD.endTime;
					
				constraint VerifyEHAscheduleTimer2:
					verifyEVR.startTime > WriteMessageCMD.endTime;

}


	




	
	

