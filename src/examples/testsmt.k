
class A {
  a : Int = 10
}

class B extends A {
  b : Int

  req b = a + 1
}

class C extends B {
  c : Int

  req c = b + 1
}

class D extends C {
  d : Int

  req d = c + 1
}

class E {
  a : A
}

a : A
