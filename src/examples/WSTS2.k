--WSTS modeling pattern
--STAKR model
--Written by Dang Le and Thirupathi Srinivasan

//EHA = Engineering Housekeeping and Accountability Packet
//EVR = Event Report


class SpacecraftTB {

	curr_sclk : Int
	lower_sclk : Int
	//i.e TchannelID- temporal reqs
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






class <event> DurativeEvent{
		StartTime : Int
		EndTime : Int
		duration : Int
			
		@doc("Duration will be inherited by any class that extends 'DurativeEvent'")	
		req durationTime:
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
		incr2		 : Int
		output_mode	 : Seq[String]	//Verbose, Debug, or Quiet mode
		timeOut		 : Int
		send_sclk	 : Int
		
		curr_sclk	 : spacecraft.curr_sclk
		cmd_name 	 : String
		
		event StartCMD{

			// TODO: Maybe unnecessary, since DurativeEvent.java might already have a startTime associated to the class?
			@doc("starts at specific time")
			//req startTimereqs:
				//startTime = 2015-03-03T10:10:10.000-800
		
			req startTime:
				startTime = 0
		    	
		}
		
		//--call SetLogFile---------------------------------------------------------------------------------
		
		event SetLogFile{
		
			startCommand : StartCMD
			endTime : : StartCMD
			fileName : String
		
			req incrValue:
				incr = 5
			
			req SetLogFileStartTime:
				startTime = startCommand.endTime + incr //adding increment
		
		}
		
		//--Write message to console------------------------------------------------------------------------
		
		event WriteMessageCMD{
		
			startCommand : StartCMD
			endTime : StartCMD
			messageToBeSent : String
			messageOutputFile : String
		
			req incrValue:
				incr = 6
		
			req WriteMessageCMDscheduleTimer:
				startTime = startCommand.endTime + incr; 
		
		 }
		    
		//--Send(CMDmessage)-------------------------------------------------------------------------------
		
		event SendCMD{
		
			CMDmessage : String
			startCMD : StartCMD
			endTime : StartCMD
		
			req incrval:
				incr = 7
				
			req SendCMDscheduleTimer:
				startTime = startCMD.endTime +incr //adding increment		
		}
		
		//--SendSCMF(filePath)-------------------------------------------------------------------------------
		
		event SendSCMF{
			// This is a command, no reqs are required
			// Need to wrap with Event class as all commands need these.
			
			filePath: String

		}	
		
		//--EVR and EHA timelines
		//--VerifyEHA()------------------------------------------------------------------------------------
		    
		event verifyEHA{
		
			//set channelID as temporal req
			//channelID(t) = y
			
			sendCMD : SendCMD
			endTime : SendCMD
			

			
			req VerifyEHAscheduleTimer:
				startTime = sendCMD.endTime + incr
		}
		
		
		//--VerifyEHACritical()------------------------------------------------------------------------------------

		event verifyEHACritical{
			
			(channelID,SpacecraftTB.channelID,BASE)
			sendCMD : SendCMD
			endTime : SendCMD

			req VerifyEHAscheduleTimer:
					startTime = sendCMD.endTime
			
		}
		
		
		//--VerifyEVR()------------------------------------------------------------------------------------
		//VerifyEVR(search_string, lower_sclk)
		
		event verifyEVR{
		
		
		//TODO: of type SpacecraftTB (?) (since that is what the class is named as)
		//lower_sclk : SpacecraftSTAKR
		//it's actually inheriting the value from SpacecraftTB since it's the sclk on the spacecraft that we want to look at. 
		
		writeCommand : WriteMessageCMD
		sendCMD : SendCMD
		endTime : SendCMD
		endTime : WriteMessageCMD
		search_string : String
		lower_sclk : SpacecraftTB
		lower_sclk : SpacecraftTB
		search_string : String
		
			req VerifyEHAscheduleTimer:
				startTime = sendCMD.endTime + incr
				
			req VerifyEHAscheduleTimer2:
				startTime = writeCMD.endTime + incr
					
		}
		
		//--VerifyEVRBackground()------------------------------------------------------------------------------------
		//VerifyEVRBackground(search_string, lower_sclk)
		
		event verifyEVRBackground{
		
		
			writeCommand : WriteMessageCMD
			sendCMD : SendCMD
			endTime : SendCMD
			endTime : WriteMessageCMD
			search_string : String
			lower_sclk : SpacecraftTB
		
			req VerifyEHAscheduleTimer:
				startTime = sendCMD.endTime + incr
				
			req VerifyEHAscheduleTimer2:
				startTime = writeCMD.endTime + incr2
					
		}
		
		//--VerifyEVRCount()------------------------------------------------------------------------------------
		//VerifyEVRCount(search_string, lower_sclk)
		
		event VerifyEVRCount{
		
			(search_string,lower_sclk)
			writeCommand : WriteMessageCMD
			sendCMD : SendCMD
			endTime : SendCMD
			endTime : WriteMessageCMD
			search_string : String
			lower_sclk : SpacecraftSTAKR
			search_string : String
			lower_sclk : SpacecraftTB
		
			req incr = 5
			req incr2 = 10	
		
			req VerifyEHAscheduleTimer:
				startTime = sendCMD.endTime + incr
				
			req VerifyEHAscheduleTimer2:
				startTime = writeCMD.endTime + incr2
					
		}
		
