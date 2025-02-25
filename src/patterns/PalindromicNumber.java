//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5

package patterns;

import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        System.out.println("Palindromic Number Pyramid Pattern");
        System.out.println("Enter n value (1 - 9) to print pattern : ");
        Scanner scanner = new Scanner(System.in);

        try {
            int n = scanner.nextInt();

            if (n < 1 || n > 10) {
                System.out.println("Invalid input!!");
                return;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }

                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }

                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Invalid input!!");
        }
    }
}
