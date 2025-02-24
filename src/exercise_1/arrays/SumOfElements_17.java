// *Sum of Array Elements*
//    Write a program to find the sum of all elements in an array/list.

package exercise_1.arrays;
import java.util.Scanner;

public class SumOfElements_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // double[] arr = {2, 56.4, 4, 9, 0, 64, -8};

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];

        System.out.println("Enter " + size + " elements for the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
            System.out.print("Elements : ");
        }

        double sum = 0;

        for (double v : arr) {
            sum = sum + v;
        }
        System.out.println("Sum of elements is : " + sum);
    }
}
