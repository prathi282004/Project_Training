package excercise_4;

import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        System.out.println("Palindromic Number Pyramid Pattern");
        System.out.println("Enter n value to print pattern : ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(i);
            }
        }

    System.out.println();
    }
    }
