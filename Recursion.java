import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int n = scn.nextInt();

        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
