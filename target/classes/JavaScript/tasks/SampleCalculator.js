const readline = require('readline'); //imports and sets up the Node.js built-in readline module for use in your program.
// const is a keyword for constant variable and name is readline
//: The require() function is used in Node.js to load and include external modules (such as 'readline') into your script.
//'readline': This is the name of the module you want to import. The 'readline' module in Node.js provides functionality
// for reading input from the command line and creating interactive command-line interfaces.
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
//readline.createInterface(): This is a method provided by the readline module in Node.js. It creates an interface for
// reading and writing text from and to a readable stream (in this case, the standard input, process.stdin, and the standard output, process.stdout).
//{ input: process.stdin, output: process.stdout }: These are configuration options passed to readline.createInterface().
// They specify where the input and output streams should be connected
//
rl.question("Enter two numbers (separated by space): ", function(input) {
    const [num1, num2] = input.split(' ').map(Number);

    rl.question("Enter your operator (+, -, *, /): ", function(operator) {
        let result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                console.log("Operator has to be +, -, *, or /");
                rl.close();
                return;
        }

        console.log(`num1 = ${num1}`);
        console.log(`num2 = ${num2}`);
        console.log(`operator = ${operator}`);
        console.log("Calculation is : " + result);

        rl.close();
    });
});