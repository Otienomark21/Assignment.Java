// This program asks the user to enter the marks of the five units they did last semester.
// It then calculates the average of the marks and prints it to the console, formatted to two decimal places.

package averagemarks;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the marks of the five units.
        System.out.println("Enter the marks of the five units: ");

        // Create an array to store the marks.
        int[] marks = new int[5];

        // Read the marks from the user and store them in the array.
        for (int input = 0; input < 5; input++) {
            marks[input] = scanner.nextInt();
        }

        // Calculate the average of the marks.
        double average = (double) (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;

        // Format the average to two decimal places.
        System.out.printf("The average marks is %.2f", average);
		

	}

}
