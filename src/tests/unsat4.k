========
Both classes A and C are unsatisfiable.
But K will stop at the first one before it can 
proceed to discover the second unsatisfiability. 
========

class A {
  x : Int

  req x < 0

  req x + 0 > 10

}

class B {

  y : Int

  req y > 100

}

class C {

  z : Int

  req z < 10

  req z * 1 > 10

}