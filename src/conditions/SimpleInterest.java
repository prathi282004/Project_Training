package conditions;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To calculate simple interest");
        System.out.println("Enter principle : ");
        int p = scanner.nextInt();

        System.out.println("Enter interest : ");
        int n = scanner.nextInt();

        System.out.println("Enter rate: ");
        int r = scanner.nextInt();

        int simple_interest = (p * n * r) / 100;
        System.out.println("Simple interest value is : " + simple_interest);
    }
}
