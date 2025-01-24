// 1. Write a program to take a name as input and greet the user.

package exercise_2.basicinputoutput;
import java.util.Scanner;

public class GreetUser_1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Good morning!! " + name);
    }
}
