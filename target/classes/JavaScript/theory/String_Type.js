let str1 = 'Java';
let str2= "Script";
let str3 = "awesome";

let result ;
result = "result variable is: "+ str1 + str2 + ' ' + str3; //like java
console.log(result);

//difference from Java : backticks for variable insertion

result =  `result variable is : ${str1}${str2} ${str3}`;
console.log(result);


// constant variable

const number = 35;
//  number = 45; you can not change the variable or reassign the number after define as const
console.log(number);