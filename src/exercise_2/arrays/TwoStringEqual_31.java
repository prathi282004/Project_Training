// Program to check if two string are equal

package exercise_2.arrays;

import java.util.Scanner;

public class TwoStringEqual_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To check if two string are equal");

        System.out.print("Enter a string 1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter a string 2: ");
        String str2 = scanner.nextLine();


        if (str1.equals(str2)) {
            System.out.println("The given two strings are equal");
        } else {
            System.out.println("The given two strings are not equal");
        }
    }

}

