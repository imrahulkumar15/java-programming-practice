
// Write a program that accepts three integers and uses conditional statements to identify and print the largest number. If the largest value is shared, the program should still report the correct largest value.

import java.util.Scanner;

public class Q15_Largest_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Three Integer NO: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>=b && a>=c) {
            System.out.println("Largest " +a);
        } else if (b>=c && b>=c) {
            System.out.println("Largest " + b);
        }else 
            System.out.println(" Largest " + c);
            sc.close();
    }
}
