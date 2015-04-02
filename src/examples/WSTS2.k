--WSTS modeling pattern
--simple Test script invoking TestBed


//EHA = Engineering Housekeeping and Accountability Packet
//EVR = Event Report

//Inner classes
package TestBed

class SpacecraftTB {

	
	curr_sclk : Int
	lower_sclk : Int
	//i.e TchannelID- temporal constraints
	DMX_ID : String[]
	ChannelID : Int[]


}


	



class MTAK extends TestBed {

		session_key :	Int
		user_name 	:	String
		start_time  :	Int
		sse_session :	Int
		venue_type  :	String
		MTAK_log  	:	String
		MTAK_pID	:	Int
		
}

class WSTS extends TestBed {

	

}

// make this a command?  event?
//Exit() is a command -- no time constraints on Exit
//Functioncall Exit() = Functioncall(object="TestBed",method="Exit")


		class <event> Event{
			StartTime : Int
			EndTime : Int
			duration : Int
			
			
			
			//only id if time is known
			constraint durationTime:
				duration = EndTime - StartTime
				
			fun execute ()
		}		

		class StartCMD extends Event{

		
		    command{ 
		    	TestBed.START 
			}
		
		//calling from STAKR
		fun execute(){
			command(TestBed.Start)
		}
			
			constraint startTimeConstraints:
				startTime = 2015-03-03T10:10:10.000-800
			
			
			//make sure StartCMD schedule is on time	
			duration = StartCMD.endTIme - StartCMD.StartTime
		
			@doc("")
			constraint startCMDDurationConstraint:
		    	duration <= 2
		    	
		
		}
		


//STAKR class
class TestBed {

		spacecraft	 : SpacecraftTB
		host 		 :	String
		port 		 :	Int
		configString :	String
		session_key  : Int
		user_name 	 : String
		sse_version  : Int
		venue_type 	 : MTAK.venue_type
		mtak_log 	 : MTAK.MTAK_log
		outputFile 	 : String
		chidlren	 : Seq[Int]
		MTAK_pID	 : MTAK.MTAK_pID
		channelID	 : spacecraft.channelID
		
		incr		 : Int
		output_mode	 : Seq[String]	//Verbose, Debug, or Quiet mode
		timeOut		 : Int
		send_sclk	 : Int
		
		curr_sclk	 : spacecraft.curr_sclk
		
		startTime 	 : Int
		endTime		 : Int
		duration 	 : Int
		startcommand : StartCMD
		cmd_name 	 : String
		
		//--call start command from STAKR-------------------------------------------------------------------
		//--Start STAKR session

		event StartCMD{
		
		
		
		    command{ 
		    	TestBed.START 
			}
		
		
			constraint startTimeConstraints:
				startTime = 2015-03-03T10:10:10.000-800
			
			
			//make sure StartCMD schedule is on time	
			duration = StartCMD.endTIme - StartCMD.StartTime
		
			@doc("")
			constraint startCMDDurationConstraint:
		    	duration <= 2
		    	
		
		}
		//--call SetLogFile---------------------------------------------------------------------------------
		
		event SetLogFile(fileName){
		
		startCommand : StartCMD
		fileName : String
		
			command {
		    		TestBed.SetLogFile(fileName)
			}
		
				constraint SetLogFile:
					startTime = startCommand.endTime
		
		}
		
		//--Write message to console------------------------------------------------------------------------
		
		event WriteMessageCMD(messageToBeSend, messageOutputFile){
		
		//startCommand is an instance of the class StartCMD
		startCommand : StartCMD
		messageToBeSend : String
		messageOutputFile : String
		
		
			command {
				TestBed.WriteMessageCMD(messageToBeSend, messageOutputFile)
			}
		
				constraint WriteMessageCMDscheduleTimer:
					startTime = startCommand.endTime
		
		 }
		    
		//--Send(CMDmessage)-------------------------------------------------------------------------------
		
		
		event SendCMD(CMDmessage){
		
		CMDmessage : String
		
			command {
				TestBed.Send(CMDmessage)
			}
		
				constraint SendCMDscheduleTimer:
					startTime = StartCMD.endTime		
		}
		
		//--SendSCMF(filePath)-------------------------------------------------------------------------------
		// This is a command, no constraints are required
		
		filePath: String
			
			SendSCMF(filePath).command{
				TestBed.SendSCMF(filePath)
			}
			
		
		//--EVR and EHA timelines
		//--VerifyEHA()------------------------------------------------------------------------------------
		    
		event verifyEHA(channelID,BASE){
		
		//set channelID as temporal constraint
		//channelID(t) = y
		
		
		SendCommand : Send
		channelID : SpaceCraft
		BASE = "10" //16 if HEX, default set to base 10
		
			
			//--verifyEHA("") --parameter should be ID of telemetry channel
		    
		    command{
				TestBed.VerifyEHA(channelID,BASE)
				
				if(channelID != null)
					return channelID
				else
					return 0		
			}
			
				constraint VerifyEHAscheduleTimer:
					startTime = SendCommand.endTime
		}
		
		
		//--VerifyEHACritical()------------------------------------------------------------------------------------
		
		
		event verifyEHACritical(channelID,SpacecraftTB.channelID,BASE){
			
			command{
				TestBed.verifyEHACritical(channelID,SpacecraftTB.channelID,BASE)
				
				if(channelID != null)
					return channel
				else
					TestBed.Exit()
			}
			
			constraint VerifyEHAscheduleTimer:
					startTime = SendCommand.endTime
			
		}
		
		
		//--VerifyEVR()------------------------------------------------------------------------------------
		//VerifyEVR(search_string, lower_sclk)
		
