package exercise_1.simplecode;// *Sum of Two Numbers*
//   Write a program to take two numbers as input and print their sum.

// JR: review done
//  1) Output/print should be well-formated/texted like,
//      Calculating sum of two numbers:
//          Enter first number:
//          Enter second number:
//               done
//
import java.util.Scanner;
public class SumOfNumbers_2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        double val1 = scanner.nextDouble();

        System.out.println("Enter second number : ");
        double val2 = scanner.nextDouble();

        double sum = val1 + val2;
        System.out.println("Sum of two numbers is : " + sum);
    }
}
