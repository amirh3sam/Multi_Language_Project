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

function reversedString(str:string) :string  {
    //join is opposite of split

   return str.split("").reverse().join("")

}

console.log(reversedString("Amir"))
function reversedString2(str:string) :string  {// filter is for removing some of the element that I do not want
                                                // in filter you write the condition
   //join is opposite of split                 // map is opposite of filter is for make change on elements

   return str.split(" ").reverse().map(e => e.split("").reverse().join("")).join(" ")}

console.log(reversedString2("Hello How are YOu"))
