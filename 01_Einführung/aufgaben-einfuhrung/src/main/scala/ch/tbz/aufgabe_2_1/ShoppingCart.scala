package ch.tbz.aufgabe_2_1

import scala.collection.mutable.ArrayBuffer

class ShoppingCart {
  private var items: ArrayBuffer[String] = new ArrayBuffer[String]
  private var bookAdded = false

  def addItem(item: String): Unit = {
    items.append(item)
    if (item == "book") bookAdded = true
  }

  def removeItem(item: String): Unit = {
    items = items.filter(_ != item)
    if (!items.contains("book")) bookAdded = false
  }

  def getItems: ArrayBuffer[String] = items

  def isBookAdded: Boolean = bookAdded
}