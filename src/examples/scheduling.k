==============================================
This example shows how one can encode Allen
logic using a simple Event class, and then 
encode a schedule which can be tested for 
satisfiability and receive a possible schedule 
in return.
==============================================

package examples.planning

class Event {
  startTime : Int
  endTime : Int 

  req afterBigBang : startTime >= 0
  req nonZeroDuration : endTime > startTime 

  fun before (e : Event) : Bool {
    endTime < e.startTime
  }

  fun meets (e : Event) : Bool {
    endTime = e.startTime
  }  

  fun contains (e : Event) : Bool {
    (startTime <= e.startTime && e.endTime < endTime)
     ||
    (startTime < e.startTime && e.endTime <= endTime)
  }
}

class Schedule {
  sciWin  : Event
  digHole : Event
  takePic : Event

  commWin  : Event
  config  : Event
  comm    : Event

  oneScienceActivity : Bool = 
    (sciWin.contains(digHole) || sciWin.contains(takePic)) &&
   !(sciWin.contains(digHole) && sciWin.contains(takePic))

  req  sciWin.before(commWin) &&
       oneScienceActivity &&
       commWin.contains(config) && commWin.contains(comm) &&
       config.meets(comm)  
}

mySchedule: Schedule