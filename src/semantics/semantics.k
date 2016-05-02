
import ast

=================
SEMANTIC DOMAINS:
=================

class MODEL {
  env  : ENV
  fun heap(r:Int):OBJECT -- what about null?
  fun plus(env:ENV):MODEL
}

class ENV {
  fun dom : Set[STRING]
  fun get(id:STRING): VALUE
  fun plus(env:ENV):ENV
}

class OBJECT {
  classId : STRING
  env : ENV
}

class VALUE
class BOOL_VALUE extends VALUE {bool : Bool}
class INT_VALUE  extends VALUE {int : Int}
class REAL_VALUE extends VALUE {real : Real}
class REF_VALUE  extends VALUE {ref : Int}
class SET_VALUE  extends VALUE {values : Set[VALUE]}
class CLASS_VALUE extends VALUE {objects : Set[OBJECT]}


===================
SEMANTIC FUNCTIONS:
===================

---------------------------
-- Auxilliary functions: --
---------------------------

fun WAIT(s:String) : Bool

-- sets used for modeling Option, not perfect:

fun chooseType(set : Set[Type]):Type
  pre set != Set{}

fun chooseExp(set : Set[Exp]):Exp
  pre set != Set{}

-- assume model stored globally, to ease access to it:

theModel : Model

-- denotation is then obtained from this global model:

fun denotation: Set[MODEL]
{
  semModel(theModel)
}

-- we may want to pass model as argument instead.
-- It is a little bit non-standard.

---------------------------------
fun semModel(m:Model): Set[MODEL]
---------------------------------

req forall m : Model :-
semModel(m) = 
  Set{M | M : MODEL :- satModel(m,M)}


-----------------------------------
fun satModel(m:Model, M:MODEL):Bool
-----------------------------------

req forall m : Model :- forall M : MODEL :-
satModel(m, M) =
  forall decl : TopDecl :- 
    decl isin m.decls => satDecl(decl,M)


-------------------------------------------
fun satDecl(decl: TopDecl, M : MODEL): Bool
-------------------------------------------

req forall ed : EntityDecl :- forall M : MODEL :-
satDecl(ed,M) = 
  if ed.entityToken = ClassToken then
    ed.ident isin M.env.dom() &&
    M.env.get(ed.ident) is CLASS_VALUE &&
    {classValue : CLASS_VALUE = M.env.get(ed.ident) as CLASS_VALUE
     classValue.objects = Set{obj | obj : OBJECT :- entityDeclSatObject(ed,M.plus(obj.env)) }
    }
  else
    WAIT("association")

-------------------------------------------

req forall td : TypeDecl :- forall M : MODEL :-
satDecl(td,M) = {
  td.ident isin M.env.dom() &&
  if (td.ty = Set{}) then
    M.env.get(td.ident) subset Set{v | v : VALUE :- true}
  else
    M.env.get(td.ident) = semType(chooseType(td.ty))
}

-------------------------------------------

req forall pd: PropertyDecl :- forall M : MODEL :-
satDecl(pd, M) = {
  pd.name isin M.env.dom() &&
  M.env.get(pd.name) isin semType(pd.ty).values &&
  (pd.expr != Set{} => {
    exp : Exp = chooseExp(pd.expr)
    evalBoolExp(exp,M)
  }) &&
  (
  forall o : OBJECT :-
    (isInHeap(M,o) =>
      forall p : OBJECT :-
        (hasPart(M,o,p) =>
          !exists o_ : OBJECT :-
            (o_ != o && 
            isInHeap(M,o_) &&
            hasPart(M,o_,p)) 
        )
    ) 
  )
}

-------------------------------------------

req forall cd : ConstraintDecl :- forall M : MODEL :-
satDecl(cd,M) = 
  evalBoolExp(cd.exp,M)


------------------------------------
fun isInHeap(M:MODEL, o:OBJECT):Bool 
------------------------------------
{
  exists r:Int :- M.heap(r) = o
}

------------------------------------------------
fun hasPart(M: MODEL, o:OBJECT,p:OBJECT): Bool 
------------------------------------------------
{
  exists propName : STRING :-
    hasPartProperty(o.classId,propName) && 
    contains(M, o.env.get(propName),p)    
}

---------------------------------------------
fun contains(M:MODEL, v:VALUE, o:OBJECT):Bool
---------------------------------------------
{
  valueIsObject(v,o) || valueContainsObject(v,o)
}

-----------------------------------------
fun valueIsObject(v:VALUE,o:OBJECT): Bool
-----------------------------------------
{
 v is REF_VALUE && {
    refValue : REF_VALUE = v
    M.heap(refValue.ref) = o  
 }
}


-----------------------------------------------
fun valueContainsObject(v:VALUE,o:OBJECT): Bool
-----------------------------------------------
{
  v is SET_VALUE && {
    setValue : SET_VALUE = v
    set : Set[VALUE] = setValue.set
    exists v : VALUE :- v isin set && contains(v,o)
  }
}


-----------------------------------------------------------
fun hasPartProperty(className: STRING, field: STRING): Bool
-----------------------------------------------------------
{
  exists ed : EntityDecl :- 
    ed isin theModel.decls &&
    ed.ident = className &&
    exists pd : PropertyDecl :-
      pd isin ed.members &&
      pd.name = field &&
      Part isin pd.modifiers
} 

-------------------------------------------------------
fun entityDeclSatObject(ed: EntityDecl, M: MODEL): Bool
-------------------------------------------------------
-- TODO

--------------------------------------    
fun evalExp(exp: Exp, M: MODEL): VALUE
--------------------------------------
-- TODO

------------------------------
fun semType(ty:Type):SET_VALUE
------------------------------
-- TODO
  
-----------------------------------------
fun evalBoolExp(exp: Exp, M: MODEL): Bool
-----------------------------------------
{
  isTrue(evalExp(exp,M))
}

------------------------
fun isTrue(v:VALUE):Bool 
------------------------
{
  v = BOOL_VALUE(bool :: true)  
}
