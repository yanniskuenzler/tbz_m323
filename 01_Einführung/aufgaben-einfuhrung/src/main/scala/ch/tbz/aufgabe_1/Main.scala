package ch.tbz.aufgabe_1

object Main extends App {
  println(calculateScore("imperative"))
  println(calculateScore("no"))
  println(wordScore("declarative"))
  println(wordScore("yes"))

  def calculateScore(word: String) = {
    var score = 0
    for (c <- word.toCharArray) {
      if (c != 'a') {
        score += 1
      }
    }
    score
  }

  def wordScore(word: String) = word.count(_ != 'a')


}
