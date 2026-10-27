
// Input two numbers and check if they are equal or not

import java.util.Scanner;

public class Q12_Check_No_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first No: ");
        int a = sc.nextInt();
        System.out.print("Enter a second No: ");
        int b = sc.nextInt();

        String Result = a==b?"This is Equal":"This is not Equal";
        System.out.println(a + "==" + b + " " + Result);
        sc.close();
    }
}
