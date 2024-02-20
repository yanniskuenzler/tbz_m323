package ch.tbz.aufgabe_1

object Main extends App {
  println(calculateScore("yannis"));
  def calculateScore(word: String) = {
    var score = 0
    for (c <- word.toCharArray) {
      if (c != 'a') {
        score += 1;
      }
    }
    score
  }

}
