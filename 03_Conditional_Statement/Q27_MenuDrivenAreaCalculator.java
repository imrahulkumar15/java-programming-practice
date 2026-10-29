// Write a program that displays a menu to calculate the area of a circle, rectangle, 
// or square. Accept the user's choice and required dimensions, then use a switch statement to 
// calculate and display the area. Reject invalid choices and non-positive dimensions.

import java.util.Scanner;

public class Q27_MenuDrivenAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");

        System.out.println("Enter a radious value: ");
        int Radious = sc.nextInt();
        float PI= 3.14f;

        int i =3;
        switch (i) {
            case 1:
                float Circle = 2*PI*Radious;
                System.out.println("Area of Circle is: " + Circle);
                float Circumference = 2*PI*Radious;
                System.out.println("Circumference is: " +Circumference);
                break;
            case 2:

            default:
                break;
        }
    }
}
