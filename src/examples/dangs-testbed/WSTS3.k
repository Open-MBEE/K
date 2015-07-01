


class <event> DurativeEvent{
		StartTime : Int
		EndTime : Int
		duration : Int
		
		t1 : Int   --StartTime
		t2 : Int    --endTime
		Dur : Int	--Duration
			
		@doc("Duration will be inherited by any class that extends 'DurativeEvent'")	
		req durationTime:
			t2 = t1 + Dur
		
}
======
RahulKu: Seems like this is old code. Commenting out so that we can still run on it.

package STAKRschedule{

incr : Int
				
				
event StartCMD
event WriteMsgCMD
event SendCMD
event VerifyEHA
event VerifyEHACritical
event VerifyCompleteCritical
event VerifyEVR
event VerifyEVRCompleteBackground
event VerifyEVRBackground
event VerifyEVRCount
event VerifyDispatch
event VerifyDispatchCritical
event VerifyDP
event VerifyDispatchBackground
event VerifyComplete
event VerifyCompleteBackground
event VerifyRecordedEVR
event VerifyRecordedEVRBackground
event SignOff
event DisplaySessionInfo
event SetLogFile
event SetMode
event SendSCMF
event SetValidityChecks
event SetTimeOut
event Pause
event Print
event Exit


		req incr = 5
		req StartCMD.t1 = 0 
		req WrteMsgCMD.t1 = StartCMD.t2 + incr
		req SendCMD.t1 = WriteMsgCMD.t2 + incr
		req VerifyEHA.t1 = SendCMD.t2 + incr
		req VerifyEHACritical.t1 = SendCMD.t2 + incr
		req VerifyEHACompleteCritical.t1 = SendCMD.t2 + incr
		req VerifyEVR.t1 = SendCMD.t2 + incr
		req VerifyEVRCompleteBackground.t1 = VerifyEVR.t2 + incr
		req VerifyEVRBackground.t1 = SendCMD.t2 + incr
		req VerifyEVRCount.t1 = SendCMD.t2 + incr
		req VerifyDispatch.t1 = SendCMD.t2 + incr
		req VerifyDispatchCritical.t1 = SendCMD.t2 + incr
		req VerifyDP.t1 = SendCMD.t2 + incr
		req VerifyDispatchBackground.t1 = SendCMD.t2 + incr
		req VerifyComplete.t1 = SendCMD.t2 + incr
		req VerifyCompleteBackground.t1 = VerifyComplete.t2 + incr
		req VerifyRecordedEVR.t1 = SendCMD.t2 + incr
		req VerifyRecordedEVRBackground.t1 = VerifyRecordedEVR.t2 + incr
		req VerifyComplete.t1 = SendCMD.t2 + incr

}
======