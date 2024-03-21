package assignment1wk2;
/* Travis VanArsdale 
 * 8/30/2021
 * CMS 141 6383 Introductory Programing(2218)
 */

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		// Variables
		
		int stdnID;
		double classGpa; // Current Class GPA
		double classCredits; // current class credits
		double oldGpa; // previous GPA
		double oldCredits; // previous Credits
		double newGpa; // post calculation GPA
		
		//Prompting user data
		System.out.println("Enter student ID: ");
		stdnID = input.nextInt();
		
		System.out.println("Enter current class grade in GPA format (e.g 3.5):");
		classGpa = input.nextDouble();
		
		System.out.println("Enter current class number of credits:");
		classCredits = input.nextDouble();
		
		System.out.println("Enter overall GPA:");
		oldGpa = input.nextDouble();
		
		System.out.println("Enter overall number of credits:");
		oldCredits = input.nextDouble();
		
		// calculating new GPA
		newGpa = ((classGpa * classCredits)+ (oldGpa * oldCredits)) /(classCredits + oldCredits) ;
		
		// Displaying data 
		System.out.println("Student ID: " + stdnID);
		System.out.println("Current class GPA: " + classGpa);
		System.out.println("Current class credits: " + classCredits);
		System.out.println("Overall GPA: " +oldGpa);
		System.out.println("Overall credits: " + oldCredits);
		
		System.out.println("NEW GPA: " +newGpa);
		// closing scanner
		input.close();
	}

}
