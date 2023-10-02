package Java.theory;

import java.util.Scanner;

public class NextLineMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // \n

        System.out.println("Enter your full name:");
        String fullName = input.nextLine(); //Daniel James King

        System.out.println("fullName = " + fullName);

        System.out.println("Enter your age:");
        int age = input.nextInt(); //29

        System.out.println("age = " + age);

        input.nextLine(); //in order to clear the scanner

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("schoolName = " + schoolName);

        System.out.println("Are you employed:");
        String employed = input.next(); //yes

        input.nextLine();
        // everytime when we are using nextLine() after the OTHER methods of scanner, we MUST provide one additional nextLine() to clear the scanner memory

        System.out.println("Enter your job title:");
        String job_title = input.nextLine();

        System.out.println("employed = " + employed);
        System.out.println("job_title = " + job_title);


        System.out.println("Enter your gender:");
        String gender = input.next();

        System.out.println("gender = " + gender);

        input.close();



    }
}
