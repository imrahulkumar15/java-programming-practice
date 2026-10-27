
// Input marks and use ternary operator to print Pass/Fail.
import java.util.Scanner;

public class Q15_Find_Fale_Pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Hindi Marks: ");
        int a = sc.nextInt();
        System.out.print("Enter a English Marks: ");
        int b = sc.nextInt();
        System.out.print("Enter a physic Marks: ");
        int c = sc.nextInt();
        System.out.print("Enter a Maths Marks: ");
        int d = sc.nextInt();

        int Marks = a+b+c+d;
        System.out.println("Total Marks out of 400: " + Marks);

        String Result = Marks >= 200?" Pass ": " Fale ";
        System.out.println("Result: " + Result);
        sc.close();

    }
}
