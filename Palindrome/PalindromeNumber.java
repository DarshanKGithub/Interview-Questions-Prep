package Palindrome;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int rev = 0;
        int org_sum = num;


        while(num!=0){
        rev = rev * 10  + num%10;
        num = num / 10;
        }
        if(org_sum == rev){
            System.out.println(org_sum + " " + "yes this is palindrome");
        }else{
            System.out.println(org_sum + " " +" Not a palindrome");
        }
    }
}
