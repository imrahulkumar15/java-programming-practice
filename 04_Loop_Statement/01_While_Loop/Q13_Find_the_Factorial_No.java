
// Find the factorial of a number. Write a Java program that accepts a non-negative integer and 
// calculates its factorial using a while loop.

import java.util.Scanner;

public class Q13_Find_the_Factorial_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        long factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);

        sc.close();

        
    }
}
