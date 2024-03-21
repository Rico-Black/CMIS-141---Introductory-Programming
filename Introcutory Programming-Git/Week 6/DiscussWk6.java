package discussWk6;
import java.util.Scanner;
/* This program will take calculate the volume of a prism. It will take 3 doubles and return 1
 */
public class DiscussWk6 {
	
	// method to calculate volume
	public static double cubeArea(double a, double b, double c) {
		return (a *b *c);}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Variables
		double num1;
		double num2;
		double num3;
		double answer;
		
		//Prompting user input
		System.out.println("This program will calculate the volume of a rectangular prism.");
		System.out.println("Please enter the three dimensions of the cube separated by a space.");
		
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3= input.nextDouble();
		
		//calling method
		 answer = cubeArea(num1, num2, num3);
		 System.out.println("The volume of a rectangular prism with the dimentions: " +num1 + ", " +num2+ ", " +num3 + ", is :" + answer +".");
		 
	}

}
