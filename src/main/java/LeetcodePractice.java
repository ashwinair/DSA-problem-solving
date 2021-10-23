import java.util.LinkedList;
import java.util.List;

public class LeetcodePractice {
    public static void main(String[] args) {
       List<String> a =letterCombinations("22");
        System.out.println(a);
    }

   static public List<String> letterCombinations(String digits){
        LinkedList<String> result = new LinkedList();//this will work as queue

        String[] letters = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if (digits.length() == 0) return result;

        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (result.peek().length() == i) {
                System.out.println(result.peek());
                System.out.println(result.peek().length());
                String permutation = result.remove();
                for (char c : letters[index].toCharArray()) {
                    result.add(permutation + c);
                }
            }
        }


        //permutation queations usually runs slow ....
        return result;
    }

    public static int peakIndexInMountainArray(int[] arr){
//        int peek = arr[0];
        int peek =1;
        while(peek!=arr.length){
            if(arr[peek-1] > arr[peek]) {
                return peek-1;
            }
            peek++;
        }
        return peek;
    }
}
