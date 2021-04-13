package Array;

public class Segregate0and1 {
    public static void main(String[] args) {
        segregate0and1();
    }

    public static void segregate0and1() {
        int[] arr = {1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0};
        int n = arr.length;
        int i, j, x;
        int count = 0;
        int a = 0;
        for (x = 0; x < n; x++) {
            if (arr[x] != 0) {
                arr[x] = 0;
                count++;//22

            }//3


        }
        System.out.println(count);
        for (j = n - count + 1; j < n; j++) {
            arr[j] = 1;
            a++;
        }
    }

}
