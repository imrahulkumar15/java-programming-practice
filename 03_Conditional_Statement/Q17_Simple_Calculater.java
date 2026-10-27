
// Write a program that accepts two numbers and an arithmetic operator (+, -, *, /, or %). Use a switch statement to perform the selected operation. Handle division or remainder by zero appropriately.

import java.util.Scanner;

public class Q17_Simple_Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first No: ");
        int a = sc.nextInt();
        System.out.print("Enter a secon No:");
        int b = sc.nextInt();
        
        System.out.println("Select the Airthmatic Operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Mode");

        System.out.println("Enter your Choice: ");
        int Result = sc.nextInt();
     
        switch (Result) {
            case 1: 
                int Add =a+b;
                System.out.println("Addition: " + Add);
                break;
            case 2: int Sub = a-b;
                System.out.println("Subtracion: " +Sub);
                break;
            case 3: int Mul = a*b;
                System.out.println("Multiply: " +Mul);
                break;
            case 4: int Division = a/b;
                System.out.println("Division: " +Division);
                break;
            case 5: int Mod = a%b;
                System.out.println("Mode: " +Mod);
                break;
        
            default:
                System.out.println("Error");
                break;
        }
        sc.close();

    }
}
