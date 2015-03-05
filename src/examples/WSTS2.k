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

		event StartCMD{
		
			
		    command{ 
		    	STAKR.rb.START; 
			}
		
		
			constraint startTimeConstraints:
				startTime = 2015-03-03T10:10:10.000-800;
			
			
			//make sure StartCMD schedule is on time	
		
			constraint startCMDDurationConstraint:
		    	duration = 5s;
		    	
		    constraints EndTime:
		    	EndTime = startTime + duration;
		
		}
		//--call SetLogFile---------------------------------------------------------------------------------
		
		event SetLogFile(fileName){
		
		fileName = "D-65303Log.txt";
		
			command {
		    	STAKR.rb.SetLogFile(fileName);
			}
		
				constraint SetLogFile:
					startTime > StartCMD.endTime;
		
		}
		
		//--Write message to console------------------------------------------------------------------------
		
		event WriteMessageCMD(messageToBeSend, messageOutputFile){
		
		messageToBeSend : String;
		messageOutputFile : String;
		
		
			command {
				STAKR.rb.Write(messageToBeSend, messageOutputFile);
			}
		
				constraint WriteMessageCMDscheduleTimer:
					startTime > StartCMD.endTime;
		
		 }
		    
		//--Send(CMDmessage)-------------------------------------------------------------------------------
		
		event SendCMD(CMDmessage){
		
		CMDmessage : String;
		
			command {
				STAKR.rb.Send(CMDmessage);
			}
		
				constraint SendCMDscheduleTimer:
					startTime > StartCMD.endTime;		
		}
		
		    
		//--EVR and EHA timelines
		
		//--VerifyEHA()------------------------------------------------------------------------------------
		    
		event verifyEHA(channelID,BASE){
		
		channelID : String[];
		BASE = "10"; //16 if HEX, default set to base 10
		
			
			//--verifyEHA("") --parameter should be ID of telemetry channel
		    
		    command{
				STAKR.rb.VerifyEHA(channelID,BASE);
			}
			
				constraint VerifyEHAscheduleTimer:
					startTime > SendCMD.endTime;
		}
		
		//--VerifyEVR()------------------------------------------------------------------------------------
		//VerifyEVR(search_string = “”, lower_sclk = “0”)
		
		event verifyEVR(search_string,sclk){
		
		search_string : String;
		lower_sclk : Double;
		
			command{
				STAKR.rb.VerifyEVR(search_string,sclk);
			}
		
				constraint VerifyEHAscheduleTimer:
					startTime > SendCMD.endTime;
					
				constraint VerifyEHAscheduleTimer2:
					startTime > WriteMessageCMD.endTime;
		}
		
		//--VerifyDP()------------------------------------------------------------------------------------
		
		event verifyDP(apID,args){
		
		apID : String;
		//args : data structure or array, where contents of file with the ID "apID" are stored 
			command{
				STAKR.rb.verifyDP(apID,args);
			}
			
				constraint VerifyapID:
					apID != null;
		}
				
}


	




	
	

