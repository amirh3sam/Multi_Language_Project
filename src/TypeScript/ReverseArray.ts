
/*
function reverseArray(arr: number[]) :number[]{

    let newArray = []
    let j = 0
    for (let i = arr.length-1; i >= 0 ; i--) {
        newArray[j++] = arr[i]
    }
    return newArray
}
console.log(reverseArray([1,2,3]))


 */
// number less than 6 and module 2
function reverseArray(arr: number[]) :number[] {

return arr.filter(e => e % 2 == 0 && e <= 6).reverse()
}
console.log(reverseArray([1,2,3,4,5,6,7,8,9,10]))

function reverseArray2(arr: number[]) :number[] {

    return arr.map(e => e * 2 ).filter(e => e<=10).reverse().map(e => e+1)
}
console.log(reverseArray2([1,2,3,4,5,6,7,8,9,10]))