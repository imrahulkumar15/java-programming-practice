
// Write a Java program to calculate the sum of all elements present in an integer array.
//  Input: 5 followed by 10 20 30 40 50. Expected Output: Sum = 150.

import java.util.Scanner;

public class Q03_SumOfArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]= new int[5];
        System.out.println("Enter a 5 number:");

        int i;
        int sum=0;
        for(i=0; i<arr.length;i++)
            {
            arr[i]=sc.nextInt();
        }
        System.out.println("This is your elemet No: ");
        for(i=0; i<arr.length;i++){
            sum =sum + arr[i];
            System.out.println(arr[i] + " ");
        }
        System.out.println("This is your Sum of Elemetns: " +sum);
sc.close();
    }
}
