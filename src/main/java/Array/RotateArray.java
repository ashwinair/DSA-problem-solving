//package Array;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class RotateArray {
//    public static void main(String[] args) {
//        rotate(new int[] {-1},1);
//    }
//    public static void rotate(int[] nums, int k) {
//
//        List<Integer> ls = new ArrayList<>();
//        int start = nums.length - k;
//        if(nums.length < k) return 0;
//        for(int i=start;i<nums.length;i++)
//        {
//            ls.add(nums[i]);
//        }
//        for(int i= 0;i<start;i++)
//        {
//            ls.add(nums[i]);
//        }
//        for(int i =0;i< nums.length;i++){
//            nums[i] = ls.get(i);
//        }
//        System.out.println(Arrays.toString(nums));
//    }
////        int n=nums.length;
////        int d = k % n;
////
////
////        reverse(nums,0,n-1);
////        reverse(nums,0,d-1);
////        reverse(nums,d,n-1);
////
////    }
////
////    public static void reverse(int[] nums,int start,int end){
////        while (start < end) {
////            int temp = nums[start];
////            nums[start] = nums[end];
////            nums[end] = temp;
////            start++;
////            end--;
////        }
////    }
//
//}