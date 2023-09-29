package Java.theory;

public class Loops {

    public static void main(String[] args) {

// for loop:
        for (int i = 0; i < 5; i++) {
            // Code to be executed repeatedly
            System.out.println("Iteration " + i);
        }
//while Loop:

        int count = 0;
        while (count < 3) {
            // Code to be executed repeatedly
            System.out.println("Count: " + count);
            count++;
        }
//do-while:
        int number = 1;
        do {
            // Code to be executed repeatedly
            System.out.println("Number: " + number);
            number++;
        } while (number <= 3);
//for-each Loop: for data structure
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            // Code to be executed for each element in the array
            System.out.println("Number: " + num);
        }


    }
}
