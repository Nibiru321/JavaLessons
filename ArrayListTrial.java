import java.util.*;

public class ArrayListTrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of arrays you want to input: ");
        int n = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.print("Enter the size of array " + (i + 1) + ": ");
            int n1 = sc.nextInt();

            ArrayList<Integer> l2 = new ArrayList<>();

            System.out.println("Enter the " + n1 + " elements of array " + (i + 1) + "; ");
            for(int j = 0; j < n1; j++) {
                l2.add(sc.nextInt());
            }

            list.add(i, l2);
        }

        System.out.print("Enter the number of queries to process: ");
        int num = sc.nextInt();
        
        for(int k = 0; k < num; k++){
            System.out.print("Enter row and column for query " + (k + 1) + ": ");
            int m = sc.nextInt();
            int o = sc.nextInt();

            try {
                System.out.println("Element at (" + m + ", " + o + "):" + list.get(m - 1).get(o - 1));
            }
            catch (Exception e) {
                System.out.println("ERROR");
            }
        }
        
    }
}