
// Find the ASCII value of a given character
import java.util.Scanner;

public class Q7_ASCII_Value_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Etner a charater value: ");
        char ch = sc.next().charAt(0); // taken character value from the user.

        int Result = ch; // just i print integer value.

        System.out.println("Charater Value: " + ch);
        System.out.println("ASCII Value: " + Result);
        sc.close();
    }
}
