package Array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
     int[] arr = {0,1,0,3,12};
     moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
//        int j = 1, i=0;
//        while(j < nums.length){
//            if(nums[i] == 0 & nums[j] != 0){
//                swap(nums,i,j);
//            }
//            if(nums[i] != 0){
//                i++;
//            }
//            j++;
//
//        }
        int pointer =0;
        for(int a =0;a<nums.length;a++) {
            if (nums[a] != 0) {
                swap(nums, a, pointer);
                pointer++;
            }
        }
    }
    public static void swap(int[] num,int i,int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
