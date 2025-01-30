// Write a program to count the number of digits in a number.

package exercise_2.work_on_loops;
import java.util.Scanner;

// JR: TODO - try logic without converting it to Integer - done
public class CountDigits_14 {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("To count the number of digits in a number");

        System.out.println("Enter digits to count number of digits : ");
        int n = scanner.nextInt();

//        int len = Integer.toString(n).length();
//        System.out.println("Number of digits are : " + len);

//    without converting it to Integer
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Number of digits are : " + count);
    }
}
