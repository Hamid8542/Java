package W3D3;
import java.util.Scanner;
public class CountCharacter {	

 public static void main(String[] args) {   
			       
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter String of word or words :");
			
	String string = scan.nextLine();
			
	  int count = 0;    
			            
	for(int i = 0; i < string.length(); i++) {    
	   if(string.charAt(i) != ' ')    
		count++;    
	 }    
			              
	   System.out.println("Total number of characters : " + count);    
  }    
} 

//write a method that askes a user to enter string or word and count the number of characters

//public static void main(String[] args) {
//	
//	char c = ' ';
//	String str= " ";
//	//int result = countChar( count);
//	System.out.println(countChar(str, c));
//	
////	System.out.println("There are "  + countChar(count) + " character ");
//}
//
//private static int countChar(String str, char a) {
//	
//	 Scanner input = new Scanner(System.in);
//	    System.out.print("Enter a string : ");
//	    String string = input.nextLine();
//	    
//	    System.out.print("Enter a character : ");
//	    char c = input.nextLine().charAt(0);
//	 int count = 0;      
//	if(str.length() != 0) {
//		count++;
//	}
//		return  count + countChar(str.substring(1), a);
//	 
//	  //    return countChar(str.length()-1); 
//	          
//   }    
//}
//	
	
	
