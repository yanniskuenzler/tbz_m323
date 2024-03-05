package ch.tbz.aufgabe_2_1

import java.util

object Main extends App {
    var cart = new ShoppingCart
    cart.addItem("book")
    cart.addItem("pen")
    System.out.println("Book added: " + cart.isBookAdded)
    System.out.println("Items in cart: " + cart.getItems)
    cart.removeItem("book")
    System.out.println("Book added: " + cart.isBookAdded)
    System.out.println("Items in cart: " + cart.getItems)
}