		//--VerifyEVRCritical()------------------------------------------------------------------------------------
		
		event verifyEVRCritical{
		
		(search_string,sclk)
		//writeMessageCommand is an instance of the class WriteMessageCMD
		writeCommand : WriteMessageCMD
		sendCMD : SendCMD
		endTime : SendCMD
		endTime : WriteMessageCMD
		search_string : String
		lower_sclk : SpacecraftSTAKR
		
		
			req incr = 5
			req incr2 = 10	
				
			req VerifyEHAscheduleTimer:
				startTime = SendCMD.endTime + incr
					
			req VerifyEHAscheduleTimer2:
				startTime = writeCMD.endTime + incr2
				
		
		}
		
		
		
		//--VerifyComplete(cmd_name, lower_sclk = send_sclk)-----------------------------------------------------------------
		// TODO: Why conditionals 
		event verifyComplete{

		 (cmd_name, lower_sclk = send_sclk)
		 WriteCMD : verifyEVR
		 endTime  : verifyEVR	
		 cmd_name : String
		 lower_sclk : Int
			
			req verifyCompleteBTimer:
				startTime = verifyEVR.endTime + incr
		}
		
		
		//--VerifyCompleteBackground(cmd_name,lower_sclk = send_sclk)-----------------------------------------------------------------
		
		event verifyCompleteBackground{

			(cmd_name,lower_sclk)
		 WriteCMD : verifyEVR
		 endTime  : verifyEVR	
		 cmd_name : String
		 lower_sclk : Int
		 
			req verifyCompleteBTimer:
				startTime = verifyEVR.endTime + incr
		
		}
		
		//--VerifyCompleteCritical(cmd_name,lower_sclk)-----------------------------------------------------------------
		
		event verifyCompleteCritical{
			
		(cmd_name,lower_sclk)
		 WriteCMD : verifyEVR
		 endTime : verifyEVR	
		 cmd_name : String
		 lower_sclk : Int
		 
			req verifyCompleteCriticalTimer:
				startTime = verifyEVR.endTime + incr
		
		}
		
		
		//---VerifyRecordedEVR----------------------------------------------------------------------------------
		 event VerifyRecordedEVR{
		 
		 (searchString,lower_sclk)
		 WriteCMD : WriteMessageCMD
		 endTime : WriteMessageCMD	
		 cmd_name : String
		 lower_sclk : Int
		 
		 req VREvr:
		 		startTime = WriteCMD.endTime + incr
		 
		 }
		
		//---VerifyRecordedEVRbackground----------------------------------------------------------------------------------
		
		event VerifyRecordedEVRbackground{
		 
		 (searchString,lower_sclk)
		 WriteCMD : WriteMessageCMD
		 endTime : WriteMessageCMD	
		 cmd_name : String
		 lower_sclk : Int
		 
		 req EVRTimer:
		 		startTime = WriteCMD.endTime + incr
		 
		 }
		 
		 //---VerifyDispatch------------------------------------------------------------------------------
		 
		 event VerifyDispatch{

		 (cmd_name, lower_sclk)	
		  WriteCMD : WriteMessageCMD
		 endTime : WriteMessageCMD	
		 cmd_name : String
		 lower_sclk : Int
		 
		 req VPTimer:
		 		startTime = WriteCMD.endTime + incr
		 
		 }
		 
		 
		 //---VerifyDispatchBackground------------------------------------------------------------------------------
		 
		 event VerifyDispatchBackground{

		 (cmd_name, lower_sclk)	
		 WriteCMD : WriteMessageCMD
		 endTime : WriteMessageCMD	
		 cmd_name : String
		 lower_sclk : Int
		 
		 req EVRexists:
		 		startTime = WriteCMD.endTime + incr
		 
		 }
		 
		 
		 //---VerifyDispatchCritical------------------------------------------------------------------------------
		 //exit the testscript if no EVRs are found
		 
		 event VerifyDispatchCritical{
		 	
		 (cmd_name, lower_sclk)
		 WriteCMD : WriteMessageCMD
		 endTime : WriteMessageCMD	
		 cmd_name : String
		 lower_sclk : Int
		 
			 req VDPTimer:
		 		startTime = WriteCMD.endTime + incr
		 
		 }
		
		//--VerifyDP()------------------------------------------------------------------------------------
		
		event verifyDP{
		
		(apID,args)
		sendCMD : SendCMD
		apID : String
		args : String[]
		//args : data structure or array, where contents of file with the ID "apID" are stored 
			
			req verifyDPTimer:
					startTime = sendCMD.endTime + incr
	
		}
		
		//--DisplaySessionInfo()------------------------------------------------------------------------------------
		
		event DisplaySessionInfo(){
		
			session_key :	MTAK
			user_name :		MTAK
			start_time :	MTAK
			sse_session :	MTAK
			
			startCommand : StartCMD
				
				req DisplaySessionInfoTimer:
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
				
			
		}		
		
		
		
//--SetTimeOut------------------------------------------------------------------------------------	

		event SetTimeOut{
			
			(num)
			num : Int
			verifyEVR : VerifyEVR
			verifyEHA :	VerifyEHA
			endTime : VerifyEVR
			endTime : VerifyEHA
			
			req WaitForEHA:
				startTime = verifyEHA.endTime + incr	
				
			req WaitForEVR:
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


	




	
	

