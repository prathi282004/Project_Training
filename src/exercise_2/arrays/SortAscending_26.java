// Program to find index of a given element in an array

package exercise_2.arrays;
import java.util.Scanner;

// JR : Review DONE

public class SortAscending_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To sort elements in an array in ascending order");

        // int[] arr = {3, 6, 1, 67, 0, -2, 2, 1};

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];
        System.out.println("Enter " + size + " elements for the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
            System.out.print("Elements : ");
        }

        // Arrays.toString(arr);

        // Arrays.sort(arr);

        // System.out.println("Sorted array is : " + Arrays.toString(arr));

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
