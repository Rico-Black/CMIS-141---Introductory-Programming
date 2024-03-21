package assignment1wk2;

/* Travis VanArsdale 
 * 9/4/2021
 * CMS 141 6383 Introductory Programing(2218)
 * This program will read in 2 numbers from the user and one operation (+ , - etc)
 * It will then apply the operation to the 2 numbers 
 */

import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		// Variables
		int num1;// stores int val of 1. number
		int num2; // stores int val of 2. number
		double output; // stores output value
		String opr; // stores operator
		char temp1; // stores char val of first number
		char temp2;// stores char val of second number
		
		
		// Prompting user input
		System.out.println("This program will take 2 numbers, one operation (division subtraction etc..) and will return the result");
		System.out.println("Please enter two integers seperated by a space:");
	
		// collects the input characters.
		temp1 = input.next().charAt(0); 
		temp2 = input.next().charAt(0);
		
		// converts the characters into type int.
		num1 = Character.getNumericValue(temp1);
		num2= Character.getNumericValue(temp2);
		
		System.out.println("Please enter an operation symbol(+,-,/, or *):");
		opr = input.next(); // collects the operator as a string.
	
		//Evaluations and switch statements
		switch(opr) {
			
		case "+" : output = num1 + num2; // handles addition
			System.out.println("Evaluation: " + num1+ " + " + num2 +" = " +output );
			break;
			
		case "-" : output = num1 -num2; // handles subtraction
			System.out.println("Evaluation: " + num1+ " -  " + num2 +" = " +output );
			break;
			
		case "/" : output = num1 / num2; // handles division
			System.out.println("Evaluation: " + num1+ " / " + num2 +" = " +output );
			break;
			
		case "*" : output = num1 * num2; // handles multiplication
			System.out.println("Evaluation: " + num1+ " * " + num2 +" = " +output );
			break;
		
		default : System.out.println("Not Valid Operation Symbol"); // handles invalid cases
		}
	}
}
