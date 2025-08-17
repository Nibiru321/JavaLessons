import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + "elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        displayArrReverse(arr, 0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        displayArrReverse(arr, idx + 1);

        System.out.println(arr[idx]);
    }
}
