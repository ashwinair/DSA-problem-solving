package CyclicSort;

class MissingNumber {
    public int missingNumber(int[] arr) {
            int i =0;
            while(i<arr.length){
                int correctLoc = arr[i] ;//index is starting from 0
                if(arr[i]< arr.length && arr[i] != arr[correctLoc]){
                    swap(arr,i,correctLoc);
                }
                else{
                    i++;
                }
            }
        //case 1: if the  value in between is not present...
        for (int j = 0; j < arr.length ; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        //case 2 : if the nth value is not there then....
        return arr.length;


    }
    static void swap(int[]arr,int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}