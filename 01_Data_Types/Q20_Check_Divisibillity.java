// Check Divisibility: Take two integers as input and check whether the first number is completely divisible by the second number using the remainder (%) operator. 

import java.util.Scanner;

public class Q20_Check_Divisibillity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first No: ");
        int Num1 = sc.nextInt();
        System.out.println("Enter a second No: ");
        int Num2 = sc.nextInt();

        String Divisibillity = Num1 % Num2==0?" Divisibillity":"No Divisibillity";
        System.out.println(Divisibillity);
        sc.close();
    }
}
