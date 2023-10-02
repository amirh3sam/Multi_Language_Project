package Java.tasks;

import java.util.Scanner;

public class SampleCalculator {
    public static void main(String[] args) throws Exception {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter two number : ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Enter your Operator");
        char operator = input.next().charAt(0);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("operator = "+ operator);

        double result = 0;
       switch (operator) {
           case '+' :
              result =  num1 + num2;
              break;
           case  '-' :
               result = num1 - num2;
               break;
           case  '/':
               result = num1 / num2;
               break;
           case '*':
               result = num1 * num2;
               break;
           default:
               throw new Exception("Operator has to be +, -, *, or /");

       }
        System.out.println("Calculation is : " + result);
    }



}
