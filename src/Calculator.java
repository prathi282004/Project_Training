import java.util.Scanner;

public class Calculator {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter val1 : ");
        double val1 = scanner.nextDouble();

        System.out.println("Enter val2 : ");
        double val2 = scanner.nextDouble();

        double add = val1 + val2;
        System.out.println("Addition of " + val1 + " and " + val2 + " is 2 : " +add);

        double sub = val1 + val2;
        System.out.println("Subraction of " + val1 + " and " + val2 + " is 2 : " +sub);

        double mul = val1 * val2;
        System.out.println("Multiplication of " + val1 + " and " + val2 + " is 2 : " +mul);

        double div = val1 / val2;
        System.out.println("Division of " + val1 + " and " + val2 + " is 2 : "  +div);
    }
}
