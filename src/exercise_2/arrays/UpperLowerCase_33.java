// Convert string to uppercase and lowercase

package exercise_2.arrays;

import java.util.Scanner;

public class UpperLowerCase_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To convert string to uppercase and lowercase");

        System.out.print("Enter a string to convert from lowercase to uppercase: ");

        String str1 = scanner.nextLine();
        String uppercase = str1.toUpperCase();
        System.out.println("String converted from lowercase to uppercase is : " + uppercase);

        System.out.print("Enter a string to convert from uppercase to lowercase: ");

        String str2 = scanner.nextLine();
        String lowercase = str1.toLowerCase();
        System.out.println("String converted from uppercase to lowercase is : " + lowercase);
    }
}
