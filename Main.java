import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a positive number n: ");
        int n = scn.nextInt();

        pzz(n);
    }

    public static void pzz(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        pzz(n - 1);

        System.out.print(n + " ");

        pzz(n - 1);

        System.out.print(n + " ");

        pzz(n - 1);
    }
}
