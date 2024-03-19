function firstCharacter(str) {
    let firstCharacter = str.charAt(0);
    if (firstCharacter > 0) {
        return firstCharacter;
    } else {
        return null;
    }
}

console.log(firstCharacter("Hello"));
console.log(firstCharacter("JavaScript"));
