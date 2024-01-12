//loops are same with Java : for loop, while loop , do while;

for( let i = 0 ; i < 5 ; i++){
    console.log(i);
}

// console.log(i);  you can not print i outside the loop


//old type of declaring variable before ES6

for(var j =0 ; j <5 ; j++){
    console.log(j);
}
console.log(j);//but it was var you can print it outside the loop -->this is type of global and function scope


let n1 =0;
while(n1<3){
    console.log(n1);
    n1++;
}


let n2 = 0;
do {
    console.log(n2);
    n2++;
} while (n2< 3);

