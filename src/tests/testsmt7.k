
class A {
  a : Int = 1
  fun f(k:Int):Int { a + k }
}

class B {
  iA : A 
  b : Int = 2
  fun g(k:Int):Int { iA.f(iA.a+b+k)}
}

class C {
  iA : A
  c : Int = 3
  fun h(k:Int):Int { iA.f(iA.a+c+k)}
}

class D {
  iB : B
  iC : C
  d  : Int = 4
  req iB.iA = iC.iA
  fun i(k:Int): Int { iB.iA.a + iB.b + iC.c + d + k}
}

class Master {
  d : D

  fun main: Int {  d.iB.iA.f(1) + d.iB.g(2) + d.i(3) }

  RESULT : Int = main + main -- 42 (main = 21)

  -- req r = 21
}

