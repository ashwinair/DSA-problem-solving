package Array;/*package whatever //do not write package name here */

import java.util.Arrays;
import java.util.Scanner;

public class rotate_test_cases {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter test cases");
        t = sc.nextInt();
        for (int i = 0; i <= t; i++)
            System.out.println(Arrays.toString(test_case(t)));
    }

    public static void rotate(int[] ar, int start, int end) {

        int temp; // to store temp val for swapping
        while (start < end) {
            temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }

    }

    public static int[] test_case(int t) {
        Scanner sc = new Scanner(System.in);
        int n, d;
        System.out.println("enter N:");
        n = sc.nextInt();
        System.out.println("enter D(must be greater than N):");
        d = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("enter array");
        for (int j = 0; j < n; j++)
            ar[j] = sc.nextInt();//enter values in array


        rotate(ar, 0, d - 1);
        rotate(ar, d, n - 1);
        rotate(ar, 0, n - 1);

        return ar;

    }
}