import java.util.Scanner;

public class Q26_CheckAdmissionEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter a Mathematic Marks: ");
        int a = sc.nextInt();
        System.out.print("Enter a Physics Marks: ");
        int b = sc.nextInt();
        System.out.print("Enter a Chemistry Marks: ");
        int c = sc.nextInt();

        int TotalMarks= a+b+c;
        System.out.println("Total Marks: " +TotalMarks);

        if (a>=60 && b>=50 && c>=40 && TotalMarks>=180) {
            System.out.println("Eligibility for Admission");
        }else
        {
            System.out.println("Not Eligible for Admission");
        }
        sc.close();
    }
}
