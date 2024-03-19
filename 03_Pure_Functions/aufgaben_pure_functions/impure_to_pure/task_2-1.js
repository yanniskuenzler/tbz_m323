let cartItems = [];

function addToCart(item, cartItemList) {
    cartItemList.push(item);
    return cartItemList;
}

console.log(addToCart('Apple', cartItems));  // Ausgabe: ['Apple']
console.log(addToCart('Banana', cartItems)); // Ausgabe: ['Apple', 'Banana']
console.log(addToCart('Orange', cartItems)); // Ausgabe: ['Apple', 'Banana', 'Orange']
