
// 9.	Smallest of Three Numbers: Take three integers as input and find the smallest number using operators.

import java.util.Scanner;

public class Q19_Smallest_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first No:");
        int Num1 = sc.nextInt(); // i taken no form the user
        System.out.print("Enter a second No: ");
        int Num2 = sc.nextInt(); // i taken no form the user
        System.out.print("Enter a Third No: ");
        int Num3 = sc.nextInt(); // i taken no form the user

        System.out.println(" This is your Intput No: " + Num1 + " " + Num2 + " " + Num3);

        int Mini = Num1 < Num2 ? Num1 : Num2; // This is logic
        Mini = Mini < Num3 ? Mini: Num3;

        System.out.println("This is your Minimum No: " + Mini);
        sc.close();

    }
}
