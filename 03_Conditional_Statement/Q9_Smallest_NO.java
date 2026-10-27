
// Write a program that accepts two integers and prints the smaller number. If both values are equal, print that both numbers are equal.

import java.util.Scanner;

public class Q9_Smallest_NO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first No: ");
        int a = sc.nextInt();
        System.out.print("Enter a second No: ");
        int b = sc.nextInt();

        if (a<b) 
        {
            System.out.println(a + " is smallest No. ");            
        }else
            if (b<a) {
                System.out.println(b + " is a Smallest No.");
            }else
                if (a==b) {
                    System.out.println(a + " & " + b + " is a equal.");
                }
                sc.close();
    }
}
