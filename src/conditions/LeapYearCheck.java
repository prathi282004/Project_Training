package conditions;
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year to check whether leap year : ");
        int year = scanner.nextInt();

        if(year % 4 == 0) {
            System.out.println("Leap year");
        }
            else if(year % 100 == 0){
                System.out.println("Not a Leap year");
            }
            else if(year % 400 == 0){
                System.out.println("Leap year");
        }
            else{
                System.out.println("Not a leap year");
        }

    }
}
