// 9. *Fibonacci Series*
//   Write a program to print the Fibonacci series up to n terms.

package exercise_1.Loops;
import java.util.Scanner;
// JR: review done - Good
public class Fibanocci_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value to calculate fibanocci series : ");
        int n = scanner.nextInt();

        int first = 0, second = 1;
        System.out.println("Fibonacci Series : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + "  ");

            int next = first + second;
            first = second;
            second = next;

        }
    }
}
