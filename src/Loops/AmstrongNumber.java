package Loops;
import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int n = temp % 10;
            sum = sum + n * n * n ;
            temp = temp / 10;
        }

        if(sum == num) {
            System.out.println(num + " is a Amstrong number");
        }
        else{
            System.out.println(num + " is Not a Amstrong number");
        }


    }
}
