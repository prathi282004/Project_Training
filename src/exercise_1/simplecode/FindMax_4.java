package exercise_1.simplecode;//4. *Find the Maximum*
//   Take three numbers as input and print the largest among them.

import java.util.Scanner;

//JR: Review done

public class FindMax_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter val1 : ");
        double val1 = scanner.nextDouble();

        System.out.println("Enter val2 : ");
        double val2 = scanner.nextDouble();

        System.out.println("Enter val3 : ");
        double val3 = scanner.nextDouble();

        // JR: 2) your logic complex. u should use a max variable to find max - done
//        if (val1 > val2 && val1 > val3) {
//            System.out.println(val1 + " is maximum");
//        } else if (val2 > val1 && val2 > val3) {
//            System.out.println(val2 + " is maximum");
//        } else {
//            System.out.println(val3 + " is maximum");
//        }

        // using built-in function
//        double max = Math.max(val1, Math.max(val2, val3));
//        System.out.println(max + " is maximum");

        // using max variable
        double max = val1;

        if (val2 > max) {
            max = val2;
        }
        if (val3 > max) {
            max = val3;
        }

        System.out.println("The maximum number is: " + max);
    }
}

