package Temporal

class Time {
	value : Real
	
	fun within(e : Event) : Bool {
		value >= e.start.value && value <= e.end.value
	}
}

class Event {
	start : Time
	end	: Time
	duration : Time
	
	req duration.value = end.value - start.value
	req end.value >= start.value
	
	--implementing Allen Interval Logic:
	fun before (e : Event) : Bool {
        end.value < e.start.value
    }
    fun meets (e : Event) : Bool {
        end.value = e.start.value
    }
	fun overlaps (e : Event) : Bool {
		end.value > e.start.value && end.value <= e.end.value
	}
	fun starts (e : Event) : Bool {
		start.value = e.start.value && end.value <= e.end.value
	}
	fun during (e : Event) : Bool {
		start.value > e.start.value && end.value < e.end.value
	}
	fun finishes (e : Event) : Bool {
		start.value > e.start.value && end.value = e.end.value
	}
	fun equals (e : Event) : Bool {
		start.value = e.start.value && end.value = e.end.value
	}
}

	