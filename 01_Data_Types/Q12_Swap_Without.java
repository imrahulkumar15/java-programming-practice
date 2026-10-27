
// Swap two numbers without using a third variable.
import java.util.Scanner;

public class Q12_Swap_Without {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first num1: ");
        int Num1 = sc.nextInt();
        System.out.println("Enter a second number: ");
        int Num2 = sc.nextInt();

        System.out.println("Before Swapping: " + Num1 + " " + Num2);

         Num1 = Num1 + Num2;
         Num2 = Num1 - Num2;
         Num1 = Num1 - Num2;
        
         System.out.println("After Swapping: " +Num1 + " " + Num2);
         sc.close();
            
    }
}
