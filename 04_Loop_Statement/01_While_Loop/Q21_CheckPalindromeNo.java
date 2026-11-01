
// Check whether a number is a palindrome. Write a Java program that accepts an integer, reverses its digits,
//  and checks whether the reversed number equals the original number. Input: 1221.
//  Expected output: Palindrome

import java.util.Scanner;

public class Q21_CheckPalindromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int Num1 = sc.nextInt();

        int Reverse = 0;
        int digit;
        int Original = Num1; // initilization

        while (Num1 > 0) {
            digit = Num1 % 10; // Extract last digit
            Reverse = Reverse * 10 + digit; // 
            Num1 = Num1 / 10; // Remove last digit
        }
        System.out.println("Reverse No: " + Reverse);
         if (Original == Reverse) { // compare with oringal Num1 with Reverse 
                System.out.println("This is Palindrome No.");
            }else
                System.out.println("This is not Palindrome No.");
                sc.close();
    }
}
