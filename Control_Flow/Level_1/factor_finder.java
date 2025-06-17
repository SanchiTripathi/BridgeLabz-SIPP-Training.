package Level_1;
import java.util.*;

public class factor_finder {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Step 1: Get user input and validate
	        System.out.print("Enter a positive integer: ");
	        int number = scanner.nextInt();

	        if (number <= 0) {
	            System.out.println("Invalid input! Please enter a positive integer.");
	            return;
	        }

	        // Step 2: Initialize counter
	        int counter = 1;

	        System.out.println("Factors of " + number + " are:");

	        // Step 3: Loop to find and print factors
	        while (counter <= number) {
	            if (number % counter == 0) {
	                System.out.println(counter);
	            }
	            counter++;
	        }


	}

}
