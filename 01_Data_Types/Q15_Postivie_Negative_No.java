
// Take an integer as input and determine whether the number is Positive or Negative using relational operators. 
import java.util.Scanner;

public class Q15_Postivie_Negative_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer value: ");
        int Num1 = sc.nextInt(); // i taken input form the user

        String Restul = (Num1 > 0)?"Postivie": "Negative"; // i used logic 
        System.out.println(Num1 + " is: " +Restul );
        sc.close();



    }
}
