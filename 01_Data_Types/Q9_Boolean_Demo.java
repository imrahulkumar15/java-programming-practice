
// Take a Boolean input and print "YES" if true, "NO" if false.

import java.util.Scanner;

public class Q9_Boolean_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a boolean value: ture and flase ");
        boolean str = sc.nextBoolean();
        
        String Result = str?"Yes": "No"; // i used conditional operator to perform this task 
        System.out.println(Result);
        sc.close();

    }
}
