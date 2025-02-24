// Create program to find the average of elements in an array

package exercise_2.arrays;
import java.util.Scanner;

public class AverageOfElements_24 {
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

        System.out.println("To print average of elements in an array");

        double sum = 0;
        double avg;

        for (double v : arr) {
            sum = sum + v;
        }
        avg = sum / arr.length;
        System.out.println("Average of elements is : " + avg);
    }
}
