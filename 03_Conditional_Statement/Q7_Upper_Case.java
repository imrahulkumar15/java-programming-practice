
// Write a program that accepts a single English alphabet character and checks whether it is uppercase or lowercase. Assume the user enters an alphabetic character.

import java.util.Scanner;

public class Q7_Upper_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character value:");
       char ch = sc.nextLine().charAt(0);

        if (ch>='A' && ch <='Z') {
            System.out.println(ch + " is an Upper case.");
        }else{
            System.out.println(ch + " is a Lower case.");
        }
        sc.close();
    }
}
