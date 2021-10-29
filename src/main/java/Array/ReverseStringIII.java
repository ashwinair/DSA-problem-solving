package Array;

public class ReverseStringIII {

        public static void main(String[] args) {
            String s = "Oh god";
            reverseString(s);
//            System.out.println(s);
        }
        public static void reverseString(String s) {
            int start =0 , end = 1;
            char[] charArray = s.toCharArray();
            for (char ch : charArray) {
                if(ch == ' ' ){
                    while(start < end){
                        swap(charArray,start,end);
                        start++;
                        end--;
                    }
                    end++;
                    start = end;
                }
            }
            for (char ch:charArray
                 ) {
                System.out.print(ch);

            }
        }
        public static void swap(char[] ch,int start, int end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

        }
    }

