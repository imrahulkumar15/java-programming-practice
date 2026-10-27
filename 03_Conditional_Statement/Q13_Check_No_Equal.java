// Write a program that accepts three integers and determines whether all three numbers are equal. If they are not equal, display a message stating that the numbers are not all equal.

import java.util.Scanner;

public class Q13_Check_No_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ente a first No: ");
        int a = sc.nextInt();
        System.out.print("Ente a second No: ");
        int b = sc.nextInt();
        System.out.print("Enter a thrid No: ");
        int c = sc.nextInt();

        if (a == b && b==c && c==a ) {
            System.out.println("All three number are Equal No.");
        }else
            System.out.println("All three number are not Equal No.");
            sc.close();
    }
}
