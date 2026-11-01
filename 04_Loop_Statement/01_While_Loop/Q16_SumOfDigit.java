
// Find the sum of digits. Write a Java program that accepts an integer and calculates the 
// sum of its digits using the modulus (%) and division (/) operators. Input: 1234. 
// Expected output: Sum of digits = 10

import java.util.Scanner;

public class Q16_SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digits: ");
        int Num1 = sc.nextInt();

        int sum =0;
        while (Num1>0) {
            int digit = Num1%10;
            sum =sum +digit;
            Num1 = Num1/10;
        }
        System.out.println("Sum of digits: " +sum);
        sc.close();
    } 

}
