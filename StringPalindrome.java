// Program to check whether a String is Palindrome or not
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        int size;
        String str, revstr = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        str = sc.nextLine();
        size = str.length();

        // Storing values of word in reverse order
        for (int i = size - 1; i >= 0; i--)
            revstr = revstr + str.charAt(i);

        if (str.equals(revstr))
            System.out.println(str + " is Palindrome!");
        else
            System.out.println(str + " is not Palindrome!");
    }
}
