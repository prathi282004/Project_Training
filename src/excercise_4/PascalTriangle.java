package excercise_4;

import java.util.Scanner;

//JR: Review Done - Good
public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("Pascal Triangle Pattern");
        System.out.println("Enter n value to print pattern : ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}


//            if (i >= 1 && i <= 9) {
//                one_digit(i);
//            } else if (i >= 10 && i <= 99) {
//                two_digit(i);
//            } else if (i >= 100 && i <= 999) {
//                three_digit(i);
//            }
//
//            System.out.println();
//        }
//    }
//
//    public static void one_digit(int n) {
//        for (int j = 0; j < n; j++) {
//            System.out.print(n + "   ");
//        }
//    }
//
//    public static void two_digit(int n) {
//        for (int j = 0; j < n; j++) {
//            System.out.print(n + "  ");
//        }
//    }
//
//    public static void three_digit(int n) {
//        for (int j = 0; j < n; j++) {
//            System.out.print(n + " ");
//        }
//    }
//}