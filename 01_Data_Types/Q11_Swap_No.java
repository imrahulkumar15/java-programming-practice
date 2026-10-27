
// Swap two numbers using a temporary variable.

import java.util.Scanner;

public class Q11_Swap_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second num: ");
        int num2 = sc.nextInt();

        System.out.println("Before Swapping No: " +num1 + " " +num2);

        int num3 = num1;
            num1 = num2;
            num2 = num3;
            System.out.println("After swapping: " + num1 + " " + num2);
            sc.close();
    }
}
