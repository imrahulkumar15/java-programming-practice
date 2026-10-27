
// . Print numbers from 1 to N. Write a Java program that accepts an integer N and prints all numbers 
// from 1 to N using a while loop.

import java.util.Scanner;

public class Q1_Print_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int i =1;
        while (i<=a) {
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
