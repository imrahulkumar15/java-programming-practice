
// Find the sum of digits. Write a Java program that accepts an integer and calculates the 
// sum of its digits using the modulus (%) and division (/) operators. Input: 1234. 
// Expected output: Sum of digits = 10

import java.util.Scanner;

public class Q16_SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digits: ");
        int Num1 = sc.nextInt();

        int Sum = 0;
      while (Num1>0) {
        int digits = Num1%10;
        Sum =Sum + digits;
        Sum =Num1/10;
      }
      System.out.println("Sum of digit: " + Sum);
    }
}
