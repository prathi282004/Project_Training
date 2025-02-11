//Check if a string is a palindrome.

package exercise_2.arrays;

import java.util.Scanner;
//JR - Review DONE
public class StringPalindrome_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "abc";

        try {
            System.out.println("Enter string to check whether it is palindrome : ");
            str = scanner.next();
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println(str + " is Not Palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println(str + " is a Palindrome");

    }
}
