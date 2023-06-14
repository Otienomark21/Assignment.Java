// This program asks the user to enter a number.
// It then loops through the numbers from 0 to 9.
// For each number, it checks if the user's number is divisible by the current number.

package divisibilitytest;

import java.util.Scanner;

public class DivisibilityTestForKids {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.println("Enter a number: ");

        // Read the user's input and store it in a variable.
        int number = scanner.nextInt();

        // Loop through the numbers from 0 to 9.
        for (int divisor = 0; divisor < 9; divisor++) {
            // Check if the number is divisible by the current number.
            if (number % (divisor + 1) == 0) {
                // Print a message stating that the number is divisible by the current number.
            	System.out.println("The number is divisible by " + (divisor + 1) + " because it ends with a " + (divisor + 1));
            }
            }
        }
    }









	


