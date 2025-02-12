// *Remove Duplicates from Array*
//    Write a program to remove duplicate elements from an array/list.

package exercise_1.arrays;

import java.util.Scanner;

// TODO: JR: where are you removing from Array. u r just display the duplicate numbers.--
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

        double[] unique = new double[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                unique[count++] = arr[i];
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
            }
        }
    }

