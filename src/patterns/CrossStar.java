// *  *   *
//  * * *
//    *
//  * * *
//*   *   *

package patterns;

import java.util.Scanner;

public class CrossStar {
    public static void main(String[] args) {
        System.out.println("Palindromic Number Pyramid Pattern");
        System.out.println("Enter n value to print pattern : ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
