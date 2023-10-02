package Java.theory;

public class Operators_If_Switch {

    public static void main(String[] args) {

        /*
        Concatenation vs Addition: +

			Addition:
				number + number

			Concatenation:
				text + any data
				any data + text
				text + text




Arithmetic Operators:
	+: Addition
			"200" + 500 = "200500"

			500 + 400 = 900

	-: Subtraction

			1000 - 300 = 700

	*: Multiplication

			20 * 5 = 100

			2.5 * 2 = 5.0

	/: division

			10 / 2  = 5

			10 / 3 = 3


	%: remainder

		in math:  20 / 8 = 2.5

				remainder = 20 - (8 * 2)
				remainder = 4

		in java: 20 % 8 ==> 4


				100 / 28 = 3.57

				remainder = 100 - (28*3)
				remainder =  100 - 84
				reminder = 16


				100 % 28 ===>16



Logical Operators:

		||: or. only ONE condition need to be true in order to return true


		&&: and. both condition must be true, in order to return true





If Statements: Conditional statements. decision makings

	single if: creating conditions for one possible output

			if(Boolean Condition){
					statements
			}

	if & else: creating conditions for 2 possible outputs. NOT MORE NOT LESS THAN 2 CONDITIONS

			if(Boolean Condition){

			}else{ // !

			}



	multi-branch if

	nested if

	ternary

         */





        /**
         Operators:
         Operators in Java allow you to perform operations on variables and values. Java supports a wide range of operators, including:

         Arithmetic Operators: Used for mathematical calculations.

         + (addition)
         - (subtraction)
         * (multiplication)
         / (division)
         % (modulo)
         Comparison Operators: Used to compare values.

         == (equal to)
         != (not equal to)
         < (less than)
         > (greater than)
         <= (less than or equal to)
         >= (greater than or equal to)
         Logical Operators: Used for logical operations.

         && (logical AND)
         || (logical OR)
         ! (logical NOT)
         Assignment Operators: Used to assign values to variables.

         = (assignment)
         +=, -=, *=, /=, %= (compound assignment)
         Bitwise Operators: Used for bit-level operations.

         & (bitwise AND)
         | (bitwise OR)
         ^ (bitwise XOR)
         ~ (bitwise NOT)
         << (left shift)
         >> (right shift)
         >>> (unsigned right shift)

         */
        //------------switch statements
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            // Add more cases as needed
            default:
                System.out.println("Invalid day");
        }
//if statement
        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
//if and  else if and else
        int score = 85;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }


    }
}
