
fun one : Int { 1 }
 
class X {
  fun f : Int {
    one()
  }
}

x : X

r_1 : Int = x.f()
