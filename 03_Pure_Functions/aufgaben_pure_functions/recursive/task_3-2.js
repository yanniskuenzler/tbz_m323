// Eine Funktion, die aus einer Liste von Zahlen den Mittelwert aller Listenelemente berechnet.

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

function getAvg(firstArray) {
    console.log(getSum(firstArray));
    console.log("länge: " + firstArray.length);
    return getSum(firstArray) / firstArray.length;
}

console.log(getAvg(numArray));