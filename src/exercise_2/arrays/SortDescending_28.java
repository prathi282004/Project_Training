// Sort the array in descending order

package exercise_2.arrays;
import java.util.Arrays;

// TODO: JR-
//  1)don't hard-code data, it should be get from user
//  2) use ur own logic for sorting
public class SortDescending_28 {
    public static void main(String[] args) {
        System.out.println("To sort elements in an array in descending order");

        int[] arr = {3, 6, 1, 67, 0, -2, 2, 1};

        Arrays.toString(arr);
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Sorted in descending order is : " + Arrays.toString(arr));
    }
}
