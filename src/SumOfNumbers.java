import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter val1 : ");
        double val1 = scanner.nextDouble();

        System.out.println("Enter val2 : ");
        double val2 = scanner.nextDouble();

        double sum = val1 + val2;
        System.out.println("Sum of two numbers is : " + sum);
    }
}
