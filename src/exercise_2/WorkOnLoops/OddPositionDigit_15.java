// Print the sum of all odd-positioned digits in a number.

package exercise_2.WorkOnLoops;
import java.util.Scanner;

public class OddPositionDigit_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to show sum of all odd positioned digits in a number");

        System.out.println("Enter number : ");
        int num = 0;

        try {
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
        int n = 0;

        if(n % 2 == 0){
            System.out.println("Position of odd number in a ");
            System.out.println(" ");
        }
    }
}
