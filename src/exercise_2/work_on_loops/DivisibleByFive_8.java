// Write a program to find the sum of all numbers divisible by 5 up to n.

package exercise_2.work_on_loops;
import java.util.Scanner;

public class DivisibleByFive_8 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sum of all numbers divisible by 5 upto n");

        System.out.println("Enter n value : ");
        int n = scanner.nextInt();

        int sum = 0;
        for(int i = 0; i<=n; i++){
            if (i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of all numbers is : " + sum);
    }
}
