//  *Find the Largest Element*
//    Write a program to find the largest element in an array/list.

package exercise_1.arrays;
import java.util.Scanner;
// JR: TODO
//      1)You should not hard-code the values in the program. change the program to get inputs from the user.
//      2) fix warnings - done
public class LargestElement_16 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        // double arr[] = {2.9, 4, 7, 11.5, 0, -3};

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];
        System.out.println("Enter " + size + " elements for the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
            System.out.print("Elements : ");
        }

        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element in array is : " + max);
    }
}
