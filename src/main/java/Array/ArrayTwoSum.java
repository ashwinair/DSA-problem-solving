package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayTwoSum {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6, 5, 3, 4};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr1, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        //HashTable approach O(n)
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");

// Brute Force approach O(n2) time
//        for (i = 0; i < nums.length; i++) {
//            for (j = 0; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target && i != j) {
//                    return new int[]{i, j};//returns the pointer value(address)
//                }
//            }
//        }
//        return new int[]{0};
    }
}
