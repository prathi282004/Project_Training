// Write a program to check if a string contains only alphabets.

package exercise_2.arrays;

import java.util.Scanner;

public class CheckAlphabet_34 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To check if a string contains only alphabets");

        System.out.print("Enter a string: ");
        String str = "abc";

        try{
            str = scanner.next();
        } catch(Exception e){
            System.out.println("Invalid input!!");
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //TODO JR: Explain
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                System.out.println(str + " contains only characters");
                break;
            } else {
                System.out.println("The string given does not contains alphabets");
            }
        }
    }
}
