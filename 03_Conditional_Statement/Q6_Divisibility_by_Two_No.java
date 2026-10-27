
// Write a program that accepts a number and determines whether it is divisible by both 3 and 5 using a logical operator.
import java.util.Scanner;

public class Q6_Divisibility_by_Two_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Integer No: ");
        int a = sc.nextInt();

        if (a%3==0 || a%5==0) {
            System.out.println(a + " is Divisible by 3 and 5.");
        } else
            System.out.println(a + " is not divisible by 3 and 5.");
            sc.close();
    }
}
