package W1D5Lab5Assignment;
/*
 *One million is 106 and 1 billion is 109. Write a program that reads a power of 10 (6, 9, 12, etc.) and displays
 * how big the number is (Million, Billion,etc.). Display an appropriate message for the input value that has no
corresponding word. The table below shows the correspondence between the power of 10 and the word for that number.
Power of 10                    Number
     6                        Million
     9                        Billion
     12                       Trillion
     15                       Quadrillion
     18                       Quintillion
     21                       Sextillion
     30                       Nonillion
     100                      Googol
 
 * 
 */
import java.math.BigInteger;
import java.util.Scanner;

public class PowerOf10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter a number : ");
		
		int number = input.nextInt();
		System.out.println(Math.pow(10,number));
		
	
  if(number == 6 ) {
	  System.out.println("The power of  : " + number + " is Million");
  }
	
  if(number == 9 ) {
	  System.out.println("The power of  : " + number + " is Billion");
  }
	
  if(number == 12 ) {
	  System.out.println("The power of  : " + number + " is Trillion");
  }
	
  if(number == 15 ) {
	  System.out.println("The power of  : " + number + " is Quadrillion");
  }
	
  if(number == 18 ) {
	  System.out.println("The power of  : " + number + " is Quintillion");
  }
	
  if(number == 21 ) {
	  System.out.println("The power of  : " + number + " is Sextillion");
  }
	
  if(number == 30 ) {
	  System.out.println("The power of  : " + number + " is Nonillion");
  }
  if(number == 100 ) {
	  System.out.println("The power of  : " + number + " is Googol");
  }
  
 }
}
