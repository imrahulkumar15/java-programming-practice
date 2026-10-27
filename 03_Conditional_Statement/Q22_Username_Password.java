
// Write a program that accepts a username and password and checks them against predefined credentials. 
// Display a login success message only when both values match; otherwise, display an invalid credentials 
// message. For this exercise, use simple hardcoded sample credentials.

import java.util.Scanner;

public class Q22_Username_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Username: ");
        String str = sc.nextLine();
        System.out.print("Enter a Password: ");
        String str1 = sc.nextLine();
        System.out.println("Saved your User and Password");

        System.out.println("Welcome to Login page: ");
        System.out.println("Enter a Username: ");
        String str2 = sc.nextLine();
        System.out.println("Enter a Password: ");
        String str3 = sc.nextLine();

        if (str.equals(str2)&& str1.equals(str3)) {
            System.out.println("Login Successful");
        }else
            System.out.println("Invalid User and password");
            sc.close();
    }
}
