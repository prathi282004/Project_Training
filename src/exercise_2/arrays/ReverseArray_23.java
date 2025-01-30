// Program to reverse an array

package exercise_2.arrays;
import java.util.Arrays;
import java.util.Scanner;

// JR : Review DONE

public class ReverseArray_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int[] arr = {3, 6, 1, 67, 0, -2, 2, 1};

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];
        System.out.println("Enter " + size + " elements for the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
            System.out.print("Elements : ");
        }

        System.out.println("Array: " + Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            double temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}