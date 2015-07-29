package Kevin.DSN_Pass

annotation owner : String
annotation name : String
annotation text : String
annotation afid : String
annotation maturity : String
annotation ID : String
annotation units : String


class Event {
  t1 : Real 
  t2 : Real  
  duration : Real 
  success : Bool 

  req t1 >= 0
  req t2 > t1 
  req t2 = t1 + duration
  req duration > 0

  -- START OPERATORS -- 
  fun before (e : Event) : Bool {
    t2 < e.t1
  }

  fun meets (e : Event) : Bool {
    t2 = e.t1
  }  

  fun overlaps (e : Event) : Bool {
    t2 > e.t1 && t2 < e.t2
  }

  fun starts (e : Event) : Bool {
    t1 = e.t1
  }

  fun during (e : Event) : Bool {
    t2 > e.t1 && t2 < e.t2 &&
    t1 > e.t1 && t2 < e.t2
  }
 
  fun finishes (e : Event) : Bool {
    t2 = e.t2
  }

  fun equal (e : Event) : Bool {
    t1 = e.t1 && t2 = e.t2
  }
  -- END OPERATORS --

}

class DSN_Pass extends Event {
	  req duration = 8.0
}

class Schedule {
requirements : Requirements
DSN_Pass_1 : DSN_Pass
DSN_Pass_Backup : DSN_Pass
DSN_Pass_2 : DSN_Pass
DSN_Pass_3 : DSN_Pass
DSN_Pass_4 : DSN_Pass
DSN_Pass_5 : DSN_Pass
DSN_Pass_6 : DSN_Pass
DSN_Pass_7 : DSN_Pass
DSN_Pass_8 : DSN_Pass
SunPointed_1 : Event
SunPointed_2 : Event
OTM_Prime : Event
OTM_Backup : Event
OTM_Contingency : Event
HailMary : Event
Anomaly : Event
Anomaly_2 : Event
Safe_Mode : Event
Carrier_1 : Event
Carrier_2 : Event
Carrier_3 : Event
Declare_Emergency : Event
MnvrAccy : Event
Ephemeris_Update : Event
FS_Ready : Event
FS_Ready_2 : Event
Flyby : Event
ClosestApproach : Event
Impact : Event

===
Assumptions
  OTMs have a duration of 2 hours
  Ephemeris Update duration is 0.5 hours
  Single occurance events (anamoly, closest approach, impact) have a duration
  		 of 0.001 hours. Must define a duration due to event structure.
 Carrer_1 duration is 5.0 hours in Nominal
===

req Nominal_Anomaly_Impact:
    (--Nominal Approach
	 requirements.missedpass = false && DSN_Pass_Backup = DSN_Pass_3 &&
	 DSN_Pass_1.success = true &&
	 DSN_Pass_1.meets(SunPointed_1) &&      
	 DSN_Pass_1.t1 = 0.0 && 
	 OTM_Prime.success = true &&
	 OTM_Prime.duration = 2.0 &&
	 OTM_Prime.during(DSN_Pass_1) && 
	 Carrier_1.success = true &&
	 Carrier_1.duration = 5.0 && 
	 Carrier_1.finishes(DSN_Pass_1) &&
	 SunPointed_1.success = true && 
	 SunPointed_1.duration = 8.0 &&
	 SunPointed_1.meets(DSN_Pass_2) && 
	 DSN_Pass_2.success = true &&
	 DSN_Pass_2.meets(DSN_Pass_3) && 
	 MnvrAccy.success = true &&
	 MnvrAccy.duration = 5.5 && 
	 MnvrAccy.finishes(DSN_Pass_2) &&
	 DSN_Pass_3.success = true &&
	 DSN_Pass_3.meets(SunPointed_2) && 
	 SunPointed_2.success = true &&
	 SunPointed_2.duration = 8.0 &&
     SunPointed_2.meets(DSN_Pass_4) && 
	 DSN_Pass_4.success = true &&
     DSN_Pass_4.meets(DSN_Pass_5) && 
	 DSN_Pass_5.success = true &&
	 Ephemeris_Update.success = true && 
	 Ephemeris_Update.duration = 0.5 &&
     Ephemeris_Update.starts(DSN_Pass_5) && 
	 Flyby.success = true &&
	 Flyby.duration = 10.0 && 
     Flyby.t1 = 72.0 && 
	 ClosestApproach.success = true &&
	 ClosestApproach.duration = .001 &&
	 ClosestApproach.during(Flyby) &&
 	 ClosestApproach.t1 = 77.0 && 
	 Impact.success = false &&
	 Impact.duration = 0.001 &&
	 Impact.starts(ClosestApproach)
	 --page 9 timeline
    )
	||
	(--Anomalous Approach Maneauver
	 requirements.missedpass = true && requirements.tolerate = true && 
	 DSN_Pass_1.t1 = 0.0 &&
 	 DSN_Pass_1.success = false &&
	 DSN_Pass_1.meets(SunPointed_1) &&
 	 OTM_Prime.during(DSN_Pass_1) &&
 	 OTM_Prime.duration = 2.0 && 
	 OTM_Prime.success = false &&
 	 DSN_Pass_Backup = DSN_Pass_2 &&
	 Carrier_1.success = false &&
	 SunPointed_1.duration = 8.0 &&
	 SunPointed_1.meets(DSN_Pass_2) &&
	 SunPointed_1.success = true && 
	 DSN_Pass_2.success = true &&	 
	 OTM_Backup.during(DSN_Pass_2) && 
	 OTM_Backup.duration = 2.0 &&
	 OTM_Backup.success = false && 
	 Carrier_2.success = true &&
	 Carrier_2.finishes(DSN_Pass_2) && 
	 Carrier_2.starts(OTM_Backup) &&
	 Anomaly.during(OTM_Backup) && 
	 Anomaly.duration = 0.001 &&
	 Anomaly.success = true &&
	 Anomaly.meets(Safe_Mode) && 
	 Anomaly.meets(SunPointed_2) &&	 
	 Safe_Mode.success = true &&
	 Safe_Mode.meets(FS_Ready) &&
	 Declare_Emergency.finishes(DSN_Pass_2) &&
	 Declare_Emergency.duration = 0.001 &&
 	 Declare_Emergency.success = true &&
 	 SunPointed_2.finishes(Safe_Mode) &&
	 SunPointed_2.success = true &&
 	 DSN_Pass_3.success = true &&
 	 DSN_Pass_3.meets(DSN_Pass_4) &&
	 DSN_Pass_4.success = true &&
	 DSN_Pass_4.meets(DSN_Pass_5) &&
 	 DSN_Pass_5.success = true &&
	 DSN_Pass_5.meets(DSN_Pass_6) &&
	 OTM_Contingency.during(DSN_Pass_6) && 
	 OTM_Contingency.duration = 2.0 &&
	 OTM_Contingency.success = true && 
	 FS_Ready.success = true &&
	 FS_Ready.during(DSN_Pass_5) && 
	 FS_Ready.duration = 0.001 &&
	 DSN_Pass_6.success = true &&
	 DSN_Pass_6.meets(DSN_Pass_7) && 
	 DSN_Pass_7.success = true && 
	 DSN_Pass_7.meets(DSN_Pass_8) &&
	 Carrier_3.starts(DSN_Pass_7) &&
	 Carrier_3.finishes(DSN_Pass_7) &&
	 Carrier_3.success = true && 
	 DSN_Pass_8.success = true &&
	 Flyby.starts(DSN_Pass_8) &&
	 Flyby.duration = 10.0 &&
	 Flyby.success = true &&
	 ClosestApproach.during(Flyby) && 
	 ClosestApproach.t1 = 77.0 &&
	 ClosestApproach.duration = 0.001 && 
	 ClosestApproach.success = true &&
	 Impact.starts(ClosestApproach) && 
	 Impact.duration = 0.001 &&
     Impact.success = false
	--page 19 timeline
    )
	||
	(--Impact Possible: W-C Anomalous Approach Maneauver
	 requirements.missedpass = true && requirements.tolerate = false && 
	 DSN_Pass_1.t1 = 0.0 && 
	 DSN_Pass_1.success = false &&
	 DSN_Pass_1.meets(SunPointed_1) && 
 	 OTM_Prime.during(DSN_Pass_1) && 
	 OTM_Prime.duration = 2.0 &&
	 OTM_Prime.success = false && 
	 DSN_Pass_Backup = DSN_Pass_2 &&
	 Carrier_1.success = false &&
	 SunPointed_1.duration = 8.0 &&
	 SunPointed_1.meets(DSN_Pass_2) &&
	 SunPointed_1.success = true && 
 	 DSN_Pass_2.success = true &&	 
	 OTM_Backup.during(DSN_Pass_2) && 
	 OTM_Backup.duration = 2.0 &&
     OTM_Backup.success = false && 
	 Carrier_2.success = true &&
	 Carrier_2.finishes(DSN_Pass_2) && 
	 Carrier_2.starts(OTM_Backup) &&
	 Anomaly.during(OTM_Backup) && 
	 Anomaly.duration = 0.001 &&
	 Anomaly.success = true && 
	 Anomaly.meets(Safe_Mode) && 
	 Anomaly.meets(SunPointed_2) &&	 
	 Safe_Mode.success = true &&
	 Safe_Mode.meets(FS_Ready) &&
	 Declare_Emergency.finishes(DSN_Pass_2) &&
	 Declare_Emergency.duration = 0.001 && 
	 Declare_Emergency.success = true &&
     SunPointed_2.finishes(Safe_Mode) &&
	 SunPointed_2.success = true &&  
	 DSN_Pass_3.success = true &&
 	 DSN_Pass_3.meets(DSN_Pass_4) && 
	 DSN_Pass_4.success = true &&
	 DSN_Pass_4.meets(DSN_Pass_5) && 
	 DSN_Pass_5.success = true &&
	 DSN_Pass_5.meets(DSN_Pass_6) && 
	 OTM_Contingency.during(DSN_Pass_6) && 
	 OTM_Contingency.duration = 2.0 &&
	 OTM_Contingency.success = false && 
	 FS_Ready.success = true &&
	 FS_Ready.during(DSN_Pass_5) && 
	 FS_Ready.duration = 0.001 &&
	 Anomaly_2.during(OTM_Contingency) && 
	 Anomaly_2.duration = 0.001 &&
	 Anomaly_2.success = true && 
	 DSN_Pass_6.success = true &&
	 DSN_Pass_6.meets(DSN_Pass_7) && 
 	 DSN_Pass_7.success = true && 
	 DSN_Pass_7.meets(DSN_Pass_8) && 
	 OTM_Contingency.overlaps(Carrier_3) &&
	 Carrier_3.finishes(DSN_Pass_6) && 
	 Carrier_3.success = true && 
	 HailMary.success = true && 
	 HailMary.duration = 2.0 &&
	 HailMary.during(DSN_Pass_8) && 
	 DSN_Pass_8.success = true && 
	 FS_Ready_2.success = true &&
	 FS_Ready_2.t1 = 54.0 && 
	 FS_Ready_2.duration = 0.001 &&
	 Flyby.starts(DSN_Pass_8) &&
	 Flyby.duration = 10.0 && 
	 Flyby.success = false &&
	 ClosestApproach.during(Flyby) && 
	 ClosestApproach.t1 = 77.0 &&
	 ClosestApproach.duration = 0.001 && 
	 ClosestApproach.success = false &&
	 Impact.starts(ClosestApproach) && 
	 Impact.duration = 0.001 &&
	 Impact.success = true
	 --page 32 timeline
	 )


