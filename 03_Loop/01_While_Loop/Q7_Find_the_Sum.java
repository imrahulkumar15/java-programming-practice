
// Find the sum of numbers from 1 to N. Write a Java program that accepts an integer N and calculates 
// the sum of all integers from 1 to N using a while loop.

import java.util.Scanner;

public class Q7_Find_the_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a serial No from 1 to N: ");
        int a = sc.nextInt();

        int sum = 0;
        int i =1;
        while (i<=a) {
           sum = sum + i;
            i++;
        }
         System.out.println("This is Sum of serial No: " + sum);
         sc.close();
    }
}
