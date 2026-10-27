
// . Print even numbers from 1 to N. Write a Java program that accepts an integer N and prints all even 
// numbers between 1 and N.

import java.util.Scanner;

public class Q4_2nd_Print_Even_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit No: ");
        int a = sc.nextInt();

        int i=2;
        while (i<=a) {
            System.out.println(i);
            i+=2;
        }
        sc.close();
    }
}
