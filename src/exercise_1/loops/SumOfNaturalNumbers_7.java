// 7. *Sum of Natural Numbers*
//   Write a program to find the sum of the first n natural numbers.

package exercise_1.loops;
import java.util.Scanner;

// JR: review done
public class SumOfNaturalNumbers_7 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value to calculate sum of natural numbers : ");
        int n = scanner.nextInt();

        int sum = 0;
        for(int i=0; i<=n; i++) {
            sum = (n * (n + 1)) / 2;
        }
        System.out.println("Sum of natural numbers is: " + sum);
    }
}
