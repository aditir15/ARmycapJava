import java.util.Scanner;
public class Prime {

    public static void main(String[] args) {

        System.out.println("Please insert any number ");
        Scanner sc=new Scanner(System.in);  //input from user
        int num=sc.nextInt();
        boolean isPrime = false;
        for (int i = 2; i <= num / 2; i++) {
            // condition for nonprime number (divisibility check)
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }

        if (!isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
