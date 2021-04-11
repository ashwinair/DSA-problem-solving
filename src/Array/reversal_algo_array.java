package Array;

public class reversal_algo_array {

    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 4, 5};//considering array is already sorted
        rotate(ar, 1);
//        Time Complexity : O(n)
//        (means that the algorithm's maximum running time is proportional to the input size.)
    }


    public static void rotate(int[] ar, int d) {
        int n = ar.length;

        if (d == 0) {
            return;
        }
        reverseArray(ar, 0, d - 1);     //reverse A(0.....d-1)
        reverseArray(ar, d, n - 1);         //reverse B(d.....n-1)
        reverseArray(ar, 0, n - 1);     //reverse BA(0.....n-1)

        print(ar, n);
    }

    public static void reverseArray(int[] ar, int start, int end) {
        int temp; // to store temp val for swapping
        while (start < end) {
            temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }

    }

    static void print(int[] ar, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(ar[i] + " ");//printing all val of the array one by one
    }

}
