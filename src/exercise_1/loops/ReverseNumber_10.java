package exercise_1.loops;// *Reverse a Number*
//    Write a program to reverse the digits of a number.
//    Example: Input: 1234, Output: 4321

import java.util.Scanner;

// JR: TODO -
//      1) Wrong output, if the last few chars of the number is 0, Ex.- 1230000 - doneee
//
public class ReverseNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to be reversed : ");
        int num = scanner.nextInt();

        String str = Integer.toString(num);

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

        String reversedNum = new String(arr);
        System.out.println("Reversed Number: " + reversedNum);

    }
}

