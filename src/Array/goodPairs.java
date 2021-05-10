package Array;

//Given an array of integers nums.
//
//        A pair (i,j) is called good if nums[i] == nums[j] and i < j.
//
//        Return the number of good pairs.
public class goodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        numIdenticalPairs(nums);
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        //not an optimal solution..........
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;

    }
}
