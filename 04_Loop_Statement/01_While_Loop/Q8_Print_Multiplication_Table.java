
// . Print the multiplication table. Write a Java program that accepts an integer and prints its 
// multiplication table from 1 to 10.

import java.util.Scanner;

public class Q8_Print_Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit for multiplication for table: ");
        int a = sc.nextInt();

        int i =1;
        while (i<=10) {
            System.out.println(i*a);
            i++;
        }
        sc.close();
    }
}
