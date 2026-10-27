// Largest of Three Numbers: Take three integers as input and find the largest number using relational and ternary operators
import java.util.Scanner;

public class Q18_Largest_Three_NO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first No:");
        int Num1 = sc.nextInt();
        System.out.print("Enter a second No: ");
        int Num2 = sc.nextInt();
        System.out.print("Enter a Third No: ");
        int Num3 = sc.nextInt();

        int Max = (Num1 > Num2)? Num1 : Num2;
        Max = (Max > Num3)? Max : Num3;
        System.out.println("This is your Max No: " + Max);
        
        sc.close();
    }
}
