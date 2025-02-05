// 1) Spiral Matrix Traversal
//Problem: Given a 2D matrix, return all elements in spiral order (clockwise).
//Example:
//Input: [[1,2,3],
//        [4,5,6],
//        [7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]

package excersise_3;

public class SpiralMethod {
    public static void main(String[] args) {
        System.out.println("Given a 2D matrix, return all elements in spiral order (clockwise)");

        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        int n = 3;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (true) {

            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }
}




