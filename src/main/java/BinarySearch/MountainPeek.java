package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array
class MountainPeek {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                // if it's true then it means we are in decreasing part of the bionic/mountain array
                end = mid; // because mid also can be the answer we are searching for....but look in the part
            } else {//else we are in ascending array part

               //because we know that mid element < mid + 1 element...so no point of including it then
                start = mid +1;
            }
        }
        return start;//or return end;
        // because both pointing at the same element at the end.
        // that's why in while condition we don't included start<=end
    }
}