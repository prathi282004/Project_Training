// To count odd and even number in an array

package exercise_2.arrays;
import java.util.Scanner;

// JR : Review DONE
public class CountOddEven_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To count odd and even numbers in an array");

        //int[] arr = {3, 6, 1, 67, 0, -2, 2, 1};

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];
        System.out.println("Enter " + size + " elements for the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
            System.out.print("Elements : ");
        }
        int odd_count = 0;
        int even_count = 0;

        for (double v : arr) {
            if (v % 2 == 0) {
                even_count++;
            } else if (v % 2 != 0) {
                odd_count++;
            }
        }

        System.out.println("Number of odd count in array is : " + even_count);
        System.out.println("Number of even count in array is : " + odd_count );
    }
}
