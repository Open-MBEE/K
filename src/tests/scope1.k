-- negative example, should not type check

x : Int
y : Int

class A {
  z : Int

  fun foo(x : Int) : Int {
    if (x > 0) then {
      y : Int
      y : String
      x
    }
  }

}
  