// Check if a number is a palindrome.

package exercise_2.mathematical_programs;

import java.util.Scanner;

//JR: Review DONE
public class PalindromeNumber_43 {
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