		event verifyEVR(search_string,sclk){
		
		search_string : String
		lower_sclk : SpacecraftTestBed
		
			command{
				TestBed.VerifyEVR(search_string,sclk)
			}
		
				constraint VerifyEHAscheduleTimer:
					startTime = SendCMD.endTime
					
				constraint VerifyEHAscheduleTimer2:
					startTime = WriteMessageCMD.endTime
					
		}
		
		//--VerifyEVRCritical()------------------------------------------------------------------------------------
		
		event verifyEVRCritical(search_string,sclk){
		
		//writeMessageCommand is an instance of the class WriteMessageCMD
		writeMessageCommand : WriteMessageCMD
		search_string : String
		lower_sclk : SpacecraftTestBed
		
			command{
				TestBed.VerifyEVRCritical(search_string,sclk)
			}
			
			constraint emptySearchString:
				search_string != null

				
			constraint VerifyEHAscheduleTimer:
				startTime = SendCMD.endTime
					
			constraint VerifyEHAscheduleTimer2:
				startTime = WriteMessageCMD.endTime
				
		
		}
		
		
		
		//--VerifyComplete(cmd_name, lower_sclk = send_sclk)-----------------------------------------------------------------
		
		event verifyComplete(cmd_name, lower_sclk = send_sclk){
			
			command{
				if(cmd_name == verifyEVR(cmd_name,send_sclk)){
					TestBed.Pause()
					return verifyEVR(cmd_name)
				}
				else 
					return 0
			}	
			
			constraint verifyCompleteBTimer:
				startTime = verifyEVR.endTime + incr
		}
		
		
		//--VerifyCompleteBackground(cmd_name,lower_sclk = send_sclk)-----------------------------------------------------------------
		
		event verifyCompleteBackground(cmd_name,lower_sclk){
		
			command{
				if(cmd_name == verifyEVR(cmd_name,send_sclk)){
					return verifyEVR(cmd_name)
				}
				else 
					return 0
				
			}
			
			constraint verifyCompleteBTimer:
				startTime = verifyEVR.endTime + incr
		
		}
		
		//--VerifyCompleteCritical(cmd_name,lower_sclk)-----------------------------------------------------------------
		
		event verifyCompleteCritical(cmd_name,lower_sclk){
		
			command{
				if(cmd_name == verifyEVR(cmd_name,send_sclk)){
					TestBed.Pause()
					return verifyEVR(cmd_name)
				}
				else 
					TestBed.Exit()
				
			}
			
			constraint verifyCompleteCriticalTimer:
				startTime = verifyEVR.endTime + incr
		
		}
		
		
		//--VerifyDP()------------------------------------------------------------------------------------
		
		event verifyDP(apID,args){
		
		apID : String
		args : String[]
		//args : data structure or array, where contents of file with the ID "apID" are stored 
			
			command{
				TestBed.verifyDP(apID,args)
			}
			
			constraint fileExist:
				apID.isEmpty() ==  false	
	
		}
		
		//--DisplaySessionInfo()------------------------------------------------------------------------------------
		
		event DisplaySessionInfo(){
		
			session_key :	MTAK
			user_name :		MTAK
			start_time :	MTAK
			sse_session :	MTAK
			
			startCommand : StartCMD
				
				constraint DisplaySessionInfoTimer:
					startTime = startCommand.endTime
		
		}
		
		//--SetMode(mode)------------------------------------------------------------------------------------
		
		event SetMode(output_mode){
		
		//output file type
		mode : String[]
		mode[0] := "Quiet"
		mode[1] := "Q"
		mode[2] := "Verbose"
		mode[3] := "Debug"
		
			constraint ModeHasChanged:
				output_mode = !output_mode~
			
		}		
		
		
		//--SetTimeOut(num)------------------------------------------------------------------------------------
		
		num : Int
		
			SetTimeOut(num).command{
				TestBed.SetTimeOut(num)
			}
		
			constraint EHATimeout:
				startTime = VerifyEHA.endTime + num
			
			constraint EVRTimeout:
				startTime = VerifyEVR.endTime + num
		
		
		//--SetidityChecks(mode)------------------------------------------------------------------------------------	
		
		mode : String[]
		//mode[0] := "ON"
		//mode[1] := "OFF"
			
		event SetidityChecks(mode){
			if(SetidityChecks(mode))
				return true
			else
				return false
		}
		
		//--Pause()------------------------------------------------------------------------------------	
		
		command{
			TestBed.Pause()
		}
		
			//needs work
			constraint PauseUntilEnter:
				Pause.endTime = KeyboardInput
		
		//--Print()------------------------------------------------------------------------------------
		
		msg : String
	
		Print(msg,outputFile).command{
			
			if(Print(msg,outputFile))
				return true
			else
				return false
		}

		//--SignOff(file)------------------------------------------------------------------------------------
		
		
		
		SignOff(outputFile).command{
			if(SignOff(outputFile))
				return true
			else
				return false
		}



}


	




	
	

