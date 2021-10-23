package CyclicSort;

class DuplicateNum {
    public int findDuplicate(int[] arr) {
//cyclic sort

        int i =0;
        while(i<arr.length){
            if(arr[i] != i+1){
                int correctLoc = arr[i] - 1;// because array starting from 1 to n  that's why we -1 to make it 0 to n
                if(arr[i] != arr[correctLoc]){
                    swap(arr,i,correctLoc);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }

        }
//        for (int index = 0; index < arr.length ; index++) {
//            if(index +1 != arr[index]){
//                return arr[index];
//            }
//        }
        return -1;
    }

    static void swap(int[]arr,int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    //O(n)
//        Set<Integer> seen=new HashSet<>();
//        for(int i =0;i<nums.length;i++){
//            if(seen.contains(nums[i])){
//                return nums[i];
//            }
//            else{
//                seen.add(nums[i]);
//            }
//        }
        
        
        
       
    //O(nlogn)
//         Arrays.sort(nums);
//        
//         for(int i=0;i<nums.length-1;i++){

//             if(nums[i] == nums[i+1]){
//                 return = nums[i];
//             }
//         }

}