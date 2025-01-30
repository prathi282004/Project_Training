// Program to reverse an array

package exercise_2.arrays;

import java.util.Arrays;


// TODO: JR- don't hard-code data, it should be get from user
public class ReverseArray_23 {
    public static void main(String[] args) {

        int[] arr = {3, 6, 1, 67, 0, -2, 2, 1};

        System.out.println("Array: " + Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}