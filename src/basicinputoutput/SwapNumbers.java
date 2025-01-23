package basicinputoutput;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Swap two values");

        System.out.println("Enter val1 : ");
        double val1 = scanner.nextInt();

        System.out.println("Enter val2 : ");
        double val2 = scanner.nextInt();

        val1 = val1 + val2;
        val2 = val1 - val2;
        val1 = val1 - val2;

        System.out.println("Swapped value is : " + val1 + " " + val2 );
    }
}
