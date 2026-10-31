
//Find the sum of odd numbers. Write a Java program that accepts an integer N and calculates 
// the sum of all odd numbers between 1 and N.

import java.util.Scanner;

public class Q11_Sum_of_Odd_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit No. find the sum of Odd No. from 1 to N: ");
        int a = sc.nextInt();
        System.out.println("This is your Odd No: ");

        int sum = 0;
        int i =1;

        while (i<=a) {
            sum = sum +i;
            System.out.println(i);
            i += 2;
        }
        System.out.println("This is your sum of Odd No: " +sum);
        sc.close();

    }
}
