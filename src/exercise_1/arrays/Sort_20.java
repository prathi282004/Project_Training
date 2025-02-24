// *Sort*
//    Write a program to sort an array

package exercise_1.arrays;

import java.util.Scanner;

public class Sort_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // double arr[] = {2.5, 56, 4, 9, 0.1, 64, -8, 2, 4, 2};

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];
        System.out.println("Enter " + size + " elements for the array:");

        for (int k = 0; k < size; k++) {
            arr[k] = scanner.nextDouble();
        }

        //without usage of built-in function

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = 0;
            if (minIndex != i) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println("Sorted Array: ");
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
}