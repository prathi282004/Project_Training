package patterns;

import java.util.Scanner;

public class Pyramid_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number pyramid triangle");

        System.out.println("Enter n value to print numbers : ");
        int n = scanner.nextInt();

        int len = String.valueOf(n).length();

        for (int i = 0; i <= n; i++) {
            space(i, len);
        }
    }

    public static void space(int n, int digits) {
        int len = String.valueOf(n).length();
        StringBuilder sp = new StringBuilder();
        for (int i = len; i <= digits; i++) {
            sp = sp.append(" ");
        }
        for (int j = 0; j < n; j++) {
            System.out.print(sp.toString() + n);
        }
        System.out.println();
    }
}




