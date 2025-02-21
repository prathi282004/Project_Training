// 12. Create a number pyramid pattern.
//Example:
//
//1
//22
//333

package exercise_2.work_on_loops;

import java.util.Scanner;


//JR : Review DONE
public class NumberPyramid_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number pyramid triangle");
        System.out.println("Enter n value to print numbers : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i >= 1 && i <= 9) {
                one_digit(i);
            } else if (i >= 10 && i <= 99) {
                two_digit(i);
            } else if (i >= 100 && i <= 999) {
                three_digit(i);
            }
            System.out.println();
        }
    }

    public static void one_digit(int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(n + "   ");
        }
    }

    public static void two_digit(int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(n + "  ");
        }
    }

    public static void three_digit(int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(n + " ");
        }
    }
}





