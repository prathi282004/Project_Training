import java.util.Scanner;
public class OddEven {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value : ");
        int val = scanner.nextInt();

        if(val % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }

}
