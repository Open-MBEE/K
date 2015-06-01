(define-fun MyInt.abs ((mi MyInt)) Int
  (ite (< (x mi) 0) (- (x mi)) (x mi))
)
(declare-datatypes () ((A (mkA (a Int)))))

(define-fun A.incr ((this A) (x Int)) Int
  (+ (a this) x)
)

(declare-datatypes () ((MyInt (mkMyInt (x Int) (y Int)))))

(declare-datatypes (T1 T2) ((Tuple2 (mkTuple2 (fst T1) (snd T2)))))


(define-fun MyInt.abs ((mi MyInt)) Int
  (ite (< (x mi) 0) (- (x mi)) (x mi))
)

(define-fun MyInt.checkSquare ((mi MyInt)) Bool
  (= (* (x mi) (x mi)) (y mi))
)

(define-fun MyInt.f((x Int)) A
  (mkA x)
)

(declare-const intInit Int) ???

(define-fun newMyInt ((k Int)) MyInt ???
  (mkMyInt intInit intInit)
)

(define-fun MyInt.sillyRep ((x Int)) (Tuple2 Int Bool) 
  (mkTuple2 (ite (< x 0) (- x) x) (>= x 0))
)

(define-fun MyInt.sillyNeg ((t (Tuple2 Int Bool))) (Tuple2 Int Bool) 
   (mkTuple2 (fst t) (! (snd t))) 
)  
(assert (forall ((mi1 MyInt)) (>= (MyInt.abs mi1) 0)))

(assert (exists ((mi2 MyInt)) (MyInt.checkSquare mi2)))

(assert (forall ((x Int)) (= (a (MyInt.f x)) x)))

(declare-const mi0 MyInt)
(assert (MyInt.checkSquare mi0))

(assert (= (fst (MyInt.sillyNeg (MyInt.sillyRep (- 1)))) 1))


(assert (= (snd (MyInt.sillyNeg (MyInt.sillyRep (- 1)))) false))

----

(assert (forall ((b B)) (< (x (a b)) 15)))

----
