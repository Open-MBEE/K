
class A {
  x : Int = 1
  y : Int

  fun sum : Int {
     x + y
  }

  req x < y
}

class B extends A {
  z : Int
  a1 : A
  a2 : A = A(y :: 17) 
  a3 : A = if z > 3 then A(y :: z+9) else A(y :: 33)

  req a1.y < z
  req y < z
  req sum > 10
  
}



inst1A : A = A(x :: 1,y :: 2) 
inst2A : A = A(y :: 2) 

inst1B : B = B(a1 :: inst1A, z :: 200) 

