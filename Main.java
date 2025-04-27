public class Main {
    public static void main(String[] args) {
        
        int a=10;
        int b=5;
        System.out.println("==========Guess The Answers==========");

        System.out.println("Uninary Operator"+ (a++));
        System.out.println("Uninary Operator"+ (++b));
        System.out.println("Binary Operator");
        System.out.println("1+2 " +1+2);
        System.out.println("1+2 " +(1+2));
        System.out.println("1+2 " +" =3");
        int increment = ++a * b++;
        System.out.println(increment);
    }
}