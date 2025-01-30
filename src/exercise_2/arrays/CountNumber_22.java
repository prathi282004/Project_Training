// Count how many times a specific number appears in an array

package exercise_2.arrays;
import java.util.Scanner;

// TODO: JR - don't hard-code & fix warning

public class CountNumber_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To count how many times a specific number appears in an array");

        int[] arr = {3, 6, 1, 67, 0, -2, 2, 1};

        System.out.print("Enter the number to count: ");
        int num = scanner.nextInt();

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }

        }
        System.out.println("Number of times " + num + " appeared in an array is : " + count);

    }
}