
// Write a program that accepts a person's age and checks whether they meet the minimum age of 18 for this exercise. Display whether they are eligible to apply for a driving licence.

import java.util.Scanner;

public class Q14_Driving_Licence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String str = sc.nextLine();
        System.out.print("Enter your age: ");
        int a = sc.nextInt();
        if (a >=18) {
            System.out.println(str + " is eligible for Driving Licence.");
        }
        else
            System.out.println(str + " is not eligible for Driving Licence.");
        sc.close();
    }
}
