import java.util.Scanner;

public class FibonacciSeries {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;

            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);

            printFibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of fibonnaci numbers you want to print: ");
        int count = scn.nextInt();

        System.out.print(n1 + " " + n2);

        printFibonacci(count - 2);
    }
}