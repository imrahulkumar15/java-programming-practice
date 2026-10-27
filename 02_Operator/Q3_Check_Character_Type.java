
// Check Character Type: Take one character as input and determine whether it is an Uppercase letter, Lowercase letter, or Digit using relational, logical, and ternary operators. 
import java.util.Scanner;

public class Q3_Check_Character_Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Etner a charater value: ");
        char ch = sc.next().charAt(0);

        String str = ch >= 'A' && ch <= 'Z'? "is a Uppercase": ch >= 'a'? "is Lowercase":"is a digit";
        System.out.println(ch + " " + str);
        sc.close();
                
    }
}
