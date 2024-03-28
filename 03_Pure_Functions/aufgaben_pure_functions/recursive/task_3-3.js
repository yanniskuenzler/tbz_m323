// Eine Funktion, die eine gegebene Liste von Strings alphabetisch sortiert.

let names = ["yannis", "laurin", "leon", "aladin", "beladin", "celadin"];

function getSort(array) {
    let tempArray = array.map((x) => x);
    compareTwo(tempArray[0], tempArray[2]);
}

function compareTwo(first, second) {
    if (first.substring(0,1) > second.substring(0,1)) {
        
    }
}