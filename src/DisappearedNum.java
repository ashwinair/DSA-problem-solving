import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class DisappearedNum {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        int[] map = new int[nums.length];

        for (int num : nums) {
            map[num - 1]++;
        }
        for (int i = 0; i < map.length; i++) {
            if(map[i]==0){
                ans.add(i+1);
            }
        }


        return ans;
    }
    
}