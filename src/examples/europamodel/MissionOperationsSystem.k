package MissionOperationsSystem

import Temporal
import ValueTypes

class MissionOperationsSystem {
	operationsTeam : OperationsTeam
	
	--process : Event
	--deliver : Event
	
	--req process.before(deliver)
}

class OperationsTeam {
	--rapidAssessmentOfHealthAndStatus : Event
}