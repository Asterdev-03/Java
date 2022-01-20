// Program to check whether a number is Prime or not

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int num;
        boolean flag = false;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            num = sc.nextInt();
        }
        if (num <= 1)
            flag = true;
        else
            for (int i = 2; i <= num / 2; i++)
                if (num % 2 == 0) {
                    flag = true;
                    break;
                }
        if (flag)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
