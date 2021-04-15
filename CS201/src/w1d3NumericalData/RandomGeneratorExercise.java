package w1d3NumericalData;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// What is the maximum and minimum value we can get from this:

//   double random_double = Math.random() * (13 - 3 + 1) + 3; Answer :  maximum = 12 , minimum = 3



   public class RandomGeneratorExercise {

//	public static void main(String[] args) {
		
//		      Random rand = new Random(); //instance of random class
//		      int upperbound = 25;
//		        //generate random values from 0-24
//		      int int_random = rand.nextInt(upperbound); 
//		      double double_random=rand.nextDouble();
//		      float float_random=rand.nextFloat();
//		      
//		      System.out.println("Random integer value from 0 to  " + (upperbound-1) + " : " + int_random);
//		      System.out.println("Random float value between 0.0 and 1.0 : " + float_random);
//		      System.out.println("Random double value between 0.0 and 1.0 : " + double_random);
//		    }
//		}

	

//		 public static void main( String args[] ) {
//		      int min = 50;
//		      int max = 100;
//		      //Generate random double value from 50 to 100 
//		      System.out.println("Random value in double from " + min +" to " + max + ":");
//		      double random_double = Math.random() * (max - min + 1) + min; 
//		      System.out.println(random_double);
//		        
//		      //Generate random int value from 50 to 100 
//		      System.out.println("Random value in int from " + min + " to "+ max + ":");
//		      int random_int = (int)(Math.random() * (max - min + 1) + min);
//		      System.out.println(random_int);
//		    }
//		}

	
//	 public static void main( String args[] ) {
//	      // Generate random integers  
//	      int int_random = ThreadLocalRandom.current().nextInt();  
//	  
//	      // Print random integers 
//	      System.out.println("Random Integers: " + int_random); 
//
//	      // Generate Random doubles 
//	      double double_rand = ThreadLocalRandom.current().nextDouble(); 
//	  
//	      // Print random doubles 
//	      System.out.println("Random Doubles: " + double_rand); 
//	       
//	      // Generate random booleans 
//	      boolean boolean_rand = ThreadLocalRandom.current().nextBoolean(); 
//	       
//	      // Print random booleans 
//	      System.out.println("Random Booleans: " + boolean_rand); 
//	    }
//	}


public static void main(String args[]){
	
    // create instance of Random class
    Random rand = new Random();

    // Generate random integers in range 0 to 99
    int rand_int1 = rand.nextInt(100);
    int rand_int2 = rand.nextInt(100);

    // Print random integers
    System.out.println("Random Integers: " + rand_int1);
    System.out.println("Random Integers: " + rand_int2);

    // Generate Random doubles
    double rand_dub1 = rand.nextDouble();
    double rand_dub2 = rand.nextDouble();

    // Print random doubles
    System.out.println("Random Doubles: " + rand_dub1);
    System.out.println("Random Doubles: " + rand_dub2);
}
}