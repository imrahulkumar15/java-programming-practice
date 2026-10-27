import java.util.Scanner;

public class Q10_Find_Max_NO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second num: ");
        int num2 = sc.nextInt();

        int str =(num1 > num2)?num1:num2;
        System.out.println("Max num is: " + str);
        sc.close();
    }
}
