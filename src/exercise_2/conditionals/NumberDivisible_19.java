// Check if number is divisible by both 3 and 7

package exercise_2.conditionals;

import java.util.Scanner;

public class NumberDivisible_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to check whether it is divisible by both 3 and 7");
        System.out.println("Enter number : ");

        int num = 2;

        try {
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input!!");
        }

        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println(num + " is divisible by both 3 and 7");
        } else {
            System.out.println("Not divisible by both 3 and 7");
        }
    }
}
