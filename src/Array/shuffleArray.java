package Array;
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//        Return the array in the form [x1,y1,x2,y2,...,xn,yn].


public class shuffleArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        shuffle(nums, 3);
    }

    public static int[] shuffle(int[] nums, int n) { //O(n) time
        int[] fHalf = new int[n];

        int[] sHalf = new int[n];

        int h = 0;
        for (int i = 0; i < n; i++) {
            fHalf[i] = nums[i];
            sHalf[i] = nums[i + n];
        }

        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
                nums[i] = fHalf[h];
            } else {
                nums[i] = sHalf[h];
                h++;
            }
        }
        return nums;
    }


}
