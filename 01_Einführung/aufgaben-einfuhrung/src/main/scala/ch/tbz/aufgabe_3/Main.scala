package ch.tbz.aufgabe_3

import scala.collection.mutable.ArrayBuffer

object Main extends App {
  def addPerson(name: String, names: ArrayBuffer[String]): ArrayBuffer[String] = {
    var nameList: ArrayBuffer[String] = names
    nameList.append(name)
    return nameList
  }

  def getTipPercentage(names: ArrayBuffer[String]): Int = {
    var tipPercentage = 0
    if (names.size > 5) {
      tipPercentage = 20
    } else if (names.nonEmpty) {
      tipPercentage = 10
    }

    return tipPercentage
  }


}
