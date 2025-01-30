package exercise_1.loops;// *Reverse a Number*
//    Write a program to reverse the digits of a number.
//    Example: Input: 1234, Output: 4321

import java.util.Scanner;

// JR: TODO -
//      1) Wrong output, if the last few chars of the number is 0, Ex.- 1230000
//
public class ReverseNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to be reversed : ");
        int num = scanner.nextInt();

        int rev = 0;
        int temp = num;

        while (temp != 0) {
            int n = temp % 10;
            rev = rev * 10 + n;
            temp = temp / 10;

            if (temp == 0) {
                System.out.println("Reversed number: 0" + rev);
            }
        }

        System.out.println("Reversed series : " + rev);

    }
}
