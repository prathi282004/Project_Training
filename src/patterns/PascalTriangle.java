//        1
//      1   1
//    1   2   1
//  1   3   3   1
//1   4   6   4   1

package patterns;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("Pascal Triangle Pattern");
        System.out.println("Enter n value to print pattern : ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}