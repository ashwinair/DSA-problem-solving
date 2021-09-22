package Strings;
//https://www.hackerrank.com/challenges/java-strings-introduction/problem
import java.util.Scanner;

public class HackerRank_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(firstLetterCapital(A) + " " + firstLetterCapital(B));
        // first Letter Capital without creating a function
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1,A.length()));
    }

    private static String firstLetterCapital(String letter) {
        StringBuilder sb = new StringBuilder();
        sb.append(letter.toUpperCase().charAt(0));
        for (int i = 1; i < letter.length(); i++) {
            char c = letter.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }
}



