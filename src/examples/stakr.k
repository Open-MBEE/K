
class DurativeEvent {
  -- StartTime : Int
  -- EndTime : Int
  -- duration : Int
		
  t1 : Int   -- StartTime
  t2 : Int	 -- endTime
  Dur : Int	 -- Duration
			
  @doc("Duration will be inherited by any class that extends 'DurativeEvent'")	

  req durationTime:
    t2 = t1 + Dur	
}

incr : Int
				
StartCMD : DurativeEvent
WriteMsgCMD : DurativeEvent
SendCMD : DurativeEvent
VerifyEHA : DurativeEvent
VerifyEHACritical : DurativeEvent
VerifyCompleteCritical : DurativeEvent
VerifyEVR : DurativeEvent
VerifyEVRCompleteBackground : DurativeEvent
VerifyEVRBackground : DurativeEvent
VerifyEVRCount : DurativeEvent
VerifyDispatch : DurativeEvent
VerifyDispatchCritical : DurativeEvent
VerifyDP : DurativeEvent
VerifyDispatchBackground : DurativeEvent
VerifyComplete : DurativeEvent
VerifyCompleteBackground : DurativeEvent
VerifyRecordedEVR : DurativeEvent
VerifyRecordedEVRBackground : DurativeEvent
SignOff : DurativeEvent
DisplaySessionInfo : DurativeEvent
SetLogFile : DurativeEvent
SetMode : DurativeEvent
SendSCMF : DurativeEvent
SetValidityChecks : DurativeEvent
SetTimeOut : DurativeEvent
Pause : DurativeEvent
Print : DurativeEvent
Exit : DurativeEvent

req incr = 5
req StartCMD.t1 = 0 
req WriteMsgCMD.t1 = StartCMD.t2 + incr
req SendCMD.t1 = WriteMsgCMD.t2 + incr
req VerifyEHA.t1 = SendCMD.t2 + incr
req VerifyEHACritical.t1 = SendCMD.t2 + incr
req VerifyCompleteCritical.t1 = SendCMD.t2 + incr
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

