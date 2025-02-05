// 3) Search in a 2D Matrix
//Problem: Given a matrix where each row and column is sorted in ascending order, write an efficient algorithm to find if a target exists.
//Example:
//
//Input: matrix = [[1,4,7,11],
//                 [2,5,8,12],
//                 [3,6,9,16],
//                 [10,13,14,17]]
//       target = 5
//Output: True

package excersise_3;

// need to fix error. dont know how to resolve it
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter target value : ");
        int target = scanner.nextInt();

        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

                System.out.println();


                while (true) {
                    if (anInt == target) {
                        System.out.println("Target found");
                    } else {
                        System.out.println("Target not found");
                    }
                    break;
                }
            }
        }
    }
}