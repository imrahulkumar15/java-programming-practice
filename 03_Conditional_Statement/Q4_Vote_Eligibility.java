
// Write a program that accepts a person's age and determines whether the person is eligible to vote. Consider 18 years as the minimum voting age for this exercise.
import java.util.Scanner;

public class Q4_Vote_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String str = sc.nextLine();
        System.out.print("Enter a your age: ");
        int age = sc.nextInt();

        if (age>18) {
            System.out.println(str + " is eligibile for vote. ");
        }
        sc.close();
    }
}
