
max : Int

req max = 1000

fun double(x:Int):Int {
  x + x
}

class A {
  a_500 : Int

  req double(a_500) = max
}

instA : A

class B {
  b_1000 : Int = double(instA.a_500)
}

X : Int
Y : Int

req X >= 0
req Y >= 0

fun sum : Int { X + Y }

class C {
  req X + Y >= 10

  req sum() <= 10
}