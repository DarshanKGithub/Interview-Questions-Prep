// Q) Swapping a number using third variable

public class SwapNumber {
    static void Swap(int a, int b) {
        // Swapping the number using third variable
        System.out.println("Before Swapping: " + " a: " + a + " b:" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped number is: " + "a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 50;

        Swap(a, b);
    }
}
