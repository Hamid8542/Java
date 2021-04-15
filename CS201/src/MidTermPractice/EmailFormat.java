package MidTermPractice;

import java.util.Scanner;

/*Write a method that will take a student's first name and last name and it will produce an MIU email. 
Note: the email format is the first letter of the first name and the full last name followed by @miu.edu. The returned string should be all lower case.

Example: 
"Muhyieddin" "Altarawneh" --> maltarawneh@miu.edu
 * 
 */

public class EmailFormat {

	public static void main(String[] args) {
		
		String firstName;
		String lastName;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Your First Name and Last name :");
		String input = scan.nextLine();
		
		int spaceIndex = input.indexOf(" ");
		int secondSpaceIndex = input.indexOf(spaceIndex + 1);
		
		firstName = input.substring(0, spaceIndex).toLowerCase();
		char firstNameInitial = firstName.charAt(0);
		lastName = input.substring(spaceIndex + 1).toLowerCase();
		
		
		System.out.println("Your email is : " + firstNameInitial + lastName + "@miu.edu" );
	}
}
	

