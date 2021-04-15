/*1-) Input the user’s first, middle, and last name as three separate strings and 
display the name in the order of the first name, the middle initial, and the last 
name. Include the period after the middle initial. If the input strings are Wolfgang,
 Amadeus, and Mozart, for example, then the output would be Wolfgang A. Mozart. 
 Use the console window for output. 
*/


package Assignment1;

import java.util.Scanner;

//public class FirstMlastName {
	public class FirstNameLastNameEmailFormat {

	public static void main(String[] args) {
			
	        String firstName;  // The first name, extracted from the input.
	        String lastName;   // The last name, extracted from the input.
	       
	    	Scanner scan = new Scanner(System.in);
	        System.out.print("Please Enter your First and Last Name : ");
	        
	        String input = scan.nextLine();  // Read user input
		   
			int spaceIndex = input.indexOf(" ");  
			int secondSpace = input.indexOf(spaceIndex + 1);
	        
	        firstName = input.substring(0, spaceIndex);
	     // middleName = input.substring(spaceIndex + 1 , secondSpace);
	        lastName = input.substring(spaceIndex + 1);
	     // lastName = input.substring(secondSpace + 1 );
	     // middleIni = input.substring(spaceIndex + 1, spaceIndex + 2);      
	        
	        System.out.print("Your First Name is :  " + firstName +"\n");		        
	      //  System.out.println("Your Middle Name is : " + middleName);
	     //   System.out.println("Your Middle initials is : " + middleIni);
	        System.out.println("Your Last Name is :" + lastName );
	        System.out.println("Your Email Address is  : " + firstName  + lastName + "@Mmiu.edu");   	
	
}

}
