
//Print odd numbers from 1 to N. Write a Java program that accepts an integer N and prints all 
// odd numbers between 1 and N.

import java.util.Scanner;

public class Q6_2nd_Print_Odd_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit: ");
        int a = sc.nextInt();

        int i=1;
        while (i<=a) {
               System.out.println(i);
            i+=2;
        }
        sc.close();
    }
}
