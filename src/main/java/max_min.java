import java.util.Scanner;

public class max_min {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//no. of element
        int[] ar = new int[n];
        for (int j = 0; j < n; j++) {
            ar[j] = sc.nextInt();//enter values in array
        }
        // Calling getMax() method for getting max value
        int max = getMax(ar);
        System.out.println("Maximum Value is: " + max);

        // Calling getMin() method for getting min value
        int min = getMin(ar);
        System.out.println("Minimum Value is: " + min);
    }

    // Method for getting the maximum value
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // Method for getting the minimum value
    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
