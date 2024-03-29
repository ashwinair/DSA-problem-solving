package Array;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class peekMountainIndex {
    public static void main(String[] args) {
        int a = peakIndexInMountainArray(new int[]{0,0,0,0,0,0,0,1,0});
        System.out.println(a);
    }
        public static int peakIndexInMountainArray(int[] arr) {
            int start =0;
            int end = arr.length-1;

            while(start < end) {
                int mid = start + (end - start) / 2;
                if(arr[mid] > arr[mid + 1]){
                    end = mid;
                }
                else {
                    start = mid +1;
                }
            }
            return start;
        }
}

