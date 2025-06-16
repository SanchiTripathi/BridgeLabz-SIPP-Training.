package Level_1;
import java.util.*;

public class fizz_buzz {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input and validate
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
            return;
        }

        // Step 2: Loop through 1 to number
        System.out.println("FizzBuzz Output:");
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

	}

}
