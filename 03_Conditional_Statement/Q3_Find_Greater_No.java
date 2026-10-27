// Write a program that accepts two integers and compares them using if-else to print the greater number. If both numbers are equal, display an appropriate message.

import java.util.Scanner;

public class Q3_Find_Greater_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first No: ");
        int a = sc.nextInt();
        System.out.print("Enter a second No: ");
        int b = sc.nextInt();

        if (a>b) {
            System.out.println(a + " is greater NO.");
        }else
        System.out.println(b + " is greater No.");
        sc.close();
    }
}
