public class concatenateSquareOfEveryDigit {

    public static void main(String[] args) {
        long val = 9119;
        System.out.println(square(val));
    }

    static int square(long n) {
        String temp = Long.toString(n);
        int digit;
        String square = "";
        for (int i = 0; i < temp.length(); i++) {
            digit = temp.charAt(i) - '0';
            square += digit * digit;
        }
        return Integer.parseInt(square);

//        while(n>0){
//            temp = n% 10;
//            square +=temp *temp;
//            n /=10;
//        }

    }
}
