// *Sum of Array Elements*
//    Write a program to find the sum of all elements in an array/list.

package exercise_1.arrays;
// JR: TODO
//      1)You should not hard-code the values in the program. change the program to get inputs from the user.
//      2) fix warnings
public class SumOfElements_17 {
    public static void main(String[] args) {
        double[] arr = {2, 56.4, 4, 9, 0, 64, -8};

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements is : " + sum);
    }
}
