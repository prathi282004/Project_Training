// Replace all spaces in a string with -.

package exercise_2.arrays;

import java.util.Scanner;
//TODO : JR - multiple line - output
public class ReplaceSpace_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To replace all spaces in a string with -");

        System.out.println("Enter sentence : ");
        String str = "bbc";

        try {
            str = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input!!");
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                String result = str.replace(" ", "-");
                System.out.println("Replaced - in place of space is : " + result);
            }
        }

    }
}

