
// Write a program that accepts three side lengths and checks whether they can form a 
// valid triangle. A triangle is valid only if all sides are positive and the sum of any two
//  sides is greater than the third side.

import java.util.Scanner;

public class Q23_ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first side Value: ");
        double A = sc.nextDouble();
        System.out.print("Enter a second side Valu: ");
        double B = sc.nextDouble();
        System.out.print("Enter thrid side Value: ");
        double C = sc.nextDouble();

        if (A + B > C) {
            System.out.println("Invalid Triangle:");
        }else
            if (A + C > B) {
                System.out.println("valid Triangle:");
            }else
                if (B + C > A) {
                    System.out.println("valid Triange:");
                }else
                    System.out.println("Invalid Triangle:");
                    sc.close();
    }
    
}
