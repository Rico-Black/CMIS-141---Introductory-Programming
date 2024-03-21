package assignment1wk2;
import java.util.Scanner;

/* Travis VanArsdale 
 * 9/28/2021
 * CMS 141 6383 Introductory Programing(2218)
 *  This program prompts calculates a user's BMI using their weight in kilograms and their height in meters
 *  If the user does not know this then the program can also convert their weight in pounds to kg
 *  and convert their height in inches to meters.
 */

public class Assignment5 {

	// Converts pounds to kilograms
	public static double poundConvert(double a) {
		return (a * .45);
	}
	// Converts inches to Meters
	public static double inchConvert(double a) {
		return ((a *2.54)/100);
	}
	// Method to calculate BMI
	public static void bmiCal(double kg, double m) {
		double cm = m*100;
		double result = ((kg/cm/cm) *10000);
		
		if (result < 18.5) {
			 System.out.println("Underweight");
		}
		else if ( 18.5 < result && result < 24.99 ) {
			System.out.println("Normal");
			}
		
		else if	(result > 25 && result <29.99) {
			System.out.println("Overweight");
		}
		else if (result > 30) {
			System.out.println("Obese");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Var Declarations
		double num1;
		double num2;
		String run;
		int select;
		double answer;
		
		//Starting prompting
		System.out.println("This program can be used to calculate BMI, convert inches to meters, and convert pounds to kilograms.");
		System.out.println("Enter 'Yes' to perform a calculation, or enter exit to exit the program");
		
		// run loop
		run = input.next();
		while (run.equalsIgnoreCase("Yes")) {
			
			// selecting calculation
			
			System.out.println("Which calculation would you like to perform?");
			System.out.println("Enter '1' for BMI calculation, '2' to convert Inches to Meters, or '3' to convert pounds to kilograms.");
		
			select = input.nextInt();
			
			switch(select) {
			
			case 1: // for BMI Calc 
				
				System.out.println("Enter your height in meters :");
				num1 = input.nextDouble();
				System.out.println("Enter your weight in kilograms :");
				num2 = input.nextDouble();
				// calling method
				bmiCal(num2, num1);
				break;
				
			case 2: // Converts inches to meters
				System.out.println("Please enter your height in inches.");
				num1 = input.nextDouble();
				// calling method
				
				answer =inchConvert(num1); 
				System.out.println("Your height in meters is :" + answer);
				break;
				
			case 3: // converts pounds to kilograms
				System.out.println("Please enter your weight in pounds.");
				num1 = input.nextDouble();
				
				answer = poundConvert(num1);
				System.out.println("Your weight in kilograms is :" +answer);
				break;
				
			default: System.out.println("Invalid Selection. Please enter a valid number.");
			}
			
			System.out.println("Would you still like to perform a calculation?");
			System.out.println("Enter 'Yes' if so");
			run = input.next();
		}
		System.out.println("Thank you for using the calculator");

		input.close();
	}
 
}
