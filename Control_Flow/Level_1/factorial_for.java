package Level_1;
import java.util.*;

public class factorial_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		if(n<0) {
			System.out.println("Invalid input please Enter the number is greater tha or equal to 0");
		}
		long factorial = 1;
		for(int i=1;i<=n;i++) {
			factorial *= i;
		}
		System.out.println("The factorial is: "+factorial);

	}

}
 