package Java.tasks;

public class Reverse {


    public static void main(String[] args) {


        String str = "Amir";
        String reversed = "" ;
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);
    }
}
