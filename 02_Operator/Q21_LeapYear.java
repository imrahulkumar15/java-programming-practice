
// Write a program that accepts a year and determines whether it is a leap year. Apply the standard
//  rule: a year divisible by 400 is a leap year; otherwise, a year divisible by 100 is not; all other 
// years divisible by 4 are leap years.

import java.util.Scanner;

public class Q21_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int Year = sc.nextInt();

       if (Year % 400 ==0) {
        System.out.println("Leap Year: " + Year);
       }else
        if (Year%4==0) {
            System.out.println("Leap Year: " + Year);
        }else
            if (Year % 100 == 0 ) {
                System.out.println("Not Leap Year: " + Year);
            }else
                System.out.println("Not Leap Year: " + Year);
            sc.close();
    }
}
