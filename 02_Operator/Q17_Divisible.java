import java.util.Scanner;

public class Q17_Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer value: ");
        int a = sc.nextInt();

        String Result = (a%5==0?"Divisible by 5: ": a%11==0?"Divisible by 11: ": "No Divisible");
        System.out.println(Result);
        sc.close();
    }
}
