// To count odd and even number in an array

package exercise_2.arrays;

public class CountOddEven_30 {
    public static void main(String[] args) {
        System.out.println("To count odd and even numbers in an array");

        int[] arr = {3, 6, 1, 67, 0, -2, 2, 1};

        int OddCount = 0;
        int EvenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                EvenCount++;
            } else if (arr[i] % 2 != 0) {
                OddCount++;
            }
        }

        System.out.println("Number of odd count in array is : " + EvenCount);
        System.out.println("Number of even count in array is : " + OddCount);
    }
}
