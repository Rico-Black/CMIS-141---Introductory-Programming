package assignment1wk2;
/*Travis VanArsdale 
 * 10/2/2021
 * CMS 141 6383 Introductory Programing(2218)
 * This program will prompt a user for a number of students
 * It will then ask the user to enter the names and grades of those students
 * It will then print the names and grades of all the students
 * It will then return which student had the highest and the lowest grade
 */
import java.util.*;

public class Assignement6 {

	public static int maxArray(double array[]) { // finds the index of the max array value
		
		double max = array[0];// stores max value
		int locMax = 0; // stores location of max value
		
		 for( int i =0; i< array.length; i++) { // loop to process through array.
			 
			 if (array[i] > max) { // sets max to next largest value if next value is larger.
				 max = array[i];
				 locMax = i; // sets index location of largest found number
			 }
		 }
		
		return locMax; // returns max value
	}
	
	public static int minArray(double array[]) { // finds the index of the min array value
		
		double min = array[0]; // stores min value
		int locMin = 0; // stores the location of min value
				for (int i =0; i <array.length; i++) {// loop to process array
					
					if (array[i] < min) { // sets min to next lowest number.
						min = array[i];
						locMin = i; // sets index location of min value 
					}
				}
		return locMin;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Var decs
		int numStu; // stores the number of students
		double grade; // stores grades of students
		String fsName; // Stores first name
		String lsName; // stores last name
		int minInd; // index of min grade value
		int maxInd; // index of max grade value
		
		
		System.out.println("Hello. This program will allow you to enter the names and grades of students.");
		System.out.println("It will then tell you which student did the best and which did worst");
		System.out.println("How many Students are there?");
		
		numStu = input.nextInt();
		
		
		// Declaring the arrays for names and grades
		String[] nameArray = new String[numStu]; // array for names
		double[] gradeArray = new double[numStu]; // array for grades
		
		for (int a= 0; a <nameArray.length; a++) { // loop to input the student data
			
			System.out.println("Student " + (a+1) +":");
			System.out.println("Enter the student's first and last name.");
			fsName = input.next();// reads in first name.
			lsName= input.next();// reads in last name
			
			do {
			
			System.out.println("Enter students score (0-100).");
			grade = input.nextDouble();// reads in next double as grade.
			
			if (grade < 0 || grade > 100) { // checking that grade is within limits
				
				System.out.println("That is not a valid grade entry.");
			}
			
			nameArray[a] = (fsName +" " + lsName); // Sets student's name
			gradeArray[a]= grade; // Sets student's grade
			
			}while (grade <0 || grade >100);
		}
		
		
		for (int a =0; a<nameArray.length; a++) {// loop to display student data
			
			System.out.print(nameArray[a] +":");
			System.out.println("    " +gradeArray[a]);
		}
	
		// Calling Methods for min and max
		maxInd = maxArray(gradeArray);
		minInd = minArray(gradeArray);
		
		// Printing Highest grade
		System.out.println(nameArray[maxInd] + " has the highest score of " + gradeArray[maxInd]);
		System.out.println(nameArray[minInd] + " has the lowest score of " + gradeArray[minInd]);

		input.close();
	}
}