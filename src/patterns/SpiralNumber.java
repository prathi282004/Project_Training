//1  1  1  1  1
//1  2  2  2  1
//1  2  3  2  1
//1  2  2  2  1
//1  1  1  1  1

package patterns;

import java.util.Scanner;

public class SpiralNumber {
    public static void main(String[] args) {
        System.out.println("Spiral Number Pattern");
        System.out.println("Enter n value to print pattern : ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int size = 2 * n - 1;
        int[] arr = new int[size * size];

        for (int layer = 0; layer < n; layer++) {
            int val = layer + 1;
            for (int i = layer; i < size - layer; i++) {
                arr[layer * size + i] = val;
                arr[(size - 1 - layer) * size + i] = val;
                arr[i * size + layer] = val;
                arr[i * size + (size - 1 - layer)] = val;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i * size + j] + " ");
            }
            System.out.println();
        }
    }
}
