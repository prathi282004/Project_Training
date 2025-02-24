// 1 2 3 4 5 6 7
//  2 3 4 5 6
//    3 4 5
//      4
//    3 4 5
//  2 3 4 5 6
//1 2 3 4 5 6 7

package patterns;

import java.util.Scanner;

public class NumericHourglass {
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

           for (int i = 0; i <= n / 2; i++) {
               for (int j = 0; j < i; j++) {
                   System.out.print("  ");
               }

               for (int j = i + 1; j <= n - i; j++) {
                   System.out.print(j + " ");
               }
               System.out.println();
           }

           for (int i = n / 2 - 1; i >= 0; i--) {
               for (int j = 0; j < i; j++) {
                   System.out.print("  ");
               }
               for (int j = i + 1; j <= n - i; j++) {
                   System.out.print(j + " ");
               }
               System.out.println();
           }
       } catch (Exception e) {
           System.out.println("Invalid input!!");
       }
    }
}
