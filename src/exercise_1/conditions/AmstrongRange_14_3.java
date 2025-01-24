package exercise_1.conditions;

import java.util.Scanner;

public class AmstrongRange_14_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter last number to print in range: ");
        int last = scanner.nextInt();

        System.out.print("Armstrong numbers from " + 0 + " to " + last + " is :" + " ");

        for (int num = 0; num <= last; num++) {
            int length = Integer.toString(num).length();
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int a = temp % 10;
                sum += Math.pow(a, length);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }

        }
    }
}
