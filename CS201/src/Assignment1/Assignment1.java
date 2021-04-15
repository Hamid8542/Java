/*2-) Write a program that accepts a string input and outputs the number of characters in the string
and the first and last character in separate lines. For 80 Chapter 2 Getting Started with Java
example, if the input is, I like Java then the output would be
11
I
a
 */

package Assignment1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    String str = scan.nextLine();  // Read user input and assign to a variable str
	    int index1 = str.charAt(0);
        int index2 = str.charAt(str.length() - 1);
        
        // Print out the results.
        System.out.println("The String Length of Your user name is : " + str.length());
        
     //   System.out.println("The character at position 0 is : " + (char)index1);
        System.out.println("The character at position 0 is : " + str.charAt(0));
     //   System.out.println("The character at end position is : " + (char)index2);
        System.out.println("The character at last position  is : " + str.charAt(str.length() - 1 ));
    }
}
	