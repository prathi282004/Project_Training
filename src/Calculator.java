import java.util.Scanner;

public class Calculator {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter val1 : ");
        int val1 = scanner.nextInt();

        System.out.println("Enter val2 : ");
        int val2 = scanner.nextInt();

        int add = val1 + val2;
        System.out.println("Addition of two numbers is : " +add);

        int sub = val1 + val2;
        System.out.println("Subraction of two numbers is : " +sub);

        int mul = val1 * val2;
        System.out.println("Multiplication of two numbers is : " +mul);

        int div = val1 / val2;
        System.out.println("Division of two numbers is : " +div);
    }
}
