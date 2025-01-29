// 7. *Sum of Natural Numbers*
//   Write a program to find the sum of the first n natural numbers.

package exercise_1.loops;
import java.util.Scanner;

// JR: review done
//    1) output could be 1 + 2 + 3 + 4 = 10 (if the given number is small like below 10)
//    2) unnecessary line inside for
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
