import java.util.HashSet;
import java.util.Set;

class DuplicateNo {
    public int findDuplicate(int[] nums) {
    
     //O(n)
        Set<Integer> seen=new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(seen.contains(nums[i])){
                return nums[i];
            }
            else{
                seen.add(nums[i]);
            }
        }
        
        
        
       
//O(nlogn)        
//         Arrays.sort(nums);
//        
//         for(int i=0;i<nums.length-1;i++){

//             if(nums[i] == nums[i+1]){
//                 return = nums[i];
//             }
//         }
return -1;
    }
}