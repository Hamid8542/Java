package W3D1Arrays;

public class AverageOfArray {

	public static void main(String[] args) {
	
		
		int rowSize = 4;
		int colSize = 3;
		int sum = 0;
		double avg = 0;
		int [] [] arr = { {1,2,3},
		                  {3,4,5},
		                  {6,7,8},
		                  {3,9,8}
		                           };
		printEvenSumOddSumArray(arr,  rowSize,  colSize);
		printArray(arr,  rowSize,  colSize);
		printRowAverage(arr,  rowSize,  colSize);
		printColAverage(arr,  rowSize,  colSize);
		printLargestInRows(arr , rowSize, colSize);
		printLowestInRows(arr , rowSize, colSize);
		
		
	}
		
public static void printEvenSumOddSumArray(int [][] arr,  int rowSize,  int colSize) {
	
	int EvenSum = 0;
	int OddSum = 0;
	
	for(int r = 0; r < rowSize; r++) {

		for(int c = 0 ; c < colSize; c++) {
			
			if(arr[r][c] % 2 == 0) {
				EvenSum += arr[r][c];
		  }
			else
				OddSum += arr[r][c];
		  }
	 }
	System.out.println("Even Sum : " + EvenSum); 
	System.out.println("Odd Sum : " + OddSum); 
	System.out.println("===================================");
}
	
public static void printArray(int [][] arr,  int rowSize,  int colSize) {
	
	for(int r = 0; r < rowSize ; r++) {
		
		for(int c = 0; c < colSize; c++) {
			System.out.print( arr [r][c] + " " );
//			System.out.print( arr [r][c] + " " );
//			System.out.print( arr [r][c] + " " );
			
			
		}
	      System.out.println();
	}
	      System.out.println("===================================");
}
	
public static void printRowAverage(int [] [] arr, int rowSize, int colSize) {
	
for(int r= 0; r < rowSize; r++ ) {
		int sum = 0;
		for(int c = 0; c < colSize; c++) {
			
			sum += arr[r][c];
		}	
			System.out.println("The Average of Row : " + sum / colSize);
				
    }
            System.out.println("===================================");
  }


public static void printColAverage(int [] [] arr, int rowSize, int colSize) {
	
for(int c= 0; c < colSize; c++ ) {
		double sum = 0;
		for(int r = 0; r < rowSize; r++) {
			
			sum += arr[r][c];
		}	
			System.out.println("The Average Colomn : " + sum / rowSize);
	}
           System.out.println("======================================");
  }


public static void printLargestInRows(int [][] arr , int rowSize,int colSize)
{
   int largest;

   for (int r = 0; r < rowSize; r++)
   {
      // assume that the first element of the row is largest
      largest = arr[r][0];

      for (int c = 1; c < colSize; c++)
      {
         if (largest < arr[r][c])
         {
            largest = arr[r][c];
         }
      }
     
      System.out.println("The largest element of row " + (r + 1)
                         + " = " + largest);
   }
       System.out.println("======================================");
}


public static void printLowestInRows(int [][] arr , int rowSize,int colSize)
{
   int lowest;

   for (int r = 0; r < rowSize; r++)
   {
      // assume that the first element of the row is largest
      lowest = arr[r][0];

      for (int c = 1; c < colSize; c++)
      {
         if (lowest > arr[r][c])
         {
            lowest = arr[r][c];
         }
      }
     
      System.out.println("The lowest element of row " + (r + 1)
                         + " = " + lowest);
   }
}
}