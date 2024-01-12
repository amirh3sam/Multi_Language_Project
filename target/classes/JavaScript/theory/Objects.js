
// in JS with opening {} you create Object
let person = {

    firstName : "Joe", // need , to separate each with each other
    lastName : 'Doe'   // you do single quotation to
}
console.log(typeof person);
console.log(person);
console.log(person.firstName);

let address = {

    'building no' : 5555, // keu can be with ''
    street : 'Keowee', // key can be with '' or "" or not any of them
    state : ' Kentucky'

}
console.log(address);
console.log(address['building no']);
console.log(address['street']);

// add new property to object

person.age =30;
console.log(person);//{ firstName: 'Joe', lastName: 'Doe', age: 30 }

//delete a property

delete person.age;
console.log(person);//{ firstName: 'Joe', lastName: 'Doe' }

//check a property

console.log('street' in address); //true --> mean street is in the address or not?!

// you can put arrays inside objects


let course = {
    name : 'JS',
    url : 'www.cydeo.com',
    subject : ['Objects','Arrays','Functions','Live Server']
}
console.log(course);



// loop using the keys of object

for (let key in course) {
    console.log(key+" : "+ course[key]);
}


/*
We Will have fixtures folder in Cypress Tools, we store JSON files
*/


// let's create an object with function, array, object in it

let myCar = {
    make : 'Dacia',
    color : 'orange',
    year : 2022,
    engine :{
        cylinders :3,
        size :1.0
    },
    extras :['AC','Cruise Control','Sound System'],
    drive : function name(){
        console.log("Running on LPG");
    }
}

myCar.drive(); // like in Java call method from object
console.log(myCar.extras[1]); // we want to access to Cruise Control
