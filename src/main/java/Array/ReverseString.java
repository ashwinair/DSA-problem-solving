package Array;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {};

    }
    public void reverseString(char[] s) {
        int start =0 , end = s.length - 1;

        for(int i = 0;i<s.length/2;i++){
            swap(s,start,end);
            start++;
            end--;
        }
    }
    public static void swap(char[] ch,int start, int end){
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;

    }
}
