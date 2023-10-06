const str: string = "aaaassssdderfff";
let result: string = "";

for (let i = 0; i < str.length; i++) {
    // If the current character is already in the result string, skip the current iteration of the loop.
    // @ts-ignore
    if (result.includes(str[i])) {
        continue;
    }

    // Otherwise, add the current character to the result string.
    result += str[i];
}

console.log(result); // asdfre