package Java.tasks;

import java.util.Scanner;

public class CombineTwoWords {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter 2 string : ");
        String str1 = input.next();
        String str2 = input.next();
        String combine = str1 + str2;

        if(str1.charAt(str1.length()-1) == str2.charAt(0)){
            combine = str1 + str2.substring(1);


        }

        System.out.println(combine);
    }

}
