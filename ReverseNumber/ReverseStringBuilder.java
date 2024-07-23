package ReverseNumber;

import java.util.Scanner;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reverse: ");
        int num = sc.nextInt();

        //Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(num);

        StringBuilder rev = sb.reverse();
        System.out.println("The reverse number is: "+ rev);
    }
}
