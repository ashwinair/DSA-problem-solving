class MountainPeek {
    //https://leetcode.com/problems/peak-index-in-a-mountain-array
    public int peakIndexInMountainArray(int[] arr) {
        
        int peek =0;
        for(int i = 1;i<arr.length -1;i++){
            
            if(arr[i-1]< arr[i] && arr[i+1]< arr[i])
                peek = i;
        }
        
        return peek;
    }
}