// Maximum Submatrix Sum (Kadane's Algorithm for 2D)
//Problem: Find the submatrix with the maximum sum in a 2D grid of integers.
//Hint: Extend the 1D Kadane’s algorithm to handle 2D arrays efficiently.

package excersise_3;

public class Kadne {

    public static int kadane(int[] arr) {
        int max_sum = arr[0];
        int current_sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current_sum = Math.max(arr[i], current_sum + arr[i]);
            max_sum = Math.max(max_sum, current_sum);
        }

        return max_sum;
    }

    public static int submatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int max_sum = Integer.MIN_VALUE;

        int[] temp = new int[row];

        for (int top = 0; top < row; top++) {
            for (int i = 0; i < row; i++) {
                temp[i] = 0;
            }

            for (int bottom = top; bottom < row; bottom++) {
                for (int i = 0; i < col; i++) {
                    temp[i] += matrix[bottom][i];
                }

                int currentMax = kadane(temp);
                max_sum = Math.max(max_sum, currentMax);
            }
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, -1, -4, -20},
                {-8, -3, 4, 2, 1},
                {3, 8, 10, 1, 3},
                {-4, -1, 1, 7, -6}
        };

        System.out.println("Maximum Sum Submatrix: " + submatrix(matrix));
    }
}


