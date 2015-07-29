
fun one : Int { 1 }
 
class X {
  fun f : Int {
    one()
  }
}

x : X

theOne: Int = x.f()

req theOne = 1
