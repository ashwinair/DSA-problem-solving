package Array;
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//        Return the running sum of nums.

public class runningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        RunningSum(nums);
    }


    public static int[] RunningSum(int[] nums) {
        int prev = 0;
        for (int i = 0; i < nums.length; i++) {
            prev += nums[i];
            nums[i] = prev;

        }

        return nums;
    }
}