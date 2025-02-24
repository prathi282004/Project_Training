//*Armstrong Number*
//    Write a program to check whether a number is an Armstrong number or not.
//    Example: 153 = 1³ + 5³ + 3³

package exercise_1.conditions;

import java.util.Scanner;

public class AmstrongNumber_14_1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of digits to check armstrong value : ");
        int n = scanner.nextInt();

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int length = String.valueOf(num).length();
        int sum = 0;
        int temp = num;

        if (n != length) {
            throw new Exception("Invalid input");
        }
        while (temp > 0) {
            int a = temp % 10;
            sum += (int) Math.pow(a, n);
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println(num + " is a Armstrong number");
        } else {
            System.out.println(num + " is Not a Armstrong number");
        }
    }
}
