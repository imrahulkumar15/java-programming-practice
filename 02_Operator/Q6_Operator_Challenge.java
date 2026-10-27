
// Operator Challenge: Take three integers as input and calculate the following expressions: (a + b) × c, (a × b) + c, (a + b) / c, and (a % b) + c. 
import java.util.Scanner;

public class Q6_Operator_Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first value: ");
        int a = sc.nextInt();
        System.out.print("Enter a second value: ");
        int b = sc.nextInt();
        System.out.print("Enter a third value: ");
        int c = sc.nextInt();

        int First = (a + b)* c; //(a + b) × c, (a × b) + c, (a + b) / c, and (a % b) + c. 
        int Second = (a * b) + c;
        int Third = (a + b) / c;
        int Fourth = (a % b) + c;
        System.out.println("This is your complete answer: " + First + " " + Second + " " + Third + " " + Fourth);
        sc.close();
    }
}
