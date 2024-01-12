// we are using new Promise (function(resolve, reject))

let stateOfTheWebPage= function (state){
    return new Promise(function (resolve,reject) {
        if(state){
            resolve('Page is loaded')
        }else{
            reject('page is not loaded yet')
        }
    })
}

console.log(stateOfTheWebPage(true).then((result) => {console.log(result)}));


console.log(stateOfTheWebPage(false).catch((errorMsg) => {console.log("errorMsg")}));


// one with function and the other one is without function so have =>
new Promise(function (resolve,reject) {

})

new Promise((resolve,reject) => {
    setTimeout(()=>{
        resolve(1)
    },3000);
}).then((result) => {
    console.log(result);//after 3 sec value is 1
    return result*2 ;// then multiply by 2 and give it to next
}).then((result2) => {
    console.log(result2); //2
    return result2*2 ;
}).then((result3) => {
    console.log(result3);//4
    return result3*2 ;// the value increased to 8, but we did not use it
})