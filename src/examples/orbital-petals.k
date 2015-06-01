package examples.petal

class <act> Activity {
	t1 : Real
	t2 : Real
	active : Int
	duration : Real
}

class Schedule {

=============================================
Issues as I go:
- I would like to see properties and requirements defined at the class level to be part of the satisfiability problem and reported out when solutions are given for classes that have properties typed by these classes (e.g., start time must be before end time, definition of duty cycle, etc.). In this example - I would like to be able to migrate some of my more basic constraints out of the Schedule class and down into the Activity class.
- Reporting of fractions as decimals (something like 2-3 significant figuress)
- I would like to be able to get some number of viable solutions generated

General questions: I've done a number of formulas for constraints to make activities border each other, not overlap, etc. Are there better / standard / more concise constraints I could have formulated instead? I don't want to kick off a research project, just know if I'm overlooking some obvious best practices.

=============================================

	part intAct : IntegratorActivity
	part telAct : TelecomActivity
	part intAct2 : IntegratorActivity
	part telAct2 : TelecomActivity

	allStart : Real
	allEnd : Real

	req startTime :
		allStart = 0.0

	req endTime :
		allEnd = 20.0

============================================
Force start and end times of activities to match

===========================================

	req touchingTimes :
		(intAct.t1 = telAct.t2 ||
		 intAct.t1 = intAct2.t2 ||
		 intAct.t1 = telAct2.t2 ||
		 intAct.t1 = allStart) &&
		(telAct.t1 = intAct.t2 ||
		 telAct.t1 = intAct2.t2 ||
		 telAct.t1 = telAct2.t2 ||
		 telAct.t1 = allStart) &&
		(intAct2.t1 = telAct.t2 ||
		 intAct2.t1 = intAct.t2 ||
		 intAct2.t1 = telAct2.t2 ||
		 intAct2.t1 = allStart) &&
		(telAct2.t1 = intAct.t2 ||
		 telAct2.t1 = intAct2.t2 ||
		 telAct2.t1 = telAct.t2 ||
		 telAct2.t1 = allStart)

=============================================
Remove overlapping solutions - had to fake ABS function

===========================================

	req nonOverlap:
		(
		 ((((intAct.t2 - intAct.t1) < (intAct.t2 - intAct2.t1)) && (intAct.t2 - intAct2.t1 > 0)) ||
			(intAct.t2 - intAct.t1 <= 0))
			&&
		((((intAct.t2 - intAct.t1) < (intAct.t2 - telAct.t1)) && (intAct.t2 - telAct.t1 > 0)) ||
			(intAct.t2 - telAct.t1 <= 0))
			&&
		((((intAct.t2 - intAct.t1) < (intAct.t2 - telAct2.t1)) && (intAct.t2 - telAct2.t1 > 0)) ||
			(intAct.t2 - telAct2.t1 <= 0))
		)

		&&

		(
		 ((((intAct2.t2 - intAct2.t1) < (intAct2.t2 - intAct.t1)) && (intAct2.t2 - intAct.t1 > 0)) ||
			(intAct2.t2 - intAct.t1 <= 0))
			&&
		((((intAct2.t2 - intAct2.t1) < (intAct2.t2 - telAct.t1)) && (intAct2.t2 - telAct.t1 > 0)) ||
			(intAct2.t2 - telAct.t1 <= 0)) &&
		((((intAct2.t2 - intAct2.t1) < (intAct2.t2 - telAct2.t1)) && (intAct2.t2 - telAct2.t1 > 0)) ||
			(intAct2.t2 - telAct2.t1 <= 0))
		)

		&&

