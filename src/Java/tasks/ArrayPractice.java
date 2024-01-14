package Java.tasks;

public class ArrayPractice {


    /*
    toString() -->Returns a string representation of the contents of this array
    equals() --> Returns boolean, checks if both the arrays are equal or not.
    sort()  --> Sorts the complete array in ascending order.
    copyOf()  --> Returns new array, copies the specified array,
                   (truncating or padding with zeros if necessary)
    copyOfRange() --> Returns new array, copies the specified range

    toArrays -> convert String to Array
       */

    /*
    for(DataType VariableName : DataStructure){
    //statements
    }
    int[] num = {1,2,3,4};

    for(int each : num){
    System.out.println(each);

     */
    public static void main(String[] args) {


        String str = "Amir";

        char[] charArray = str.toCharArray();

        for (char each: charArray) {

            System.out.print(each+", ");

        }

    }
}