package Java.tasks;

import java.util.ArrayList;

public class SumOfElementEvenOdd {

    /*
          Given a list of integer, determine whether the sum of its element is odd or even
          Give your answer as string matching "odd" or "even"
          if the input array is empty consider it as [0] (array with zero)
           */
    public static void main(String[] args) {


        int[] input = {0,1,4};
        int sum = 0;
        for (int each: input) {

             sum += each;

        }
        if (sum % 2 == 0){
            System.out.println("even");
        } else if (sum % 2 != 0 ) {
            System.out.println("odd");
        }
    }
}
