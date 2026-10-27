
// Convert a given number of days into years, weeks, and days.

import java.util.Scanner;

public class Q7_Find_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a days: ");
        int Days = sc.nextInt();
         
        int Year = Days / 365;
        System.out.println(" Year is: " + Year );

        int RemeningMonth = Days % 365; // Remening days
        int Month = RemeningMonth / 7;
        System.out.println(" Weeks is: " + Month);
        Month = RemeningMonth % 7;

        System.out.println("Days is: " + Month);
         sc.close();
    }
}
