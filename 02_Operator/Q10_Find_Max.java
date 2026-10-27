
// Find the maximum of three numbers using conditional operators

import java.util.Scanner;

public class Q10_Find_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first No: ");
        int a = sc.nextInt();
        System.out.print("Enter a second No: ");
        int b = sc.nextInt();
        System.out.print("Enter a third No: ");
        int c = sc.nextInt();

        int Max = a > b? a:b;
        Max = Max > c? Max:c;
        System.out.println("This is your Max value: " + Max);
        sc.close();
    }
}
