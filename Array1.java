import java.util.Scanner;

public class Array1 {
    static void Sum(int[] arr) {
        int sum = 0;
        for (int j = 0; j <= arr.length - 1; j++) {
            sum += arr[j];

            System.out.println("The sum is: " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers: ");

        // Loop to read 10 numbers from the user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Close the scanner
        sc.close();

        // Print the array elements
        System.out.println("The entered numbers are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Sum(arr);
    }

}
