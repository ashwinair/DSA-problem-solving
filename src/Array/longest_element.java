package Array;

public class longest_element {

    public static void main(String[] args) {
        long[] arr = {1, 2, 5, 90, 64, 4, 87};
        System.out.println(largest(arr, arr.length));
    }

    public static long largest(long[] arr, long n) {
        long i;
        long temp = 0;

        for (i = 0; i < n; i++) {
            if (temp < arr[(int) i])
                temp = arr[(int) i];
        }
        return temp;
    }

}


