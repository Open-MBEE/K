
==============
Original spec:
==============

class SC {
  mass : Int

  req p : 10 <= mass && mass <= 15
}

==========
Extension:
==========

class Clipper extends SC {
  bound : Int

  req q: bound = 12 && mass <= bound
}

=======
Proofs:
=======

class ConservativeProof1 {
  B : Int = 40

   -- p & q => p:
   -- incorrectly succeeds when 12
   -- correctly   succeeds when 40

   pandq_impl_p : Bool =
     forall mass, bound : Int :-
       ((10 <= mass && mass <= 15) && (bound = B) && (mass <= bound))
         =>
       (10 <= mass && mass <= 15)

  -- p & q = p:
  -- correctly   fails when 12
  -- incorrectly fails when 40

  pandq_equal_p: Bool =
    forall mass, bound : Int :-
      ((10 <= mass && mass <= 15) && (bound = B) && (mass <= bound))
        =
      (10 <= mass && mass <= 15)
 
}
