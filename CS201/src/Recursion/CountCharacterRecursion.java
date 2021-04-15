package Recursion;

import java.util.Scanner;

public class CountCharacterRecursion {

	public static void main(String[] args) {		
	
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter a string : ");
		    String string = input.nextLine();
		    
		    System.out.print("Enter a character : ");
		    char c = input.nextLine().charAt(0);
		 //   int count = count(string, c);
//		    System.out.println("occurrences of  " + c + " is :" + count);
		    System.out.println(countChar(string, c));
		  }

		  public static int countChar(String str, char a) {
			  			  
		    if (str.length() == 0) {
		      return 0;
		    }
		    int count = 0;
		    if (str.charAt(0) == a) {
		      count++;
		      
		    }
		    return count + countChar(str.substring(1), a);
	  }
	}