package Omer;
/*we have 3 bunnies at 1,2,3 and we have two of them odd and one of them even so I will be having 7 ears because => 2+3+2 = 7
 * Write a method to do the following: 
We have a bunnies standing in a line, numbered 1,2,3,.
The odd bunnies (1,3,5..) have the normal 2 ears.
The even bunnies (2,4,6,..) have 3 ears.
Recursively return the number of ears in the bunny line 1,2,..N 
(you are not allowed to use any kind of loops). 
*/
public class BunnyEar {

	public static void main(String[] args) {
		
		System.out.println(countBunniesEars(3));
		
	}
		
		public static int countBunniesEars(int n) {
			if(n == 0) {
			return 0;
			} else {
			if (n % 2 == 0) {
			return 3 + countBunniesEars(n-1);
			} else {
			return 2 + countBunniesEars(n-1);
			}
		}
	}
}
	