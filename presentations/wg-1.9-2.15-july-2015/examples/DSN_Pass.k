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
--modeling 5 passes out of flyby, 1 is first pass, 5 is last pass before flyby
class Schedule {
requirements : Requirements
DSN_Pass_1 : Event
DSN_Pass_Backup : Event
DSN_Pass_2 : Event
DSN_Pass_3 : Event
DSN_Pass_4 : Event
DSN_Pass_5 : Event
DSN_Pass_6 : Event
DSN_Pass_7 : Event
DSN_Pass_8 : Event
SunPointed_1 : Event
SunPointed_2 : Event
OTM_Prime : Event
OTM_Backup : Event
OTM_Contingency : Event
HailMary : Event
Anomaly : Event
Anomaly_2 : Event
Declare_Emergency : Event
Ephemeris_Update : Event
Flyby : Event
ClosestApproach : Event
Impact : Event


req NominalOrAnomalyOrCrash:
    (--Nominal Approach
	 requirements.missedpass = false && DSN_Pass_Backup = DSN_Pass_3 &&
     DSN_Pass_1.t1 = 0.0 && DSN_Pass_1.duration = 8.0 && DSN_Pass_1.success = true &&
	 OTM_Prime.during(DSN_Pass_1) && OTM_Prime.duration = 2.0 && 
	 OTM_Prime.t1 = 4.5 && OTM_Prime.success = true &&
	 DSN_Pass_1.meets(SunPointed_1) && SunPointed_1.duration = 8.0 &&
	 SunPointed_1.meets(DSN_Pass_2) && DSN_Pass_2.duration = 8.0 &&
	 SunPointed_1.success = true && DSN_Pass_2.success = true &&
	 DSN_Pass_2.meets(DSN_Pass_3) && DSN_Pass_3.duration = 8.0 &&
	 DSN_Pass_3.meets(SunPointed_2) && SunPointed_2.duration = 8.0 &&
	 DSN_Pass_3.success = true && SunPointed_2.success = true &&
     SunPointed_2.meets(DSN_Pass_4) && DSN_Pass_4.duration = 8.0 &&
     DSN_Pass_4.meets(DSN_Pass_5) && DSN_Pass_5.duration = 8.0 &&
	 DSN_Pass_4.success = true && DSN_Pass_5.success = true &&
     Ephemeris_Update.starts(DSN_Pass_5) && Ephemeris_Update.duration = 0.5 &&
	 Ephemeris_Update.success = true && Flyby.success = true &&
     Flyby.t1 = 72.0 && Flyby.duration = 10.0 && ClosestApproach.during(Flyby) &&
 	 ClosestApproach.t1 = 77.0 && ClosestApproach.duration = .001 &&
	 Impact.starts(ClosestApproach) && Impact.duration = 0.001 &&
	 ClosestApproach.success = true && Impact.success = false
	 --page 9 timeline
    )
	||
	(--Anomalous Approach Maneauver
	 requirements.missedpass = true && requirements.tolerate = true && 
	 DSN_Pass_1.t1 = 0.0 && DSN_Pass_1.duration = 8.0 && DSN_Pass_1.success = false &&
 	 OTM_Prime.during(DSN_Pass_1) && OTM_Prime.duration = 2.0 &&
	 OTM_Prime.t1 = 4.5 && OTM_Prime.success = false && DSN_Pass_Backup = DSN_Pass_2 &&
	 DSN_Pass_1.meets(SunPointed_1) && SunPointed_1.duration = 8.0 &&
	 SunPointed_1.meets(DSN_Pass_2) && DSN_Pass_2.duration = 8.0 &&
	 SunPointed_1.success = true && DSN_Pass_2.success = true &&	 
	 OTM_Backup.during(DSN_Pass_2) && OTM_Backup.duration = 2.0 &&
	 OTM_Backup.t2 = (DSN_Pass_2.t2 - 3.5) && OTM_Backup.success = false &&
	 Anomaly.during(OTM_Backup) && Anomaly.duration = 0.001 &&
	 Anomaly.success = true && Declare_Emergency.finishes(DSN_Pass_2) &&
	 Declare_Emergency.duration = 0.001 && Declare_Emergency.success = true &&
	 DSN_Pass_2.meets(SunPointed_2) && SunPointed_2.duration = 8.0 &&
     SunPointed_2.meets(DSN_Pass_3) && DSN_Pass_3.duration = 8.0 &&
	 SunPointed_2.success = true && DSN_Pass_3.success = true &&
 	 DSN_Pass_3.meets(DSN_Pass_4) && DSN_Pass_4.duration = 8.0 &&
	 DSN_Pass_4.meets(DSN_Pass_5) && DSN_Pass_5.duration = 8.0 &&
	 DSN_Pass_4.success = true && DSN_Pass_5.success = true &&
	 DSN_Pass_5.meets(DSN_Pass_6) && DSN_Pass_6.duration = 8.0 &&
	 OTM_Contingency.during(DSN_Pass_6) && OTM_Contingency.duration = 2.0 &&
	 OTM_Contingency.success = true &&
	 DSN_Pass_6.meets(DSN_Pass_7) && DSN_Pass_7.duration = 8.0 &&
	 DSN_Pass_6.success = true && DSN_Pass_7.success = true &&
	 DSN_Pass_7.meets(DSN_Pass_8) && DSN_Pass_8.duration = 8.0 &&
	 DSN_Pass_8.success = true && Flyby.starts(DSN_Pass_8) &&
	 Flyby.duration = 10.0 && Flyby.success = true &&
	 ClosestApproach.during(Flyby) && ClosestApproach.t1 = 77.0 &&
	 ClosestApproach.duration = 0.001 && ClosestApproach.success = true &&
	 Impact.starts(ClosestApproach) && Impact.duration = 0.001 &&
     Impact.success = false
	--page 19 timeline
    )
	||
	(--Impact Possible
	 requirements.missedpass = true && requirements.tolerate = false && 
	 DSN_Pass_1.t1 = 0.0 && DSN_Pass_1.duration = 8.0 && DSN_Pass_1.success = false &&
 	 OTM_Prime.during(DSN_Pass_1) && OTM_Prime.duration = 2.0 &&
	 OTM_Prime.t1 = 4.5 && OTM_Prime.success = false && DSN_Pass_Backup = DSN_Pass_2 &&
	 DSN_Pass_1.meets(SunPointed_1) && SunPointed_1.duration = 8.0 &&
	 SunPointed_1.meets(DSN_Pass_2) && DSN_Pass_2.duration = 8.0 &&
	 SunPointed_1.success = true && DSN_Pass_2.success = true &&	 
	 OTM_Backup.during(DSN_Pass_2) && OTM_Backup.duration = 2.0 &&
	 OTM_Backup.t2 = (DSN_Pass_2.t2 - 3.5) && OTM_Backup.success = false &&
	 Anomaly.during(OTM_Backup) && Anomaly.duration = 0.001 &&
	 Anomaly.success = true && Declare_Emergency.finishes(DSN_Pass_2) &&
	 Declare_Emergency.duration = 0.001 && Declare_Emergency.success = true &&
	 DSN_Pass_2.meets(SunPointed_2) && SunPointed_2.duration = 8.0 &&
     SunPointed_2.meets(DSN_Pass_3) && DSN_Pass_3.duration = 8.0 &&
	 SunPointed_2.success = true && DSN_Pass_3.success = true &&
 	 DSN_Pass_3.meets(DSN_Pass_4) && DSN_Pass_4.duration = 8.0 &&
	 DSN_Pass_4.meets(DSN_Pass_5) && DSN_Pass_5.duration = 8.0 &&
	 DSN_Pass_4.success = true && DSN_Pass_5.success = true &&
	 DSN_Pass_5.meets(DSN_Pass_6) && DSN_Pass_6.duration = 8.0 &&
	 OTM_Contingency.during(DSN_Pass_6) && OTM_Contingency.duration = 2.0 &&
	 OTM_Contingency.success = false &&
	 Anomaly_2.during(OTM_Contingency) && Anomaly_2.duration = 0.001 &&
	 Anomaly_2.success = true && DSN_Pass_6.meets(DSN_Pass_7) && 
	 DSN_Pass_6.success = true && DSN_Pass_7.duration = 8.0 && 
	 DSN_Pass_7.success = true && DSN_Pass_7.meets(DSN_Pass_8) && 
	 HailMary.starts(DSN_Pass_8) && HailMary.duration = 2.0 &&
	 HailMary.success = true && DSN_Pass_8.duration = 8.0 &&
	 DSN_Pass_8.success = true && Flyby.starts(DSN_Pass_8) &&
	 Flyby.duration = 10.0 && Flyby.success = false &&
	 ClosestApproach.during(Flyby) && ClosestApproach.t1 = 77.0 &&
	 ClosestApproach.duration = 0.001 && ClosestApproach.success = false &&
	 Impact.starts(ClosestApproach) && Impact.duration = 0.001 &&
	 Impact.success = true
	 --page 32 timeline

	 )

