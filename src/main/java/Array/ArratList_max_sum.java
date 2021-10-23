package Array;


import java.util.ArrayList;

public class ArratList_max_sum {
    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<>();
        int[][] arr = {{1, 2, 3}, {5, 6, 7}, {10, 9, 10}};//2d array
        int[] b = {3, 60, 9};
        int n = 3;
        int i;
        int r = 2;
        int sum = 0;
        int rSum = 0;

        for (i = 0; i < n; i++) {
            sum += arr[i][i];
        }
        alist.add(sum);
        System.out.println("Sum of left diagonal:" + alist.get(0));
        for (int k = 0; k < 3; k++) {
            rSum += arr[k][r];
            r--;
        }
        alist.add(rSum);
//        (0,2),(1,1),(2,0) right diagonal
        System.out.println("Sum of right diagonal:" + alist.get(1));

        int max = b[0];
        for (int j = 0; j < n; j++) {

            if (b[j] > max) {
                max = b[j];
            }
        }
        System.out.println("max value:" + max);
    }
}


//
//class Complete
//{
//    public static ArrayList<Integer> array(int a[][], int b[], int n)
//    {
//        ArrayList<Integer> list =new ArrayList<>();
//        int sum=0;
//        for(int i=0;i<n;i++){
//
//            sum +=  a[i][i];
//        }
//        list.add(sum);//sum of left diagonal of the array
//
//        //max:
//
//        int max = b[0];
//        for(int j=0;j<n;j++){
//
//            if(b[j]>max){
//                max=b[j];
//            }
//        }
//        list.add(max);
//
//        return list;
//    }
//
//}