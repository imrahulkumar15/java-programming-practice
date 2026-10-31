
// . Find the sum of even numbers. Write a Java program that accepts an integer N and 
// calculates the sum of all even numbers between 1 and N.

import java.util.Scanner;

public class Q10_Sum_of_Even_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit No. find the even no of sum: ");
        int a = sc.nextInt();
        System.out.println("This is your Even No: ");

        int sum = 0;
        int i=2;
        while (i<=a) {
            sum = sum + i;
            System.out.println(i);
            i+=2;
        }
         System.out.println("Sum of Even No: " + sum);
         sc.close();
    }
}
