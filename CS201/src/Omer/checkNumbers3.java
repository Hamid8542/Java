package Omer;

import java.util.Scanner;

/*write a method that will take an array and count the ocurrence of 3 in the array using recursion
 * ex arr = {1,3,5,3} // 2
 *   arr = {1,2,4} // 0
 *   arr = {1,2,3,5} // 1
 */
public class checkNumbers3 {

	public static void main(String[] args) {

		 int arr[] = {1, 2, 3, 4, 3 };
		 
		 System.out.println("Number 3 appears : "+checkNumber3(arr, 0) + " times");
		 
	}

	private static int checkNumber3(int[] arr, int index) {
		if(index == arr.length) {      // base case+
		return 0;
		} else {
		if(arr[index] == 3) {
			
		return 1 + checkNumber3(arr, index+1);
		
		} else {
			
		return checkNumber3(arr, index+1);
		}
		}
		}
}

//public class checkNumbers3 {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Array Size : ");
//		
//		int size = scan.nextInt();
//		int arr[] = new int [size];
//		
//		int index = 0;
//		int i ;
//		
//		  for( i = 0; i < size ; i ++) {
//			System.out.println("Enter the " +(i + 1) +" elements");
//			arr[i] = scan.nextInt();
//		 
//			
//		    System.out.println(checkNumber3(arr, index));
//		}	 
//	}
//
//	private static int checkNumber3(int[] arr,  int index) {
//		
//		if(index == arr.length) {      // base case+
//		return 0;
//		} else {
//		if(arr[index] == 3) {
//		return 1 + checkNumber3(arr, index+1);
//		} else {
//		return checkNumber3(arr, index+1);
//		}
//		}
//		}
//}
//
//public class checkNumbers3 {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Array Size : ");
//		
//		int size = scan.nextInt();
//		int arr[] = new int [size];
//		
//		System.out.println("Enter number you want to check : ");
//		int num = scan.nextInt();
//		int index = 0;
//		int i ;
//		
//		  for( i = 0; i < size ; i ++) {
//			System.out.println("Enter the " +(i + 1) +" elements");
//			arr[i] = scan.nextInt();
//		 
//			
//		    System.out.println(checkNumber3(arr,num, index));
//		}	 
//	}
//
//	private static int checkNumber3(int[] arr, int num,  int index) {
//		
//		if(index == arr.length) {      // base case+
//		return 0;
//		} else {
//		if(arr[index] == num) {
//		return 1 + checkNumber3(arr,num, index+1);
//		} else {
//		return checkNumber3(arr,num, index+1);
//		}
//		}
//		}
//}
