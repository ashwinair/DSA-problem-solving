package Array;

import java.util.ArrayList;
import java.util.List;

//Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
//For each kid check if there is a way to distribute extraCandies among the
//kids such that he or she can have the greatest number of candies among them.
// Notice that multiple kids can have the greatest number of candies.
public class kidsCandies {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        kidsWithCandies(nums, 3);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> whichKidCan = new ArrayList<>();
        int maxCandy = 0;

        for (int candy : candies) {
            maxCandy = Math.max(maxCandy, candy);
        }

        for (int candy : candies) {

            if (candy + extraCandies >= maxCandy) {
                whichKidCan.add(true);
            } else {
                whichKidCan.add(false);
            }

        }

        return whichKidCan;
    }
}
