
// Input a character and check whether it is a vowel or consonant.

import java.util.Scanner;

public class Q8_Check_Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character value: ");
        char ch = sc.next().charAt(0);

        String str = ch =='a'? "Vowel": ch=='e'?"Vowel": ch=='i'?"Vowel": ch=='o'?"Vowel": ch=='u'?"vowel":"Consonant";
        str = ch =='A'? "Vowel": ch=='E'?"Vowel": ch=='I'?"Vowel": ch=='O'?"Vowel": ch=='U'?"vowel":"Consonant";
        System.out.println(ch + " is  " + str);
        sc.close();
    }
}
