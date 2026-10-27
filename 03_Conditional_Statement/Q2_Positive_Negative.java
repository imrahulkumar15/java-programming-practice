// Write a program that accepts a number and checks whether it is positive, negative, or zero using conditional statements.

import java.util.Scanner;

public class Q2_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer No: ");
        int a = sc.nextInt();

        if (a>0) {
            System.out.println(a + " is positive No.");
        }if (a<0) {
            System.out.println(a + " is Negative No.");
        }if (a==0) {
            System.out.println(a + " is a Zero.");
        }
        sc.close();
    } 
}
