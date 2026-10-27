
// Character Check: Take a character as input and determine whether it is an uppercase letter. Use relational operators. 
import java.util.Scanner;

public class Q22_Check_Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Charater value: ");
        char ch = sc.next().charAt(0);

    String Result = ch >= 'A' && ch <= 'Z'? "Uppercase": "Not Uppercase";
    System.out.println( Result +" is: " + ch);
    sc.close();
    }

}
