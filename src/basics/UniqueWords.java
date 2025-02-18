// 1) Unique Words Counter
//Given a list of words, use a HashSet to find the count of unique words.

package basics;

import java.util.Collections;
import java.util.Scanner;
import java.util.HashSet;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> words = new HashSet<>();

        System.out.println("Enter words :");
        String input = scanner.nextLine();

        String[] wordArray = input.split(" ");

        // Collections.addAll(words, wordArray);

        for (int i = 0; i < wordArray.length; i++) {
            String word = wordArray[i];
            words.add(word);
        }
        
        System.out.println("Unique word count: " + words.size());
    }
}
