package W2D4;

import java.util.Scanner;

public class CountinVowels {

//	public static String VOWELS = "[a-zA-Z]";
//	public static void main(String[] args) {
		
//		char letter;
//		System.out.println("Your name:");
//		Scanner scanner = new Scanner(System.in);
//		
//		String name = scanner.next(); 
//		int numberOfCharacters = name.length();
//		int vowelCount = 0;
//		
//		if(name.matches(VOWELS))
//			vowelCount++;
//			System.out.print(name + ", Your Name has " + vowelCount + " vowels");
//		
		
		
		
//		for (int i = 0; i < numberOfCharacters; i++) {
//		letter = name.charAt(i);
//		if ( letter == 'a' || letter == 'A' ||
//		letter == 'e' || letter == 'E' ||
//		letter == 'i' || letter == 'I' ||
//		letter == 'o' || letter == 'O' ||
//		letter == 'u' || letter == 'U'
//		) {
//		vowelCount++;
//		}
//		}
		//System.out.print(name + ", your name has " + vowelCount + " vowels");

//	}
//
//}

//	public static String VOWELS = "[aeiouv]";
//public static void main(String[] args) {
//	
//	
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Input string : ");
//
//    // 1
//    String str = scanner.nextLine();
//    scanner.close();
//
//    // 2
//    str = str.toLowerCase();
//
//    int vCount = 0, cCount = 0;  
//    //3
//    for (int i = 0; i < str.length(); i++) {
//        //4. Checks whether a character is a vowel
//    	if(str.matches(VOWELS)) {
//    	
////        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
////                           || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
////            // Increments the vowel counter
//            vCount++;
//        }
//        //5. Checks whether a character is a consonant
////        else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
//        else if (str.matches(str) )
//        {
//            // Increments the consonant counter
//            cCount++;
//        }
//    }
//    //6
//    System.out.println("Number of vowels: " + vCount);
//    System.out.println("Number of consonants: " + cCount);
//}
//}
	
	public static void main(String[] args) {
		
		String str = "AbdulHamid  2003@gmail.com";
		int uppCase = 0;
		int sum = 0;
		int space = 0;
		int spacelast = 0;
		int num = 0;
		int lowCase = 0;
		char c ;
		for(int i = 0; i < str.length(); i++) {
		    c = str.charAt(i);
		    if(c >= 'A' && c <= 'Z') {
		    	uppCase++;
		    	System.out.println("Upper Case letter : " + uppCase);
		}
		    else if(c >= 'a' && c <= 'z') {
		    	lowCase++;
		    	System.out.println("Lower Case letter : " + lowCase);
		    }
		    
		    else if(c >= '0' && c <= '9') {
		    	num++;
		    	System.out.println("Numbers : " + num);
		    }
		    else if(c == ' ') {
		    	space++;
		    	System.out.println("Space  : " + uppCase);
		    }
		    	else
		    		spacelast++;
		    }
	}
}	