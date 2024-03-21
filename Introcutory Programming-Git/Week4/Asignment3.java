package assignment1wk2;

/* Travis VanArsdale 
 * 9/12/2021
 * CMS 141 6383 Introductory Programing(2218)
 * This program will allow a user to caclulate a student's final course grade
 * It will then allow a user to calculate another student's final grade or exit out
 *  
 */

import java.util.Scanner;
public class Asignment3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		//Var declaration
		String stdFstName; //stores  student's first name 
		String stdSndName; // Stores second name
		Double as1;// stores first assignment grade 
		Double as2;// stores second assignment grade
		Double exam; // stores exam grade
		Double part; // participation grade
		String run; // controls if program runs/runs again
		Double fin; // stores final grade
		
		
		// Prompting user inputs
		System.out.println("Hello user. This program will allow you to calculate a final grade for a class.");
		System.out.println("Would you like to calculate a grade? Enter 'Yes' or 'No'. ");
		// setting the run
		run = input.next();
		
		//while loop
		while(run.equalsIgnoreCase("Yes")) {
			
			// collecting name
			System.out.println("Enter Student's first and last name");
			stdFstName = input.next();
			stdSndName = input.next();
			
			//collecting numeric data
			System.out.println("Enter Student's grades separated by a space: A1 A2 Ex P");
			as1 = input.nextDouble();
			as2 = input.nextDouble();
			exam = input.nextDouble();
			part = input.nextDouble();
			
			//calculating grade
			fin = (as1 *.25) + (as2 *.25)+ (exam *.4)+ (part *.1) ;
			
			//output data
			System.out.println("Student's Name: " +stdFstName + " " +stdSndName);
			System.out.println("Student's Grades: Assignment 1 =" + as1 +" Asignment 2=" +as2+ " Exam=" + exam + " Participation =" +part);
			System.out.println("Final course grade=" + fin);
			
			//restarting/exiting loop
			System.out.println("Do you want to enter another student's data? Yes or No");
			run = input.next();
		}
		System.out.println("Thank you for using the grade calculation program.");
		
		
	}

}
