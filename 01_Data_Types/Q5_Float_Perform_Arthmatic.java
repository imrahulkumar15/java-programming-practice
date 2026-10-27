
// Take two float numbers and print their sum, difference, product, and division.

import java.util.Scanner;

public class Q5_Float_Perform_Arthmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kinldy enter float value: ");
        float num1 = sc.nextFloat(); // first num1 taken from the user
        System.out.print("Enter a second float value: ");
        float num2 = sc.nextFloat(); // second num2 taken from the user

         float sum = num1+num2; // perform sum logic
         float sub = num1 -num2; //perform sub logic
         float multi = num1*num2; //perform multi logic 
         float division = num1/num2; // perform divison

         System.out.println("Ths is your sum: " +sum);
         System.out.println("This is your sub: " +sub);
         System.out.println("This is your multi: "+multi);
         System.out.println("This is your divison: "+division);

         sc.close();




    }
}
