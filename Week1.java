import java.util.*;

public class Week1 {
	

	public static void main(String[] args) {
        //To store the variable for name
        String name = "Abideen";

        //To store the variable for weight
        double weight = 56;

        //To store the variable for height
        double height = 113;

        //Below is the formula that save the BMI and the formula for the BMI
        double bmi = weight / height / height;

        // Printing name, height, weight, and BMI
        System.out.println("My name is " +name);
        System.out.println("My height is "+ height +" meters");
        System.out.println("My weight is "+weight+" kilograms");
        System.out.println("My BMI is "+bmi);

        System.out.println("                                              ");
        System.out.println("                                              ");
       
        //Question two
        //Defining the variables for the width and height of the the rectangle.
        int lenght = 4;
        int width = 3;
        //Storing the value for the formula of the perimeter and length of the rectangle.
        int perimeter = 2*lenght+2*width;
        int l = perimeter/2-width;
        System.out.println("The Perimeter of the rectangle is : " +perimeter+ " cm.");
        System.out.println("The length of the rectangle is : " +l+ " cm." );

    }
}