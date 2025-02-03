// 47. Check if a number is an Armstrong number.

package exercise_2.mathematical_programs;

import java.util.Scanner;

public class ArmstrongNumber_47 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of digits to check armstrong value : ");
        int n = scanner.nextInt();

        System.out.print("Enter a number: ");
        int num = 0;

        try {
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input!!");
        }

        int length = String.valueOf(num).length();

        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int a = temp % 10;
            sum += (int) Math.pow(a, length);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
