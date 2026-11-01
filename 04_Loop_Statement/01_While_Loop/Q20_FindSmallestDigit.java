// Find the smallest digit. Write a Java program that accepts a positive integer and identifies 
// the smallest digit in that number. Input: 58329. Expected output: Smallest digit = 2

import java.util.Scanner;

public class Q20_FindSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive Integer: ");
        int Num1 = sc.nextInt();

        int Smallest = 1;
        int digit;

        while (Num1 > 0) {
            digit = Num1 % 10; // Extract last digit
            if (digit < Smallest) { // compare smallest with digit
                Smallest = digit;
            }
            Num1 = Num1 / 10; // Remove the last digit
        }
        System.out.println("Smallest Digit: " + Smallest);
        sc.close();
    }
}
