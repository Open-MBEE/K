
class A {
  a : Int
  fun f(k:Int):Int { a + k }
}

class B {
  iA : A
  b : Int
  fun g(k:Int):Int { iA.f(iA.a+b+k)}
}

class C {
  iA : A
  c : Int
  fun h(k:Int):Int { iA.f(iA.a+c+k)}
}

class D {
  iB : B
  iC : C
  d  : Int
  req iB.iA = iC.iA
  fun i(k:Int): Int { iB.iA.a + iB.b + iC.c + d + k}
}

class Master {
  d : D
  fun main: Int {  d.iB.iA.f(1) + d.iB.g(1) + d.i(1) }
}
