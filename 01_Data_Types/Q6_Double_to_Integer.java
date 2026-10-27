
// Convert a double value into int (type casting).

import java.util.Scanner;

public class Q6_Double_to_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kinldy enter double value: ");
        double num1 = sc.nextDouble(); // taken input from the user

        int Result =(int)(num1); // perform logic, convert double value into integer.

        System.out.println("Ths is your integer value: " +Result);
        sc.close();
    }
}
