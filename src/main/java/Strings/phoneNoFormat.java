package Strings;

public class phoneNoFormat {
    // "(123) 456-7890" in this format
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(num));
    }
    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "(xxx) xxx-xxxx";

        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }

        return phoneNumber;
    }
//        StringBuilder sb = new StringBuilder();
//        sb.append('(');
//        for(int i =0;i<10;i++){
//            if(i<3){
//                sb.append(numbers[i]);
//            }
//            if(i==3){
//                sb.append(')');
//                sb.append(' ');
//                sb.append(numbers[i]);
//            }
//            if(i<6 && i>3){
//                sb.append(numbers[i]);
//            }
//            if(i==5){
//                sb.append('-');
//            }
//            if(i>5){
//                sb.append(numbers[i]);
//            }
//
//
//        }
//        return sb.toString();
//    }
}



