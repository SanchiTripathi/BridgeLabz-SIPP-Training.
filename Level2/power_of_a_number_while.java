package Level2;
import java.util.*;

public class power_of_a_number_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		if(p<0) {
			System.out.println("Invalid number");
		}
		else {
			int result = 1;
			int counter = 0;
			 while (counter != p) {
	                result = result * n;
	                counter++;
	            }
			 System.out.println(n + " raised to the power " + p + " is: " + result);
		}		

	}

}
