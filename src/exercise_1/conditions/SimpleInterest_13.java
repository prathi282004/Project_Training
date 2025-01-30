// *Simple Interest*
//    Write a program to calculate simple interest given principal, rate, and time.

package exercise_1.conditions;

import java.util.Scanner;
// JR: TODO is 'n' means interest & 'r' means duration? -
//      yes uncle, I have mentioned them clearly by referring in google
//      JR: No- 'n' means duration & 'r' means interest - set proper name for variables - change 'n' to 'r' and vice versa
// doneeeee

public class SimpleInterest_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To calculate Simple Interest");

        try {
            System.out.println("Enter principle value : ");
            int p = scanner.nextInt();

            System.out.println("Enter interest rate value : ");
            double r = scanner.nextDouble();

            System.out.println("Enter time duration value : ");
            int n = scanner.nextInt();

            double simple_interest = (p * n * r) / 100;
            System.out.println("Simple Interest is : " + simple_interest);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
