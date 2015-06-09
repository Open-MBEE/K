-- This is a negative example to test the type checker. 
-- Cyclic inheritance is disallowed. 

class A extends C
class B extends A
class C extends B