// Print all odd numbers between 1 and 100.

package exercise_2.work_on_loops;

// JR: Review done
public class PrintOddNumbers_7 {
    public static void main(String[] args) {
        System.out.println("Even Values from 1 to 100");

        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
