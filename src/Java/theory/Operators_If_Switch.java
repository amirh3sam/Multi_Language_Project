package Java.theory;

public class Operators_If_Switch {

    public static void main(String[] args) {

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
