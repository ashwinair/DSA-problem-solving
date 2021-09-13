package BinarySearch;

class InsertPosition {
    public int searchInsert(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        if(target < arr[start]){
            return 0;
        }
        if(target > arr[end]){
            return end+1;
        }
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                if(arr[mid-1]<target) return mid;
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}