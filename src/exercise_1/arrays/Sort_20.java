// *Sort*
//    Write a program to sort an array

package exercise_1.arrays;

import java.util.Scanner;
// JR: Review Done - Good!

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
            // TODO JR: You can use temp variable to swap the value. It is less complex & risk.
            //  I think, u did this logic because of you did a program to swap without temp variable.
            //  That problem is just for improving ur logical thinking, not for real time usage.
            if (minIndex != i) {
                arr[i] = arr[i] + arr[minIndex];
                arr[minIndex] = arr[i] - arr[minIndex];
                arr[i] = arr[i] - arr[minIndex];
            }

        }
        System.out.println("Sorted Array: ");
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
}


//        for (int num : arr) {
//        System.out.print(num + " ");
//    }

//        Arrays.sort(arr);
//
//        System.out.print("Sorted array: ");
//        for (double v : arr) {
//            System.out.print(v + " , ");






