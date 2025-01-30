// Determine type of triangle given its side length (equilateral, isosceles, scalene)

package exercise_2.conditionals;

import java.util.Scanner;

// JR: review DONE
public class Triangle_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side length to check whether it is equilateral, isosceles, scalene triangle");

        System.out.println("Enter side length 1 : ");

        System.out.println("Enter side length 2 : ");

        System.out.println("Enter side length 3 : ");

        int len1 = 2;
        int len2 = 2;
        int len3 = 2;

        try {
            len1 = scanner.nextInt();
            len2 = scanner.nextInt();
            len3 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input!!");
        }

        if (len1 == len2 && len2 == len3) {
            System.out.println("The given side length represents equilateral triangle");
        } else if (len1 == len2 || len1 == len3 || len2 == len3) {
            System.out.println("The given side length represents isosceles triangle");
        } else {
            System.out.println("The given side length represents scalene triangle");
        }
    }
}
