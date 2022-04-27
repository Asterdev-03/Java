// Program to Display reverse of a String using reverse method in class StringBuffer

import java.util.Scanner;
import java.lang.StringBuffer;

public class StringReverse {
    public static void main(String[] args) {
        String word;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        word = sc.nextLine();

        // Reversing a word using StringBuffer class
        StringBuffer str = new StringBuffer(word);
        str.reverse();

        System.out.println("Word in Reverse: " + str);
    }
}