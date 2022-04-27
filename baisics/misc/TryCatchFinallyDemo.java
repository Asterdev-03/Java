import java.util.*;

public class TryCatchFinallyDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of a : ");
        int a = sc.nextInt();
        System.out.print("Enter The Value Of b : ");
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("Quotient : " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception Found : " + e);
        } finally {
            System.out.println("This will be executed");
        }
    }
}