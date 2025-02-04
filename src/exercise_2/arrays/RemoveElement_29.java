// Remove a specific element from an array

package exercise_2.arrays;
import java.util.Scanner;

public class RemoveElement_29 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To remove a specific element from an array");

        // int[] arr = {3, 6, 1, 67, 0, -2, 2, 1};
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];
        System.out.println("Enter " + size + " elements for the array:");

        for (int k = 0; k < size; k++) {
            arr[k] = scanner.nextDouble();
        }

        System.out.println("Enter number to delete in array");
        int num = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                //int arr_new.remove(i);
                // remove elements .i
                System.out.println("The index of element " + num + " is in the index of : " + i);
                //arr.remove(Double.valueOf(num));
            } else {
                System.out.println("Element " + num + " is not found in an array");
            }
        }
    }
}

