

//


const arr = [1,2,3]

const arr2 = [4,5]
let arr3= []

arr3 = arr.concat(arr2)
console.log(arr3)


//second way to concat 2 array

console.log([...arr,...arr2])
