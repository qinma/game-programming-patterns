package com.game.pattern.observer

trait Observer {
  def onNotify(event: Event): Unit
}
