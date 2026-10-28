
// Write a program that accepts one character and uses conditional statements to identify
//  whether it is an uppercase letter, lowercase letter, digit, or special character.
import java.util.Scanner;

public class Q23_Check_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + ":is upper case. ");
        }else
            if (Character.isLowerCase(ch)) {
                System.out.println("This is your Lowercase: " +ch);
            }else
                if (Character.isDigit(ch)) {
                    System.out.println("This is your digit: " +ch);
                }else
                     {
                     System.out.println("This is your Special Character: " +ch);   
                    }
                    sc.close();
      } 
    }