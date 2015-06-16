package examples.GravityScience_2

annotation owner : String
annotation name : String
annotation afid : String
annotation maturity : String
annotation ID : Int
annotation units : String

class <GravSci> GravityScience {
  isDSNsatisfieable : Bool
  GSdatacollection : Bool
  GSsignal : Bool
  angle_ClipperEarthSun : Real
  latitude_Clipper : Real
  longitude_Clipper : Real
  measurement_accuracy: Real
  interval : Real
  steradians : Real
  YZwidecoverage : Real
  YZorthogonalcoverage : Real
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
  altitude : Real
  k2accuracy : Real
  currentlyMeasuring : Bool

  ==================================================
  The closer the angular distance is to the sun, 
  the worse the Solar Scintillation gets. 
  20 is the lowest you want to do
  ==================================================
  @owner("Gravity Science Concept")
  @afid("CT xx.xxx")
  @maturity("?")
  @ID(xxx)
  @units("degrees")  
  req ValidAngle: 20 <= angle_ClipperEarthSun && angle_ClipperEarthSun <= 180

  @owner("Gravity Science Concept")
  @afid("CT xx.xxx")
  @maturity("?")
  @ID(xxx)
  @units("degrees")
  req ValidLatitude:  ((-20) <= latitude_Clipper) && (latitude_Clipper <= 60)

  =====================================================
  Determine the Telecom Strategy & Opportunities Constraints
  =====================================================

  @owner("Gravity Science InstrumenTelecom Strategy & Opportunities")
  @name("Gravity Science Capability")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID("TSO.15")
  @units("n/a")
  -- The Mission Operations System shall base gravity science 
  -- measurements on radiometric data provided by the DSN.
  req ValidGSCapability: isDSNsatisfieable = true


  =====================================================
  Determine the Instrument Constraints
  =====================================================

  @owner("Gravity Science Instrument")
  @name("Gravity Science Data Collection")
  @afid("CT 102.607")
  @maturity("Identified")
  @ID(id)
  @units("n/a")
  
  -- The gravity science investigation shall be able to 
  -- collect its data, during flybys, while the spacecraft 
  -- nadir deck is pointed at Europa center of mass.
  req ValidGSdatacollection: GSdatacollection = true

  @owner("Gravity Science Instrument")
  @name("Gravity Science Signal")
  @afid("CT 102.606")
  @maturity("Identified")
  @ID(id)
  @units("n/a")
  -- The gravity science subsystem shall accept an uplink signal, 
  -- and turn it around for downlink, to provide a radio science 
  -- signal for performing gravity field measurements during 
  -- Europa flybys.
  req ValidGSdatacollection: GSsignal = true

  @owner("Gravity Science Instrument")
  @name("Gravity Science Measurement Accuracy")
  @afid("CT 100.702")
  @maturity("Identified")
  @ID(476)
  @units("absolute and seconds")
  -- The GS subsystem shall provide for a Doppler accuracy of <= 0.07 mm/s 
  -- over a 60-sec (TBC) interval during Europa Flybys.
  -------------CONFLICT--------------see Requirement Conflicts doc-------
  req ValidMeasurementAccuracy: 0 < measurement_accuracy && 
                                measurement_accuracy <= 0.07 && 
                                interval <= 60

  req CurrentlyMeasuringAccuracy: currentlyMeasuring => 
                                    0 < measurement_accuracy && 
                                    measurement_accuracy <= 0.07
  
  req currentlyMeasuring

  @owner("Gravity Science Instrument")
  @name("Gravity Science Measurement Pointing")
  @afid("CT 100.699")
  @maturity("Identified")
  @ID(473)
  @units("steradians, degrees, degrees")
  -- 3 is just a place holder
  req ValidGSMeasurementPointing: 3 <= steradians && 
      270 <= YZwidecoverage && 20 <= YZorthogonalcoverage

  =====================================================
  Determine the Radio Constraints
  =====================================================

  @owner("Radio")
  @name("Gravity Science X-Band U/L Pt/No")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID(557)
  @units("dB-Hz")
  req ValidUplinkPtNo: 25 <= GS_uplink_pt_no

  @owner("Radio")
  @name("Gravity Science Boresight Pointing Error")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID(7)
  @units("milliradians")
  req ValidBoresightPointingError: GS_boresight_pointing_error <= 8.7

  @owner("Radio")
  @name("FANBEAM Electrical Boresight Alignment")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID(602)
  @units("degrees")
  req ValidBoresightAlignment: fanbeam_boresight_alignment <= 0.25

  @owner("Radio")
  @name("Gravity Science Power/Noise")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID(474)
  @units("dB-Hz")
  req ValidPowerNoise: xband_downlink_pt_no <= 10 && DSN = 34

  @owner("Radio")
  @name("Gravity Science X-Band D/L Pt/No")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID(601)
  @units("dB-Hz")
  req ValidDownlink_pt_no: GS_downlink_pt_no <= 10 && DSN = 34

  @owner("Radio")
  @name("2-way Doppler accuracy")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID(619)
  @units("mm/sec and dB")
  req Valid2WayDopplerAccuracy: twowayDoppleraccuracy <= 0.1 && 10 < twowayDoppler_PcNo

  @owner("Radio")
  @name("Gravity Science X-Band Coherency Requirements")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID(585)
  @units("True/False")
  req ValidGSXband_Coherency : (GravSciXband_Coherency = true)

  @owner("Radio")
  @name("Telecom Turnaround for Gravity Science")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID(475)
  @units("True/False")
  req ValidTelecomTurnaroundGS : (TelecomTurnaroundGS = true)

  @owner("Radio")
  @name("Gravity Science EIRP")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID(582)
  @units("dBm")
  req ValidGS_EIRP: 49.37 < GS_EIRP && DSN = 34

  @owner("Radio")
  @name("GSA_GT")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID(594)
  @units("dB/K")
  req ValidGSA_GT: 21.2 < GSA_GT

  =====================================================
  Determine the Radio/Gravity Science Constraints
  =====================================================

  @owner("Radio/Gravity Science")
  @name("Gravity Science ALtitude")
  @afid("CT xx.xxx")
  @maturity("Identified")
  @ID(unnamed18)
  @units("km")
  req ValidAltitude: altitude <= 100

  @owner("Radio/Gravity Science")
  @name("Measure k2")
  @afid("CT xx.xxx")
  @maturity("Draft")
  @ID("Sr.5.1")
  @units("none")
  req Validk2accuracy: k2accuracy <= 0.05

}