package examples.GravityScience

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

class GravSciReqs extends Requirements {
 
  angle_ClipperEarthSun : Real
  latitude_Clipper : Real
  longitude_Clipper : Real
 
  @owner("Gravity Science Concept")
  @text("The closer the angular distance is to the sun, 
  	     the worse the Solar Scintillation gets. 
         20 is the lowest you want to do")
  @afid("CT xx.xxx")
  @maturity("?")
  @ID("xxx")
  @units("degrees")  
  req ValidAngle: 20.0 <= angle_ClipperEarthSun && angle_ClipperEarthSun <= 180.0 

  @owner("Gravity Science Concept")
  @text("A range of latitudes and longitudes is desired for measurements")
  @afid("CT xx.xxx")
  @maturity("?")
  @ID("xxx")
  @units("degrees")
  req ValidLatitude:  ((-40.0) <= latitude_Clipper) && (latitude_Clipper <= 60.0)
}

  =====================================================
  Determine the Telecom Strategy & Opportunities Constraints
  =====================================================
class TelecomReqs extends Requirements {

  isDSNsatisfieable : Bool

  @owner("Gravity Science InstrumenTelecom Strategy & Opportunities")
  @name("Gravity Science Capability")
  @text("The mission Operations System shall base gravity science
         measurements on radiometric data provided by the DSN")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("TSO.15")
  @units("n/a")
  req ValidGSCapability: isDSNsatisfieable = true
}

  =====================================================
  Determine the Instrument Constraints
  =====================================================
class InstrumentReqs extends Requirements {

  GSdatacollection : Bool
  GSsignal : Bool
  measurement_accuracy: Real
  interval : Real
  currentlyMeasuring : Bool
  steradians : Real
  YZwidecoverage : Real
  YZorthogonalcoverage : Real

