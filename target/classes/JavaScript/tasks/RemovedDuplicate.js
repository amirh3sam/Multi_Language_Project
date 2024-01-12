let str= "aaaassssdderfff";
let result = "";

for (let i = 0; i <str.length ; i++) {
    if (result.includes(str.charAt(i))){
        continue;
    }
    result+=str.charAt(i);
}
console.log(result)