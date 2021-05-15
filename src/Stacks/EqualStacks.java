package Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//https://www.hackerrank.com/challenges/equal-stacks/problem?isFullScreen=false
//You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height.
//You can change the height of a stack by removing and discarding its topmost cylinder any number of times.
//Find the maximum possible height of the stacks such that all of the stacks are exactly the same height.
//This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they are all the same height,
//then return the height.

public class EqualStacks {
    public static void main(String[] args) {
        ArrayList<Integer> h1 = new ArrayList<>();
        ArrayList<Integer> h2 = new ArrayList<>();
        ArrayList<Integer> h3 = new ArrayList<>();
        h1.add(3);
        h1.add(2);
        h1.add(1);
        h1.add(1);
        h1.add(1);
        h2.add(4);
        h2.add(3);
        h2.add(2);
        h3.add(1);
        h3.add(1);
        h3.add(4);
        h3.add(1);

        System.out.println(equalStacks(h1, h2, h3));
    }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        int s1Total = 0, s2Total = 0, s3Total = 0;

        for (int i = h1.size() - 1; i >= 0; i--) {
            s1Total += h1.get(i);
            st1.push(s1Total);
        }//for h1 box's

        for (int i = h2.size() - 1; i >= 0; i--) {
            s2Total += h2.get(i);
            st2.push(s2Total);
        }//for h1 box's

        for (int i = h3.size() - 1; i >= 0; i--) {
            s3Total += h3.get(i);
            st3.push(s3Total);
        }//for h3 box's


        while (true) {
            if (st1.isEmpty() || st2.isEmpty() || st3.isEmpty()) return 0;

            s1Total = st1.peek();
            s2Total = st2.peek();
            s3Total = st3.peek();

            if (s1Total == s2Total && s2Total == s3Total) {
                return s1Total;
            }//all are equal so print any one fo them

            if (s1Total >= s2Total && s1Total >= s3Total) {
                st1.pop();
            }
            if (s2Total >= s1Total && s2Total >= s3Total) {
                st2.pop();
            }
            if (s3Total >= s2Total && s3Total >= s1Total) {
                st3.pop();
            }
        }
    }

}

