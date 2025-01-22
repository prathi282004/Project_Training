package arrays;
import java.util.Arrays;
public class Sort {
    public static void main(String [] args){
            int arr[] = {2, 56, 4, 9, 0, 64, -8, 2, 4};

            Arrays.sort(arr);

            System.out.print("Sorted array: ");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " , ");
            }
        }
    }

