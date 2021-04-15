package W3D1Arrays;
import java.util.Scanner;
public class AverageTemperatureOfMonth {

	public static void main(String[] args) {
		    
			//int temp, sum = 0;
		    int sum = 0;
			float average;
		
			Scanner input = new Scanner(System.in);
			
			for (int i = 1; i <= 10; i++) {
				System.out.print("Enter temperature for day " + i + "-> ");
				int temp = input.nextInt();
			     sum += temp;
			}
			average = (float)sum/30;
		    	System.out.println("Average temperature for the week: " + average);
			    System.out.printf("Average temperature for the week: %.1f Celcius", average);
		   } 
			
public static int averageHigh(int[][] array)
{
    double average = 0;
    
    for (int index = 0; index < array.length; index++)
    {
        average += array[index][1];
    }
    
    average = average / 12;
    
    // Returning as an int since a double would only be
    // applicable in a scientific program. I used an int
    // return for astetics. 
    return (int)average; 
}
}


