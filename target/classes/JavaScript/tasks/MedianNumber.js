let a = 10;
let b =15;
let c = 20 ;

let aIsMedian = (b < a && a < c) || (b > a && a > c);
let bIsMedian = (a < b && b < c) || (a > b && b > c);
let cIsMedian = (a < c && c < b) || (a > c && c > b);

if (aIsMedian) {
    console.log(`${a} is a median number`);
} else if (bIsMedian) {
    console.log(`${b} is a median number`);
} else {
    console.log(`${c} is a median number`);
}