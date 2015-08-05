class Shape { sides : Int }

class Angle {
  value : Int

  fun eq(other: Angle) : Bool { value = other.value }

  req value >= 0 && value <= 360
}

class TAngle extends Angle {
  req value < 180
}

class Triangle extends Shape {
  a : TAngle 
  b : TAngle 
  c : TAngle

  req sides = 3
  req Angles: a.value + b.value + c.value = 180
}

class  Equilateral extends Triangle {
  req a.eq(b) && b.eq(c) 
}

class Obtuse extends Triangle {
  req a.value > 90 || b.value > 90 || c.value > 90
}