import java.util.Scanner;

public class Q24_Number_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Integer value: ");
        int a = sc.nextInt();

        String Result = a > 0 ? "Is Positive NUmber":a<0?"Is Negavtive Number": a==0?"Is Zero Number":" Invaild Number";
       
        System.out.println(a + " " + Result);
        sc.close();
    }
}
