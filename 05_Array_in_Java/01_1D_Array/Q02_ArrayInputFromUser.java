import java.util.Scanner;

public class Q02_ArrayInputFromUser {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arr[] = new int[5];
     System.out.print("Enter a 5 Number: ");
     
     int i;

     for(i=0; i<arr.length;i++){
        arr[i]=sc.nextInt();
     } 
      System.out.println("This is element of No: ");
     for(i=0; i<arr.length;i++ ){
        System.out.println(arr[i]);
     }
     sc.close();
    
   }
}
