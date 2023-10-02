package Java.tasks;

public class MedianNumber {

    public static void main(String[] args) {


        int a = 12;
        int b = 10;
        int c = 20;

        // in order  to be median number between three DIFFERENT numbers
        // needs to be less than b and greater than c. OR a need to be less than c and greater than b


        boolean aIsMedian = (b > a && a > c) || (c > a && a > b);
        boolean bIsMedian = (a > b && b > c) || (c > b && b > a);
        boolean cIsMedian = !aIsMedian && !bIsMedian;
        if (aIsMedian) {
            System.out.println(a + " is the median number");
        } else if (bIsMedian) {
            System.out.println(b + " is the median number");

        }else {
            System.out.println(c + " is the median number");
        }

    }

}

