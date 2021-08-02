package Strings;

import java.util.LinkedList;
import java.util.List;

public class LettersCombinationNo {

    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList();//this will work as queue

        String[] letters = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if (digits.length() == 0) return result;

        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (result.peek().length() == i) {
                String permutation = result.remove();
                for (char c : letters[index].toCharArray()) {
                    result.add(permutation + c);
                }
            }
        }


        //permutation queations usually runs slow ....
        return result;
    }
}

