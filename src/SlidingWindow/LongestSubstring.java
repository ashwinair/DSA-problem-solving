package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int max = 0;

        while (j < s.length()) {

            if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;

            } else {
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, set.size());
            }


        }
        return max;
    }
}

