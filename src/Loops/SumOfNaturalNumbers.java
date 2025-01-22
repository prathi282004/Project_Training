package Loops;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value to calculate sum of natural numbers : ");
        int n = scanner.nextInt();

        int sum = 0;
        for(int i=0; i<=n; i++) {
            sum = (n * (n + 1)) / 2;

        }
        System.out.println("Sum of natural numbers is: " + sum);
    }
}
