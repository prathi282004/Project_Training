// 3. *Odd or Even*
//   Write a program to check whether a given number is odd or even.

package exercise_1.simplecode;
import java.util.Scanner;

public class OddEven_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");
        int val = scanner.nextInt();

        if (val % 2 == 0) {
            System.out.println(val + " is Even");
        } else {
            System.out.println(val + " is Odd");
        }
    }
}
