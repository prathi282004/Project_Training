package arrays;

public class LargestElement {
    public static void main(String args[]){
        int arr[] ={2, 4, 7, 11, 0, -3};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max);
            max = arr[i];
        }
        System.out.println("Largest element in array is : " + max);
    }
}
