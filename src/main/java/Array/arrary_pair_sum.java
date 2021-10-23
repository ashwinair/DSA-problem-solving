package Array;

public class arrary_pair_sum {

    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};//sorted and reversed array
        int sum_value = 26;//sum to find in array pair making or not
        check_sum(arr, sum_value);
    }

    private static void check_sum(int[] arr, int sum_value) {
        int temp;
        for (int i = 0; i <= arr.length - 1; i++) {
            temp = arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (sum(sum_value, arr[j], temp))//ture when we found the sum
                    System.out.println(sum_value + " found by adding " + temp + " and " + arr[j] + ".");

            }
        }

    }

    private static boolean sum(int sum, int i, int temp) {
        return sum == i + temp;
    }
}



