package RecursionFactorial;

public class Factorial {
    static int sumFactorial(int n){
        //Base Case
        if(n == 0 || n == 1){
            return 1;
        }

        int factorial = n * sumFactorial(n-1);
        return factorial;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumFactorial(n));
    }
}