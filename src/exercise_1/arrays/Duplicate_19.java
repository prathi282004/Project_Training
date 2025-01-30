// *Remove Duplicates from Array*
//    Write a program to remove duplicate elements from an array/list.

package exercise_1.arrays;

import java.util.Scanner;

// TODO: JR: where are you removing from Array. u r just display the duplicate numbers.
public class Duplicate_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // double [] arr = { 1, 4, 0, 5.3, -6};

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];
        System.out.println("Enter " + size + " elements for the array:");

        for (int k = 0; k < size; k++) {
            arr[k] = scanner.nextDouble();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i] + " at indices " + i + " and " + j);
                    break;
                }
            }
        }
    }
}

