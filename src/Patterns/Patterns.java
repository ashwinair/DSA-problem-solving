package Patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern12(5);
    }

//    static void pattern13(int n){
//        int noOfSpace = n-1; //starts with n space
//        int noOfStar = 1;//for first line
//        for (int rows = 0; rows <n; rows++) {
//
//            for (int space = 0; space < noOfSpace; space++) {
//                System.out.print(" ");
//            }
//            int spaceBetweenStars = 0;
//            for(int col = 1;col<=noOfStar;col++) {
//            }
//            //after every line star count inc. by 2
//            noOfStar +=2;
//            noOfSpace--;//after every step space dec. by 1
//            System.out.println();
//        }
//    }


    static void pattern12(int n){ //copied pattern 10 & 11 for now .....hod to solve in any other way too
        int noOfSpace = 0;//starts with 0 space
        for (int rows = 0; rows < n; rows++) {

            for (int space = 0; space < noOfSpace; space++) {
                System.out.print(" ");
            }

            for (int col = n; col > rows; col--) {
                System.out.print(" *");
            }
            noOfSpace++;//after every step space inc. by 1;
            System.out.println();
        }
        //for other half part....
        noOfSpace = n-1; //starts with n-1 space
        for (int rows = 0; rows < n; rows++) {

            for (int space = 0; space < noOfSpace; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= rows; col++) {
                System.out.print(" *");
            }
            noOfSpace--;//after every step space dec. by 1
            System.out.println();
        }
    }
    static void pattern11(int n){
        int noOfSpace = 0;//starts with 0 space
        for (int rows = 0; rows < n; rows++) {

            for (int space = 0; space < noOfSpace; space++) {
                System.out.print(" ");
            }

            for (int col = n; col > rows; col--) {
                System.out.print(" *");
            }
            noOfSpace++;//after every step space inc. by 1;
            System.out.println();
        }
    }

    static void pattern10(int n){
        int noOfSpace = n-1; //starts with n space
        for (int rows = 0; rows < n; rows++) {

            for (int space = 0; space < noOfSpace; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= rows; col++) {
                System.out.print(" *");
            }
            noOfSpace--;//after every step space dec. by 1
            System.out.println();
        }
    }

    static void pattern9(int n){//copies patter7
        int noOfStar = 2 * n;
        for (int rows = 1; rows <= n; rows++) {
            //reverse of patter2 (if row inc. col dec.)(row = 4 but col = 2)

            int noOfSpace = rows-1;//spaces inc. when rows inc.
            for (int space = 0; space < noOfSpace ; space++) {
                System.out.print(" ");
            }
            for(int col = 1;col<noOfStar;col++){
                System.out.print("*");
            }
            noOfStar -=2;
            System.out.println();
        }
    }

    static void pattern8(int n){//copied pattern2
        int noOfStar = 1;//for first line
        for (int rows = 1; rows <= n; rows++) {
            //col will inc. with rows (if rows = 4 col = 4 )

            int noOfSpace = n-rows;//spaces dec. when the rows inc.
            for (int space = 0; space < noOfSpace ; space++) {
                System.out.print(" ");
            }
            for(int col = 1;col<=noOfStar;col++){
                System.out.print("*");

            }
            //after every line star count inc. by 2
            noOfStar +=2;
            //new line
            System.out.println();
        }
    }

    static void pattern7(int n){//copies patter3
        for (int rows = 1; rows <= n; rows++) {
            //reverse of patter2 (if row inc. col dec.)(row = 4 but col = 2)
            int noOfSpace = rows-1;//spaces inc. when rows inc.
            for (int space = 0; space < noOfSpace ; space++) {
                System.out.print(" ");
            }
            for(int col = 5;col>=rows;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){//copied pattern2
        for (int rows = 1; rows <= n; rows++) {
            //col will inc. with rows (if rows = 4 col = 4 )
            int noOfSpace = n-rows;//spaces dec. when the rows inc.
            for (int space = 0; space < noOfSpace ; space++) {
                System.out.print(" ");
            }
            for(int col = 1;col<=rows;col++){
                System.out.print("*");
            }
            //new line
            System.out.println();
        }
    }

    static void pattern5(int n){
        n= 2*n;
        for (int rows = 1; rows <= n - 1; rows++) { //n = 5 and rows = 2n-1(lines)
            int noOfStarInCol = n/2 > rows ? rows : n - rows ;//if rows < 5 then print 5 else 10 - rows
            for(int col = 1;col<=noOfStarInCol;col++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int rows = 1; rows <= n; rows++) {
            for(int col = 1;col<=rows;col++){
                //in this we have to print the col no. with space
                //rest is same like patter2
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int rows = 1; rows <= n; rows++) {
            //reverse of patter2 (if row inc. col dec.)(row = 4 but col = 2)
            for(int col = 5;col>=rows;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern2(int n){
        for (int rows = 1; rows <= n; rows++) {
            //col will inc. with rows (if rows = 4 col = 4 )
            for(int col = 1;col<=rows;col++){
                System.out.print("*");
            }
            //new line
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int rows = 1; rows <= n; rows++) {
            //for every row, run the col
            for(int col = 1;col<=n;col++){
                //prints until col<=n
                System.out.print("*");
            }
            //when new row creates add a new line
            System.out.println();
        }
    }
}

