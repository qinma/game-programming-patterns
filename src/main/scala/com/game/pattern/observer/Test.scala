package com.game.pattern.observer

object Test {
 def main(cmdArgs: Array[String]): Unit = {
   val subject: Subject = new Subject
   val achievementObserver: Achievements = new Achievements(subject)
   val event = Event(name="EVENT_ENTITY_FELL")

   println(s"number of observers: ${subject.numObservers}")

   subject.notifyObservers(event)
 }
}
