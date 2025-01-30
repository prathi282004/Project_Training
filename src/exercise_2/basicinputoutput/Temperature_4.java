// Convert temperature from Celsius to Fahrenheit.

package exercise_2.basicinputoutput;
import java.util.Scanner;
// JR: Review done
public class Temperature_4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Converting temperature from Celcius to Fahrenheit");

        try {
            System.out.println("Enter temperature : ");
            int celcius = scanner.nextInt();

            double fahrenheit = (celcius * 1.8) + 32;
            System.out.println("Fahrenheit of temperature " + celcius + " is : " + fahrenheit);
        }

        catch(Exception e){
            System.out.println("Invalid input!");
        }

    }
}
