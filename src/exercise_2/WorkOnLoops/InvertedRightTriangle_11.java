// 11. Write a program to print an inverted triangle pattern.
//Example:
//
//***
//**
//*

package exercise_2.WorkOnLoops;
import java.util.Scanner;

// JR: Review done
public class InvertedRightTriangle_11 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inverted Right angled triangle");

        System.out.println("Enter n value to print stars : ");
        int n = scanner.nextInt();

        for(int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
