package Java.tasks;

import java.util.Arrays;

public class MergeAndSort {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    //nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = nums1.length-n ; i < nums1.length; i++) {

                nums1[i] = nums2[j];

                if (j < n) {
                   j++;
                }

        }

        Arrays.sort(nums1);

    }
}
