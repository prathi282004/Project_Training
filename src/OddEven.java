import java.util.Scanner;
public class OddEven {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");
        int val = scanner.nextInt();

        if(val % 2 == 0){
            System.out.println(val + " is Even");
        }

        else{
            System.out.println(val + " is Odd");
        }

    }

}
