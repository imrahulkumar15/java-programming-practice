// Write a Java program that accepts an integer from the user and determines whether the number is even or odd using the remainder operator and an if-else statement.

import java.util.Scanner;

public class Q1_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer No: ");
        int a = sc.nextInt();

        if (a%2==0) {
            System.out.print(a + " is Even No.");
        } else{
            System.out.println(a + " is Odd No.");
        }
        sc.close();
    }
}
