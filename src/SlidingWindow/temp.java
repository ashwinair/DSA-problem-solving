//package SlidingWindow;
//
//
//import java.lang.*;
//        import java.util.*;
//
//public class temp {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int q = sc.nextInt();
//
//        for(int i =0;i<q;i++){
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            check(x,y);
//
//        }
//        sc.close();
//
//    }
//    static void check(int x,int y){
//
//        Queue<Integer> que = new ArrayDeque<>();
//
//        if (x == 1)
//            que.offer(y);
//        else if (x == 2) {
//            if (que.size() == 0)
//                System.out.println(-1);
//            else
//                System.out.println(q.peek());
//
//        } else {
//
//            else
//                que.poll();
//        }
//
//}
//
//// You need to answer Q queries, in each query you are given two integers x and y:
//
////     if x = 1 then push the integer y  to the back of the queue.
////     if x = 2 then return the front element of the queue if the queue is not empty else return -1
////     if x = 3  then remove the front element from the queue if the queue is not empty else do nothing. No need to return anything in this query.
//
//
//
//
//// Input Format
//
//// First line of input contains a single integer Q.
//
//// Next Q lines each contain two integers x and y for that query.
//
//
//
//
//// Output Format
//
//// For each query in which x = 2 print its answer in separate lines.
//
//
//// Example Input
//
//// Input 1:
//
////  5
////  2 -1
////  1 5
////  3 -1
////  1 5
////  2 -1
//
//
////-1
////5