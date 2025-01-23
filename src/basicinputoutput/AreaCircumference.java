package basicinputoutput;
import java.util.Scanner;

public class AreaCircumference {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("To calculate area and circumference of a circle");

        System.out.println("Enter radius of a circle : ");
        double r = scanner.nextDouble();
        double pi = 3.14;

        double area = pi * r * r;
        System.out.println("Area of a circle is : " + area);

        double circumference = 2 * pi * r;
        System.out.println("Circumference of a circle is : " + circumference);
    }
}
