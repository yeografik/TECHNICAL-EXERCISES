const array = ["Apple", "Orange", "Banana", "Strawberry", "Grape", "Mango", "Melon", "Pineapple", "Peach", "Peach"];

console.log(array.filter(containsS));

index = array.indexOf("Grape");
if (0 <= index && index < array.length) {
    console.log(array[index]);
}

function containsS(str) {
    return str.includes('p');
}
