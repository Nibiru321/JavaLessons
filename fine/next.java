package fine;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The string is "+str);
        int num = sc.nextInt();
        System.out.println("The number is "+num);
        float fnum = sc.nextFloat();
        System.out.println("The floating number is "+fnum);
    }
}