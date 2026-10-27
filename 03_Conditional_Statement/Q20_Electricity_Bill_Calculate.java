
//Write a program that accepts electricity units consumed and calculates the bill using 
// these simplified slabs: the first 100 units cost ₹2 per unit, the next 100 cost ₹3 per unit, 
// and all units above 200 cost ₹5 per unit. Use an if-else-if structure and charge progressively by slab.

import java.util.Scanner;

public class Q20_Electricity_Bill_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity Unit: ");
        int a = sc.nextInt();
        int bills;

        if (a<=100) {
            bills = a*2;
        }else
            if (a<=200) {
                bills = (100*2) + ((a-100)*3);
            }else
                {
                    bills =(100*2) + (100*3) - ((a-200)*5);
                    System.out.println("Electricity bills: " + bills); 
                }
                    
    }
    
}
