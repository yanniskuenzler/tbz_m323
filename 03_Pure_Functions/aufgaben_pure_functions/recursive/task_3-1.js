// Eine Funktion, die aus einer Liste von Zahlen die Summe aller Listenelemente berechnet.

let numArray = [1, 2, 3, 4];

function getSum(array) {
    let tempArray = array.map((x) => x);
    if (tempArray.length <= 1) {
        return tempArray[0];
    } else {
        let result = tempArray[0];
        tempArray.shift();
        return result + getSum(tempArray);
    }
}

console.log(getSum(numArray));