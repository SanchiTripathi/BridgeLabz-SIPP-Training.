package Level_1;
import java.util.*;

public class factor_finder_for {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Step 1: Get the input and validate
	        System.out.print("Enter a positive integer: ");
	        int number = scanner.nextInt();

	        if (number <= 0) {
	            System.out.println("Invalid input! Please enter a positive integer.");
	            return;
	        }

	        // Step 2: Use for loop to find and print factors
	        System.out.println("Factors of " + number + " are:");
	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                System.out.println(i);
	            }
	        }

	}

}
