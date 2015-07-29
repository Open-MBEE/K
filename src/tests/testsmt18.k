
class Body {
  mass : Int
}

class Planet extends Body {
  distanceToEarth : Int
}

class Moon extends Body {
  planet : Planet
}

jupiter : Planet = Planet(mass :: 50000, distanceToEarth :: 588000000)
europa  : Moon = Moon(mass :: 1, planet :: jupiter)

fun getPlanet(moon: Moon) :Planet {
  moon.planet
}

class Trip {
  missionStudy : Body
  firstStop : Body = europa
  secondStop : Body = getPlanet(firstStop)

  req missionStudy = europa
}

trip : Trip
