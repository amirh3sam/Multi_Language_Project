let s = "Python Java java Python C++ C++ Java C# Python ";

let t = s.replace(/Python/g, "abcdefg");

let frequencyOfPython = t.split("abcdefg").length - 1;

console.log("frequencyOfPython = " + frequencyOfPython);