package exercise_1.SimpleCode;// 3. *Odd or Even*
//   Write a program to check whether a given number is odd or even.

import java.util.Scanner;
// JR: review done
//      1) Unnecessary empty line between if & else

public class OddEven_3 {
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
