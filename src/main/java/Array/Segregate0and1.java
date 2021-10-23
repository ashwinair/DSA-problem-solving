package Array;

public class Segregate0and1 {
    public static void main(String[] args) {
      segregate0and1();
    }

    public static void segregate0and1() {
        int[] arr = {0, 1, 0, 1, 1, 0};
        int j, x;
        int count = 0;
        for (x = 0; x < arr.length; x++) {
            if (arr[x] != 0) {
                arr[x] = 0;
                count++;//22

            }//3


        }
//        System.out.println(arr.length);
//        System.out.println(count);
        int one = 0;
        for (j = arr.length - count; j < arr.length; j++) {
            arr[j] = 1;
            one++;
        }
//        System.out.println(one);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}

//time complexity O(n)