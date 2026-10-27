
// Write a program that accepts a number from 1 to 7 and uses a switch statement to display the corresponding day, where 1 represents Monday and 7 represents Sunday. Display an error message for invalid numbers

import java.util.Scanner;

public class Q18_Display_The_Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a days: ");
        int Days = sc.nextInt();

        switch (Days) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thirsday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        sc.close();
    }
}
