// with Temp
let a = 10;
let b = 20;

let t = a;
a = b;
b= t;


console.log(`a = ${a} and b = ${b} `)

// without Temp value

let c = 30;
let d =40;
c = c + d
d = c - d
c = c - d

console.log(`c = ${c} and d = ${d}`)