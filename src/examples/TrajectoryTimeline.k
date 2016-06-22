class PhysicalObject {
  -- type checker workaround
  keyParam1 : Real
  keyParam2 : Real
}
class Environment

class BallScenario {
  env : StillAir
  trajX : SoftballTimeline
  trajY : SoftballTimeline
    
  req (trajX.referencedObject = trajY.referencedObject)
  req (trajX.referencedObject.keyParam1 = env.mass)
  req (trajX.referencedObject.keyParam2 = env.area)
}
  
class StillAir extends Environment {
  -- physical constants
  rho : Real = 1.225
  g : Real = 9.81
  area : Real
  mass : Real
  
  -- laws of motion; 
  -- we could simplify a little by using mass / area = ballistic coefficient
  
  fun dX(currentVx : Real) : Real {
    -- wind resistance, assume +Vx is to the right
    - (0.5 * rho * currentVx * currentVx * area) / mass
  }
  fun dY(currentVy : Real) : Real {
    -- wind resistance plus gravity, assume + Vy
    -- is down
    - (0.5 * rho * currentVy * currentVy * area) / mass - g
  }
}

class Softball extends PhysicalObject {
  mass : Real
  area : Real
    
  req (mass > 0.0)
  req (area > 0.0)
    
  fun ballisticCoef(m : Real, a : Real) : Real  {
    m / a
  }
  
  req (ballisticCoef(mass, area) < 15.0)
    
  req (keyParam1 = mass)
  req (keyParam2 = area)
}


--air : StillAir = StillAir(trajectoryX::xTimeline, trajectoryY::yTimeline)

myScenario : BallScenario = BallScenario(env::air, trajX::xTimeline, trajY::yTimeline)
air : StillAir = StillAir()

mySoftball : Softball = Softball(mass::14.0,area::1.0)
xTimeline : SoftballTimeline = SoftballTimeline(referencedObject::mySoftball)
yTimeline : SoftballTimeline = SoftballTimeline(referencedObject::mySoftball)


--------------------------------------------------------------------------------

class _2DVector extends Real * Real {
  x = this[0]  -- Do we need to say, "this # 1" instead of "this[0]" ?
  y = this[1]
}

class Position extends _2DVector

class Velocity extends _2DVector

class Acceleration extends _2DVector

class Force extends _2DVector

class _2DObject {
  mass : Real
  p_0 : Position
  v_0 : Velocity
  a_0 : Acceleration

  acceleration = Nonconsumable[Acceleration]( initialValue=a_0 )
  velocity = acceleration.integral( initialValue=v_0 )
  position = velocity.integral( initialValue=p_0 )
  
  fun push(id : Any, force : Force, t1 : Real, t2 : Real) : Bool {
      acceleration.add(id, (t1, t2, force / mass))
  }
}


ball : _2dObject
req gravity : ball.push((0.0,-9.8), 0, inf)
req throw : ball.push((50.0,59.8), 0, 2)
-- add wind resistance?


-- Some definitions of some of the timelines in the BAE. 

-- simple timeline class
class TL[V] extends Real -> V {
  value = this
}

-- if above inheritance is not supported, . . .
-- class TL[V] {
--   value : Real -> V    -- map representation if -> is not supported: <Real, V>
-- }

-- interpolation of the timeline constrains values based on given timepoints
class InterpolatedTL[V] extends TL[V] {
  -- the interpolation type
  type : { none, step, linear, quadratic, cubic }
  
  pointConstraints : <Real, V>
  -- req forall t : Real :-
  --     if type = step . . .
  --     else if type = linear . . .
}

-- An Effect is a tuple (interval_start, interval_end, V).
class Effect<V> extends Real * Real * V {
   start = this[0]
   end = this[1]
   value = this[2]
}

-- a time interval that includes the start but not the end
fun interval(v1 : Real, v2 : Real) : Set[Real] {
  { v | v : Real . v >= v1 && v < v2 }
}

-- a state variable that is affected over time intervals, with special
-- constraints for summing values (effects) over overlapping time intervals
class Nonconsumable extends InterpolatedTL[V] {

