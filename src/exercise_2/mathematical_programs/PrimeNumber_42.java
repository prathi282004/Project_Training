// Write a program to print the first n prime numbers.

package exercise_2.mathematical_programs;

import java.util.Scanner;
//JR: Review DONE
public class PrimeNumber_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To print the first n prime numbers");

        System.out.println("Enter n value to print prime numbers : ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers upto " + n + " are : ");

        int count = 0;
        int num = 2;

        while (count < n) {
        if (num == 2 || num == 3 || num == 5 || num == 7 || num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
            System.out.print(num + " ");
            count++;
        }
            num++;
        }
    }
}

