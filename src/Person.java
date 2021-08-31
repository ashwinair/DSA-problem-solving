import java.util.Arrays;
import java.util.*;

public class Person {

    public int age =0;
    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        age = initialAge;
        if (age < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0");
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (age < 13) {
            System.out.println("You are Young");
        } else if (age < 18) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are old");
        }
    }

    public void yearPasses() {
        // Increment this person's age.
        age = age + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p =new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();

//        int[] arr = {5, 7, 7, 8, 8, 10};
//        int t = 2;
//        int k = 3;
//        int n = arr.length;
//        int d = n - k;
////        leetcode(arr,d,k,n);
//        System.out.println(Arrays.toString(searchRange(arr, t)));


    }

    public static void leetcode(int[] arr, int d, int k, int n) {
        int[] temp = new int[n];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i + d];//5,6,7
        }
        for (int j = k; j < n; j++) {
            temp[j] = arr[j - k];
        }

        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] temp = new int[nums.length];
        int count = 0;
        int count1 = 0;
        int[] temp2 = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                temp[count] = i;
                count++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (temp[j] != 0) {
                temp2[count1] = temp[j];
                count1++;
            }
        }
        return temp2;
    }



}