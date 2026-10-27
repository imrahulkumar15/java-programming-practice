
// Input three numbers and find the largest using nested ternary operators.
import java.util.Scanner;

public class Q20_Large_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first NO: ");
        int a = sc.nextInt();
        System.out.print("Enter a second No: ");
        int b = sc.nextInt();
        System.out.print("Enter a third No: ");
        int c = sc.nextInt();

        int Result = a>b?a:b;
        Result = Result > c?Result:c;
        System.out.println("This is your Max value: " + Result);
        sc.close();
    }
}
