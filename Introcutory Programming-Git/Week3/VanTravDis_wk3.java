package discuswk3;

/* Travis VanArsdale 
 * 8/30/2021
 * CMS 141 6383 Introductory Programing(2218)
 * This program ask the user about the weather and tells them if they need to salt their driveway.
 */

import java.util.Scanner;

public class VanTravDis_wk3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		//Variables
		int temp;
		boolean weather;
		
		// prompting input
		System.out.println("Hello This program will ask you about the weather and tell you if you should salt your driveway");
		System.out.println("Please enter the temperature (in degrees F) as a whole number.");
		temp = input.nextInt();
		
		System.out.println("Next is percipitation expected enter 'true' for yes or 'false' for no");
		weather = input.nextBoolean();
		
		// If statements
		if ((temp <= 32) && (weather == true ) )   // case with low temp and rain
			System.out.println("There is a chance of snow. You should salt your driveway."); // case where temp is low and rain is expected
		
		else if(( temp) <= 32 && (weather == false)) // case with low temp but no rain
			System.out.println("Its not going to snow so you don't need to salt your driveway."); // case where temp is low but no rain expected
		
		else if ((temp > 32) && (weather == false)) // case with high temp no rain
			System.out.println("It is too warm and there is no expected percipitation. No salt needed.");
			
		else  // case with high temp and rain
			System.out.println("It is not cold enough to salt the driveway. You should pack an umbrella though.");
		//closing scanner
		input.close();	
	}
	}

		
	
	
	
