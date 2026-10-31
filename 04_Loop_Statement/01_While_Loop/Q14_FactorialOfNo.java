
// Find the factorial of a number. Write a Java program that accepts a non-negative integer
//  and calculates its factorial using a while loop. Input: 5. Expected output: Factorial = 120
import java.util.Scanner;

public class Q14_FactorialOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit: ");
        int a = sc.nextInt(); // I input taken form the user

        int i=1; // initilization
        int Multi = 1; // initilization
        while (i<=a) {
            System.out.println(i);
            Multi = Multi*i;
            i++;
        }
        System.out.println("This is your Factorial No: " + Multi);
        sc.close();

    }
}
