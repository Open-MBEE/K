package Spacecraft

import Temporal
import ValueTypes

class Spacecraft{

	@AFID("RQ103.766")
	@Name("Spacecraft Clock")
	@Text("The spacecraft shall include a hardware Spacecraft Clock (see Viewpoint, section 1.1.4), which we call SCLK.")
	@RelatedConstraint("CT102.073 [Prelim] (from Time Management)")
	sclk : SCLK
}

class SCLK {}