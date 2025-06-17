package Level2;
import java.util.*;

public class greatest_factor_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid number");
		}
		else {
			int greatest_factor = 1;
			int counter = n-1;
			while(counter>1) {
				if(n % counter == 0) {
					greatest_factor = counter;
					break;
			}
				counter--;
			}
			System.out.println(greatest_factor);
		}
	}

}
