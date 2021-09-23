package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int target = 50;
        int[] arr = {1,2,3,40,50,66,76,80,84,100};
        int start = 0;
        int end = arr.length -1;
       int result =  search(target,arr,start,end);
        System.out.println(result);
    }

    private static int search(int target, int[] arr,int s,int e) {


        while(s<=e){
            int mid = s + (e - s)/2;
            if(arr[mid]== target) return mid;

            if(target > arr[mid]){
                s = mid +1;
                return search(target,arr,s,e);
            }
            if(target < arr[mid]){
                e = mid-1;
                return search(target,arr,s,e);
            }
        }
        return -1;
    }
}
