package Kevin.GravityScience

annotation owner : String
annotation name : String
annotation text : String
annotation afid : String
annotation maturity : String
annotation ID : String
annotation units : String


class <Req> Requirements {

-------------------------------------------
===
   fun pow(x : Int, y : Int) : Int {
     i : Int
     r : Int = 1
     while ( i < y) do {
       r = r * x
       i= i + 1
     }
	 return r
   }
===
------------------------------------------
}


=====================================================
Determine the Gravity Science Constraints
=====================================================
class GravSci_Reqs extends Requirements {
 
  angle_SpacecraftEarthSun : Real
  latitude_Spacecraft : Real
  longitude_Spacecraft : Real
 
  @owner("Gravity Science Concept")
  @text("The closer the angular distance is to the sun, 
  	     the worse the Solar Scintillation gets. 
         20 is the lowest you want to do.")
  @afid("CT xx.xxx")
  @maturity("?")
  @ID("xxx")
  @units("degrees")  
  req ValidAngle: 20.0 <= angle_SpacecraftEarthSun && angle_SpacecraftEarthSun <= 180.0 

  @owner("Gravity Science Concept")
  @text("A range of latitudes and longitudes is desired for measurements.")
  @afid("CT xx.xxx")
  @maturity("?")
  @ID("xxx")
  @units("degrees")
  req ValidLatitude:  ((-40.0) <= latitude_Spacecraft) && (latitude_Spacecraft <= 60.0)
}

=====================================================
Determine the Telecom Strategy & Opportunities Constraints
=====================================================
class Telecom_Reqs extends Requirements {

  isDSNsatisfieable : Bool

  @owner("Gravity Science InstrumenTelecom Strategy & Opportunities")
  @name("Gravity Science Capability")
  @text("The mission Operations System shall base gravity science
         measurements on radiometric data provided by the DSN.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("TSO.15")
  @units("n/a")
  req ValidGSCapability: isDSNsatisfieable = true
}

=====================================================
Determine the Instrument Constraints
=====================================================
class Instrument_Reqs extends Requirements {

  steradians : Real
  YZwidecvrg : Real
  YZorthocvrg : Real
  measurement_accy: Real
  interval : Real
  GSdatacollect : Bool
  GSsignal : Bool

