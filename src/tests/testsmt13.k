
class A {
  a : Int 
}

class B extends A {
  b : Int
}

class C extends B {
  c : Int
}

class D {
  d : Int
} 

a : A = C(a :: 1, b :: 2, c :: 3)

req a is A
req a is B
req a is C
-- req a is D

