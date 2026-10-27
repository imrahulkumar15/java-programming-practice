
// Print numbers from N to 1. Write a Java program that accepts an integer N and prints numbers in 
// descending order, starting from N and ending at 1.

import java.util.Scanner;

public class Q2_Descending_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a = sc.nextInt();

        int i=a; // initial value means code start from here to N.
        while (i>=1) {
            System.out.println(i);
            i--;
        }
        sc.close();
    }
}
