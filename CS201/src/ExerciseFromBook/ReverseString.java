package ExerciseFromBook;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your String : ");
		String originalString= scan.nextLine();
	
		String reverseString = new StringBuffer(originalString).reverse().toString();
		System.out.println(reverseString);

	}

}
