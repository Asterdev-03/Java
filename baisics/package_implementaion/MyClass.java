import NewPackage.NewClass;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NewClass nc = new NewClass();
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        String s =  nc.parityCheck(num);
        System.out.println(s);
    }
}
