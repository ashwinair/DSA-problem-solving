package Array;

import java.util.Arrays;

public class cyclically_rotate_array {

    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 4, 5};//considering array is already sorted
        rotate(ar, 1);
    }


    public static void rotate(int[] ar, int d) {
        int n = ar.length;

        if (d == 0) {
            return;
        }
        System.out.println(Arrays.toString(cyclically_rotate(ar)));

    }

    public static int[] cyclically_rotate(int[] ar) {
        int temp = ar[ar.length - 1];// to store temp val for swapping
        int[] c = new int[ar.length];
        for (int i = 0; i < ar.length - 1; i++) {
            c[i + 1] = ar[i];
        }
        ar[0] = temp;
        System.arraycopy(c, 1, ar, 1, ar.length - 1);
        return ar;
    }


}
