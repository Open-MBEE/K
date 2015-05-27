--WSTS modeling pattern
--STAKR model
--Written by Dang Le and Thirupathi Srinivasan

//EHA = Engineering Housekeeping and Accountability Packet
//EVR = Event Report


class SpacecraftTB {

	curr_sclk : Int
	lower_sclk : Int
	//i.e TchannelID- temporal constraints
	DMX_ID : String[]
	ChannelID : Int[]

}

class MTAK extends STAKR {

		session_key :	Int
		user_name 	:	String
		start_time  :	Int
		sse_session :	Int
		venue_type  :	String
		MTAK_log  	:	String
		MTAK_pID	:	Int
		
}

class WSTS extends STAKR {

	

}

// make this a command?  event?
//Exit() is a command -- no time constraints on Exit
//Functioncall Exit() = Functioncall(object="STAKR",method="Exit")


		/*

		class StartCMD extends Event{
		
		//calling from STAKR
		fun execute(){
			command(STAKR.Start)
		}
			
			constraint startTimeConstraints:
				startTime = 2015-03-03T10:10:10.000-800
			
			
			//make sure StartCMD schedule is on time	
			duration = StartCMD.endTIme - StartCMD.StartTime
		
			@doc("")
			constraint startCMDDurationConstraint:
		    	duration <= 2
		    	
		
		}
		*/

		class <event> DurativeEvent{
			StartTime : Int
			EndTime : Int
			duration : Int
			
			
			
			//only id if time is known
			constraint durationTime:
				duration = EndTime - StartTime

		}		



