package Lab_Assignmet;

import java.util.Scanner;

public class Lab89 {
/*
1.  Write a program that reads in a sentence and displays the count of individual vowels in the sentence. 
  Use any output routine of your choice to display the result in this format. Count only the lowercase 
  vowels. Repeat the operation until an empty string is entered.
 
  Vowel counts for the sentence Mary had a little lamb.
  
# of 'a' : 4 
# of 'e' : 1 
# of 'i' : 1 
# of 'o' : 0 
# of 'u' : 0 
 
*/
		
//	public static void main(String[] args) {
//	 
//		String input;
//		int numberOfCharacters;
//		int vowelCount = 0;
//		char letter;
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please Enter your Sentence : ");
//		input = scan.nextLine(); 
//		
//		numberOfCharacters = input.length();
//		
//		for(int i = 0; i < numberOfCharacters ; i++) {
//			 letter = input.charAt(i);
//			 
//			 if ( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ) {
//				 
//					 vowelCount++;
//			}
//		}
//		
//		System.out.println("Your sentence " + input + " : has  " + vowelCount + " vowels");
//	}
//}
	
	public static void main(String[] args) {
		 
		String input;
		int numberOfCharacters;
		int vowelCount = 0;
		char letter;
		
		int aVowel = 0;
		int eVowel = 0;
		int iVowel = 0;
		int oVowel = 0;
		int uVowel = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your Sentence : ");
		input = scan.nextLine(); 
		
		numberOfCharacters = input.length();
		
		for(int i = 0; i < numberOfCharacters ; i++) {
			 letter = input.charAt(i);
			 
			 if ( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ) {
				 
					 vowelCount++;
			}
		}
		
		System.out.println("Your sentence " + input + " : has  " + vowelCount + " vowels");
	}
}	
	
	

/*
2.  Write a program that prints the number of uppercase letters in an input string. Use the class method 
  isUpperCase of the Character class, which returns true if the passed parameter of type char is an 
  uppercase letter. You need to explore the Character class from the java.lang package on your own. 
  Repeat the operation until an empty string is entered. 
 
*/
//public static void main(String[] args) {
//	
//	isUpperCase();
//	
//  }
//
//public static boolean isUpperCase(string str) {
//	
//}
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Please Enter your Sentence : ");
//	input = scan.nextLine();  
//	
//
//}
	

/*
3. Finding the complement of a given DNA strand is another common operation. The double helix of DNA is 
 composed of two complementary strands. Because the base pairs are formed by pairing A with T and G with C,
 we can easily ï¬�nd the complement of a given DNA strand by simple substitutions. For example, the 
 complement of GATTCGATC is CTAAGCTAG. Write a program that outputs the complement of a given DNA strand. 
 Repeat the operation until an empty string is entered. 
*/
//public static void main(String[] args) {
//	
//
//}
//
//}

/*
4. Write a program that determines if an input word is a palindrome. A palindrome is a string that reads the 
 same forward and backward, for example, noon and madam. Ignore the case of the letter. So, for example, 
 maDaM, MadAm, and mAdaM are all palindromes. Repeat the operation until an empty string is entered.

*/
//import java.util.Scanner;

//public class Palindrom {
	

//public static void main(String[] args) {
//	 
//    String original;       //Objects of string class
//    String reverse = "";   // Objects of String class  
//    Scanner input = new Scanner(System.in); 
//    
//    System.out.println("Enter a string or number to check if it is a palindrome :");  
//    original = input.nextLine();  
//    
//    for ( int i = original.length() - 1; i >= 0; i-- )  
//       reverse = reverse + original.charAt(i);  
//    if (original.equals(reverse))  
//       System.out.println("Yea ! : it is a palindrome.");  
//    else  
//       System.out.println("Ops :  is not a palindrome.");   
// }  
//}  

//2nd Option
