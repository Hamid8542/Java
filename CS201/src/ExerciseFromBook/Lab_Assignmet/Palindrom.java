package Lab_Assignmet;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
	 
		      String original;       //Objects of string class
		      String reverse = "";   // Objects of String class  
		      Scanner input = new Scanner(System.in); 
		      
		      System.out.println("Enter a string or number to check if it is a palindrome :");  
		      original = input.nextLine(); 
		      
		      int length = original.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + original.charAt(i);  
		      if (original.equals(reverse))  
		         System.out.println("Yea ! : it is a palindrome.");  
		      else  
		         System.out.println("Ops :  is not a palindrome.");   
		   }  
		}  		

	


