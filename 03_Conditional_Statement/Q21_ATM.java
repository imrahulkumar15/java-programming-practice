
//Write a program that accepts an account balance and a withdrawal amount. Use conditions to verify that the
//  withdrawal amount is positive and does not exceed the available balance. If valid, deduct the amount and
//  display the remaining balance.

import java.util.Scanner;

public class Q21_ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ATM");

        System.out.print("Enter your Amount: ");
        int Amount = sc.nextInt();
        System.out.print("Enter your Withdrawal Amount: ");
        int Withdrawal = sc.nextInt();

        if (Withdrawal<=0) {
            System.out.println("Invalid Amount");
        }else if (Withdrawal>Amount) {
            System.out.println("Insufficient balance");
        } else {
            Amount = Amount-Withdrawal;
            System.out.println("Withdrawal Successfully");
            System.out.println("Remening Balance: " + Amount);
        }
           sc.close(); 

    }      
}
