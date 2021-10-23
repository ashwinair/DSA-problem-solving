package CyclicSort;

import java.util.ArrayList;
import java.util.List;

class FindAllDuplicates {
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public List<Integer> findDuplicates(int[] arr) {

        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correctLoc = arr[i] - 1;
            if (arr[i] != arr[correctLoc]) {
                swap(arr, i, correctLoc);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (index + 1 != arr[index]) {
                ans.add(arr[index]);
            }
        }


        return ans;
    }
}