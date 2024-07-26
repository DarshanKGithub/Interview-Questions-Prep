package ReverseNumber;
//Reverse a number in array
//Using Basic Algorithm
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        //1.Algo to reverse a number
        int rev = 0; // intilizing to store the reverse number
        while(num!=0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("The reverse number is: "+ rev);

    }
}