package conditions;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To calculate Simple Interest");

        try {
        System.out.println("Enter principle value : ");
        int p = scanner.nextInt();

        System.out.println("Enter interest rate value : ");
        double n = scanner.nextDouble();

        System.out.println("Enter time duration value : ");
        int r = scanner.nextInt();

        double simple_interest = (p * n * r) / 100;
        System.out.println("Simple Interest is : " + simple_interest);
        }
        catch(Exception e){
            System.out.println("Invalid input!");
        }
    }
}
