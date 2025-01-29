// *Leap Year Checker*
//    Write a program to check whether a year is a leap year or not.

package exercise_1.conditions;

import java.util.Scanner;

// JR: TODO
//      1) code not indented
//      2) Why + symbol beging of all println - done
//          TIP: Code should not have any single unnecessary char
public class LeapYearCheck_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year to check whether leap year : ");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is Leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is Not a Leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is Leap year");
        } else {
            System.out.println(year + " is Not a leap year");
        }

    }
}
