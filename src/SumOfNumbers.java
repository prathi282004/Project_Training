import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter val1 : ");
        int val1 = scanner.nextInt();

        System.out.println("Enter val2 : ");
        int val2 = scanner.nextInt();

        int sum = val1 + val2;
        System.out.println("Sum of two numbers is : " + sum);
    }
}
