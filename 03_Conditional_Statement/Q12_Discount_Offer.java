
// Write a program that accepts a customer's purchase amount. If the amount is ₹5,000 or more, apply a 10% discount; otherwise, no discount is applied. Display the discount amount and final bill.

import java.util.Scanner;

public class Q12_Discount_Offer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Purchage Amount: ");
        double d = sc.nextDouble();
         double Result = d*10/100;
         System.out.println("Discount Amount: " + Result);
        double Final = d - Result;
        System.out.println("Final bills: " + Final);
        sc.close();
        
    }
}
