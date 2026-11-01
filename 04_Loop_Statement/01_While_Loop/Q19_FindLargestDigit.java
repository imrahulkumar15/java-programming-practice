
// Find the largest digit. Write a Java program that accepts a positive integer and identifies the 
// largest digit in that number. Input: 58329. Expected output: Largest digit = 9

import java.util.Scanner;

public class Q19_FindLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int Num1 = sc.nextInt();

        int Largest = 0;
        int digit;
        while (Num1 > 0) {
            digit = Num1%10; // find the last digit 
            if (digit > Largest) { // compare digist with largest 
                Largest = digit;
            }
             Num1= Num1 / 10; // Remove the last digit
        }
         System.out.println("This is your Largest digit: " + Largest);
         sc.close();
    }
}
