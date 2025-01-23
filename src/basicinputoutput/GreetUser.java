package basicinputoutput;
import java.util.Scanner;

public class GreetUser {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Good morning!! " + name);
    }
}
