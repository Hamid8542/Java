package MidTermPractice;
import java.util.Scanner;
public class FirstMiddleLastName {
		/*
				Introduction to OOP with Java
				McGraw-Hill

		  Chapter 2 Exercise 19

		  Input the user’s first, middle and last name as three separate
		  strings and display the name in the order of the first name, the
		  middle initial, and the last name. Include the period after the
		  middle initial. If the input strings are Wolfgang, Amadeus, and
		  Mozart, for example, the output would be Wolfgang A. Mozart. Use
		  the console window for output.

		*/
		    public static void main( String args[] ) {

		    	String first, middle, last;
		    	Scanner scanner = new Scanner(System.in);

		    	System.out.print("First name: ");
		    	first = scanner.next();
		    	System.out.print("Middle name: ");
		    	middle = scanner.next();
		    	System.out.print("Last name: ");
		    	last = scanner.next();

		    	System.out.println(first + " " + middle+ " " + last);
		    	System.out.println(first + " " + middle.substring(0, 1)+ ". " + last);
		    	System.out.println(first.substring(0,1) + " " + middle.substring(0, 1)+ ". " + last.substring(0,1));
		    	System.out.println(first.substring(0,1) +  last + "@miu.edu");
		    	System.out.println(last.substring(0,1) + first + "@miu.edu");
		    }

		}


