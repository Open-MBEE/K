
class Body {
  mass : Int
}

class Planet extends Body {
  distanceToEarth : Int
}

class Moon extends Body {
  planet : Planet
}

jupiter : Planet = Planet(mass :: 1000, distanceToEarth :: 2000)
europa  : Moon = Moon(mass :: 3000, planet :: jupiter)

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
