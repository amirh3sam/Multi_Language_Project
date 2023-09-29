/*

There is no Collection is JS. In JS, we only have  Arrays and Map
NOT Fixed size

There are two important Bracket in JS

[] --> create an Array
{}--> create object


*/

let score = new Array(); // create an empty Array
let numbers = new Array(10); // create and Array with size 10
let emptyArray = [];//create empty Array
let myNumber = new Array(1,2,3,4,5,8,13);
let colors = ['red','green','blue'];



console.log(score);
console.log(numbers);
console.log(emptyArray);
console.log(myNumber);
console.log(colors);
console.log(colors[1]); // indexed base

//add element to an Array
colors.push("White"); // add the element to the end
console.log(colors);

//add element to beginning of the Array
colors.unshift("Orange");
console.log(colors);


console.log(colors.pop());// giving the last element and removing at the same time
console.log(colors);

//the size of the array

console.log(colors.length);

for(let i =0 ; i <colors.length ; i++){
    console.log(colors[i]);

}

// loop with values of Array

for (let value of colors) {
    console.log(value);
}


//loop for each with lambda expression
colors.forEach(element => {
    console.log(element);
});

// can we add multiple type of data? yes
/*
() => expression

param => expression

(param) => expression

(param1, paramN) => expression

() => {
  statements
}

param => {
  statements
}

(param1, paramN) => {
  statements
}

Traditional anonymous function
(function (a) {
  return a + 100;
});

 1. Remove the word "function" and place arrow between the argument and opening body bracket
(a) => {
  return a + 100;
};
 2. Remove the body braces and word "return" — the return is implied.
(a) => a + 100;

 3. Remove the parameter parentheses
a => a + 100;


*/
let soupOfData = [5, "Amir" ,true, undefined]; // you can also put Map , Object, Functions inside Array
soupOfData.forEach(element => {
    console.log(typeof element);
});