
//how we create Functions
//no access modifier , no method overloading
function add(a,b) {

    console.log("Total is : " + (a+b));
    // no return type functions
}


add(10,20); //--> call a function -- argument we are passing


// return type functions

function multiply(a,b) {
    return(a*b);

}

console.log(multiply(10,20));

// no overloading

add(10,20,40,400,220); // ignore after the second parameter and not going to give you error too


/*
They call function as first class citizens of Javascript

1- you can pass arguments to other functions
2- you can return a function from a function
3- you can store a function into a variable

*/

let divide = function (a,b){
    return a/b;
}

console.log(divide(30,5));

let anyFunction = divide;

console.log(anyFunction(30,5));

//pass a function as an argument to other functions

function sum(a,b){
    return a+b;
}

function average(a,b,fn){
    return fn(a,b)/2;
}

let aveResult = average(10,20,sum);
console.log(aveResult);

// you can pass a function to another function

aveResult =average(10,20,multiply);
console.log("average result from multiplication : " + aveResult);



