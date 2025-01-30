// Sort the array in descending order

package exercise_2.arrays;
import java.util.Arrays;
import java.util.Scanner;

// TODO: JR-
//  1)don't hard-code data, it should be get from user
//  2) use ur own logic for sorting - doneee
public class SortDescending_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To sort elements in an array in descending order");

        // int[] arr = {3, 6, 1, 67, 0, -2, 2, 1};

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];
        System.out.println("Enter " + size + " elements for the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();

        }

//        Arrays.toString(arr);
//        Arrays.sort(arr);

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                arr[i] = arr[i] + arr[minIndex];
                arr[minIndex] = arr[i] - arr[minIndex];
                arr[i] = arr[i] - arr[minIndex];
            }

        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            double temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Sorted in descending order is : " + Arrays.toString(arr));
    }
}

