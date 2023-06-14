 // This program creates a calculator that can perform basic operations (+, -, *, and /).

package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		        // Create a Scanner object to read input from the user.
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter a number.
		        System.out.println("Enter a number: ");

		        // Read the user's input and store it in a variable.
		        int number1 = scanner.nextInt();

		        // Prompt the user to enter an operation.
		        System.out.println("Enter an operation (+, -, *, or /): ");

		        // Read the user's input and store it in a variable.
		        String operation = scanner.next();

		        // Switch on the operation and perform the corresponding calculation.
		        switch (operation) {
		            case "+":
		                System.out.println(number1 + " + " + operation + " = " + (number1 + scanner.nextInt()));
		                break;
		            case "-":
		                System.out.println(number1 + " - " + operation + " = " + (number1 - scanner.nextInt()));
		                break;
		            case "*":
		                System.out.println(number1 + " * " + operation + " = " + (number1 * scanner.nextInt()));
		                break;
		            case "/":
		                System.out.println(number1 + " / " + operation + " = " + (number1 / scanner.nextInt()));
		                break;
		            default:
		                System.out.println("Invalid operation!");
		        }
		    }
		}
