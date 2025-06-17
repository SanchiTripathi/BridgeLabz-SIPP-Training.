package Level_1;
import java.util.*;

public class rocket_launch_for {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Enter countdown start value: ");
	        int counter = scanner.nextInt();
	        
	        for (int i = counter; i >= 1; i--) {
	            System.out.println(i);
	        }

	        System.out.println("Rocket Launched!");

		}

	}


