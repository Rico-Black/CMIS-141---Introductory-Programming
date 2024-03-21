package assignment1wk2;


/* Travis VanArsdale 
 * 9/20/2021
 * CMS 141 6383 Introductory Programing(2218)
 *  This program will ask a user for a number of rows and then will create a pattern
 *  using the input number of rows 
 */

import java.util.Scanner;
public class Asignenment4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Var Declarations
		int numrow; // number of input rows
		int shape;// Shape type to be created
		
		
	do {
		System.out.println("This program will take a number and then make a pattern using that number.");
		System.out.println("Please enter a positive integer.");
		
		numrow = input.nextInt();
		if(numrow <=0) // ensuring proper entry 
			System.out.println("That is not a valid entry. Please enter a positive integer.");
		}while (numrow <=0);
		
	
	do {// processes weather a triangle or diamond is desired
		System.out.println("Would you like to print a triangle or a diamond?");
		System.out.println("Enter '1' for triangle or '2' for diamond.");
		
		shape = input.nextInt();
		
		if ((shape != 1) && ( shape != 2)) // limiting data to 1 or 2
			System.out.println("That is not a valid entry. Please enter either 1 or 2");
		
		}while ((shape != 1) && ( shape != 2));
		
		switch(shape) {
		
		
		case 1: // Makes Triangle
			// loop for top right quarter
			for (int i = 0; i <= numrow; i++) { // loop for top right half pyramid rows
				
				for (int j = 1; j <= i; j++ ) { // loop for top right half pyramid columns 
					System.out.print("# ");
				}
				System.out.println(" ");
			}
		break;
		
		case 2: // makes Diamond
		// loop for top of pyramid
	for(int i =1; i < numrow; i++) { 
		for (int j =i; j <= numrow; j++) { // loop for 'invisible' bottom right of diamond
			System.out.print("  ");
		}
		for (int j = 1; j < i; j++) { // loop for top left side of diamond
			System.out.print("# ");
		}
		for (int k = 1; k <= i; k++) { // loop for top right side of diamond
			System.out.print("# ");
		}
		
		System.out.println("");
	}  
		
		//loop for bottom of pyramid
	for(int i = 1; i <= numrow; i++ ) {
		
		for(int j = 1; j <= i; j++) { //loop for 'invisible' top right diamond
			System.out.print("  ");
		}
		for (int j =i; j < numrow; j++) { // loop for bottom left of diamond
			System.out.print("# ");
		}
		for (int j = i; j <= numrow; j++) {// loop for bottom right of diamond
			System.out.print("# ");
		}
		System.out.println("");
	}
	
		break;
	
	
}

}
}