// *Count Positive, Negative, and Zeros*
//    Write a program to count the number of positive, negative, and zero elements in an array.

package exercise_1.arrays;

import java.util.Scanner;

// JR: review done
public class CountArrayElements_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // double[] arr = {2, 56.3, 4, 9.7, 0, 64, -8};

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];
        System.out.println("Enter " + size + " elements for the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
            System.out.print("Elements : ");
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (double v : arr) {
            if (v > 0) {
                positiveCount++;
            } else if (v < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }


        System.out.println("Number of Positive elements in array: " + positiveCount);
        System.out.println("Number of Negative elements in array: " + negativeCount);
        System.out.println("Number of Zero elements in array: " + zeroCount);
    }
}


