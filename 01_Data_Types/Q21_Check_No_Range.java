// Check Number Range: Take an integer as input and check whether the number is between 10 and 100, inclusive. Use relational and logical operators.

import java.util.Scanner;

public class Q21_Check_No_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Integer No: ");
        int Num1 = sc.nextInt();
        
        String Result = Num1 > 10 && Num1 < 100? "Range value":" is not Range value";
        System.out.println(Num1 + " " +Result);
        sc.close();
    }
}
