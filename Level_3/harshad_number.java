package Level_3;
import java.util.*;

public class harshad_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int originalNumber = number;
		int sum=0;
		while (number != 0) {
            int digit = number % 10;  
            sum += digit;             
            number = number / 10;     
        }

        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        sc.close();

	}

}
