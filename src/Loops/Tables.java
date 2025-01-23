package Loops;
import java.util.Scanner;

public class Tables {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value to display table : ");
        int num = scanner.nextInt();

        System.out.println("Table number : " + num);
        for(int i=1; i<= 10; i++){
            System.out.println(num + " * " +i + " = " + num * i);
        }
    }
}