  ==================================
  Implementing Further Requirments
  ==================================
  @owner("Trajectory Concept")
  @name ("Back-up OTM Pass Timing")
  @text("The ground system shall schedule a DSN pass for a backup OTM to 
 	    begin no later than 16 hours of the beginning of the prime Europa
        OTM pass.")
  @afid("TBD")
  @maturity("Prelim")
  @ID("?")
  @units("n/a")
  OTM_Pass_Timing : Real
  req OTM_Pass_Timing = DSN_Pass_Backup.t1 - OTM_Prime.t1
-- req Backup_OTM_Pass_Timing: DSN_Pass_Backup.t1 - OTM_Prime.t1 <= 16.0 


  @owner("FBR Concept")
  @name ("Autonomous Establishment of Maneuver Capability")
  @text("The flight system shall be able to autonomously establish a safe 
        state from which a Europa-avoidance maneuver can be commanded by 
	    the ground system, in less than TBR (32) hours of a recoverable 
	    single fault.")
  @afid("CT 102.111")
  @maturity("Prelim")
  @ID("?")
  @units("n/a")
  CT_102_111 : Real
  req CT_102_111 = FS_Ready.t1 - Anomaly.t1
  req AutonomousManeauver:  
 	 					    requirements.missedpass = false
						  ||
						  	requirements.missedpass = true && 
							requirements.tolerate = true && 					    
							FS_Ready.t1 - Anomaly.t1 <= 32.0 &&
							Safe_Mode.success = true &&
							Safe_Mode.duration <= 32.0 &&
							SunPointed_2.duration <= 32.0
						  || 
						  	requirements.missedpass = true && 
							requirements.tolerate = false &&
							FS_Ready.t1 - Anomaly.t1 <= 32.0 && 
							FS_Ready_2.t1 - Anomaly_2.t1 <= 32.0 &&
							Safe_Mode.success = true &&
							Safe_Mode.duration <= 32.0 &&
							SunPointed_2.duration <= 32.0


  @owner("Traj Approach Concept")
  @name ("Availability of Maneuver Capability")
  @text("The project system shall be able to plan and execute a Europa 
        avoidance maneuver within 40 hours after any planned maneuver.")
  @afid("CT 100.057")
  @maturity("Prelim")
  @ID("?")
  @units("n/a")
  CT_100_057_A : Real
  req CT_100_057_A = OTM_Backup.t1 - OTM_Prime.t1
  CT_100_057_B : Real
  req CT_100_057_B = OTM_Contingency.t1 - OTM_Backup.t1
  req AvailManeauver: 
 	 				   requirements.missedpass = false && 
					   OTM_Prime.success = true
					 ||	 	   
 				 	   requirements.missedpass = true && 
					   requirements.tolerate = true &&
					   OTM_Prime.success = false &&  
					   OTM_Contingency.success = true &&
		 			   OTM_Backup.t1 - OTM_Prime.t1 <= 40.0 && 
					   OTM_Contingency.t1 - OTM_Backup.t1 <= 40.0
		 			 ||
		  			   requirements.missedpass = true && 
					   OTM_Prime.success = false &&
					   OTM_Backup.success = false && 
					   OTM_Contingency.success = false &&
					   OTM_Backup.t1 - OTM_Prime.t1 <= 40.0 && 
					   OTM_Contingency.t1 - OTM_Backup.t1 <= 40.0 &&
		    		   HailMary.t1 - OTM_Contingency.t1 <= 40.0
					  
					  
		 
  @owner("FBR Concept")
  @name ("Doppler After Approach OTM")
  @text("The ground system shall plan for at least 4 hours of Doppler data
        collection within 16 hours following the completion of the Europa 
	    Approach OTM.")
  @afid("CT 102.105")
  @maturity("Prelim")
  @ID("?")
  @units("n/a")
  CT_102_105 : Real
  req CT_102_105 =  (DSN_Pass_8.t2 - 4.0) - HailMary.t2
  req DopplerAfterApproachOTM:
				  requirements.missedpass = false &&
				  (DSN_Pass_2.t1 + 4.0) - OTM_Prime.t2 < 16.0
				||
				  requirements.missedpass = true && 
				  requirements.tolerate = true &&
				  (DSN_Pass_7.t1 + 4.0) - OTM_Contingency.t2 < 16.0
				||
				  requirements.missedpass = true && 
				  requirements.tolerate = false &&
				  (DSN_Pass_8.t2 - 4.0) - HailMary.t2 < 16.0 -- THIS MIGHT BE THE VIOLATION, DEPENDS IF THERE IS A DSN_PASS_8




  @owner("Flyby Robustness Concept")
  @name ("Carrier Following Aborted Approach OTM")
  @text("Within TBR (16) hours of an aborted Approach OTM, the flight system 
 		 shall provide a carrier.")
  @afid("TBD")
  @maturity("Prelim")
  @ID("?")
  @units("n/a")
  CarrierProvided : Real
  req CarrierProvided = Carrier_2.t1 - OTM_Backup.t2
  req ProvideCarrier:
			 	  requirements.missedpass = false 
			    ||
				  requirements.missedpass = true && 
				  requirements.tolerate = true && 
				  Carrier_2.t1 - OTM_Backup.t2 <= 16.0 &&
				  Carrier_3.t1 - OTM_Contingency.t2 <= 16.0 -- THIS MIGHT BE THE VIOLATION, NOT SURE IF IT EXISTS
				||
				  requirements.missedpass = true && 
				  requirements.tolerate = false &&
				  Carrier_2.t1 - OTM_Backup.t2 <= 16.0 &&
				  Carrier_3.t1 - OTM_Contingency.t2 <= 16.0 -- TECHNICALLY PROVIDES A CARRER BEFORE ABORTED OTM


  @owner("FBR Concept")
  @name ("Realtime Ground Coverage of Approach OTMs")
  @text("The Ground System shall provide realtime coverage of Europa Approach
  		 OTM activities.")
  @afid("TBD")
  @maturity("Prelim")
  @ID("?")
  @units("n/a")
  req CoverageOTMS:
				OTM_Prime.during(DSN_Pass_1)
				||
				OTM_Backup.during(DSN_Pass_2) && 
				OTM_Contingency.during(DSN_Pass_6)
				||
				OTM_Backup.during(DSN_Pass_2) && 
				OTM_Contingency.during(DSN_Pass_6) &&
				HailMary.during(DSN_Pass_8)

}


class <Req> Requirements {
  missedpass : Bool  = true--false
  tolerate : Bool  = true--false

  @owner("Mission Concept")
  @name ("Tolerance to loss of flight-ground DSN pass")
  @text("Each Mission activity shall tolerate the loss 
  		 of any single planned DSN pass.

		 See PSE-449 for more information. ECR pending.
		 Avoid excessive dependence on assets which might
		 not be available. This drives how long on-board 
		 sequences need to last, ground data storage, and 
		 on-board memory management.")
  @afid("CT 100.064")
  @maturity("Prelim")
  @ID("MSN.24")
  @units("n/a")
  req Valid:   (missedpass = false) 
  	  		 ||
			   (missedpass = true && tolerate = true)
  	  		 ||
			   (missedpass = true && tolerate = false)

}



===================================
===================================
---------Start of MAIN-------------
===================================
===================================
schedule : Schedule
Miss_Pass : Bool = schedule.requirements.missedpass
Tolerate : Bool = schedule.requirements.tolerate
===================================
===================================
-----------End of MAIN-------------
===================================
===================================

