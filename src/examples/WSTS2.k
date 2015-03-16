--WSTS modeling pattern
--simple Test script invoking TestBed


//EHA = Engineering Housekeeping and Accountability Packet
//EVR = Event Report


class SpacecraftTestBed {

	
	val curr_sclk : Int;
	val lower_sclk : Int;
	//i.e TchannelID- temporal constraints
	var DMX_ID : String[];
	var ChannelID : Int[];


}



class MTAK extends TestBed {

		val session_key :	Int;
		val user_name :		String;
		val start_time :	Int;
		val sse_session :	Int;
		
}

class WSTS extends TestBed {

	

}

// make this a command?  event?
//Exit() is a command -- no time constraints on Exit
//val Functioncall Exit() = Functioncall(object="TestBed",method="Exit");




//STAKR class
class TestBed {

		val host :	Var;
		val port :	Var;
		val configString :	String;
		val startTime : Int;
		val startcommand : StartCMD;
		
		//--call start command from STAKR-------------------------------------------------------------------
		//--Start STAKR session

		event StartCMD{
		
			
		    command{ 
		    	TestBed.START; 
			}
		
		
			constraint startTimeConstraints:
				startTime = 2015-03-03T10:10:10.000-800;
			
			
			//make sure StartCMD schedule is on time	
		
			constraint startCMDDurationConstraint:
		    	duration = 2s;
		    	
		
		}
		//--call SetLogFile---------------------------------------------------------------------------------
		
		event SetLogFile(fileName){
		
		var startCommand : StartCMD;
		fileName : String;
		
			command {
		    		TestBed.SetLogFile(fileName);
			}
		
				constraint SetLogFile:
					startTime = startCommand.endTime;
		
		}
		
		//--Write message to console------------------------------------------------------------------------
		
		event WriteMessageCMD(messageToBeSend, messageOutputFile){
		
		//startCommand is an instance of the class StartCMD
		var startCommand : StartCMD;
		messageToBeSend : String;
		messageOutputFile : String;
		
		
			command {
				TestBed.Write(messageToBeSend, messageOutputFile);
			}
		
				constraint WriteMessageCMDscheduleTimer:
					startTime = startCommand.endTime;
		
		 }
		    
		//--Send(CMDmessage)-------------------------------------------------------------------------------
		
		
		event SendCMD(CMDmessage){
		
		CMDmessage : String;
		
			command {
				TestBed.Send(CMDmessage);
			}
		
				constraint SendCMDscheduleTimer:
					startTime = StartCMD.endTime;		
		}
		
		//--SendSCMF(filePath)-------------------------------------------------------------------------------
		// This is a command, no constraints are required
		
		filePath: String;
			
			SendSCMF(filePath).command{
				Stakr.rb.SendSCMF(filePath);
			}
			
		
		//--EVR and EHA timelines
		//--VerifyEHA()------------------------------------------------------------------------------------
		    
		event verifyEHA(channelID,BASE){
		
		//set channelID as temporal constraint
		//channelID(t) = y
		
		
		var SendCommand : Send;
		channelID : SpaceCraft;
		BASE = "10"; //16 if HEX, default set to base 10
		
			
			//--verifyEHA("") --parameter should be ID of telemetry channel
		    
		    command{
				TestBed.VerifyEHA(channelID,BASE);
			}
			
				constraint VerifyEHAscheduleTimer:
					startTime = SendCommand.endTime;
		}
		
		//--VerifyEVR()------------------------------------------------------------------------------------
		//VerifyEVR(search_string, lower_sclk)
		
		event verifyEVR(search_string,sclk){
		
		search_string : String;
		lower_sclk : SpacecraftTestBed;
		
			command{
				TestBed.VerifyEVR(search_string,sclk);
			}
		
				constraint VerifyEHAscheduleTimer:
					startTime = SendCMD.endTime;
					
				constraint VerifyEHAscheduleTimer2:
					startTime = WriteMessageCMD.endTime;
					
		}
		
		//--VerifyEVRCritical()------------------------------------------------------------------------------------
		
		event verifyEVRCritical(search_string,sclk){
		
		//writeMessageCommand is an instance of the class WriteMessageCMD
		writeMessageCommand : WriteMessageCMD;
		search_string : String;
		lower_sclk : SpacecraftTestBed;
		
			command{
				TestBed.VerifyEVRCritical(search_string,sclk);
			}
			
			constraint emptySearchString:
				search_string != null;
				Exit();
				
			constraint VerifyEHAscheduleTimer:
				startTime = SendCMD.endTime;
					
			constraint VerifyEHAscheduleTimer2:
				startTime = WriteMessageCMD.endTime;
				
		
		}
		
		//--VerifyDP()------------------------------------------------------------------------------------
		
		event verifyDP(apID,args){
		
		apID : String;
		args : String[];
		//args : data structure or array, where contents of file with the ID "apID" are stored 
			
			command{
				TestBed.verifyDP(apID,args);
			}
			
			constraint fileExist:
				apID.isEmpty() ==  false;	
	
		}
		
		//--DisplaySessionInfo()------------------------------------------------------------------------------------
		
		event DisplaySessionInfo(){
		
			var session_key :	MTAK;
			var user_name :		MTAK;
			var start_time :	MTAK;
			var sse_session :	MTAK;
			
			var startCommand : StartCMD;
				
				constraint DisplaySessionInfoTimer:
					startTime = startCommand.endTime;
		
		}
		
		//--SetMode(mode)------------------------------------------------------------------------------------
		
		event SetMode(mode){
		
		//output file type
		var mode : String[];
		val mode[0] := "Quiet";
		val mode[1] := "Q";
		val mode[2] := "Verbose";
		val mode[3] := "Debug";
		
			constraint ModeHasChanged:
				mode[endTime] != mode[startTime];
			
		}		
		
		
		
			
		
		
		
				
}


	




	
	

