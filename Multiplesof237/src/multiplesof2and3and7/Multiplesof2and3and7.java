//This program displays all the multiples of 2,3,7 in the range 71 to 50
package multiplesof2and3and7;

public class Multiplesof2and3and7 {

	public static void main(String[] args) {
		// Declare variables to store the start and end of the range.
		 int startNumber = 71;
	        int endNumber = 150;

	     // Print a message stating the range of numbers to be checked.
	        System.out.println("Multiples of 2, 3, and 7 within the range " + startNumber + " to " + endNumber + ":");
	        
	        // Iterate through each number within the range.
	        for (int number = startNumber; number <= endNumber; number++) {
	        	
	        	 // Check if the number is a multiple of 2, 3, or 7.
	            if (number % 2 == 0 || number % 3 == 0 || number % 7 == 0) {
	            	
	            	 // Display the number if it is a multiple.
	                System.out.println(number);
	            }
	        }

	}

}
