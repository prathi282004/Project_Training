// Find the factorial of a number using a loop.

package exercise_2.mathematical_programs;

import java.util.Scanner;

public class Factorial_41 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value to calculate factorial : ");
        int n = scanner.nextInt();

        int fact =1;

        for(int i=1; i<=n; i++){
            fact = fact * i;
            if (n < 11){
                System.out.print(i);
                if (i < n) {
                    System.out.print(" * ");
                }
            }
        }
        System.out.println("\nFactorial of " + n + " is : " + fact);
    }
}
