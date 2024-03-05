package ch.tbz.aufgabe_2_2

object Main extends App {
  val cartWithBook: List[String] = List("book", "pen", "notebook")
  val cartWithoutBook: List[String] = List("pen", "notebook")

  val discountWithBook: Double = getDiscountPercentage(cartWithBook)
  val discountWithoutBook: Double = getDiscountPercentage(cartWithoutBook)

  System.out.println("Discount with book: " + discountWithBook)
  System.out.println("Discount without book: " + discountWithoutBook)

  def getDiscountPercentage(items: List[String]): Double = {
    val bookAdded = items.contains("book")
    if (bookAdded) 0.05
    else 0.0
  }

}
