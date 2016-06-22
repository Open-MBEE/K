package PlannedTrajectory

import Temporal
import ValueTypes

class PlannedTrajectory {
	predictedTotalIonizingDose : Dose
	compatibleWithLaunchVehicle : Bool
	deltaVBudget : DeltaV
		
	telemetryEvent : Event
	launchVehicleSeparation : Event
	--dsnTrack : Event
	--downlink : Event
	
	--req downlink.during(dsnTrack)
	
	--input number from physics analysis 
	req deltaVBudget.value = 1000.0
	
	@AFID("RQ102.102")
	@Name("Mission Delta-V")
	@Text("The ∆V budget needed to execute the planned trajectory shall be no greater than 1695 m/s.")
	@RelatedConstraint("CT100.050 [Prelim] (from Mission Concept)")
	req deltaVBudget.value <= 1695.0
	
	--simulating input value from (External) physics analysis 
	req predictedTotalIonizingDose.value = 2.0
	
	@AFID("RQ102.104")
	@Name("Maximum Radiation Environment")
	@Text("The Flight System Planned Trajectory shall limit the predicted total ionizing dose (TID) over the prime mission to be less than 3.0 Mrad(Si) behind a 100 mil spherical aluminum shell.")
	@RelatedConstraint("CT100.058 [Prelim] (from Mission Concept)")
	req predictedTotalIonizingDose.value < 3.0
}

