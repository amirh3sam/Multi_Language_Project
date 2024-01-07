var a = 10;
var b = 15;
var c = 20;
var aIsMedian = (b < a && a < c) || (b > a && a > c);
var bIsMedian = (a < b && b < c) || (a > b && b > c);
var cIsMedian = (a < c && c < b) || (a > c && c > b);
if (aIsMedian) {
    console.log("".concat(a, " is a median number"));
}
else if (bIsMedian) {
    console.log("".concat(b, " is a median number"));
}
else {
    console.log("".concat(c, " is a median number"));
}
//# sourceMappingURL=MedianNumber.js.map