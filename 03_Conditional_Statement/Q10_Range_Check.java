
// Write a program that accepts an integer and checks whether it lies between 10 and 100, including both boundaries.
import java.util.Scanner;

public class Q10_Range_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer vlaue: ");
        int a = sc.nextInt();

        if (a>=10 && a<=100) {
            System.out.println(a + " is Integer Range.");
        }else
        {
            System.out.println(a + " is not Integer range.");
        }
        sc.close();
    }
}
