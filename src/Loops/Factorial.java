package Loops;
import java.util.Scanner;

public class Factorial {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value to calculate factorial : ");
        int n = scanner.nextInt();

        int i, fact =1;
        for(i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
    }
}
