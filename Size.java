/*Write a program to 
 * 1.Print the size of int float, double.
 * 2.Multiply the values calculated in a.
 * 3.if the value computed in b, is less than 10 print small number.
 * 4.if the value computed in b, is more than 10 print and less than 20 print big number.
 * 5.if the value computed in b, is more than 20 print large number*/

import java.util.Scanner;

public class Size {
    public static void main(String[] arge) {
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of int: " + Integer.SIZE + " Size");
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("Size of float: " + Float.SIZE + " Size");
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        System.out.println("Size of double: " + Double.SIZE + " Size");

        // Multiply the values calculated in a;
        int product = Integer.SIZE * Float.SIZE * Double.SIZE;
        System.out.println("Multiply the values of a is: " + product);
        printCondition();

    }

    static void printCondition() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // conditions
        if (num < 10) {
            System.out.println("Small number");
        } else if (num > 10 || num < 20) {
            System.out.println("Big number");

        } else {
            System.out.println("Large number");

        }

    }
}
