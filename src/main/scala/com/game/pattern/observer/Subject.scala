package com.game.pattern.observer

import scala.collection.mutable.ArrayBuffer

class Subject {
  var observerList: ArrayBuffer[Observer] = ArrayBuffer[Observer]()
  var numObservers: Int = 0

  def addObserver(observer: Observer): Unit = {
    observerList += observer
    numObservers += 1
  }
  def removeObserver(observer: Observer): Unit = {
    val index: Int = observerList.indexOf(observer)
    observerList.remove(index)
    numObservers -= 1
  }
  def notifyObservers(event: Event): Unit = {
    observerList.foreach { observer =>
      observer.onNotify(event);
    }
  }
}
