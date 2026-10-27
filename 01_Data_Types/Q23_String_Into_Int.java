import java.util.Scanner;

public class Q23_String_Into_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String value: ");
        String str = sc.nextLine();

        System.out.println("This is your String Value: " + str);

        int a = Integer.parseInt(str);

        System.out.println("This is your Integer value: " + a);
        sc.close();
    }
}
