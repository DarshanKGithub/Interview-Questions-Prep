//Q1)Pair with given Sum (Two Sum)
//Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x. 

public class PairSum {
    public static boolean pairSum(int arr[], int size, int key) {
        // outer loop
        for (int i = 0; i <= size - 1; i++) {
            // inner loop
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };
        // System.out.println(arr.length);
        int size = arr.length;
        int key = -2;
        System.out.println(pairSum(arr, size, key));
    }
}