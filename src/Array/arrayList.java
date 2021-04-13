//package Array;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class arrayList {//not completed
//
//    public static void main(String[] args) {
//        int t = 3;
//        int[] arr = {1, 2, 3};
//        int sum = 0;
//
//        ArrayList<Character> list = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        char a;
//        for (int i = 0; i < t; i++) {
//            a = scanner.next().charAt(0);
//            insert(list, a);
//        }
//
//    }
//
//    public static void insert(ArrayList<Character> clist, char c) {
//        clist.add(c);
//        //add c to clist
//    }
//
//    // Function to count frequency of element
//    public static void freq(ArrayList<Character> clist, char c) {
//        boolean i = clist.contains('i');
//        boolean f = clist.contains('f');
//
//        if (i && f)
//            System.out.println("Not Present");
//        else
//            Collections.frequency(clist, c);
//
//    }
//}
