package SubArray;

import java.util.Scanner;

public class MaxSubArray {
    static long maxArray(int[] arr, int n){
        int sum = 0;
        long max = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i]; // Update the value of sum
            if(sum < 0){
                sum = 0;
            }
            if(sum > max){
                max = sum; // Update max
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        long maxSum = maxArray(arr, size);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}
