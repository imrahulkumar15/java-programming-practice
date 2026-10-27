
// Take a double input for radius and print the area and circumference of a circle.
import java.util.Scanner;

public class Q8_Area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kindly enter the radiuos value: ");
        float r = sc.nextFloat(); // taken input form the user.
        float PI = 3.14f; // this is PI value 
        float Area = PI*r*r; // Area of circule formula
        System.out.println("Area of circlue is: " + Area);
        float circumference = 2*PI*r; //circumference of area formula 
        System.out.println("circumference of Area: " + circumference);
        sc.close();
    }
}
