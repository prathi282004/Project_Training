package patterns;

import java.util.Scanner;

//JR: Review Done - Good
public class NumberPyramid {
    public static void main(String[] args) {
        System.out.println("Number Pyramid Pattern");
        System.out.println("Enter n value to print pattern : ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                if (j == 0 || j == (2 * i - 2)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
