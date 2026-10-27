// Write a program that accepts marks out of 100 and assigns a grade using an else-if ladder. Use these ranges: 90–100 = A, 75–89 = B, 60–74 = C, 35–59 = D, and below 35 = F. Reject marks outside 0–100.

import java.util.Scanner;

public class Q16_Pass_or_Fails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Marks out of 100: ");
        int Marks = sc.nextInt();
        if (Marks>=90 && Marks<=100) {
            System.out.println(Marks +":Grade A");
        }else
            if (Marks >=75 && Marks <= 89) {
                System.out.println(Marks + ":Grade B");
            }else
                if (Marks >=60 && Marks<=74) {
                    System.out.println(Marks +":Grade C");
                }else
                    if (Marks>=35&&Marks<=59) {
                        System.out.println(Marks +":Grade D");
                    }else   
                        if (Marks<35) {
                            System.out.println(Marks + ":Grade D");
                        }else
                            sc.close();
    }
}
