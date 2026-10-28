// Write a program that accepts a student's marks percentage and annual family income. 
// Award a scholarship if the percentage is at least 85 and the 
// family income is no more than ₹3,00,000. Otherwise, display that the student is not eligible.

import java.util.Scanner;

public class Q25_CheckScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your percentage Marks: ");
        int Marks = sc.nextInt();

        System.out.print("Enter your Family Manual Income: ");
        int Income = sc.nextInt();

        if (Marks >= 85 && Income<=300000) {
            System.out.println("your are Eligible for Scholarship");
        }else
        {
            System.out.println("No Eligible for scholarship");
        }
        sc.close();
    }
}
