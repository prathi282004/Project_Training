
// Program to categorize a grade based on marks entered

package exercise_2.conditionals;
import java.util.Scanner;

public class Grade_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks to categorize grade");
        System.out.println("Enter marks : ");

        double mark = 98.5;

        try {
            mark = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid input!!");
        }

        if (mark >= 90) {
            System.out.println("The grade of " + mark + " is O");
        } else if (mark >= 80 && mark <= 89) {
            System.out.println("The grade of " + mark + " is A");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("The grade of " + mark + " is B");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("The grade of " + mark + " is C");
        } else if (mark >= 50 && mark <= 59) {
            System.out.println("The grade of " + mark + " is Pass");
        } else {
            System.out.println("The grade of " + mark + " is Fail");
        }
    }
}