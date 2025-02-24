// 36. Write a program to reverse a string.

package exercise_2.arrays;

import java.util.Scanner;

public class ReverseString_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.next();

        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        String reversedStr = new String(arr);
        System.out.println("Reversed String: " + reversedStr);

    }
}

