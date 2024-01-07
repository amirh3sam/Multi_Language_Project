
//the for...in loop in JavaScript is used to iterate over the keys (or property names) of an object, and it's not
// suitable for iterating over the elements of an array.
// To iterate over the elements of an array, you should use a for...of loop.
const arr = [1, 2, 3, 4, 5];
const arr2 = [6, 7, 8, 9, 10];

const arr3 = [];
let j = 0;

for (const element of arr) {
    arr3[j++] = element;
}

for (const element of arr2) {
    arr3[j++] = element;
}

console.log(arr3);





