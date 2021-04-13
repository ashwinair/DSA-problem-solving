package Array;

import java.util.Arrays;

public class ArrayTwoSum {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6, 5, 3, 4};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr1, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int i, j;

        for (i = 0; i < nums.length; i++) {
            for (j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};//returns the pointer value(address)
                }
            }
        }
        return new int[]{0};
    }
}