  @owner("Gravity Science Instrument")
  @name("Gravity Science Data Collection")	
  @text("The gravity science investigation shall be able to 
  		 collect its data, during flybys, while the spacecraft 
         nadir deck is pointed at Europa center of mass.")
  @afid("CT 102.607")
  @maturity("Identified")
  @ID("id")
  @units("n/a")
  req ValidGSdatacollection: GSdatacollection = true

  @owner("Gravity Science Instrument")
  @name("Gravity Science Signal")
  @text("The gravity science subsytem shall accept an uplink
  		 signal, and turn it around for downlink, to provide
 		 a radio science signal for performing gravity field
		 measurements during Europa flybys")
  @afid("CT 102.606")
  @maturity("Identified")
  @ID("id")
  @units("n/a")
  req ValidGSdatacollection: GSsignal = true

  @owner("Gravity Science Instrument")
  @name("Gravity Science Measurement Accuracy")
  @text("The GS subsystem shall provide for a Doppler accuracy
  	     of <= 0.07 mm/s over a 60-sec (TBC) interval during
		 Europa Flybys.")
  @afid("CT 100.702")
  @maturity("Identified")
  @ID("476")
  @units("absolute and seconds")
  req ValidMeasurementAccuracy: 0 < measurement_accuracy && 
                                measurement_accuracy <= 0.1 && 
                                interval <= 60.0

  req CurrentlyMeasuringAccuracy: currentlyMeasuring => 
                                    0 < measurement_accuracy && 
                                    measurement_accuracy <= 0.1
  
  req currentlyMeasuring

===
Fun accuracy (t : Int)  -- this is supposed to tell us the accuracy 
that we are experiencing at any given time could let it be unimplemented

Fun measuring(t : Int) --this Is supposed to tell us if we are currently 
measuring or not could let it be unimplemented

Fun start(t : Int) { measuring(t) && !measuring(t-1)}
Fun stop(t : Int) {measuring(t) && !measuring(t+1)}
Fun interval(t1 : Int, t2: Int) { start(t1) && stop(t2) &&
           forall t : Int :- t1 <= t <= t2 => measuring(t) }

Forall t : Int :- interval(t) => accuracy(t) = 0.07 -- or whatever 
constraint you want to put on the accuracy
===


  @owner("Gravity Science Instrument")
  @name("Gravity Science Measurement Pointing")
  @text("The FS shall provide coverage over TBD steradians 
  		  without blockage (view to Earth) during Europa flybys
		  coverage. ")
  @afid("CT 100.699")
  @maturity("Identified")
  @ID("473")
  @units("steradians, degrees, degrees")
  -- 97 is just a place holder
  req ValidGSMeasurementPointing: 0.0 <= steradians && steradians <= 97.0 && 
      270.0 <= YZwidecoverage && YZwidecoverage <= 360.0  &&
	  20.0 <= YZorthogonalcoverage && YZorthogonalcoverage <= 360.0
 }

  =====================================================
  Determine the Radio Constraints
  =====================================================
class RadioReq extends Requirements {

  GS_uplink_pt_no : Real
  GS_boresight_pointing_error : Real
  DSN : Int = 34
  fanbeam_boresight_alignment : Real
  xband_downlink_pt_no : Real
  GS_downlink_pt_no : Real
  twowayDoppleraccuracy : Real
  twowayDoppler_PcNo : Real
  GravSciXband_Coherency : Bool
  TelecomTurnaroundGS : Bool
  GS_EIRP : Real
  GSA_GT : Real

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
  req ValidPowerNoise: 0.0 <= xband_downlink_pt_no &&  xband_downlink_pt_no <= 10.0 && DSN = 34

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

  @owner("Radio")
  @name("2-way Doppler accuracy")
  @text("Provide a Doppler accuracy of 0.1 mm/sec (1 sigma) for a 
  		 60-sec integration time when the SEP >20 deg (TBR) and the 
		 recovered downlink Pc/No is > 10 dB")
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
class RadioGravSciReqs extends Requirements {

  range : Real
  altitude : Real
  k2accuracy : Real
  isoccultatedbyearth : Bool

  @owner("Radio/Gravity Science")
  @name("Gravity Science Altitude")
  @text("Flyby altitudes less than or equal to 100 km")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("unnamed18")
  @units("km")
  req ValidAltitude: 0.0 < altitude && altitude <= 100.0

  @owner("Radio/Gravity Science")
  @name("Measure k2")
  @text("The gravity science data set shall be sufficient
  		to determine degree-two time-dependent gravity field,
		to recover k2 amplitude at Europa's orbital frequency
		to 0.05 absolute accuracy")
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
  @units("none and Jupiter Europa Radii")
  req ValidNoOccultation: (isoccultatedbyearth = false)
  	  					    && range <= 18.0 * europa.radius
--req while (range <= 18.0 * Europa.radius) do {
--		isocculatedbyearth = false
--		}
--
--  Redundant with reqs below for Jupiter, Europa, & Clipper classes
--  req Jupiter.sundistance > Europa.sundistance > Clipper.sundistance

}

radioGravSciReqs : RadioGravSciReqs

class Body {
  mass : Real
  radius : Real
  sundistance : Real
  gravity : Real
  density : Real

}

class Jupiter extends Body {
  @units("kg")
  --req mass = 1898000000000000000000000000.0 --E27
  req mass = 1.898E27
  @units("km")
  req radius = 69911.0
  @units("km")
  --req sundistance = 778500000.0
  req sundistance = 7.785E8
  @units("m/s^2")
  req gravity = 24.79
  @units("g/cm^3")
  req density = 1.33
}

class Earth extends Body {
  @units("kg")
  --req mass = 5972000000000000000000000.0 --E24
  req mass = 5.972E24
  @units("km")
  req  radius = 6371.0
  @units("km")
  --req sundistance = 149600000.0
  req sundistance = 1.4966E8
  @units("m/s^2")
  req gravity = 9.807
  @units("g/cm^3")
  req density = 5.51
}

class Europa extends Body {
  @units("kg")
 -- req mass = 4799800000000000000000.0 --E22 
  req mass = 4.7998E22
  @units("km")
  req radius = 1560.8
  @units("km")
--  req (Jupiter.sundistance - 607900.0) < sundistance && 
--  	   sundistance < (Jupiter.sundistance + 607900.0)
  @units("m/s^2")
  req gravity = 1.314
  @units("g/cm^3")
  req density = 3.013
}

class Clipper extends Body {
  @units("kg")
  req mass = 3100.0
  @units("km")
  req (europa.sundistance - 18.0 * europa.radius) < sundistance && 
  	   sundistance < (europa.sundistance - 1560.8)
}

europa : Europa

--req (Europa.sundistance - 18.0 * Europa.radius) < sundistance && 
  --	   sundistance < (Europa.sundistance - 1560.8)

--req (Jupiter.sundistance - 607900.0) < sundistance && 
  	   --sundistance < (Jupiter.sundistance + 607900.0)


class GravitationalForces { 
  --reference GravityFunction.k
  Eur : Europa
  Jup : Jupiter
  Ear : Earth
  Clip : Clipper
  distance : Real
  acceleration : Real
  altitude : Real
  
  fun squared (x : Real) : Real { x * x }
  
  fun Eur_Jup_Gravity : Real {
  	  6.74E-11*Eur.mass*Jup.mass/squared(Jup.sundistance-Eur.sundistance)
  }

  fun Eur_Jup_Gravity2 : Real {
  	 1222000.6*2.5
  }
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