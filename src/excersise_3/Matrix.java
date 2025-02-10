package excersise_3;

import java.util.Scanner;

public class Matrix {
    public static void triangle(int[][] mat, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                for (int size = 2; i + size <= m && j + size <= n; size++) {
                    for (int x = 0; x < size; x++) {
                        for (int y = 0; y <= x; y++) {
                            System.out.print(mat[i + x][j + y] + " ");
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
        int m = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Enter matrix value:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        triangle(mat, m, n);
        System.out.println();
    }
}



