package assignment1wk2;

import java.util.*;
/*Travis VanArsdale 
 * 10/10/2021
 * CMS 141 6383 Introductory Programing(2218)
 * This program will allow a user to enter employees into a list
 * Add new employees to the list, retrieve specific employee's data
 * and return the employees within a certain range
 */



public class Assignment8 {
// Methods
	
	public static int loadData(int num,String names[],int ID[], double salary[]) { // method to add multiple employees (total number of employees in list, Name array,iD array ,annual salary array
		
		Scanner input = new Scanner(System.in);
		// method vars
		int inStaff; // number of eployee's to be entered.
		
		System.out.println("How many staff are you inputting?");
		inStaff = input.nextInt();
		
		for (int a= 0; a < inStaff; a++) { // loop to input the staff data
			
			
			num = newStaff(num,names,ID,salary);
			
		} 
		input.close();
		return num;// 
	}
	
	public static int newStaff(int n, String name[], int ID[], double salary[]) { // method to add a single new employee(current number of employees,name array, id array, annual Salary array
		
		Scanner input = new Scanner(System.in);
		// method vars
		int id; // stores staff id
		String fName; // stores staff first name
		String lName; // stores staff last name
		int numCheck; // checks input Id is five numbers
		
		System.out.println("Employee " +(n+1)+ ":"); 
		System.out.println("Please enter the employee's name.");// reads in name
		fName = input.next();// reads in first name.
		lName= input.next();// reads in last name
		
		name[n] = (fName +" " + lName); // Sets employee's name
		
		do { // Check to ensure ID is 5 numbers
		
		System.out.println("Please enter the employee's 5 digit ID.");
		
		id = input.nextInt(); // reads in ID
		numCheck = String.valueOf(id).length(); // setting numCheck to length of input string
		
		if (numCheck !=5) { // check that the id is 5 numbers long
			
			System.out.println("That is not a valid Employee ID. IDs must be 5 didgits.");
		}
		
		ID[n] = id; // sets employee ID
		} while (numCheck != 5);
		
		System.out.println("Please enter the employee's annual salary"); // inputs salary
		salary[n] = input.nextDouble();
		
		n ++; // increments n
		input.close();
		return n; // returns index location, to track num of employee's in array.
		
	}
	
	public static void displayAllStaff(int num,String name[], int ID[], double salary[]) { // method to display all employee data
		
		for (int a= 0; a < num; a++) { // loop to go through arrays
		
			System.out.println("Employee " +(a+1) +":" + name[a] + ", ID :" +ID[a]+ ", Annual Salary :" + salary[a]);	
		}
		
	}
	
	public static void displayStaff(int num,String name[], int ID[], double salary[]) { // method to return a single employee's data. Takes ID, returns all data on that employee
		
		Scanner input = new Scanner(System.in);
		//vars
		int searchID; // stores id user is looking for
		int numCheck; // stores length of input id to make sure it is 5
		boolean found =false; //stores if employee with input id was found
	
		do { // Check to ensure ID is 5 numbers
		System.out.println("Please enter the employee's 5 digit ID");
		
		searchID = input.nextInt();// reads input ID
		numCheck = String.valueOf(searchID).length(); // gets length of input int
		
		if (numCheck != 5)
			System.out.println("That is not a valid Employee ID. IDs must be 5 didgits.");
		}while (numCheck != 5);
		
		for (int a= 0; a < num; a++) { // loop to traverse array
			
			if (searchID == ID[a]) { // check for staff ID
				System.out.println("Employee " +(a+1) +":" + name[a] + ", ID :" +ID[a]+ ", Annual Salary :" + salary[a]);
				found = true;
			}
			else if ((a ==(num-1)) && (found == false)) { // check in case Id is not found
				
				System.out.println("No Employee was found with that ID");
			}
			input.close();
		}
	}
	
	public static void payRange(int num, String name[], int ID[], double salary[]) { // method to return all employee's data within a certain pay range
		
		Scanner input = new Scanner(System.in);
		//var decs
		double max;// stores upper range for salary search
		double min;// stores lower range for salary search
		boolean found =false; // stores if employees in range are found
		
		System.out.println("Please enter the maximum value for the search");
		max = input.nextDouble();
		System.out.println("Please enter the minimum value for the search");
		min = input.nextDouble();
		
		for (int a= 0; a < num; a++) { // loop to traverse array
			
			if ( ( salary[a]> min) && (salary[a] <max)) { // check looking for employees in range
				System.out.println("Employee " +(a+1) +":" + name[a] + ", ID :" +ID[a]+ ", Annual Salary :" + salary[a]);
			found = true;
			}
			else if ((a ==(num-1)) && (found == false)) { // check if no employees are found.
				System.out.println("No Employees were found in that salary range.");
			}
		}
		input.close();
	}
	
	public static void exitOut() { // Method to end program
		
		System.out.println("Thank you for using the program");
	}
	
	public static void main(String[] args) { 
 
		Scanner input = new Scanner(System.in);
		//Var decs
		int totalStaff =0;// stores the number of staff already in the system
		int run; // stores input number for menu
		
		// Array Decs
		String[] nameArray = new String[100]; // array for names
		double[] salArray = new double[100]; // array for salary
		int[] idArray = new int[100];// array to store staff Ids
		
		System.out.println("This program will let you enter the data of up to 100 eployees and perform actions with that data. The options are as follows");
		
		System.out.println("Enter '1' to enter multiple employee's data");
		System.out.println("Enter '2' to enter a single employee's data");
		System.out.println("Enter '3' to Display all employees data");
		System.out.println("Enter '4' to Display single employee's data");
		System.out.println("Enter '5' to retrieve all employees within an annual salary range");
		System.out.println("Enter '6' to exit the program");
		
		System.out.println("Please select an action");
		run = input.nextInt();
		
		do { // loop for menu
		
		switch(run) { // switch for selection
		
		case 1:	// Add multiple staff
			
			totalStaff = loadData(totalStaff,nameArray,idArray,salArray);
			break;
		
		case 2: // Add single Staff (total staff in, nameAr, IdAr, SalAr
			
			totalStaff = newStaff(totalStaff,nameArray,idArray,salArray);		
			break;
			
		case 3: // display all staff data
			
			 displayAllStaff(totalStaff,nameArray,idArray,salArray);
			 break;
			
		case 4:// display individual staff data
			
			displayStaff(totalStaff,nameArray,idArray,salArray);
			break;
		case 5: // return employees based on pay range.
			
			payRange(totalStaff,nameArray,idArray,salArray);
			break;
			
		case 6:// exit program
			exitOut();
			break;
			
			default: 
				System.out.println("Invalid input.");
		}
		if( run != 6) {
		System.out.println("");
		System.out.println("Enter '1' to enter multiple employee's data");
		System.out.println("Enter '2' to enter a single employee's data");
		System.out.println("Enter '3' to Display all employees data");
		System.out.println("Enter '4' to Display single employee's data");
		System.out.println("Enter '5' to retrieve all employees within a salary range");
		System.out.println("Enter '6' to exit the program");
		}
		run = input.nextInt();
		
	} while(run != 6);
		exitOut();
		
		input.close();
	}
}
