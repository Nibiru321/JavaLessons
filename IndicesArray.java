import java.util.Scanner;

public class IndicesArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.print("Enter the number to find indices: ");
        int x = scn.nextInt();

        AllIndexes(arr, n, x);
    }

    public static int AllIndexesRecursive(int[] input, int size, int x, int[] output) {
        if (size == 0){
            return 0;
        }

        int smallAns = AllIndexesRecursive(input, size - 1, x, output);

        if(input[size - 1] == x) {
            output[smallAns++] = size - 1;
        }
        return smallAns;
    }

    static void AllIndexes(int[] input, int n, int x) {
        int[] output = new int[n];
        int size = AllIndexesRecursive(input, n, x, output);
        
        for (int i = 0; i < size; i++) {
            System.out.print(output[i] + " "); // Print each index
        }

    }

}
