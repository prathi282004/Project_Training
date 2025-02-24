// Check if a character is a vowel or consonant

package exercise_2.conditionals;

import java.util.Scanner;

public class CheckCharacter_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter character to check whether it is a vowel or consonant");
        System.out.println("Enter character : ");

        char str = 'a';

        try {
            str = scanner.next().charAt(0);
        } catch (Exception e) {
            System.out.println("Invalid input!!");
        }

        switch (str) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(str + " is a vowel");
                break;

            default:
                System.out.println(str + " is a consonant");

        }
    }
}

