// 2. Take two numbers as input and print their product.

package exercise_2.basicinputoutput;
import java.util.Scanner;
// JR: Review done
public class ProductInputNumber_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter val1 : ");
        double val1 = scanner.nextDouble();

        System.out.println("Enter val2 : ");
        double val2 = scanner.nextDouble();

        double product = val1 * val2;
        System.out.println("Product of " + val1 + " and " + val2 + " is : " + product);
    }

}
