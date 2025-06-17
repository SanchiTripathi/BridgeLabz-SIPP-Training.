package Level2;
import java.util.*;
public class fizz_buzz_while {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        }
        System.out.println("FizzBuzz Output:");
        while(n>0) {
        	if(n % 3 ==0) {
        		System.out.println("Fizz");
        	}
        	if(n % 5 ==0) {
        		System.out.println("Buzz");
        	}
     
        }
        

	}

}


