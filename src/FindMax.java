import java.util.Scanner;

public class FindMax {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter val1 : ");
        int val1 = scanner.nextInt();

        System.out.println("Enter val2 : ");
        int val2 = scanner.nextInt();

        System.out.println("Enter val3 : ");
        int val3 = scanner.nextInt();

        if(val1 > val2 && val1 > val3) {
            System.out.println(val1 + " is maximum");
        }
            else if(val2 > val1 && val2 > val3){
                System.out.println(val2 + " is maximum");
            }

            else{
                System.out.println(val3 + " is maximum");
            }
        }
    }

