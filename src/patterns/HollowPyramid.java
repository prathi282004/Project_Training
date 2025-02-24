package patterns;

import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        System.out.println("Hallow Pyramid Pattern");
        System.out.println("Enter n value to print pattern : ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i + 1); j++) {
                if (j == 0 || j == (2 * i) || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}