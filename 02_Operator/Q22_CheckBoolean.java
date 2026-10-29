import java.util.Scanner;

public class Q22_CheckBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a boolean value (true/false): ");
        boolean value = sc.nextBoolean();

        String result = value ? "YES" : "NO";

        System.out.println(result);

        sc.close();
    }
}
