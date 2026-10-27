
// Write a program that accepts a single English alphabet character and determines whether it is a vowel or consonant using conditional statements. Assume the input is a letter.

import java.util.Scanner;

public class Q8_Vowel_and_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character vlaue: ");
        char ch = sc.nextLine().charAt(0);

        switch (ch) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':System.out.println(ch + " is Vowel."); break;
            default:
                System.out.println(ch + " is Consonant");
                break;  
        }
        sc.close();
    }
}
