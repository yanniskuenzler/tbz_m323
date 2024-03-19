# Aufgaben pure functions

## Aufgabe 1 - pure vs impure
Beurteilen Sie für folgende gegeben Funktionen, ob diese pure oder impure sind. Schreiben Sie dafür bei jeder Funktion auf, welche der drei Regeln erfüllt / nicht erfüllt sind. Dokumentieren Sie die Resultate in Ihrem Repository.

| Aufgabe | Nur ein Rückgabewert | Resultat nur Abhängig von übergebenen Parametern | Verändert keine existierenden Werte | pure oder impure |
|---------|----------------------|--------------------------------------------------|-------------------------------------|------------------|
| 1.1     | Ja                   | Nein                                             | Nein                                | impure           |
| 1.2     | Ja                   | Ja                                               | Ja                                  | pure             |
| 1.3     | Nein                 | Ja                                               | Ja                                  | impure           |
| 1.4     | Ja                   | Nein                                             | Ja                                  | impure           |
| 1.5     | Nein                 | Ja                                               | Ja                                  | impure           |
| 1.6     | Ja                   | Ja                                               | Nein                                | impure           |


Der Code bei den einzelnen Aufgabenstellungen ist jeweils in JavaScript und Scala angegeben. Sie dürfen da die Programmiersprache wählen, die Ihnen besser liegt.

### Aufgabe 1.1

Scala:
```
val cartItems = ListBuffer[String]()

def addToCart(item: String): List[String] = {
    cartItems += item
    cartItems.toList
}

println(addToCart("Apple"))   // Ausgabe: List(Apple)
println(addToCart("Banana"))  // Ausgabe: List(Apple, Banana)
println(addToCart("Orange"))  // Ausgabe: List(Apple, Banana, Orange)
```

### Aufgabe 1.2

Scala:
```
def add(a: Int, b: Int): Int = {
    a + b
}

println(add(5, 3)) // Ausgabe: 8
println(add(2, 4)) // Ausgabe: 6
```

### Aufgabe 1.3

Scala:
```
def firstCharacter(str: String): Char = {
    str.head
}

println(firstCharacter("Scala")) // Ausgabe: S
println(firstCharacter("OpenAI")) // Ausgabe: O
```

### Aufgabe 1.4

Scala:
```
import scala.util.Random

// Methode, um eine Zahl mit einem zufälligen Wert zu multiplizieren
def multiplyWithRandom(number: Double): Double = {
  val randomValue = Random.nextDouble() // Generiert einen zufälligen Wert zwischen 0 und 1
  number * randomValue
}

println(multiplyWithRandom(5)) // Ausgabe: Eine zufällige Zahl zwischen 0 und 5
println(multiplyWithRandom(10)) // Ausgabe: Eine zufällige Zahl zwischen 0 und 10
```

### Aufgabe 1.5

Scala:
```
// Funktion zum Teilen einer Zahl durch eine andere
def divideNumbers(dividend: Double, divisor: Double): Double = {
  dividend / divisor
}

println(divideNumbers(10, 2)) // Ausgabe: 5.0
println(divideNumbers(8, 4))  // Ausgabe: 2.0
```

### Aufgabe 1.6

Scala:
```
// Methode zum Ausgeben und Rückgeben einer Zeichenkette
def printAndReturnString(str: String): String = {
  println(str) // Ausgabe der Zeichenkette auf der Konsole
  str          // Rückgabe der Zeichenkette
}

println(printAndReturnString("Hello")) // Ausgabe: Hello
```