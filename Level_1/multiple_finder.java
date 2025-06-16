package Level_1;
import java.util.*;

public class multiple_finder {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Please enter a positive number less than 100.");
            return;
        }

       
        int counter = number - 1;

        System.out.println("Multiples of " + number + " less than 100 are:");

        while (counter > 1) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
 int multiple = number;
        while (multiple < 100) {
            System.out.println(multiple);
            multiple += number;
        }


	}

}
