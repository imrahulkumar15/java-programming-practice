
// Count numbers from 1 to N. Write a Java program that accepts an integer N, prints numbers 
// from 1 to N, and displays the total count of numbers printed.

import java.util.Scanner;

public class Q12_Count_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit No: ");
        int a = sc.nextInt();

        int Count = 0;
        int i =1;
        while (i<=a) {
            Count++;
            System.out.println(i);
            i++;
        }
        System.out.println("This is your count No: " + Count);
        sc.close();
    }
}
