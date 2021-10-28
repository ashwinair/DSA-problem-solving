package Array;

import java.util.Arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SqOfSortedArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
    public static int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        int l = 0, r = nums.length - 1;
        int position = nums.length - 1;
        int left,right;

        while(l<=r){
            left = Math.abs(nums[l]);
            right = Math.abs(nums[r]);
            if( left > right)
            {
                result[position] = (int) Math.pow(left,2);
                l++;
            }
            else{
                result[position] =(int) Math.pow(right,2);
                r--;
            }
            position--;


        }
        return result;

    }

}
