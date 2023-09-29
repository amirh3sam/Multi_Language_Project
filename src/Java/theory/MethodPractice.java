package Java.theory;



public class MethodPractice {


    public static void main(String[] args) {

        String result = reverse("Amir");

        System.out.println(result);


    }


    public static String reverse(String str){  // Non heap memory
        return new StringBuilder(str).reverse().toString();
    }

}