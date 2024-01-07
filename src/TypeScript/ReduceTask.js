// array = reduce, map, filter, splice, concat, reverse
// String =  split, join, reverse
//const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// 1- sum arr 1 + 2 + 3 + 4 + ...... + 10 =
// arg 1 =  previous element
// arg 2 =  current element
// arg 3 =  index
// arg 4 =  arr
// initial = 0
/*

const sum: number = arr.reduce((p, c) => {
  console.log(Previous: ${p} , Current: ${c});

  return p + c;
}, 0);

console.log(Sum: ${sum});

*/
var people = [
    {
        name: "Sam Badiei",
        age: 12
    },
    {
        name: "Amirhesam Badiei",
        age: 20
    },
    {
        name: "Shiva Badiei",
        age: 8
    },
];
// SB, AB, SB.
var output = people.reduce(function (p, c, i) {
    var s = c.name
        .split(" ")
        .map(function (e) { return e.split("")[0]; })
        .join("");
    if (i !== people.length - 1) {
        s += ", ";
    }
    else {
        s += ".";
    }
    return p + s;
}, "");
console.log(output.trim());
//# sourceMappingURL=ReduceTask.js.map