package CyclicSort;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class DisappearedNumb {
    public List<Integer> findDisappearedNumbers(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
            int i =0;
            while(i<arr.length) {
                int correctLoc = arr[i] - 1;// because array starting from 1 to n  that's why we -1 to make it 0 to n
                if (arr[i] != arr[correctLoc]) {
                    swap(arr, i, correctLoc);
                } else {
                    i++;
                }
            }
        for (int index = 0; index < arr.length; index++) {
            if(index+1 != arr[index]){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[]arr,int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}