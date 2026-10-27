
// Take an integer as input and determine whether the number is Even or Odd using the remainder (%) operator.
import java.util.Scanner;

public class Q14_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer value: ");
        int Num1 = sc.nextInt(); // take Input from the user

        String Result = (Num1%2==0)?"Even":"Odd"; // i used conditonal operator 
        System.out.println(Num1 + " is: " + Result);
        sc.close();
    }
}
