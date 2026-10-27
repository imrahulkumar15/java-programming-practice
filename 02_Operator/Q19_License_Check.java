// Input age and check eligibility for driving license (>=18).

import java.util.Scanner;

public class Q19_License_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a your Name: ");
        String str = sc.nextLine();

        System.out.print("Enter a age: ");
        int a = sc.nextInt();

        String Result = a>=18?"Eligibile For License":"No Eligibile For License:";
        System.out.println(str + " " + Result);
        sc.close();
    }
}
