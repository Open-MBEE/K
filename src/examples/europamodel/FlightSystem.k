package FlightSystem

import Temporal
import ValueTypes

import Spacecraft
import LaunchVehicle
import PlannedTrajectory

class FlightSystem {
	sc : Spacecraft
	plannedTrajectory : PlannedTrajectory
	launchVehicle : LaunchVehicle
	
	deltaVCapability : DeltaV
	injectedWetMass : Mass
	dataStorageRate : DataRate
	calibrationDataStoragePerJovianOrbit : DataSize
	quickLookTelemetrySet : QuickLookTelemetrySet
	
	req deltaVCapability.value >= plannedTrajectory.deltaVBudget.value
	
	--input number from physics analysis
	req deltaVCapability.value = 2000.0
	
	@AFID("RQ100.025")
	@Name("Flight System Delta-V Capability")
	@Text("The Flight System delta-V capability shall be at least 1669 m/s.")
	@RelatedConstraint("CT100.047 [Prelim] (from Mission Concept)")
	req deltaVCapability.value >= 1669.0
	
	--input number from physics analysis 
	req injectedWetMass.value = 4000.0
	
	@AFID("RQ100.067")
	@Name("Flight System Wet Mass - SLS")
	@Text("If launching on the SLS vehicle, The Flight System injected wet mass shall be less than or equal to 5076 kg.")
	@RelatedConstraint("CT100.049 [Prelim] (from Mission Concept)")
	req launchVehicle.index = 2 => injectedWetMass.value  <= 5076.0
	
	@AFID("RQ104.545")
	@Name("Flight System Wet Mass - EELV")
	@Text("The Flight System injected wet mass shall be less than or equal to 4916 kg if launching on the Atlas V 551.")
	@RelatedConstraint("CT104.809 [Prelim] (from Mission Concept)")
	req launchVehicle.index = 1 => injectedWetMass.value <= 4916.0
	
	--input number from physics analysis 
	req calibrationDataStoragePerJovianOrbit.value = 50.0
	
	@AFID("RQ102.509")
	@Name("Maximum Amount of Calibration Data During Orbital Tour")
	@Text("Calibration data collection and storage shall not exceed TBD [ ] Gbits per Jovian orbit, subject to the maximum NVM data storage volume allocated to each instrument.")
	@RelatedConstraint("CT102.732 [Prelim] (from Information System)")
	req calibrationDataStoragePerJovianOrbit.value <= 100.0
	
	--input number from physics analysis 
	req dataStorageRate.value = 200.0
	
	@AFID("RQ102.023")
	@Name("Expected Engineering Data Volume / Day")
	@Text("The Flight System shall be able to store at least 172 Mbits of engineering data produced per day.")
	@RelatedConstraint("CT102.445 [Prelim] (from Operations Approach)")
	req dataStorageRate.value >= 172.0
	
	@AFID("RQ100.075")
	@Name("FS Provides Status")
	@Text("The Flight System shall provide information on its status (both internal and relative to its surroundings) to the Mission Operations System via a telemetry interface.")
	@RelatedConstraint("CT100.078 [Baseline] (from Mission Concept)")
	telemetryInterface : TelemetryInterface
	
	@AFID("RQ100.176")
	@Name("Autonomous initial acquisition communication")
	@Text("The Spacecraft shall start transmitting telemetry no sooner than launch vehicle separation + TBD [5 seconds] and no later than launch vehicle separation + TBD [6 minutes]. Rationale: Do not transmit into the fairing, but ensure the system starts sending telemetry ASAP.")
	@RelatedConstraint("CT100.703 [Prelim] (from Fault Management)")
	req plannedTrajectory.telemetryEvent.start.value >= plannedTrajectory.launchVehicleSeparation.end.value + 5.0 && plannedTrajectory.telemetryEvent.start.value <= plannedTrajectory.launchVehicleSeparation.end.value + 360.0
	
	@AFID("RQ102.142")
	@Name("Launch Vehicle Options")
	@Text("The baseline Flight System Planned Trajectory shall be compatible with the baseline launch vehicle (SLS).")
	@RelatedConstraint("CT102.157 [Baseline] (from Mission Concept)")
	req launchVehicle.index = 2 => plannedTrajectory.compatibleWithLaunchVehicle
	
	@AFID("RQ103.552")
	@Name("Command Log History")
	@Text("The flight system shall produce a command history log, containing a time-ordered listing of all commands executed within the past TBD days on the flight system.  This includes commands that are sequenced, realtime, and those generated autonomously on board. This log will contain the command stem as well as parameters within the command. The log will contain an indication of command execution status (e.g., successful, failed). This log can be downlinked at the flight team's discretion.")
	@RelatedConstraint("CT102.183 [Prelim] (from Operability)")
	commandHistoryLog : CommandHistoryLog
	
}

class TelemetryInterface {}

class CommandHistoryLog {
	timeOrderedListingOfAllCommands : Data
	commandStem : Data
	commandExecutionStatus : Data
}

class QuickLookTelemetrySet {
	information : Data
}

class Data{}