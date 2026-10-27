
// Take marks of 5 subjects, calculate total, average, and percentage

import java.util.Scanner;

public class Q9_Calculate_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Hindi Marks:");
        int a = sc.nextInt();
        System.out.print("Enter a English Marks: ");
        int b = sc.nextInt();
        System.out.print("Enter a Maths Marks: ");
        int c = sc.nextInt();
        System.out.print("Ente a Physic Marks: ");
        int d = sc.nextInt();

        int Sum = a+b+c+d;
        int Average = Sum/4;
        double Percentage = (Sum/400.0)*100;
        System.out.println("This is you Total Marks: " +Sum);
        System.out.println("This is your Average Marks: " + Average);
        System.out.println("This is your Percentage: " + Percentage); // percentage time you have to take a double value or float 
        sc.close();
    }
}
