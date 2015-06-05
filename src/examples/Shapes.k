package examples.Shapes

class Shape {
  fun sides : Int
  fun area : Int
}

class Triangle extends Shape {

  a : Int
  b : Int
  c : Int
  base : Int
  height : Int
    
  req Angles: (a + b + c) = 180
  
  req Range: 
    a < 180 && b < 180 && c < 180 && 
    a > 0 && b > 0 && c > 0

  ======================================================
  
  ======================================================

  req a = b && b = c
  req Equilateral: a = b && b = c => a = 60 && b = 60 && c = 60  

  ======================================================
  
  ======================================================
  req Isosceles: (b = c) || (a = b) || (a = c)
  ======================================================
  The following requirement makes the class unsatisfiable
  if the triangle is Isosceles or Equilateral.  
  

  ======================================================
  req ObtuseAngle: a >= 90
  
  fun area : Real {
    base * height / 2  
  }
  
  req ValidArea: base * height > 0 && height > 10
  req ValidAreaFunction: area() > 10
  
  fun isIsosceles : Bool {
    a = b || b = c || a = c
  }
  
  fun isEquilateral : Bool {
    a = b && b = c
  }
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

  ar = area()
}


