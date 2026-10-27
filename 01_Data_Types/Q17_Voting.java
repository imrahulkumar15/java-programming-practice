
//Take age as input and check whether the person is eligible to vote. If age is 18 or above, print "Eligible"; otherwise, print "Not Eligible". Use relational and ternary operators. 
import java.util.Scanner;

public class Q17_Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String ch = sc.nextLine(); // i taken name from the user

        System.out.print("Enter your Age: ");
        int Num1 = sc.nextInt(); // i taken age form the user

        String str = (Num1 >=18)?"Eligible for vote":"No Eligible For Vote"; // condition i used
        System.out.println(ch + " Age is: " + Num1 + " " +str);
        sc.close();
    }
}
