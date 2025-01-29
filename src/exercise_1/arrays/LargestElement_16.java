//  *Find the Largest Element*
//    Write a program to find the largest element in an array/list.

package exercise_1.arrays;
// JR: TODO
//      1)You should not hard-code the values in the program. change the program to get inputs from the user.
//      2) fix warnings
public class LargestElement_16 {
    public static void main(String args[]) {
        double arr[] = {2.9, 4, 7, 11.5, 0, -3};

        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element in array is : " + max);
    }
}
