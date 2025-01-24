// *Sort*
//    Write a program to sort an array

package exercise_1.arrays;

import java.util.Arrays;

public class Sort_20 {
    public static void main(String[] args) {
        double arr[] = {2.5, 56, 4, 9, 0.1, 64, -8, 2, 4, 2};

        Arrays.sort(arr);

        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
    }
}

