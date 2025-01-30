// Create program to find the average of elements in an array

package exercise_2.arrays;
import java.util.Arrays;


// TODO: JR- don't hard-code data, it should be get from user
public class AverageOfElements_24 {
    public static void main(String[] args) {

        int[] arr = {3, 6, 1, 67, 0, -2, 2, 1};

        System.out.println("To print average of elements in an array");

        double sum = 0;
        double avg = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = sum / arr.length;
        System.out.println("Average of elements is : " + avg);
    }
}
