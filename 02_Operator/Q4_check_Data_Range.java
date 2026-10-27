
// Check Data Type Range: Take a number as input and check whether it fits in byte, short, int, and long using relational and logical operators. 
import java.util.Scanner;

public class Q4_check_Data_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a integer value: ");
        int Num1 = sc.nextInt();

        String Result = Num1 >= Byte.MIN_VALUE && Num1 <= Byte.MAX_VALUE?"Byte Range": Num1 >= Short.MIN_VALUE && Num1 <= Short.MAX_VALUE?"Short Range":Num1 >= Integer.MIN_VALUE && Num1 <= Integer.MAX_VALUE?"Integer Range":"";
        System.out.println(Result);
        sc.close();
    }
}
