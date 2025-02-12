package excersise_3;

import java.util.Scanner;

public class Matrix {
    public static void triangle(int[][] mat, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                for (int size = 2; i + size <= row && j + size <= col; size++) {
                    for (int a = 0; a < size; a++) {
                        for (int k = 0; k <= a; k++) {
                            System.out.print(mat[i + a][j + k] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows (m): ");
        int row = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int col = scanner.nextInt();

        int[][] mat = new int[row][col];

        System.out.println("Enter matrix value:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        triangle(mat, row, col);
        System.out.println();
    }
}



