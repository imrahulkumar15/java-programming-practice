import java.util.Scanner;

public class Q16_ASCII_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a charater value: ");
        char ch = sc.next().charAt(0);

        int Result = (int)ch;
        System.out.println("This is your ASCII value: " + Result);
        sc.close();
    }
}
