
// Print numbers with a step of 2. Write a Java program that accepts an integer N and prints 
// odd numbers starting from 1, increasing by 2 each time, until N.

import java.util.Scanner;

public class Q9_Print_No_with_Step2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit No. find the odd No. From 1 to N: ");
        int a = sc.nextInt();

        int i =1;
        while (i<=a) {
            System.out.println(i);
            i = i + 2;
        }
        sc.close();
    }
}
