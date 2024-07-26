package Palindrome;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name = sc.next();
        String org_str = name;
        String rev = "";
        int len = name.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }

        if (org_str.equalsIgnoreCase(rev)) {
            System.out.println(org_str + " is a palindrome string.");
        } else {
            System.out.println(org_str + " is not a palindrome.");
        }
    }
}
