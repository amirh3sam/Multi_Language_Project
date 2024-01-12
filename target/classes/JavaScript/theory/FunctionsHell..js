// in Java make database connection and get some data , then this data inside your code
// ---> Connect DB
//--> get data
//--> is waiting until the data is received
// --> then executes rest of the code
//in JS:
//--> While trying to connect DB
//--> th rest of the function does not wait -- async code

function  waitingForSomeServerToAct() {
    let dataNeeded;
    setTimeout(()=>{
        console.log("BackEnd Information Have Just Been Received");
        dataNeeded = "Cydeo";
        console.log(dataNeeded);
    },5000);
    return dataNeeded

}

function functionThatNeedBackEndData(info) {
    console.log("I need to use BackEnd data " + info);

}
let data = waitingForSomeServerToAct(); // calling the server connection, getting the data and storing it to a variable
functionThatNeedBackEndData(data); // this function does not wait for the one line before then do the action is not
// like java if line 25 have waited not going to wait going to do line 26