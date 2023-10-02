

const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Please enter the first string: ", (userInput1) => {
    rl.question("Please enter the second string: ", (userInput2) => {
        let combine = userInput1 + userInput2;


if (userInput1.charAt(userInput1.length - 1) === userInput2.charAt(0)) {

    combine = userInput1 + userInput2.substring(1);
}

        console.log(combine);
        rl.close();
    });
});











