public class ReverseArray {

    // static void reverseArray(int[] arr) {
    // creating with an object and storing
    // int[] newReverseArray = new int[arr.length];
    // for (int i = 0; i < arr.length; i++) {
    // newReverseArray[i] = arr[arr.length - i - 1];
    // }

    // // Print reversed array
    // System.out.println("Reversed Array: ");
    // for (int i : newReverseArray) {
    // System.out.print(i + " ");
    // }
    // }

    static void reverseArray(int[] arr, int len) {
        // Loop
        for (int i = 0; i < len; i++) {
            // Storing in a Temp variable
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;

        }
        // Print reversed array
        System.out.println("Reversed Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 0 };
        int len = arr.length;
        reverseArray(arr, len);

    }
}
