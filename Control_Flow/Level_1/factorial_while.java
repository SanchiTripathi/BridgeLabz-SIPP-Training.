package Level_1;
import java.util.*;

public class factorial_while {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		if( n<0) {
			System.out.println("Invalid value please enter the value is greater than 0");
		}
		else {
			long factorial = 1;
			int i=1;
			while(i<=n) {
				factorial *=i;
				i++;
			}
			System.out.println("the factorial is: "+factorial);
		}
	}

	}