   -- NOTE: The interpolation type for this should usually be step.
   -- Noncosumable could simply extend TL[V]; interpolation is only useful 
   -- here in defining the integral, but a separate timeline for the integral
   -- (like Consumable) probably makes more sense.

   -- an initial value at time 0
   initialValue : V
   
   -- A collection of effect tuples, (interval_start, interval_end, value),
   -- mapped from an id to allow duplicates
   effects : < Any : Effect >

   -- the value at any time based on the effects
   req forall t : Real :-
      value(t) = combineValues([e.value | e : Effect .
      	       	 	        e isin effects.values && t isin interval(e.start, e.end)])

   -- Override this for other kinds of timelines.
   -- It currently just sums the values.
   fun combineValues( values : List[V] ) : V {
      values.sum()
   }

   -- add an effect -- remove this since it's not being called
   fun add( id : Any, effect : Effect ) : Bool {
      req effects[id] = effect
   }

   -- No interpretation of negative values
   forall t isin interval(-inf,0), value(t) = null

   -- an initial value from the time 0 onward
   -- The id, -1, is reserved for this effect.
   effects[-1] = (0, inf, initialValue)

   -- get all of the timepoints where the applicable effects change
   fun effectTimepointSet(t1 : Real, t2 : Real) : [Real] {
      timepointSet = { t | t : Real, e : Effect .
                       t = t1 || t = t2 ||
		       (e isin effects && t isin {e.start, e.end} &&
		       t isin interval(t1, t2))
		     }
   }

   -- compute the integral between two timepoints
   fun integrate(t1 : Real, t2 : Real) : V {
      -- get times of effects
      tps = effectTimepointSet(t1, t2).sorted()
      
      -- sum areas between adjacent timepoints
      [0..tps.size()-2].collect(i -> value(tps[i]) * (tps[i+1] - tps[i])).sum()
   }

   -- return the integral timeline
   fun integral( initialValue : V ) : Nonconsumable[V] {
      theIntegral = NonConsumable[V](type=linear, initialValue=initialValue)
      
      -- times of effects
      tps = effectTimepointSet(0, inf).sorted()

      -- create effects for the integral for each timepoint
      forall i : [0..tps.size()-2] :-
      	     theIntegral.effects[i] = (tps[i], tps[i+1], theIntegral.value(tps[i]) + value(tps[i]) * (tps[i+1] - tps[i])) -- this.integrate(0, timepointList[i+1]))

      return theIntegral
   }
}

-- Consumable resource class not yet fleshed out.  It seems like the integral definition in Nonconsumable might
class Consumable[V] extends ITL[V] {
   slope : NonConsumable[V]
   req type = linear
   -- . . . 
}



-- Below is a first pass at the 2D Object without the timeline classes

class _2DObject2 {
  mass : Real
  p_0 : Position
  v_0 : Velocity
  a_0 : Acceleration

  acceleration : Real -> Acceleration
  velocity : Real -> Velocity
  position : Real -> Position

  forall t isin [-inf, 0.0], i isin [0,1] :- acceleration(t)[i] = a_0[i] && velocity(t)[i] = v_0[i] && position(t)[i] = p_0[i]

  forall t isin [0.0, inf], i isin [0,1] :- position(t)[i] = p_0[i] + integrate(velocity, 0, t)[i]
  forall t isin [0.0, inf], i isin [0,1] :- velocity(t)[i] = v_0[i] + integrate(acceleration, 0, t)[i]

  forceSet : < Any , Real * Real * Force >

  fun push(id : Any, force : Force, t1 : Real, t2 : Real) : Bool {
      forceSet[id] = (t1, t2, force)
  }

  req forall t : interval(0, inf), i : {0,1} :- acceleration(t)[i] = [force[i] | t1, t2 : Real, force : Force . (t1, t2, force) isin forceSet.values && t >= t1 && t < t2].sum() / mass
}


ball2 : _2dObject2
req gravity2 : ball2.push((0.0,-9.8), 0, inf)
req throw2 : ball2.push((50.0,59.8), 0, 2)