package STAKR {

		spacecraft	 : SpacecraftTB
		host 		 : String
		port 		 : Int
		configString : String
		session_key  : Int
		user_name 	 : String
		sse_version  : Int
		venue_type 	 : MTAK.venue_type
		mtak_log 	 : MTAK.MTAK_log
		outputFile 	 : String
		children	 : Seq[Int]
		MTAK_pID	 : MTAK.MTAK_pID
		channelID	 : spacecraft.channelID
		
		incr		 : Int
		output_mode	 : Seq[String]	//Verbose, Debug, or Quiet mode
		timeOut		 : Int
		send_sclk	 : Int
		
		curr_sclk	 : spacecraft.curr_sclk
		cmd_name 	 : String
		
		//TODO: all events have duration constraints. startTime and endTimes are specified for in DurativeEvent.java
		//startTime 	 : Int
		//endTime		 : Int
		//duration 	 : Int
		
		//TODO: need startcommand global variable now that we have one in each event class?
		startcommand : StartCMD
		
		//--call start command from STAKR-------------------------------------------------------------------
		//--Start STAKR session
		
		// CHECK: unsure if to do it this way, or to call 'STAKR.'before each command
		// s:STAKR = STAKR();
		
		event StartCMD{

			// TODO: Maybe unnecessary, since DurativeEvent.java might already have a startTime associated to the class?
			constraint startTimeConstraints:
				startTime = 2015-03-03T10:10:10.000-800
			
			//make sure StartCMD schedule is on time	
			//CHECK: no need to define constraint involving duration, endTime, and startTime as they are already defined in DurativeEvent.java
			//duration = endTime - startTime
		
			//@doc("")
			//constraint startCMDDurationConstraint:
		    	//duration <= 2 //TODO:Why is startCMD limited to 2 seconds (if those are the units)
		    	
		}
		
		//--call SetLogFile---------------------------------------------------------------------------------
		
		event SetLogFile{
		
			startCommand : StartCMD
			fileName : String
		
			constraint incrValue:
				incr = 5
			
			constraint SetLogFile:
				startTime = startCommand.endTime + incr //adding increment
		
		}
		
		//--Write message to console------------------------------------------------------------------------
		
		event WriteMessageCMD{
		
			startCommand : StartCMD
			messageToBeSent : String
			messageOutputFile : String
		
			constraint incrValue:
				incr = 6
		
			constraint WriteMessageCMDscheduleTimer:
				startTime = startCommand.endTime + incr; //adding increment
		
		 }
		    
		//--Send(CMDmessage)-------------------------------------------------------------------------------
		
		event SendCMD{
		
			CMDmessage : String
		
			constraint incrValue:
				incr = 7
				
			constraint SendCMDscheduleTimer:
				startTime = StartCMD.endTime +incr //adding increment		
		}
		
		//--SendSCMF(filePath)-------------------------------------------------------------------------------
		
		event SendSCMF{
			// This is a command, no constraints are required
			// Need to wrap with Event class as all commands need these.
			
			filePath: String

		}	
		
		//--EVR and EHA timelines
		//--VerifyEHA()------------------------------------------------------------------------------------
		    
		event verifyEHA{
		
			//set channelID as temporal constraint
			//channelID(t) = y
			
			SendCommand : Send
			channelID : String // channelID is of type string, not Spacecraft
			BASE:String = "10" //16 if HEX, default set to base 10; need to declare variable type before assigning default val.
			returnedChannelID: String
			
			//--verifyEHA("") --parameter should be ID of telemetry channel
		    
		    
				//returnedChannelID = STAKR.VerifyEHA(channelID,BASE) //correct assignment operation for returnedChannelID?
				
				
				// TODO: The following may not be necessary, unless we want to model the internals of STAKR. 
				// STAKR already does the conditionals below within it's VerifyEHA command; we're simply calling it right?

			
			constraint VerifyEHAscheduleTimer:
				startTime = SendCommand.endTime + incr
		}
		
		
		//--VerifyEHACritical()------------------------------------------------------------------------------------

		event verifyEHACritical{
			
			(channelID,SpacecraftTB.channelID,BASE)
			constraint VerifyEHAscheduleTimer:
					startTime = SendCommand.endTime
			
		}
		
		
		//--VerifyEVR()------------------------------------------------------------------------------------
		//VerifyEVR(search_string, lower_sclk)
		
		event verifyEVR{
		
		
		//TODO: of type SpacecraftTB (?) (since that is what the class is named as)
		//lower_sclk : SpacecraftSTAKR
		//it's actually inheriting the value from SpacecraftTB since it's the sclk on the spacecraft that we want to look at. 
		lower_sclk : SpacecraftTB
		search_string : String
		
			constraint VerifyEHAscheduleTimer:
				startTime = SendCMD.endTime + incr
				
			constraint VerifyEHAscheduleTimer2:
				startTime = WriteMessageCMD.endTime + incr
					
		}
		
		//--VerifyEVRBackground()------------------------------------------------------------------------------------
		//VerifyEVRBackground(search_string, lower_sclk)
		
		event verifyEVRBackground{
		
			search_string : String
			lower_sclk : SpacecraftTB
		
			constraint VerifyEHAscheduleTimer:
				startTime = SendCMD.endTime + incr
				
			constraint VerifyEHAscheduleTimer2:
				startTime = WriteMessageCMD.endTime + incr2
					
		}
		
		//--VerifyEVRCount()------------------------------------------------------------------------------------
		//VerifyEVRCount(search_string, lower_sclk)
		
		event VerifyEVRCount{
		
			(search_string,lower_sclk)
			search_string : String
			lower_sclk : SpacecraftTB
		
			constraint VerifyEHAscheduleTimer:
				startTime = SendCMD.endTime + incr
				
			constraint VerifyEHAscheduleTimer2:
				startTime = WriteMessageCMD.endTime + incr2
					
		}
		
		//--VerifyEVRCritical()------------------------------------------------------------------------------------
		
		event verifyEVRCritical{
		
		(search_string,sclk)
		//writeMessageCommand is an instance of the class WriteMessageCMD
		writeMessageCommand : WriteMessageCMD
		search_string : String
		lower_sclk : SpacecraftSTAKR
			
				
			constraint VerifyEHAscheduleTimer:
				startTime = SendCMD.endTime + incr
					
			constraint VerifyEHAscheduleTimer2:
				startTime = WriteMessageCMD.endTime + incr2
				
		
		}
		
		
		
		//--VerifyComplete(cmd_name, lower_sclk = send_sclk)-----------------------------------------------------------------
		// TODO: Why conditionals 
		event verifyComplete{

			(cmd_name, lower_sclk = send_sclk)
			
			constraint verifyCompleteBTimer:
				startTime = verifyEVR.endTime + incr
		}
		
		
		//--VerifyCompleteBackground(cmd_name,lower_sclk = send_sclk)-----------------------------------------------------------------
		
		event verifyCompleteBackground{

			(cmd_name,lower_sclk)
			constraint verifyCompleteBTimer:
				startTime = verifyEVR.endTime + incr
		
		}
		
		//--VerifyCompleteCritical(cmd_name,lower_sclk)-----------------------------------------------------------------
		
		event verifyCompleteCritical{
			
			(cmd_name,lower_sclk)
			constraint verifyCompleteCriticalTimer:
				startTime = verifyEVR.endTime + incr
		
		}
		
		
		//---VerifyRecordedEVR----------------------------------------------------------------------------------
		 event VerifyRecordedEVR{
		 
		 (searchString,lower_sclk)
		 WriteCMD : WriteMessageCMD
		 
		 constraint EVRexists:
		 		startTime = WriteCMD.endTime + incr
		 
		 }
		
		//---VerifyRecordedEVRbackground----------------------------------------------------------------------------------
		
		event VerifyRecordedEVRbackground{
		 
		 (searchString,lower_sclk)
		 WriteCMD : WriteMessageCMD
		 
		 constraint EVRexists:
		 		startTime = WriteCMD.endTime + incr
		 
		 }
		 
		 //---VerifyDispatch------------------------------------------------------------------------------
		 
		 event VerifyDispatch{

		 (cmd_name, lower_sclk)	
		 constraint EVRexists:
		 		startTime = WriteCMD.endTime + incr
		 
		 }
		 
		 
		 //---VerifyDispatchBackground------------------------------------------------------------------------------
		 
		 event VerifyDispatchBackground{

		 (cmd_name, lower_sclk)	
		 constraint EVRexists:
		 		startTime = WriteCMD.endTime + incr
		 
		 }
		 
		 
		 //---VerifyDispatchCritical------------------------------------------------------------------------------
		 //exit the testscript if no EVRs are found
		 
		 event VerifyDispatchCritical{
		 	
		 (cmd_name, lower_sclk)	
		 constraint EVRexists:
		 		startTime = WriteCMD.endTime + incr
		 
		 }
		
		//--VerifyDP()------------------------------------------------------------------------------------
		
		event verifyDP{
		
		(apID,args)
		apID : String
		args : String[]
		//args : data structure or array, where contents of file with the ID "apID" are stored 
			
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
		
		event SetMode{
		
		(output_mode)
		//output file type
		mode : String[]
		mode[0] := "Quiet"
		mode[1] := "Q"
		mode[2] := "Verbose"
		mode[3] := "Debug"
		
			constraint ModeHasChanged:
				output_mode = !output_mode~
			
		}		
		
		
		
//--SetTimeOut------------------------------------------------------------------------------------	

		event SetTimeOut{
			
			(num)
			num : Int
			verifyEVR : VerifyEVR
			verifyEHA :	VerifyEHA
			
			constraint WaitForEHA:
				startTime = verifyEHA.endTime + incr	
				
			constraint WaitForEVR:
				startTime = verifyEVR.endTime + incr
		
		}
		
		
		//--Set ValidityChecks(mode)------------------------------------------------------------------------------------	
				
		event SetValidityChecks{
		
		(mode)
			mode : String[]
			//mode[0] := "ON"
			//mode[1] := "OFF"

		}
		
		//--Pause()------------------------------------------------------------------------------------	
		
		event Pause() {

		}

		//--SignOff(file)------------------------------------------------------------------------------------
		
		
		event SignOff{
		
			(outputFile)
			outputFile : String
			setLogFile : SetLogFile
			writeMessage : WriteMessageCMD
	
				constraint fileExists:
					outputFile != null
		}
				

		
		
		//--Print()------------------------------------------------------------------------------------
		
		event Print(){
			msg : String
		}
		
		//--Exit()------------------------------------------------------------------------------------
		
		event Exit(){

		}
		
		
		
	}


}


	




	
	

