// Find the length of a given string without built-in functions

package exercise_2.arrays;

import java.util.Scanner;

// TODO:
//  1)what is it? program not running.
//  2)For doesn't have either exit condition or break - it run continuously - VERY DANGER to system - doneeee
public class StringLength_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To find the length of a given string without built-in functions");
        String str = scanner.next();

        char[] arr = str.toCharArray();

        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            length++;
        }
        System.out.println("Length of a given string is : " + length);
    }
}
