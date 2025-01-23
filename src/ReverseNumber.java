import java.util.Scanner;

public class ReverseNumber {
    public static void main(String []args){
            Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to be reversed : ");
        int num = scanner.nextInt();

        int rev = 0;
        int temp = num;

        while (temp != 0) {
            int n = temp % 10;
            rev = rev * 10 + n;
            temp = temp / 10;
        }
            System.out.println("Reversed series : " + rev);

    }
}
