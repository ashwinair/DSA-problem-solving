package Array;

import java.util.HashMap;

public class alienDictionary {
    public static void main(String[] args) {
        String[] words= new String[]{"hello", "leetcode"};
        isAlienSorted(words, "hlabcdefgijkmnopqrstuvwxyz");
    }
        public static boolean isAlienSorted(String[] words, String order) {
            boolean isLex = false;

            HashMap<Character,Integer> wordMap = new HashMap<>();

            for(int i = 0;i<order.length();i++)
            {
                char ch = order.charAt(i);

                if(!wordMap.containsKey(ch)){

                    wordMap.put(ch,i);
                }

            }//order of letters


            for(String word : words){

                if(checkWord(word,wordMap)){
                    isLex = true;
                }
            }

            if(isLex){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

            return isLex;

        }

        static boolean checkWord(String word, HashMap<Character, Integer> wordMap){
            int prev = 0;
            for(char ch : word.toCharArray()){

                if(wordMap.get(ch)>=prev){
                    prev = wordMap.get(ch);
                }
                else{
                    return false;
                }

            }


            return true;
        }


}
