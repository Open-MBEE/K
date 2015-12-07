@noInstances
class A {
  x : Int
}

@noInstances
class B {
  y : Int
} 

class C extends A{
  z : Int
}

class D {
  aobj : A
  bobj : B
}