 @owner("Trajectory Concept")
 @name ("Back-up OTM Pass Timing")
 @text("The ground system shall schedule a DSN pass for a backup OTM to 
 	    begin no later than 16 hours of the beginning of the prime Europa
        OTM pass.")
 @afid("TBD")
 @maturity("Prelim")
 @ID("?")
 @units("n/a")
 TEST_BACKUP : Real
 req TEST_BACKUP = DSN_Pass_Backup.t1 - OTM_Prime.t1
 --req Backup_OTM_Pass_Timing: DSN_Pass_Backup.t1 - OTM_Prime.t1 <= 16.0

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
 TEST_AutoMan : Real
 req TEST_AutoMan = DSN_Pass_6.t1 - Anomaly.t1
-- req AutonomousManeauver:   requirements.missedpass = false
--						  ||
-- 	 					    OTM_Contingency.t1 - Anomaly.t1 <= 32.0  && 
--							requirements.missedpass = true 

 @owner("Traj Approach Concept")
 @name ("Availability of Maneuver Capability")
 @text("The project system shall be able to plan and execute a Europa 
        avoidance maneuver within 40 hours after any planned maneuver.")
 @afid("CT 100.057")
 @maturity("Prelim")
 @ID("?")
 @units("n/a")
 TEST_AvailMan1 : Real
 req TEST_AvailMan1 = OTM_Backup.t1 - OTM_Prime.t1
 TEST_AvailMan2 : Real
 req TEST_AvailMan2 = OTM_Contingency.t1 - OTM_Prime.t1
--req AvailManeauver: 
--	 		OTM_Backup.t1 - OTM_Prime.t1 <= 40 && requirements.missedpass = true &&
--			OTM_Prime.success = false
--		  ||
--		    OTM_Contingency.t1 - OTM_Prime.t1 <= 40 && requirements.missedpass = true &&
--			OTM_Contingency.success = true && OTM_Backup.success = false &&
--			OTM_Prime.success = false
		--  ||
--		    OTM_Prime.success = true && requirements.missedpass = false




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


class <Req> Requirements {
  missedpass : Bool = true
  tolerate : Bool = false 

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
===
  @owner("Mission Concept")
  @name ("Navigation tolerance to loss of flight-ground DSN pass")
  @text("Flight System Trajectory Uncertainty performance data 
  		 shall tolerate the loss of any single planned DSN pass.")
  @afid("CT 103.410")
  @maturity("Baseline")
  @ID("?")
  @units("n/a")  


  @owner("Operations Approach")
  @name ("Missed contact with the ground ")
  @text("During non-critical spacecraft operations, the design and 
  		 operation of the spacecraft shall ensure that it remains 
		 safe and operable for a minimum duration of at least twice 
		 the maximum interval between planned ground contacts.")
  @afid("CT 100.989")
  @maturity("Final")
  @ID("DP4.1.7.4")
  @units("n/a")
--https://europaems.jpl.nasa.gov/alfresco/mmsapp/mms.html#/workspaces/master/sites/europa/documents/_17_0_2_3_f57036a_1396393724686_86625_78570/views/_17_0_2_3_f57036a_1396393694448_305477_77691
  @owner("Operations Approach")
  @name ("Missed contact with the ground (Ref. DP 4.1.7.4)")
  @text("Missed contact with the ground (Ref. DP 4.1.7.4) - 
  		 During non-critical spacecraft operations, the design and 
  		 operation of the spacecraft shall ensure that it remains 
		 safe and operable for a minimum duration of at least twice 
		 the maximum interval between planned ground contacts.")
  @afid("CT 101.296")
  @maturity("Final")
  @ID("DP9.1.5")
  @units("n/a")







  @owner("FBR Concept")
  @name ("Doppler After Approach OTM")
  @text("The ground system shall plan for at least 4 hours of Doppler data
  		 collection within 16 hours following the completion of the Europa 
		 Approach OTM.")
  @afid("CT 102.105")
  @maturity("Prelim")
  @ID("?")
  @units("n/a")


  @owner("Flyby Robustness Concept")
  @name ("Carrier Following Aborted Approach OTM")
  @text("Within TBR (16) hours of an aborted Approach OTM, the flight system 
  		 shall provide a carrier.")
  @afid("TBD")
  @maturity("Prelim")
  @ID("?")
  @units("n/a")

  @owner("FBR Concept")
  @name ("Realtime Ground Coverage of Approach OTMs")
  @text("The Ground System shall provide realtime coverage of Europa Approach
  		 OTM activities.")
  @afid("TBD")
  @maturity("Prelim")
  @ID("?")
  @units("n/a")

} 
===