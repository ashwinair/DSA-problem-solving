import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};

        System.out.println(maxSlidingWindow(nums, 3));
    }

    static public List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while (j < nums.length) {

            if (j - i + 1 < k) {
                max = Math.max(max, nums[j]);
                j++;

            } else {
                result.add(max);
                i++;
                j++;
                max = nums[i];
            }


        }


        return result;
    }
}


//
//        Scanner scan = new Scanner(System.in);
//        double payment = scan.nextDouble();
//        scan.close();
//        /* Create NumberFormats using Locales */
//        Locale indiaLocale = new Locale("en", "IN");
//        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
//
//
//        /* Print output */
//        System.out.println("US: "     + us.format(payment));
//        System.out.println("India: "  + india.format(payment));
//        System.out.println("China: "  + china.format(payment));
//        System.out.println("France: " + france.format(payment));

