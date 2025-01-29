// *Prime Number Check*
//    Write a program to check whether a number is prime.

package exercise_1.conditions;
import java.util.Scanner;
// JR: TODO - completely wrong program.
//      You should understand what is prime number?
//      You have to carefully understand the given program and start writing code.

public class PrimeNumberCheck_15 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to check it is prime number or not : ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println(+ num + " is Not a Prime number");
        }
        else{
            System.out.println(+ num + " is a Prime number");
        }
    }
}
