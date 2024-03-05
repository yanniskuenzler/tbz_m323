package ch.tbz.aufgabe_2_1

import java.util

class ShoppingCart {
  private val items: util.List[String] = new util.ArrayList[String]
  private var bookAdded = false

  def addItem(item: String): Unit = {
    items.add(item)
    if (item == "book") bookAdded = true
  }

  def removeItem(item: String): Unit = {
    items.remove(item)
    if (!items.contains("book")) bookAdded = false
  }

  def getItems: util.List[String] = items

  def isBookAdded: Boolean = bookAdded
}