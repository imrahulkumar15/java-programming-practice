
// Take an integer input and print its square.

import java.util.Scanner;

public class Q3_Integer_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kinldy enter the integer value: ");
        int num1 = sc.nextInt(); // Input taken from the user
        
        int Result = num1*num1; // i used logic for square
        System.out.println("This is your Square value: " +Result);
        sc.close();
    }
}
