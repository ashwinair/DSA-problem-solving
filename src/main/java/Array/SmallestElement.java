package Array;

import java.util.Arrays;

public class SmallestElement {

    public static void main(String[] args) {

        int[] arr = {1, 50, 94, 62, 35, 12, 52};
        int l = 0;
        int r = arr.length - 1;
        int k = 3;
        System.out.println(kthSmallest(arr, l, r, k));

    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

}
