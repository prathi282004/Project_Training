// Program to find index of a given element in an array

package exercise_2.arrays;
import java.util.Arrays;


// TODO: JR-
//  1)don't hard-code data, it should be get from user
//  2) use ur own logic for sorting
public class SortAscending_26 {
    public static void main(String[] args) {
        System.out.println("To sort elements in an array in ascending order");

        int[] arr = {3, 6, 1, 67, 0, -2, 2, 1};

        Arrays.toString(arr);

        Arrays.sort(arr);

        System.out.println("Sorted array is : " + Arrays.toString(arr));
    }
}