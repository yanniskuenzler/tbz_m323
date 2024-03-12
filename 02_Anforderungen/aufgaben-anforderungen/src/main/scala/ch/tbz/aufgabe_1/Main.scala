package ch.tbz.aufgabe_1

object Main extends App {

  val travel: List[String] = List("Switzerland", "Spain", "France", "Italy");

  val newTravel: List[String] = addDestination("Germany", travel);
  val changedTravel: List[String] = changeDestination("France", "Great Britain", newTravel);

  println(changedTravel);

  def addDestination(newDestination: String, travelList: List[String]): List[String] = {
    val newTravelList: List[String] = travelList ::: List(newDestination);
    return newTravelList;
  }

  def changeDestination(oldDestination: String, newDestination: String, travelList: List[String]): List[String] = {
    return travelList.map { destination =>
      if (destination == oldDestination) {
        newDestination
      } else {
        destination
      }
    }
  }

}
