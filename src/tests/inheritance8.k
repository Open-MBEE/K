-- Testing layout of fields in datatypes.

===

         A       B         D(bb:B)
             C             E
                   F       G
                       H(tsum:Int)
                          
h:H = H(a:1,...,h:8)
===

class A {
  a : Int
}

class B {
  b : Int
}

class C extends A, B {
  c : Int
}

class D {
  bb : B 
  d : Int
}

class E extends  D {  
  e : Int
}

class F extends C, E {
  f : Int
}

class G extends E {
  ee : E -- before invariant optimization this would not solve.
  g : Int
}

class H extends F, G {
  h : Int 

  tsum : Int = a + b + c + d + e + f + g + h
  
 
}

h : H = H(a :: 1, b :: 2, c :: 3, d :: 4, e :: 5, f :: 6, g :: 7, h :: 8)

RESULT_36 : Int = h.tsum

