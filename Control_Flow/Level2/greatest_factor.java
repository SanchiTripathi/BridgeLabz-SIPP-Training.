package Level2;
import java.util.*;

public class greatest_factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid number ");
		}
		else {
			int greatest_factor = 1;
			for(int i=n-1;i>=1;i--) {
				if(n % i == 0) {
				greatest_factor = i;
				break;
		}
		
			}
			System.out.println(greatest_factor);
			
		}

	}

}
