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
function reverseArray(arr) {
    return arr.filter(function (e) { return e % 2 == 0 && e <= 6; }).reverse();
}
console.log(reverseArray([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]));
function reverseArray2(arr) {
    return arr.map(function (e) { return e * 2; }).filter(function (e) { return e <= 10; }).reverse().map(function (e) { return e + 1; });
}
console.log(reverseArray2([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]));
//# sourceMappingURL=ReverseArray.js.map