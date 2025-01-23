package arrays;

public class SumOfElements {
    public static void main(String [] args) {
        int arr[] = {2, 56, 4, 9, 0, 64, -8};

        int sum = 0;
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements is : " + sum);
    }

}