// Program to sort a String array using sort method in class Arrays

import java.util.Scanner;
import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {
        int words;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of words in the List: ");
        words = sc.nextInt();

        // Declaration of a list containing the words
        String[] wordList = new String[words + 1];

        System.out.println("Enter the words in the List:");
        for (int i = 0; i <= words; i++)
            wordList[i] = sc.nextLine();

        // Sorting a String array 
        Arrays.sort(wordList);

        System.out.print("\nSorted List: ");
        for (String word : wordList)
            System.out.print(word + " ");
    }
}
