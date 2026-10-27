
// Write a program that accepts a student's marks out of 100 and determines whether the student passes or fails. Consider 35 as the minimum passing mark.

import java.util.Scanner;

public class Q11_Pass_and_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Marks: ");
        int a = sc.nextInt();
        
        if (a>=35 && a<=100) {
            System.out.println("Your Marks out of 100:" + a + " You are pass.");
        }else{
            System.out.println("Your Marks out of 100: " + a +" Your are fail ");
        }
        sc.close();
    }
}
