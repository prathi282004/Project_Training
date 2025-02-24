//4. *Find the Maximum*
//   Take three numbers as input and print the largest among them.

package exercise_1.simplecode;
import java.util.Scanner;

public class FindMax_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter val1 : ");
        double val1 = scanner.nextDouble();

        System.out.println("Enter val2 : ");
        double val2 = scanner.nextDouble();

        System.out.println("Enter val3 : ");
        double val3 = scanner.nextDouble();

        double max = val1;

        if (val2 > max) {
            max = val2;
        }
        if (val3 > max) {
            max = val3;
        }

        System.out.println("The maximum number is: " + max);
    }
}

