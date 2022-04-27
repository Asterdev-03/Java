// Program to find factorial / sum of digits of a number using recurssion

import java.util.Scanner;

// Declartion of a class using recurssion type methods
class Recurssion {

    // TO find the factorial of a number
    int factorial(int value) {
        if (value == 1)
            return 1;
        return value * factorial(value - 1);
    }

    // TO find the sum of digits of a number
    int DigitSum(int value) {
        if (value % 10 == 0)
            return 0;
        return (value % 10) + DigitSum(value / 10);
    }

}

public class Recursion {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        Recurssion rec = new Recurssion();

        int fact = rec.factorial(num);
        int digitSum = rec.DigitSum(num);

        System.out.println("Factorial: " + fact);
        System.out.println("Sum of Digits: " + digitSum);
    }

}