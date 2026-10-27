
// Find the GCD and LCM of two numbers.
import java.util.Scanner;

public class Q14_Find_GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second num: ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        // Find GCD using modulus operator
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int gcd = a;

        // Find LCM using arithmetic operators
        int lcm = (num1 * num2) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
