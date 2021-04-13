package Array;

import java.util.Arrays;

public class MedianSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6, 5, 3, 4};
        int[] arr2 = {8, 9, 20};
        findMedianSortedArrays(arr1, arr2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int d, odd;
        int x = 0;
        double median;
        int[] add = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            add[i] = nums1[i];
        }
//        System.out.println(add.length);
//        System.out.println(nums2.length);
//        System.out.println(nums1.length);
        for (int j = 0; j < nums2.length; j++) {
            add[nums1.length + j] = nums2[j];

        }

        Arrays.sort(add);
        System.out.println(Arrays.toString(add));
        if (add.length % 2 == 0) {
            d = add.length / 2;
            median = add[d] + add[d - 1];
//            System.out.println(d);
//            System.out.println(median/2);
            return median / 2;
        } else {
            odd = add.length / 2;
            System.out.println(add[odd]);
            return odd;
        }
    }
}
