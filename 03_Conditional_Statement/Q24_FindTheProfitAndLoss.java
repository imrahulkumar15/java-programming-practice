
// Write a program that accepts the cost price and selling price of an item. Determine 
// whether the seller has made a profit, incurred a loss, or broken even, and calculate the 
// corresponding amount.
import java.util.Scanner;

public class Q24_FindTheProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ente a cost Price: ");
        int a = sc.nextInt();
        System.out.print("Enter a selling price: ");
        int b = sc.nextInt();

        int Result = b - a;

        if (Result > 0) {
            System.out.println("profit: " + Result);
        }else
            if (Result < 0) {
                System.out.println("Loss: " + Result);
            }else
                {
                    System.out.println("NO Profit or No Loss");
                }
                sc.close();
    }
}
