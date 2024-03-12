# Anforderungen als Funktionen erkennen
### Beispiel 1: Eine Reise planen
Wir planen eine Reise durch Europa und möchten, dass der Benutzer jeweils die Destinationen für die Reise eingibt.
Zudem soll es möglich sein, eine bereits festgelegte Route zu ändern (z.Bsp. wenn Ihr Freund noch einen anderen Zwischenaufenthalt möchte).
#### Funktionen
- `addDestination()`
- `remveDestination()`

### Beispiel 2: Autorennen
Wir möchten eine App, welche für ein Auto-Rennen die gesamte Zeit für alle Runden berechnet. Die App soll auch die Durchschnittszeit pro Auto berechnen. Die erste Runde wird nicht mitgezählt, da es sich hier um eine "Warm-up" Runde handelt.
- `addLap()`
- `getAverage()`