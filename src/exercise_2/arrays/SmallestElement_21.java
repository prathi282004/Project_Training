// Find the smallest element in array

package exercise_2.arrays;

public class SmallestElement_21 {
    public static void main(String[] args) {
        System.out.println("To find smallest element in array");

        int[] arr = {3, 6, 1, 67, 0, -2, 2};

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Smallest element in array is : " + min);
    }
}
