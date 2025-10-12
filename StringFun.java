import java.util.Scanner;

class SFun {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of characters: ");
        int n = scn.nextInt();

        System.out.print("Enter the string: ");
        scn.nextLine();
        String original = scn.nextLine();

        System.out.println("Original String: " + original);

        String reverse = new StringBuilder(original).reverse().toString();

        System.out.println("Reverse String: " + reverse);

        System.out.println("Concatenated String: " + original + "<->" + reverse);
    }
}
