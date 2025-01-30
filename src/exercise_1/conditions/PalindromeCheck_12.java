// *Palindrome Checker*
//    Write a program to check whether a string or number is a palindrome.

package exercise_1.conditions;
import java.util.Scanner;
// JR: review done
public class PalindromeCheck_12 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter number to check whether it is palindrome : ");
            int num = scanner.nextInt();

            int rev = 0;
            int temp = num;

            while (temp != 0) {
                int n = temp % 10;
                rev = (rev * 10) + n;
                temp = temp / 10;
            }
            if (rev == num) {
                System.out.println(num + " is a Palindrome");
            } else {
                System.out.println(num + " is Not a Palindrome");
            }
        }

        catch(Exception e){
            System.out.println("Invalid input!");
        }

    }
}
