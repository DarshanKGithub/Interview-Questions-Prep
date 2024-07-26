package ReverseNumber;

import java.util.Scanner;

public class ReverseStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert in reveseOrder: ");
        int num = sc.nextInt();


        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();

        System.out.println("The reverse number is : " + rev);
    }
}
