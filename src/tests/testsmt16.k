
-- Testing empty classes/constructors and string members, which should
-- be ignored. Hence verifyEVR is an empty class from Z3's point
-- of view.

class Time {
  t : Int
}

class DurativeEvent 

class VerifyEVR {
  cmd : String
}

verify1 : VerifyEVR = VerifyEVR(cmd :: "CMD_NO_OP")

time : Time