package FinalExamPractice;
/*4. The following method countDigits counts/returns the number of digits in the given string s. 
 Implement this method using recursion. 
 
 public static int countDigits(String s) 
 
 For example – countDigits(“ja2va4me82”) returns 4 since there are 4 digits (2,4,8,2) in that string. 
 Note: You don’t need to provide the main method for this problem.
*/
public class CountDigits {

	public static void main(String[] args) {
	  int index = 0;
	  String s = "b73ja2va4me73b";     // 6
	 
      countDigits(s, index);
      System.out.println(countDigits("The digits are : " + s, index));
	}

	private static int countDigits(String s, int index) {
		
			if(s.length() == 0) {
				return 0;
				
			}else {	
				if(s.charAt(index)  >= '0' && s.charAt(index) <= '9') {
					return 1 + countDigits(s, s.length() - 1);
				}else {
					return 0 + countDigits(s, s.length() - 1);
				}

				}
			}
}




