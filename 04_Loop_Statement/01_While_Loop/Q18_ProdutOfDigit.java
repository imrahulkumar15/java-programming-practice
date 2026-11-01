// Find the product of digits. Write a Java program that accepts a positive integer and calculates 
// the product of all its digits. Input: 234. Expected output: Product = 24

import java.util.Scanner;

public class Q18_ProdutOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ente a number: ");
        int Num1 = sc.nextInt();

        int Product =1;
        while (Num1>0) {                // codition 
            int digit = Num1%10;        // we found last digit
            Product = Product*digit;    // last digit multiply with product 
            Num1 =Num1/10;              // last digit i removed 
        }
        System.out.println("product of sum: " +Product);
        sc.close();
    }
}
