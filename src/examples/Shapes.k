-- PROJECT-db152ecb-e3ab-4ff8-973e-b0a45cca09bf

package examples.Shapes

class Shape {
  fun sides : Int
  fun area : Real
}

class Angle {
  a : Int
  req a > 0 && a < 180
}

class Triangle extends Shape {

  a : Angle
  b : Angle
  c : Angle
  base : Int
  height : Int
    
  req Angles: (a.a + b.a + c.a) = 180
  
  ======================================================
  req Equilateral: a = b && b = c => a = 60 && b = 60 && c = 60    
  ======================================================
  req a.a = b.a && b.a = c.a
  

  ======================================================
  req Isosceles: (b = c) || (a = b) || (a = c)
  ======================================================
  
  ======================================================
  The following requirement makes the class unsatisfiable
  if the triangle is Isosceles or Equilateral.  
    
  req ObtuseAngle: a.a >= 90
  ======================================================

  fun area : Real {
    base * height / 2  
  }
  
  req ValidAreaFunction: area() > 10
  
}

class Rectangle extends Shape {

  a : Int
  b : Int
  c : Int
  d : Int
  ar : Int
  
  req lengths: a = c && b = d
  
  req lengthsGTZero: a > 0 && b > 0
  
  ===========================================================
  The following two requirements make the class unsatisfiable
  Commenting any one of them will make it satisfiable again

  req assertRectangle: a != b
  req assertSquare: c = d
  ===========================================================
  
  fun areaRectangle : Int {
    a * b 
  }
  
  fun isSquare : Bool {
    -- using lengths Req to our advantage
    a = b 
  }

  -- ar = area()
}


t : Triangle
