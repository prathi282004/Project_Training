// 8. *Factorial*
//   Write a program to find the factorial of a given number using a loop.

package exercise_1.loops;
import java.util.Scanner;
// JR: review done
//      1) output coule be " 1 x 2 x 3 x 4 = 24 " (if the given number is small like below 10) - done
public class Factorial_8 {
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
