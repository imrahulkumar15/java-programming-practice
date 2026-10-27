
// Calculate Simple Interest: Take Principal, Rate, and Time as input and calculate Simple Interest using arithmetic operators. Formula: SI = (P × R × T) / 100. 
import java.util.Scanner;

public class Q1_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a principal Value: ");
        int Num1 = sc.nextInt();
        System.out.print("Enter a Rate: ");
        int Num2 = sc.nextInt();
        System.out.print("Etner a Time: ");
        int Num3 = sc.nextInt();

        int Interest = (Num1*Num2*Num3)/100;
        System.out.println("This is your SI Value: " + Interest);
        sc.close();
    }
}
