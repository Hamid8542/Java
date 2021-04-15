package w1d3NumericalData;

import java.util.Random;

public class RandomGeneratorGradePassOrFail {

	public static void main(String[] args) {

		 Random random = new Random();
		 
		  for(int i = 0; i < 10; i ++ ) {
		  int grade = random.nextInt(101);
			  
		  if(grade >= 60 ) {
		    System.out.println("Pass " + grade);
	}
		  else {
					
			System.out.println("Fail " + grade);
	   }
	}
			

	}

}
