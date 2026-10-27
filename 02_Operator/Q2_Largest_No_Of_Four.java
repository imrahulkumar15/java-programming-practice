
// Largest of Four Numbers: Take four integers as input and find the largest number using operators or the ternary operator without using if-else. 
import java.util.Scanner;

public class Q2_Largest_No_Of_Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter a first No: ");
    int a = sc.nextInt();
    System.out.print("Enter a second No: ");
    int b = sc.nextInt();
    System.out.print("Enter a Third No: ");
    int c = sc.nextInt();
    System.out.print("Enter a Fourth No: ");
    int d = sc.nextInt();

    int Max = a>b ?a:b;
    Max = Max > c ?Max:c;
    Max = Max > d? Max : d;
    System.out.println(" Max No. is the: " + Max);
    sc.close();
    }
}
