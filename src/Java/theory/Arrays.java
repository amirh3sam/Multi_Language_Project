package Java.theory;

public class Arrays {
    public static void main(String[] args) {
        //Arrays are fixed size
        //Array one of the data structure
        //store collection of elements of the same data type
        

        // Declaring an integer array named 'numbers'
        int[] numbers;

        int[] more_numbers = {1, 2, 3, 4, 5};// Array Literal

        int[] num = new int[5]; // Creates an integer array of size 5

        int[] numb; //Initializing with Values Later:
        numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        // ...

        //Accessing Array Elements:
        int[] nums = {1, 2, 3, 4, 5};
        int firstNumber = numbers[0]; // Accesses the first element (1)
        int thirdNumber = numbers[2]; // Accesses the third element (3)


        //Iterating Through an Array:
        int[] number = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Using enhanced for-each loop
        for (int numbs : numbers) {
            System.out.println(numbs);
        }

        //Array Length:
        int[] numbers_t = {1, 2, 3, 4, 5};
        int arrayLength = numbers_t.length; // Returns 5



    }
}
