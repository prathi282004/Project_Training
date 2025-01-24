// Write a program to calculate the sum of the digits of a number.

package exercise_2.WorkOnLoops;

import java.util.Scanner;

public class SumOfDigits_13 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to calculate sum of numbers : ");
        int num = scanner.nextInt();

        int sum = 0;
        int temp = num;


        while (temp > 0) {
            int a = temp % 10;
            sum = sum + a;
            temp /= 10;
        }

        System.out.println("Sum of digits of " + num + " is : " + sum);
    }
}
