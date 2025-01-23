package arrays;

public class LargestElement {
    public static void main(String args[]) {
        double arr[] = {2.9, 4, 7, 11.5, 0, -3};

        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element in array is : " + max);
    }
}
