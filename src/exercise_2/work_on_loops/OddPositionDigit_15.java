// Print the sum of all odd-positioned digits in a number.

package exercise_2.work_on_loops;

import java.util.Scanner;

//JR TODO: wrong program - understand the problem - doneee
public class OddPositionDigit_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to show sum of all odd positioned digits in a number");

        System.out.println("Enter number : ");
        int num = 0;

        try {
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        // built-in function

//        String str = Integer.toString(num);
//
//        int sum = 0;
//
//        for (int i = 0; i < str.length(); i += 2) {
//            sum = sum + Character.getNumericValue(str.charAt(i));
//        }
//        System.out.println(sum);

        int sum = 0;
        int position = 0;

        while (num > 0) {
            int digit = num % 10;
            if (position % 2 == 0) {
                sum = sum + digit;
            }
            num = num / 10;
            position++;
        }
        System.out.println("Sum of odd-positioned digits: " + sum);
    }
}


