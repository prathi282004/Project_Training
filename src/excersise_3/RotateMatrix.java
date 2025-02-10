// 2) Rotate Matrix by 90 Degrees
//Problem: Rotate a given N x N matrix by 90 degrees clockwise in-place.
//Example:
//
//Input: [[1,2,3],
//        [4,5,6],
//        [7,8,9]]
//Output: [[7,4,1],
//         [8,5,2],
//         [9,6,3]]

package excersise_3;
public class RotateMatrix {
        public static void rotate(int[][] mat) {

            int n = mat.length;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {

                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            for (int i = 0; i < n; i++) {
                int left = 0, right = n - 1;

                while (left < right) {
                    int temp = mat[i][left];
                    mat[i][left] = mat[i][right];
                    mat[i][right] = temp;

                    left++;
                    right--;
                }
            }
        }
        public static void main(String[] args) {
            int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            rotate(mat);

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }

        }
    }