		(
		 ((((telAct.t2 - telAct.t1) < (telAct.t2 - telAct2.t1)) && (telAct.t2 - telAct2.t1 > 0)) ||
			(telAct.t2 - telAct2.t1 <= 0))
			&&
		((((telAct.t2 - telAct.t1) < (telAct.t2 - intAct.t1)) && (telAct.t2 - intAct.t1 > 0)) ||
			(telAct.t2 - intAct.t1 <= 0))
			&&
		((((telAct.t2 - telAct.t1) < (telAct.t2 - intAct2.t1)) && (telAct.t2 - intAct2.t1 > 0)) ||
			(telAct.t2 - intAct2.t1 <= 0))
		)

		&&

		(
		 ((((telAct2.t2 - telAct2.t1) < (telAct2.t2 - telAct.t1)) && (telAct2.t2 - telAct.t1 > 0)) ||
			(telAct2.t2 - telAct.t1 <= 0))
			&&
		((((telAct2.t2 - telAct2.t1) < (telAct2.t2 - intAct.t1)) && (telAct2.t2 - intAct.t1 > 0)) ||
			(telAct2.t2 - intAct.t1 <= 0)) &&
		((((telAct2.t2 - telAct2.t1) < (telAct2.t2 - intAct2.t1)) && (telAct2.t2 - intAct2.t1 > 0)) ||
			(telAct2.t2 - intAct2.t1 <= 0))
		)

=============================================
Also require someone to be the activity that touches the end

=============================================
	req ending :
		(intAct.t2 = allEnd || telAct.t2 = allEnd || intAct2.t2 = allEnd || telAct2.t2 = allEnd)

	req ordering :
		(intAct.t1 < intAct.t2) && (telAct.t1 < telAct.t2) && (intAct2.t1 < intAct2.t2) && (telAct2.t1 < telAct2.t2) &&
		(0 <= intAct.t1 && 0 <= telAct.t1 && 0 <= intAct2.t1 && 0 <= telAct2.t1) &&
		(intAct.t2 <= allEnd && intAct2.t2 <= allEnd && telAct.t2 <= allEnd && telAct2.t2 <= allEnd)

	req dutyCycleIntegrator :
		0.0 <= intAct.dutyCycle && intAct.dutyCycle <= 1.0

	req dutyCycleEnergyIntegrator :
		intAct.energyUsed = intAct.dutyCycle * (intAct.t2 - intAct.t1) * 300.0

	req maxEnergyIntegrator :
		intAct.energyUsed < 2000.0

	req dutyCycleTelecom :
		0.0 <= telAct.dutyCycle && telAct.dutyCycle <= 1.0

	req dutyCycleEnergyTelecom :
		telAct.energyUsed = telAct.dutyCycle * (telAct.t2 - telAct.t1) * 275.0

	req maxEnergyTelecom :
		telAct.energyUsed < 2000.0

	req dutyCycleTelecom2 :
		0.0 <= telAct2.dutyCycle && telAct2.dutyCycle <= 1.0

	req dutyCycleEnergyTelecom2 :
		telAct2.energyUsed = telAct2.dutyCycle * (telAct2.t2 - telAct2.t1) * 275.0

	req maxEnergyTelecom :
		telAct.energyUsed < 2000.0

	req maxEnergyTelecom :
		telAct2.energyUsed < 2000.0

	req dutyCycleIntegrator2 :
		0.0 <= intAct2.dutyCycle && intAct2.dutyCycle <= 1.0

	req dutyCycleEnergyIntegrator2 :
		intAct2.energyUsed = intAct2.dutyCycle * (intAct2.t2 - intAct2.t1) * 300.0

	req maxEnergyIntegrator2 :
		intAct2.energyUsed < 2000.0

	req dataDown :
		telAct.dataDown = telAct.dutyCycle * (telAct.t2 - telAct.t1) * 40.0

	req dataDown2 :
		telAct2.dataDown = telAct2.dutyCycle * (telAct2.t2 - telAct2.t1) * 40.0


	req minDataDown :
		(telAct.dataDown + telAct2.dataDown) > 450.0

}

act IntegratorActvity {
	dutyCycle : Real
	energyUsed : Real
}

act TelecomActivity {
	dutyCycle : Real
	energyUsed : Real
}

