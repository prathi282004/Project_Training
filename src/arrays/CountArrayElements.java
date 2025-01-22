package arrays;

public class CountArrayElements {
        public static void main(String args[]) {
            int arr[] = {2, 56, 4, 9, 0, 64, -8};

            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    positiveCount++;
                }
                else if (arr[i] < 0) {
                    negativeCount++;
                }
                else {
                    zeroCount++;
                }
            }


            System.out.println("Positive elements in array: " + positiveCount);
            System.out.println("Negative elements in array: " + negativeCount);
            System.out.println("Zero elements in array: " + zeroCount);
        }
    }


