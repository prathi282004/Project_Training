// Check if the number is positive, negative, or zero

package exercise_2.conditionals;

import java.util.Scanner;

public class CheckNumber_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to check whether it is positive, negative, or zero");
        System.out.println("Enter number : ");

        int num = 0;

        try {
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input!!");
        }


        if (num > 0) {
            System.out.println("The number " + num + " is positive.");
        } else if (num < 0) {
            System.out.println("The number " + num + " is negative.");
        } else {
            System.out.println("The number " + num + " is zero.");
        }

    }
}
