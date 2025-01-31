// Merge two arrays and display the resulting array

package exercise_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To merge two arrays and display the resulting array");

        // int[] arr1 = {3, 6, 1, 67, 0, -2, 2, 1};
        // int[] arr2 = {31, 26, 10, 7, 60, -42, 82, 19};

        System.out.print("Enter the size 1 of the array: ");
        int size1 = scanner.nextInt();

        double[] arr1 = new double[size1];
        System.out.println("Enter " + size1 + " elements for the array 1:");

        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextDouble();
        }


        System.out.print("Enter the size 2 of the array: ");
        int size2 = scanner.nextInt();

        double[] arr2 = new double[size2];
        System.out.println("Enter " + size2 + " elements for the array 2:");

        for (int j = 0; j < size2; j++) {
            arr2[j] = scanner.nextDouble();
        }


        double[] arr = new double[arr1.length + arr2.length];

        for (int k = 0; k < arr1.length; k++) {
            arr[k] = (int) arr1[k];
        }

        for (int k = 0; k < arr2.length; k++) {
            arr[arr1.length + k] = (int) arr2[k];
        }

        Arrays.sort(arr);
        System.out.print("Merged array : ");
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
}


