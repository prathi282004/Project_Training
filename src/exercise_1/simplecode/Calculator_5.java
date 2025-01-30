// 5. *Simple excercise_1.SimpleCode.Calculator*
//   Create a basic calculator that can perform addition, subtraction, multiplication, and division.

package exercise_1.simplecode;
import java.util.Scanner;
// JR: review done
public class Calculator_5 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter val1 : ");
        double val1 = scanner.nextDouble();

        System.out.println("Enter val2 : ");
        double val2 = scanner.nextDouble();

        double add = val1 + val2;
        System.out.println("Addition of " + val1 + " and " + val2 + " is  : " +add);

        //JR: 2) Will it subtract?
        double sub = val1 + val2;
        System.out.println("Subraction of " + val1 + " and " + val2 + " is  : " +sub);

        double mul = val1 * val2;
        System.out.println("Multiplication of " + val1 + " and " + val2 + " is  : " +mul);

        double div = val1 / val2;
        System.out.println("Division of " + val1 + " and " + val2 + " is  : "  +div);
    }
}
