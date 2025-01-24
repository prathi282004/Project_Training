package exercise_1.conditions;

import java.util.Scanner;

public class AmstrongNumWithLength_14_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int length = Integer.toString(num).length();

        int sum = 0;
        int temp = num;


        while (temp > 0) {
            int a = temp % 10;
            sum += Math.pow(a, length);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }


    }
}


