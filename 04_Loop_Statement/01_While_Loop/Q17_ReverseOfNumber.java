
//Reverse the digits of an integer. Write a Java program that accepts an integer and reverses its digits
//  without converting it to a string. Input: 1234. Expected output: Reverse = 4321

import java.util.Scanner;

public class Q17_ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int Num1 = sc.nextInt();

        int digit;
        int Reverse =0;
    while (Num1>0) {
        digit =Num1%10;
        Reverse = Reverse*10 + digit;
        Num1 = Num1 / 10;
    }
    System.out.println("Reverse No: " +Reverse);
    sc.close();
        }
    }

