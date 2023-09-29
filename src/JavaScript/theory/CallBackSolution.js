
// CallBack or Pyramid of doom

/*
a(function(resultsFromA)){
    b(resultFromA, function(resultFromB){
        c(resultFromB, function(resultFromC){
            d(resultFromC, function(resultFromD){
                e(resultFromD, function(resultFromE){
                    f(resultFromE, function(resultFromF){
                        console.log(resultFromF);
                    )}
    })   )}  )}    )}
})
;

*/


function  waitingForSomeServerToAct(myCallback) {
    let dataNeeded;
    setTimeout(()=>{
        console.log("BackEnd Information Have Just Been Received");
        dataNeeded = "Cydeo";
        myCallback(dataNeeded)
    },5000);
    return dataNeeded;

}

function functionThatNeedBackEndData(info) {
    console.log("I need to use BackEnd data " + info);

}

waitingForSomeServerToAct(functionThatNeedBackEndData);


/*
The first solutions JS developers came up with was this callBack situation
ES6 --> promises handles async nature of JS
2017--> async functions, await keyword
*/

//alert(" This is a JS Alert"); // only work in browser

/*
there are some JS commands like alert, prompt : these will work only with browser
*/
//let username = prompt("Enter username");
//console.log(username);