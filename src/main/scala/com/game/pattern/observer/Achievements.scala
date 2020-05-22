package com.game.pattern.observer

class Achievements(subject: Subject) extends Observer {
  subject.addObserver(this)

  def onNotify(event: Event): Unit = {
    event.name match {
      case "EVENT_ENTITY_FELL" => println("Unlock the event fell achievement")
      case _                   => println("Unlock other event achievement")
    }
  }
}
