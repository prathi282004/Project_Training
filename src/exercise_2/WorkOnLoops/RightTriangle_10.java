// 10. Write a program to print a right-angled triangle pattern using *.
//Example:
//
//*
//**
//***

package exercise_2.WorkOnLoops;
import java.util.Scanner;

// JR: Review done
public class RightTriangle_10 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Right angled triangle");

        System.out.println("Enter n value to print stars : ");
        int n = scanner.nextInt();

        for(int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
