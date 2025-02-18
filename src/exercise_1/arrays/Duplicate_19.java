// *Remove Duplicates from Array*
//    Write a program to remove duplicate elements from an array/list.

package exercise_1.arrays;

import java.util.Scanner;

// TODO: JR: where are you removing from Array. u r just display the duplicate numbers.-- done
public class Duplicate_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // double [] arr = { 1, 4, 0, 5.3, -6};

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];
        System.out.println("Enter " + size + " positive elements for the array:");


        for (int k = 0; k < size; k++) {
            if (k <= -1) {
                System.out.println("Negative values are invalid!");
            }
            arr[k] = scanner.nextDouble();
        }


        // another method using boolean

//        double[] unique = new double[size];
//        int count = 0;
//
//        for (int i = 0; i < size; i++) {
//            boolean duplicate = false;
//
//            for (int j = 0; j < count; j++) {
//                if (arr[i] == unique[j]) {
//                    duplicate = true;
//                    break;
//                }
//            }
//
//            if (!duplicate) {
//                unique[count++] = arr[i];
//            }
//        }


        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }

        int count = 0;
        for (double num : arr) {
            if (num != -1) {
                count++;
            }
        }

        double[] unique = new double[count];
        int index = 0;
        for (double num : arr) {
            if (num != -1) {
                unique[index++] = num;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
    }
    }

