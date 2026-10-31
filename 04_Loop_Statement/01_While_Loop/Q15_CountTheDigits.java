
// Count the digits of an integer. Write a Java program that accepts a positive integer and 
// counts how many digits it contains without converting it to a string. 
// Input: 58321. Expected output: Digits = 5

import java.util.Scanner;

public class Q15_CountTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int Num1 = sc.nextInt(); // scan input from the user

        int i =1; // initilization
        int count =0;
        while (i<=Num1) { // logic 
            System.out.println(i);
            count = count +1; 
            i++;
        }
        System.out.println("This is your count: "+ count);
        sc.close();
    }
}
