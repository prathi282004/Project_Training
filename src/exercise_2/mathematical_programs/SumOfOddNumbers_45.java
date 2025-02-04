// Find the sum of the first n odd numbers.

package exercise_2.mathematical_programs;

import java.util.Scanner;

//JR: Review DONE
public class SumOfOddNumbers_45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To print the first n odd numbers");

        System.out.println("Enter n value to print odd numbers : ");
        int n = scanner.nextInt();

        int sum = 0;
        int odd_number = 1;
        for (int i = 0; i < n; i++) {
            sum = sum + odd_number;
            odd_number = odd_number + 2;
        }
        System.out.println("Sum of odd numbers upto " + n + " is : " + sum );
    }

}
