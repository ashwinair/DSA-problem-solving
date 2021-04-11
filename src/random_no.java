import java.util.Scanner;

public class random_no {

    public static void main(String[] args) {

        count_prime prime = new count_prime();
        Scanner scanner = new Scanner(System.in);
//        Random random =new Random();
//        int x = random.nextInt();
//        System.out.println(x);

        int a = scanner.nextInt();
        prime.countPrimes(a);


    }
}
