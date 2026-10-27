// Write a program that accepts an integer and checks whether it is completely divisible by 5. Display the result using a conditional statement.

import java.util.Scanner;

public class Q5_Check_Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer value: ");
        int a = sc.nextInt();

        if (a%5==0) {
            System.out.println(a + " is Divisible by 5.");
        }else{
            System.out.println(a + " is not Divisible by 5.");
        }
        sc.close();
    }
}
