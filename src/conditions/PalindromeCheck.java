package conditions;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string to check whether it is palindrome : ");
        int num = scanner.nextInt();

        int rev =0;
        int temp = num;

        while(temp != 0){
            int n = temp % 10;
            rev = (rev * 10) + n;
            temp = temp / 10;
        }
        if(rev == num){
            System.out.println("Palindrome");
        }

        else{
            System.out.println("Not Palindrome");
        }

    }
}
