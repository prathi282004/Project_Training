package Loops;
import java.util.Scanner;

public class Fibbanocci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value to calculate fibanocci : ");
        int n = scanner.nextInt();

        int first = 0, second = 1;
        System.out.println("Fibonacci Series ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

        }
    }
}
