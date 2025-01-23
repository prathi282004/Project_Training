package conditions;
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to check it is prime number or not : ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println(+ num + " is Not a Prime number");
        }
        else{
            System.out.println(+ num + " is a Prime number");
        }
    }
}
