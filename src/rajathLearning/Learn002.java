package rajathLearning;

import java.util.Scanner;

public class Learn002 {


		    public static void main(String[] args) {
		        // Create a scanner object to take input from the user
		        Scanner scanner = new Scanner(System.in);

		        // Ask the user to enter a character
		        System.out.print("Enter a character: ");
		        char character = scanner.next().charAt(0);  // Read the first character

		        // Get the ASCII value of the character
		        int asciiValue = (int) character;

		        // Display the ASCII value
		        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);

		        // Close the scanner object
		        scanner.close();
		    }
		}
	