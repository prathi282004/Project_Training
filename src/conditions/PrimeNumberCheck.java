package conditions;
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
