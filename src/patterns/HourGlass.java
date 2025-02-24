package patterns;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        System.out.println("HourGlass Pattern");
        System.out.println("Enter n value to print pattern : ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                if (j == 0 || j == (2 * i - 2) || i == n ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                if (j == 0 || j == (2 * i - 2) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
