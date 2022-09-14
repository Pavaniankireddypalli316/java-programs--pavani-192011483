import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i, num, sum = 0;

        // Take input from user
        System.out.print("Enter any number : ");
        num = scanner.nextInt();

        // Calculate sum of all proper divisors
        for(i = 1; i < num; i++) {

            if(num % i == 0) {
                sum += i;
            }
        }

        // Check whether the sum of divisors is equal to num
        if(sum == num) {
            System.out.println("\n" + num + " is PERFECT NUMBER");
        } else {
            System.out.println("\n" + num + " is NOT PERFECT NUMBER");
        }
    }

}