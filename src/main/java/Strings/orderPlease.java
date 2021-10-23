package Strings;

import java.util.Arrays;

public class orderPlease {
    public static void main(String[] args) {
        order("is2 Thi1s T4est 3a");
    }
    public static void order(String words) {

        StringBuilder sb = new StringBuilder();
        StringBuilder realSb = new StringBuilder();
        int i =0;
        int[]num = new int[4];
        for(char c: words.toCharArray()){
            if(Character.isDigit(c)){
                num[i] =Integer.parseInt(String.valueOf(c));
                i++;
            }
        }
        for(int j=0;j<words.length();j++){
            sb.append(words.charAt(3));
            int val =0;
            if(words.charAt(j) ==' '){
                realSb.append(sb.toString(),0,1);
                val++;
                sb.setLength(0);
            }

        }
//        System.out.println(words.charAt(3));

        System.out.println(realSb);
        System.out.println(Arrays.toString(num));
//        return sb.toString();
    }
}
// sb.insert(0, Integer.toString(i));

