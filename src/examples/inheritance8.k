
-- Testing layout of fields in datatypes.
-- In H they should preferably be layed out as followx:
--  a b c d e f g h
-- or something close. This is not a semanti issue, it
-- just looks better, a cosmetic issue.

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
  d : Int
}

class E extends  D {
  e : Int
}

class F extends C, E {
  f : Int
}

class G extends E {
  g : Int
}

class H extends F, G {
  h : Int 

  sum : Int = a + b + c + d + e + f + g + h
}

outer_h : H = H(a :: 1, b :: 2, c :: 3, d :: 4, e :: 5, f :: 6, g :: 7, h :: 8)

req outer_h.sum = 36 