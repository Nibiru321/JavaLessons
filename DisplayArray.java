import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + "elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        displayArr(arr, 0);
    }

    public static void displayArr(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        System.out.println(arr[idx]);

        displayArr(arr, idx + 1);
    }
}