  @owner("Gravity Science Instrument")
  @name("Gravity Science Measurement Pointing")
  @text("The FS shall provide coverage over TBD steradians 
  		  without blockage (view to Earth) during Europa flybys
		  coverage.")
  @afid("CT 100.699")
  @maturity("Identified")
  @ID("473")
  @units("steradians, degrees, degrees")
  req ValidGSMeasurementPointing:
  	  0.0 <= steradians && steradians <= 97.0 &&   -- 97 is just a place holder
      270.0 <= YZwidecvrg && YZwidecvrg <= 360.0  &&
	  20.0 <= YZorthocvrg && YZorthocvrg <= 360.0

  @owner("Gravity Science Instrument")
  @name("Gravity Science Measurement Accuracy")
  @text("The GS subsystem shall provide for a Doppler accuracy
  	     of <= 0.1 mm/s over a 60-sec (TBC) interval during
		 Europa Flybys.")
  @afid("CT 100.702")
  @maturity("Identified")
  @ID("476")
  @units("seconds, mm/s")
  req (0.0 < interval && interval <= 60.0) => (0.0 < measurement_accy && measurement_accy <= 0.1)

  @owner("Gravity Science Instrument")
  @name("Gravity Science Data Collection")	
  @text("The gravity science investigation shall be able to 
  		 collect its data, during flybys, while the spacecraft 
         nadir deck is pointed at Europa center of mass.")
  @afid("CT 102.607")
  @maturity("Identified")
  @ID("id")
  @units("n/a")
  req ValidGSdatacollection: GSdatacollect = true

  @owner("Gravity Science Instrument")
  @name("Gravity Science Signal")
  @text("The gravity science subsytem shall accept an uplink
  		 signal, and turn it around for downlink, to provide
 		 a radio science signal for performing gravity field
		 measurements during Europa flybys.")
  @afid("CT 102.606")
  @maturity("Identified")
  @ID("id")
  @units("n/a")
  req ValidGSdatacollection: GSsignal = true

 }

=====================================================
Determine the Radio Constraints PART A
=====================================================
class Radio_Reqs_A extends Requirements {

  GS_uplink_pt_no : Real
  GS_boresight_pointing_error : Real
  DSN : Int = 34
  fanbeam_boresight_alignment : Real
  xband_downlink_pt_no : Real
  GS_downlink_pt_no : Real

  @owner("Radio")
  @name("Gravity Science X-Band U/L Pt/No")
  @text("At max Earth range the Telecom X-Band GS uplink shall 
  	     provide a minimum Pt/No of 25 dB-Hz (TBC) received at
		 the S/C.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("557")
  @units("dB-Hz")
  req ValidUplinkPtNo: 25.0 <= GS_uplink_pt_no && GS_uplink_pt_no <= 50.0

  @owner("Radio")
  @name("Gravity Science Boresight Pointing Error")
  @text("The Gravity Science Antenna shall point to Earth with 
  	     a pointing error of TBC [8.7 milliradians].")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("7")
  @units("milliradians")
  req ValidBoresightPointingError: 0.0 <= GS_boresight_pointing_error &&
  	  							   GS_boresight_pointing_error <= 8.7

  @owner("Radio")
  @name("FANBEAM Electrical Boresight Alignment")
  @text("The Telecom subsystem shall provide for the electrical 
  		 boresight (maximum gain location of the antenna pattern 
		 main beam) of the Fanbeam antenna to be known relative
		 to a mechanical alignment reference (to be determined) 
		 to within [0.25] deg. Rationale:Driven by required 
		 performance for X-Band applications. Verif Approach:Test
		  & Analysis Notes:Note: This allocation in alignment error 
		  is entirely internal to the Telecom antenna hardware. Might 
		  be absorbed completely into PPP Document. and flowed down 
		  to a level 5 requirement.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("602")
  @units("degrees")
  req ValidBoresightAlignment: 0.0 <= fanbeam_boresight_alignment &&
  	  						   fanbeam_boresight_alignment <= 0.25

  @owner("Radio")
  @name("Gravity Science Power/Noise")
  @text("At max Earth range the Telecom X-Band gravity science 
  		 downlink shall provide a minimum Pt/No of 10 dB-Hz (TBC) 
		 received at the DSN. Assumes using the 34 m DSS antennas.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("474")
  @units("dB-Hz")
  req ValidPowerNoise: 0.0 <= xband_downlink_pt_no && 
  	  				   xband_downlink_pt_no <= 10.0 && DSN = 34

  @owner("Radio")
  @name("Gravity Science X-Band D/L Pt/No")
  @text("At max Earth range the Telecom X-Band GS downlink shall 
  		 provide a minimum Pt/No of 10 dB-Hz (TBC) received at the 
		 DSN. Assumes using the 34 m DSS antennas.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("601")
  @units("dB-Hz")
  req ValidDownlink_pt_no: 0.0 <= GS_downlink_pt_no && 
  	  					   GS_downlink_pt_no <= 10.0 && DSN = 34
}

=====================================================
Determine the Radio Constraints - PART B
=====================================================
class Radio_Reqs_B extends Requirements {

  DSN : Int = 34
  twowayDoppleraccuracy : Real
  twowayDoppler_PcNo : Real
  GravSciXband_Coherency : Bool
  TelecomTurnaroundGS : Bool
  GS_EIRP : Real
  GSA_GT : Real

  @owner("Radio")
  @name("2-way Doppler accuracy")
  @text("Provide a Doppler accuracy of 0.1 mm/sec (1 sigma) for a 
  		 60-sec integration time when the SEP >20 deg (TBR) and the 
		 recovered downlink Pc/No is > 10 dB.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("619")
  @units("mm/sec and dB")
  req Valid2WayDopplerAccuracy: 0.0 <= twowayDoppleraccuracy &&
  	  							twowayDoppleraccuracy <= 0.1 && 
  	  							10.0 < twowayDoppler_PcNo && 
								twowayDoppler_PcNo <= 20.0

  @owner("Radio")
  @name("Gravity Science X-Band Coherency Requirements")
  @text("The Telecom X-Band Subsystem shall accept an uplink signal,
  		 and turn it around for downlink, to provide a radio science 
		 signal for performing gravity field measurements during 
		 Europa flybys.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("585")
  @units("True/False")
  req ValidGSXband_Coherency : (GravSciXband_Coherency = true)

  @owner("Radio")
  @name("Telecom Turnaround for Gravity Science")
  @text("The FS shall accept an uplink signal, and turn it around
  	     for downlink w/ TBD performance parameters here.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("475")
  @units("True/False")
  req ValidTelecomTurnaroundGS : (TelecomTurnaroundGS = true)

  @owner("Radio")
  @name("Gravity Science EIRP")
  @text("The Telecom X-band Subsystem shall provide the following 
  	     EIRP, >49.37 dBm (TBC). Assumes the requirement TELE-805,
		 and max range 6.4 AU. Rationale:Driven by required
		 performance for Gravity Science measurements. Verif 
		 Approach:Test & Analysis Notes:As of July 2013 Assumes: 
		 20 w TWTA,3 dB line loss, antenna gain of ~9.4 dB, and one 
		 34m DSS, with Tsys 33.1K.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("582")
  @units("dBm")
  req ValidGS_EIRP: 49.37 < GS_EIRP && GS_EIRP <= 100.0 && DSN = 34

  @owner("Radio")
  @name("GSA_GT")
  @text("The Telecom X-band Subsystem shall provide the following
  		 G/T during prime mission for a gravity science antenna 
		 >-21.2 dB/K (TBC) - no contribution from sky temperature 
		 to noise assumed.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("594")
  @units("dB/K")
  req ValidGSA_GT: 21.2 < GSA_GT && GSA_GT <= 40.0

}

  =====================================================
  Determine the Radio/Gravity Science Constraints
  =====================================================
class RadioGravSci_Reqs extends Requirements {

  range : Real
  altitude : Real
  k2accuracy : Real
  isoccultatedbyearth : Bool
  europa : Europa


  @owner("Radio/Gravity Science")
  @name("Gravity Science Altitude")
  @text("Flyby altitudes less than or equal to 100 km.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("unnamed18")
  @units("km")
  req ValidAltitude: 25.0 < altitude && altitude <= 100.0

  @owner("Radio/Gravity Science")
  @name("Measure k2")
  @text("The gravity science data set shall be sufficient
  		to determine degree-two time-dependent gravity field,
		to recover k2 amplitude at Europa's orbital frequency
		to 0.05 absolute accuracy.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("Sr.5.1")
  @units("none")
  req Validk2accuracy: 0 <= k2accuracy && k2accuracy <= 0.05

  @owner("Radio/Gravity Science")
  @name("Flybys with no occultation for gravity science")
  @text("The spacecraft shall not be occulted as seen from Earth, 
  		 while the Spacecraft range to the surface of Europa is 
		 less than or equal to 18 Europa radii.")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("Sr.5.1.2")
  @units("Jupiter Europa Radii, none")
  req 0.0 < range && (range <= 18.0 * europa.radius) => isoccultatedbyearth = false
		
}



fun squared2 (x : Real) : Real { x * x }

class Body {
  mass : Real
  radius : Real
  sundistance : Real
  gravity : Real
  density : Real

  fun TwoBodyGravity1(body1 : Body, body2 : Body) : Real {
    6.74E-11*body1.mass*body2.mass/squared2(body1.sundistance-body2.sundistance)
  }
}

class Jupiter extends Body {
  @units("kg")
  req mass = 1.898E27
  @units("km")
  req radius = 69911.0
  @units("km")
  req sundistance = 7.785E8
  @units("m/s^2")
  req gravity = 24.79
  @units("g/cm^3")
  req density = 1.33
}

class Europa extends Body {
  @units("kg")
  req mass = 4.7998E22
  @units("km")
  req radius = 1560.8
  @units("m/s^2")
  req gravity = 1.314
  @units("g/cm^3")
  req density = 3.013
}

class Spacecraft extends Body {
  @units("kg")
  req mass = 3100.0
  @units("m/s^2")
  req gravity = 0.0
  @units("g/cm^3")
  req density = 2.70

}

class Earth extends Body {
  @units("kg")
  req mass = 5.972E24
  @units("km")
  req  radius = 6371.0
  @units("km")
  req sundistance = 1.4966E8
  @units("m/s^2")
  req gravity = 9.807
  @units("g/cm^3")
  req density = 5.51
}

class Sun extends Body {
  @units("kg")
  req mass = 1.989E30
  @units("km")
  req  radius = 695800
  @units("km")
  req sundistance = 0.0
  @units("m/s^2")
  req gravity = 28.02
  @units("g/cm^3")
  req density = 1.41
}

assoc JupiterTwoBody {
  source jupiter : Jupiter
  target body : Body [0,*]
}
===
assoc Line2Line {
	 source jupiterTwoBody1 : JupiterTwoBody
	 target jupiterTwoBody2 : JupiterTwoBody [0,*]
}
===
===
class GravitationalForces { 
--  body1 : Body1
--  body2 : Body2
  --reference GravityFunction.k
--  distance : Real
--  acceleration : Real
--  altitude : Real
  
  fun squared (x : Real) : Real { x * x } --needs to be in class for now, Rahul working issue
  
--  fun TwoBodyGravity (Body1 : class, Body2 : class) : Real {
--  	  6.74E-11*Body1.mass*Body2.mass/squared(Body1.sundistance-Body2.sundistance)
--  }

--  fun Eur_Jup_Gravity2 : Real { -- For Testing Purposes
--  	 1222000.6*2.5
--  }
}


class HyperbolicArc extends Requirements {
  incomingascention : Real
  incomingdeclination : Real
  turnangle : Real
  outgoingascention: Real
  outgoingdeclination : Real
  velocity : Real

  req ValidVelocity : 0 < velocity
}

PerfectTraj : HyperbolicArc
ActualTraj : HyperbolicArc

fun Delta : Real {
	PerfectTraj.velocity - ActualTraj.velocity
}
===

-----------------------------------------------------------------------------
-----------------------------------------------------------------------------
-----------------------------------------------------------------------------

=============================
--MAIN GravityScienceConcept 
=============================
  JupiterMain : Jupiter
  EuropaMain : Europa
  SpacecraftMain : Spacecraft
  EarthMain : Earth
  SunMain : Sun
  Jupiter_Europa : JupiterTwoBody = JupiterTwoBody(jupiter::JupiterMain, body::EuropaMain)
  Jupiter_Spacecraft : JupiterTwoBody = JupiterTwoBody(jupiter::JupiterMain, body::SpacecraftMain)
  Jupiter_Earth : JupiterTwoBody = JupiterTwoBody(jupiter::JupiterMain, body::EarthMain)
  Jupiter_Sun : JupiterTwoBody = JupiterTwoBody(jupiter::JupiterMain, body::SunMain)
  GravSci_ReqsMain : GravSci_Reqs
  Telecom_ReqsMain : Telecom_Reqs
  Instrument_ReqsMain : Instrument_Reqs
  Radio_Reqs_AMain : Radio_Reqs_A
  Radio_Reqs_BMain : Radio_Reqs_B
  RadioGravSci_ReqsMain : RadioGravSci_Reqs

--RELATIONSHIPS BETWEEN BODIES
  BodiesOnSameSideOfSun : Bool 
  req Aignment1 : BodiesOnSameSideOfSun = true
  req EuropaMain.sundistance = JupiterMain.sundistance - 607900.0
  req SpacecraftMain.sundistance = (EuropaMain.sundistance - 1560.8 - RadioGravSci_ReqsMain.altitude)
  req Distance : JupiterMain.sundistance > EuropaMain.sundistance 
  	  			  && EuropaMain.sundistance  > SpacecraftMain.sundistance
				  && SpacecraftMain.sundistance > EarthMain.sundistance
				  && EarthMain.sundistance > SunMain.sundistance

--Checks
--------
--req RadioGravSciReqsMain.altitude = EuropaMain.sundistance - 1560.8 - SpacecraftMain.sundistance
--altTest : Real =  RadioGravSciReqsMain.altitude
--altitudeofclipper : Real =  EuropaMain.sundistance - 1560.8 - SpacecraftMain.sundistance
--euorpafromjupiter : Real = JupiterMain.sundistance - EuropaMain.sundistance
 


--Testing Functions
-------------------


--  JupiterEarth : Real = TwoBodyGravity1(JupiterMain, EarthMain)
--  JupiterEarth = TwoBodyGravity1(JupiterMain, EarthMain)





JupiterEarth_Gravity : Real = JupiterMain.TwoBodyGravity1(JupiterMain, EarthMain)
JupiterEuropa_Gravity : Real
--JupiterSpacecraft_Gravity : Real
JupiterSun_Gravity : Real
JupiterMass : Real = JupiterMain.mass
EarthMass : Real = EarthMain.mass
EuropaMass : Real = EuropaMain.mass
SpacecraftMass : Real = SpacecraftMain.mass
SunMass : Real = SunMain.mass
JupiterSundistance : Real = JupiterMain.sundistance
EarthSundistance : Real = EarthMain.sundistance
EuropaSundistance : Real = EuropaMain.sundistance
SpacecraftSundistance : Real = SpacecraftMain.sundistance
SunSundistance : Real = SunMain.sundistance
--req JupiterEarth_Gravity = 6.74E-11 * JupiterMass * EarthMass / squared2(JupiterSundistance - EarthSundistance)
req JupiterEuropa_Gravity = 6.74E-11 * JupiterMass * EuropaMass / squared2(JupiterSundistance - EuropaSundistance)
--req JupiterSpacecraft_Gravity = 6.74E-11 * JupiterMass *SpacecraftMass / squared2(JupiterSundistance - SpacecraftSundistance)
req JupiterSun_Gravity = 6.74E-11 * JupiterMass * SunMass / squared2(JupiterSundistance - SunSundistance)


==========
REFERENCES

https://europaems.jpl.nasa.gov/alfresco/mmsapp/mms.html#/workspaces/master/sites/europa/documents/_17_0_2_3_8af0285_1397508626305_93460_77066/views/_17_0_2_3_897027c_1405552682318_913452_67432

==========