package Loops;
import java.util.Scanner;

public class Tables {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value shows table : ");
        int num = scanner.nextInt();

        System.out.println(num + "th table" );
        for(int i=1; i<= 10; i++){
            System.out.println(num + " * " +i + " = " + num * i);
        }
    }
}
