
// Convert an int to a String
import java.util.Scanner;

public class Q4_Integer_Covert_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter an Integer value: ");
        int num1 = sc.nextInt(); // taken input from the user

        String str = String.valueOf(num1); // logic, convert integer into string 
                                           // logic, Integer.toString(data);

        System.out.println("Integer value: " +num1);
        System.out.println("String value: " +str);
        sc.close();
    }
}
