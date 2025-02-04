// Generate and print the first n perfect squares.

package exercise_2.mathematical_programs;

import java.util.Scanner;

//JR: Review DONE
public class PerfectSquare_49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perfect squares");

        System.out.println("Enter n value to print perfect squares : ");
        int n = scanner.nextInt();

        int num = 1;
        for (int i = 1; i <= n; i++) {
            num = i * i;
            System.out.println("Square of " + i + " is : " + num);
        }
        }
    }


