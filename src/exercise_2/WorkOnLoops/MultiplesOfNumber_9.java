// Generate and print the first n multiples of a number.

package exercise_2.WorkOnLoops;

import java.util.Scanner;

public class MultiplesOfNumber_9 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("To calculate multiples of a number");

        System.out.println("Enter n value : ");
        int n = scanner.nextInt();

        System.out.print("Multiples of number " + n + " is : " );
        for(int i = 1; i<=n; i++){
            if (n % i == 0) {
                int sum =  i;
                System.out.print("  " + sum);
            }
        }

    }
}
