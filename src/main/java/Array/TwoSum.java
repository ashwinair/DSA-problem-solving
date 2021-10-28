package Array;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4}, 6)));
    }
    public static int[] twoSum(int[] n, int target) {
        int[] result = new int[2];
        int p1 =0 , p2 = n.length-1;

        while(p1<p2){
            int sum = n[p1] + n[p2];
            if(sum == target)
            {
                result[0] = p1+1;
                result[1] = p2+1;
                break;
            } else if(sum > target){
                p2--;
            }
            else
                p1++;

        }
        return result;
    }
}
