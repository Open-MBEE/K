

====================
Things to translate:
====================

-- [ ] classes
--     [x] definition of class
--     [x] type parameters 
--     [ ] sub-classing
-- [ ] fields in classes
--     [x] val 
--     [ ] multiplicities
--     [ ] part
-- [x] functions in classes
--     [x] pure functions
--     [.] pre/post conditions for pure functions
--         [x] pre => post (wp)
--         [ ] assertion after each call
--         [ ] assumption
-- [x] requirements
-- [.] type declarations
-- [ ] types
--     [x] primitive types
--     [x] classes
--     [ ] classes parameterized with types
--     [.] sets, bags, and lists
--     [x] cartesian product
--     [ ] function types
--     [ ] predicate subtypes
--------------------------------------------------------
-- [ ] imperative constructs
--     [ ] var
--     [ ] functions with side effects
--     [.] pre/post conditions for imperative functions
--         [x] pre => post (wp)
--         [ ] assertion after each call
--         [ ] assumption

class X {
  f(x:Int) : (Int -> Int) * Bool {
    (x -> x + 1,true)
  }
}

class A {
  x : Int

  fun incr(k:Int):Int {
    x + k
  }

  req x > 0 
}

-- (declare-datatypes () ((A (mkA (x Int)))))
--
-- (define-fun A.incr ((this A) (k Int)) Int
--   (+ (x this) k)
-- )
--
-- (define-fun inv-A ((this A)) Bool
--   (> (x this) 0) 
-- )
-- 
-- (assert (exists ((this A)) (inv-A this)))

class Container[T] {
  x : T

  fun equals(y:T) {x = y}
}

-- (declare-datatypes (T) ((Container (mkContainer (x T)))))
--
-- (define-fun Container.Int.equals ((this (Container Int)) (y Int)) Bool
--   (= (x this) y)
-- )
--
-- (define-fun Container.Bool.equals ((this (Container Bool)) (y Bool)) Bool
--   (= (x this) y)
-- )

class A {
  x : Int

  fun incr(k:Int):Int {
    x + k
  }

  req x > 0 
}

class B extends A {
  y : Int

  fun inBetween(k: Int): Bool {
    x <= k and k <= y
  }
}

class C {
  fun f(a:A):A {
    a
  }

  b : B

  req f(b) = b

}

-- (declare-datatypes () ((A (mkA (x Int)))))
--
-- (define-fun A.incr ((this A) (k Int)) Int
--   (+ (x this) k)
-- )
--
-- (define-fun inv-A ((this A)) Bool
--   (> (x a) 10) 
-- )
-- 
-- (assert (exists ((this A)) (inv-A this)))


class MyInt {
  x : Int
  y : Int
  a : A 

-- (declare-datatypes () ((MyInt (mkMyInt (x Int) (y Int) (a A)))))

  fun abs : Int 
    post $result >= 0
  {
    if x < 0 -x else x
  }

-- (define-fun MyInt.abs ((this MyInt)) Int
--   (ite (< (x this) 0) (- (x this)) (x this))
-- )
--
-- (assert (forall ((this MyInt)) (>= (MyInt.abs this) 0)))

  fun checkSquare: Bool {
    x * x = y
  }

-- (define-fun MyInt.checkSquare ((this MyInt)) Bool
--   (= (* (x this) (x this)) (y this))
-- )

  req checkSquare()

-- (define-fun inv-MyInt.1 ((this MyInt)) Bool
--   (MyInt.checkSquare this)
-- )

  fun f(k:Int):A {
    A(x=k)
  }

-- (define-fun MyInt.f ((this MyInt)(k Int)) A
--   (mkA k)
-- )

  req forall z : Int . f(z).x = z

-- (define-fun inv-MyInt.2 ((this MyInt)) Bool
--   (forall ((z Int)) 
--     (= (x (MyInt.f this z)) z)
--   )
-- )

-- (assert (forall ((x Int)) (= (a (MyInt.f x)) x)))

  req f(x).a = x

  type SillyTuple = Int * Bool

-- (declare-datatypes (T1 T2) ((Tuple2 (mkTuple2 (fst T1) (snd T2)))))

  fun sillyRep(x:Int) : SillyTuple {
    Tuple(if x < 0 then -x else x,x>=0)
  }

-- (define-fun MyInt.sillyRep ((x Int)) (Tuple2 Int Bool)
--   (mkTuple2 (ite (< x 0) (- x) x) (>= x 0))
-- )

  fun sillyNeg(t : SillyTuple): SillyTuple {
    Tuple(x#1,!x#2)
  }

  req sillyNeg(sillyRep(-1))#1 = 1

-- (define-fun MyInt.sillyNeg ((t (Tuple2 Int Bool))) (Tuple2 Int Bool)
--    (mkTuple2 (fst t) (! (snd t)))
-- )

  req sillyNeg(sillyRep(-1))#2 = false

}

mi : MyInt = MyInt(x=1,y=2)


