package Java.tasks;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] arr3 =new int[arr.length+arr2.length];
        int j = 0;
        for (int each : arr){
            arr3[j++] = each;
        }

        for (int each : arr2){
            arr3[j++] = each;
        }

        System.out.println(Arrays.toString(arr3));
    }
}
