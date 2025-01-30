// Program to find index of given element in array

package exercise_2.arrays;

import java.util.Scanner;

// JR : Review DONE
public class IndexOfElement_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To print average of elements in an array");

        // int[] arr = {3, 6, 1, 67, 0, -2, 2, 1};

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];
        System.out.println("Enter " + size + " elements for the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
            System.out.print("Elements : ");
        }

        System.out.println("Enter the element to find its index: ");
        int target = 0;

        try {
            target = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input!!");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("The index of element " + target + " is in the index of : " + i);
            } else {
                System.out.println("Element " + target + " is not found in an array");
                break;
            }
        }
    }
}