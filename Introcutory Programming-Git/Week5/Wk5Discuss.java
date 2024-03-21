package discuswk5;

/* Program shows the multiples of a number 
 * until it multiplies the original number by itself
*/

import java.util.Scanner;

public class Wk5Discuss {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int cnt = input.nextInt(); // stores input number
	
			
		// for loop to print out multiples
		for (int i = 1; i <= cnt; i++ ) {
			
			System.out.println(cnt *i);
		}
		
input.close();
}
	
}
