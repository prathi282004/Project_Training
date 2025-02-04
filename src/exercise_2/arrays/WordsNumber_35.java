// Find the number of words in a given sentence.

package exercise_2.arrays;

import java.util.Scanner;

public class WordsNumber_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To find the number of words in a given sentence");

        System.out.println("Enter sentence : ");
        String sentence = "bbc def ghi";

        try {
            sentence = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input!!");
        }

        int word_count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                if ((i == 0) || (sentence.charAt(i - 1) == ' '))
                    word_count++;
            }
        }
        System.out.println(sentence + " contains " + word_count + " number of words");
    }
}
