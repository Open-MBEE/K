package ProjectSystem

import Temporal
import ValueTypes

import FlightSystem
import MissionOperationsSystem

	annotation AFID : String
	annotation Name : String
	annotation Text : String
	annotation RelatedConstraint : String
	
class ProjectSystem {
	flightSystem : FlightSystem
	missionOperationsSystem : MissionOperationsSystem
	
	====
	@AFID("RQ103.563")
	@Name("Downlink of Quick-look Telemetry Set")
	@Text("A quick-look telemetry set (TBD) shall be downlinked, processed, and delivered to the Operations Team within one-half hour (TBR) of the beginning of a DSN track (BOT).  This summary information shall contain enough information to allow a rapid assessment of the health and status of the flight system within 2 hours (TBR) of BOT.")
	@RelatedConstraint("CT102.178 [Prelim] (from Operability)")
	req flightSystem.plannedTrajectory.downlink.before(missionOperationsSystem.process)
	req missionOperationsSystem.deliver.before(missionOperationsSystem.operationsTeam.rapidAssessmentOfHealthAndStatus)
	req flightSystem.plannedTrajectory.dsnTrack.start.value + 1800 <= missionOperationsSystem.deliver.end.value
	req flightSystem.plannedTrajectory.dsnTrack.start.value + 7200 <= missionOperationsSystem.operationsTeam.rapidAssessmentOfHealthAndStatus.end.value
	====
}

--atlasV : LaunchVehicle = LaunchVehicle(index :: 1)
--SLS : LaunchVehicle = LaunchVehicle(index :: 2)
--flightSystem : FlightSystem = FlightSystem(launchVehicle :: atlasV)
