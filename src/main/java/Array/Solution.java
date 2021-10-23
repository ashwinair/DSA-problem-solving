package Array;

import java.util.List;

class Solution {
    public static void main(String[] args) {
//       String op = whoLikesIt("Alex", "Jacob", "Mark", "Max","Ashwin","Nair");
//        System.out.println(op);
//        System.out.println(getXO("ashwin"));
//        System.out.println(getMiddle("ashwin"));
//        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,1,1))));
        System.out.println(divide(4));

    }
    public static boolean divide(int weight) {
        if(weight == 2) return false;
        return weight % 2 ==0;
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
//        int number = 0;
//        for (int bit : binary)
//            number = number << 1 | bit;
//        return number;
////    }
//        String res = "";
//
//        for (int i : binary)
//            res += i;
//
//        return Integer.parseInt(res, 2);
//    }
        String binaryString = binary.toString();
        String convert = binaryString.substring(1, binaryString.length()-1);
        StringBuilder sb = new StringBuilder();
        for (char ch: convert.toCharArray())
            if(ch != ',' && ch != ' ') sb.append(ch);

       return Integer.parseInt(String.valueOf(sb),2);
    }
    public static String getMiddle(String word) {
        int size = word.length();
        System.out.println(size);
        int half = size/2;
        System.out.println(half);
        if(size % 2 == 0){
            System.out.println(half -1);
            return word.substring(half -1 ,half+1);

        }
        else{
            return word.charAt(half) + "";
        }
    }

    public static boolean getXO (String str) {

        int x = 0,o=0;

        for(char ch : str.toLowerCase().toCharArray()){
            if(ch == 'x') x++;
            if(ch == 'o') o++;
        }

        return x == o;
    }
    public static String whoLikesIt(String... names) {
//can (also) use switch cases instead of if statements
//    switch (names.length){
//        case 0:return "no one likes this";
//        case 1:return names[0]+" likes this";
//        case 2:return names[0]+" and "+names[1]+" like this";
//        case 3:return names[0]+", "+names[1]+" and "+names[2]+ " like this";
//        default:return names[0]+", "+names[1]+" and "+(names.length-2)+" others like this";
//    }

        if(names.length == 1) return names[0] +" likes this";
        if(names.length == 2) return  names[0] + " and " + names[1] + " likes this";
        if(names.length == 3) return names[0] + ", " + names[1] + " and " + names[2] + " likes this";
        if(names.length > 3)  return names[0] + ", " + names[1] + " and " + (names.length-2) + " others" + " likes this";
        return "no one likes this";
    }
}