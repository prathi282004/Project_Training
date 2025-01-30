// *Prime Number Check*
//    Write a program to check whether a number is prime.

package exercise_1.conditions;

import java.util.Scanner;
// JR: TODO - completely wrong program.
//      You should understand what is prime number?
//      You have to carefully understand the given program and start writing code.
//      JR: Itr-2: Wrong program - doneee

public class PrimeNumberCheck_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to check it is prime number or not : ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Not a Prime");
            return;
        }

        if (num == 0) {
            System.out.println("Neither Prime nor Composite");
            return;
        }

        if (num <= 3) {
            System.out.println("Prime");
            return;
        }

        if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
