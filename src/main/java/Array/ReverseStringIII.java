package Array;

public class ReverseStringIII {

        public static void main(String[] args) {
            String s = "s'teL ekat edoCteeL tsetnoc";
            System.out.println(reverseWords(s));
//            System.out.println(s);
        }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();

        for(int startOfWord = 0;startOfWord < charArray.length; startOfWord++)
        {
            if(charArray[startOfWord] != ' ') // for non-space letters
            {
                int endOfWord =  startOfWord;//start of a new word
                while(endOfWord + 1 < charArray.length && charArray[endOfWord+1] != ' ')
                { endOfWord++; }//moving the pointer to the end of the word

                reverse(charArray,startOfWord,endOfWord);//now reverse the whole word
                startOfWord = endOfWord; // and move the pointer to end of the particular word
            }
        }
        return sb.append(charArray).toString();
    }

    public static void reverse(char[] ch,int start, int end){
        while(start<end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            //now move both pointers inwards
            start++;
            end--;
        }
    }
}
