// 12. Create a number pyramid pattern.
//Example:
//
//1
//22
//333

package exercise_2.WorkOnLoops;

import java.util.Scanner;

// TODO JR: Printing not properly if we print more than single digit number - give 13 and see the output. Align space for any digits.

public class NumberPyramid_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number pyramid triangle");

        System.out.println("Enter n value to print numbers : ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }

    }
}