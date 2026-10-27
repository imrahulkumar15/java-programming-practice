
// Take two integers as input and find the minimum number using the ternary operator. 
import java.util.Scanner;

public class Q16_Minimum_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer value: ");
        int Num1 = sc.nextInt(); // taken form the user 
        System.out.print("Enter a second integer value: ");
        int Num2 = sc.nextInt(); // taken form the user

        int str = (Num1 < Num2)? Num1:Num2; // compare with number 
        System.out.println("Negative No is: " + str);
        sc.close();
    }
}
