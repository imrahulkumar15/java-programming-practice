
// Check Leap Year: Take a year as input and determine whether it is a Leap Year using relational, arithmetic, and logical operators. 
import java.util.Scanner;

public class Q25_Check_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the Year: ");
        int Year = sc.nextInt();

        String Result = Year % 4 == 0?"Leap Year.": "Not Leap Year.";
        System.out.println(Year + " is " + Result);
        sc.close();
    }
}
