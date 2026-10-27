
// Write a program to convert a negative number into positive using unary operator.

import java.util.Scanner;

public class Q13_Negative_Into_Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Negative No: ");
        int a = sc.nextInt();
        int Result = -a;
        System.out.println("This is your positive No: " +Result);
        sc.close();
    }
}
