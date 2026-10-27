
//
import java.util.Scanner;

public class Q5_Calculate_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a product Price: ");
        int a = sc.nextInt();

        System.out.print("Enter a Discount Rate: ");
        int b = sc.nextInt();

        System.out.println("Without Discount Product Price: " + a);

        int Result = (a*b)/100;
        int After = a -Result;
        System.out.println("After discount Product price: " + After);
        sc.close();
    }
}
