package Java.tasks;

public class String_equal_vs_Same {

    public static void main (String[] args){

        String s1 = "Hello";
        String s2 = new String(s1);

        String s3= "Hello";

        System.out.println(s1 + " equals " + s2 + " --> " + s1.equals(s2));  //is deep comparison see if both has same value
        System.out.println(s1 + " == " + s2 + " --> " + (s1==s2));  // we are looking for to see if they are pointing to the same object !
        System.out.println(s1 + " == " + s3 + " --> " + (s1==s3));



    }


}
