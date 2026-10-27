
// Find the last digit of a given number using %.

import java.util.Scanner;

public class Q11_Find_Last_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first No: ");
        int a = sc.nextInt();

        int Result = a % 10;
        System.out.println("This is your last No: " + Result);
        sc.close();
    }
}
