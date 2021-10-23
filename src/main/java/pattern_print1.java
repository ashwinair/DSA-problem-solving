public class pattern_print1 {
    public static void main(String[] args) {
     pattern(2);
    }
    static void pattern(int n){
        // lines
            for(int j = 0;j<n;j++){// letters
                for(int i = n;i>0;i--){
               for(int k=0;k<n;k++){
                   System.out.print(i);
               }
                //                int k = j;
//                while(k>0){
//                    System.out.print(j);
//                    k--;
//                }
            }
            System.out.println();
        }
    }
}
