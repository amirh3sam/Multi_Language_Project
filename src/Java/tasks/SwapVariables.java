package Java.tasks;

public class SwapVariables {


    public static void main(String[] args) {
        int a =10 ;
        int b =20;

        // with temp variable

        int t = a;
          a = b;
          b= t ;

        System.out.println("a = "+ a + " b = " + b );

        // without Temp value
        int c =30;
        int d =40;
        c = ( c + d );
        d = ( c - d );
        c = ( c - d );
        System.out.println("C = " + c + " D = " + d);

    }
}
