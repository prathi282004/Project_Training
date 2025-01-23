package basicinputoutput;
import java.util.Scanner;

public class ProductInputNumber {
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
