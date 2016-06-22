package ValueTypes

class Dose {
	value : Real
	unit : String = "Mrad"
	
	req value >= 0.0
}

class DataRate {
	value : Real
	unit : String = "Mbit/day"
	
	req value >= 0.0
}

class DeltaV {
	value : Real
	unit : String = "m/s"
}

class Mass {
	value : Real
	unit : String = "kg"
	
	req value >= 0.0
}

class DataSize {
	value : Real
	name : String = "Mbits"
	
	req value >= 0.0
}