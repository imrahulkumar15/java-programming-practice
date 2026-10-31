
//Print even numbers from 1 to N. Write a Java program that accepts an integer N and prints all even 
// numbers between 1 and N.

import java.util.Scanner;

public class Q3_Print_Even_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit: ");
        int a = sc.nextInt();

        int i =1;
        while (i<=a) {
            if (i%2==0)
                 {
                System.out.println(i);
                }
            i++;
        }
        sc.close();
    }
}
