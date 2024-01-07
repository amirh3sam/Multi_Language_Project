/*
function reversedString(str:string) :string  {

   let reverse =""

    for (let i = str.length-1 ; i >=0; i-- ){
          reverse += str[i]
    }

    return reverse

}

console.log(reversedString("Amir"))

 */
function reversedString(str) {
    //join is opposite of split
    return str.split("").reverse().join("");
}
console.log(reversedString("Amir"));
function reversedString2(str) {
    // in filter you write the condition
    //join is opposite of split                 // map is opposite of filter is for make change on elements
    return str.split(" ").reverse().map(function (e) { return e.split("").reverse().join(""); }).join(" ");
}
console.log(reversedString2("Hello How are YOu"));
