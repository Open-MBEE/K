
ERROR : Int req ERROR < 0
fun CHECK(b:Bool):Int {if b then 42 else ERROR}

class A {
  x : Int = 1
  y : Int

  fun sum : Int {
     x + y
  }

  req x < y

  RESULT_A : Int = CHECK(x = 1 && x < y)
}

class B extends A {
  z : Int
  a1 : A
  a2 : A = A(y :: 17) 
  a3 : A = if z > 3 then A(y :: z+9) else A(y :: 33)

  req a1.y < z
  req y + 10 < z
  req sum > 10

  RESULT_B : Int = CHECK(a2.y = 17 && a3.y = z+9 && a1.y < z && y + 10 < z && sum > 10)
}

inst1A : A = A(x :: 1,y :: 2) 
inst2A : A = A(y :: 2) 

inst1B : B = B(a1 :: inst1A, z :: 200) 

RESULT : Int = 
  CHECK(
    inst1A.x = 1 && 
    inst1A.y = 2 && 
    inst2A.x = 1 && 
    inst2A.y = 2 && 
    inst1B.a1.x = inst1A.x && 
    inst1B.a1.y = inst1A.y && 
    inst1B.z = 200)
