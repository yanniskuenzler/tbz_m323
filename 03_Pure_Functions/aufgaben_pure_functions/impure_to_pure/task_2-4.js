// Methode, um eine Zahl mit einem zufälligen Wert zu multiplizieren
function multiplyWithRandom(number) {
    const randomValue = Math.random(); // Generiert einen zufälligen Wert zwischen 0 und 1
    return number * randomValue;
}

console.log(multiplyWithRandom(5)); // Ausgabe: Eine zufällige Zahl zwischen 0 und 5
console.log(multiplyWithRandom(10)); // Ausgabe: Eine zufällige Zahl zwischen 0 und 10
