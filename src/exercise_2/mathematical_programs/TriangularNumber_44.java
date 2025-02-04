// Generate and print the first n triangular numbers.

package exercise_2.mathematical_programs;

import java.util.Scanner;
//JR: Review DONE
public class TriangularNumber_44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Triangular numbers");

        System.out.println("Enter n value to print triangular numbers : ");
        int n = scanner.nextInt();

        int num = 0;
        for (int i = 1; i <= n; i++) {
            num = ((i) * (i + 1)) / 2;
            System.out.println("First " + n + " triangular numbers are : " + num);
        }
    }
}
